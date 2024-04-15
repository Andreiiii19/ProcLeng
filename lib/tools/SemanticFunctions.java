//*****************************************************************
// Tratamiento de errores sintácticos
//
// Fichero:    SemanticFunctions.java
// Fecha:      03/03/2022
// Versión:    v1.0
// Asignatura: Procesadores de Lenguajes, curso 2021-2022
//*****************************************************************

package lib.tools;

import java.util.*;

import org.w3c.dom.Attr;

import traductor.Token;
import lib.attributes.*;
import lib.symbolTable.*;
import lib.symbolTable.exceptions.*;
import lib.errores.*;

public class SemanticFunctions {
	//clase común de errores semánticos

	public SemanticFunctions() {
		
	}

	//COMPLETAR

	public void check_expresion(ArrayList<Attributes> atts) throws ErrorSemantico
	{
		
	}

	public void check_inst_leer(SymbolTable st, Attributes atts)
	{
		for(Attributes at : atts.atts)
		{
			if(at.type==Symbol.Types.ARRAY)
			{
				throw new ErrorSemantico("La instruccion get no admite arrays");
			}

			if(at.esConstante)
			{
				throw new ErrorSemantico("La instruccion get no admite constantes");
			}
		}
	}

	public void check_inst_escribir(SymbolTable st, Attributes atts)
	{
		for(Attributes at : atts.atts)
		{
			if(at.type==Symbol.Types.ARRAY)
			{
				throw new ErrorSemantico("La instruccion get no admite arrays");
			}
		}
	}

	public void heredar_valores(Attributes att, Attributes at)
	{
		if(att.type==Symbol.Types.UNDEFINED || att.nivel==-1) 
		{
			att.type=at.type;
			att.extraType=at.extraType;
			att.parClass=at.parClass;
			att.parList=at.parList;
			att.nivel=at.nivel;
			att.esConstante = at.esConstante;
		}
		changeCodeAttribute(att);
	}

	public void asignar_valores(Attributes att, Attributes at, String code, Symbol.Types tipo, Symbol.ParameterClass parClass, int nivel,boolean esConstante)
	{
		if(tipo!=Symbol.Types.ARRAY) at.type = tipo;
		at.parClass = parClass;
		at.nivel = nivel;
		at.esConstante = esConstante;
		at.code = code;
		add_to_atts(att, at);
		heredar_valores(att, at);
	}

	public void add_to_atts(Attributes att, Attributes at)
	{
		att.atts.add(at.clone());
	}

	private void changeCodeAttribute(Attributes att) {
		String _code="";
		int size = att.atts.size();
		for (int i = 0; i < size; i++) {
			Attributes a = att.atts.get(i);
			_code += a.code;
			if (i < size - 1) { // if this is not the last element
				_code += ",";
			}
		}
		att.code = _code;	
	}

	public void checkTypeFunctionCall(Attributes at2) {
		if(at2.type == Symbol.Types.ARRAY)
		{
			System.out.println("Expresion a comprobar: " + at2);
			if(at2.atts.size()>1)
			{
				throw new ErrorSemantico("Demasiados parametros en invocacion a array");
			}
			if(at2.atts.size()>0 && (at2.atts.get(0).type==Symbol.Types.ARRAY && at2.atts.get(0).extraType!=Symbol.Types.INT))
			{
				throw new ErrorSemantico("El índice no es un valor array indexado por integer en invocacion a array");
			}
			if(at2.atts.size()>0 && at2.atts.get(0).type==Symbol.Types.FUNCTION && at2.atts.get(0).extraType!=Symbol.Types.INT)
			{
				throw new ErrorSemantico("El índice no es una funcion con retorno de integer en invocacion a array");
			}
			if(at2.atts.get(0).type!=Symbol.Types.ARRAY&&at2.atts.get(0).type!=Symbol.Types.FUNCTION&&at2.atts.get(0).type!=Symbol.Types.INT)
			{
				throw new ErrorSemantico("El índice no es un valor integer en invocacion a array");
			}
		} else if(at2.type == Symbol.Types.FUNCTION)
		{
			if(at2.atts.size()!=at2.parList.size())
			{
				throw new ErrorSemantico("Error de parametros en invocacion a funcion");
			}
			for(int i = 0; i<at2.atts.size(); i++)
			{
				if(at2.atts.get(i).type!=at2.parList.get(i).type)
				{
					throw new ErrorSemantico("Error de parametros en invocacion a funcion");
				}

				if(at2.atts.get(i).esConstante&&at2.parList.get(i).parClass==Symbol.ParameterClass.REF)
				{
					throw new ErrorSemantico("No se admiten constantes como parametros por referencia");
				}
			}
		} else if(at2.type == Symbol.Types.PROCEDURE)
		{
			System.out.println("Lista de atts: " + at2);
			System.out.println("Lista de parList: " + at2.parList);
			if(at2.atts.size()!=at2.parList.size())
			{
				throw new ErrorSemantico("Número de parametros en invocacion a procedimiento");
			}
			for(int i = 0; i<at2.atts.size(); i++)
			{
				if(at2.atts.get(i).type!=at2.parList.get(i).type)
				{
					throw new ErrorSemantico("Error de parametros en invocacion a procedimiento");
				}

				if(at2.atts.get(i).esConstante&&at2.parList.get(i).parClass==Symbol.ParameterClass.REF)
				{
					throw new ErrorSemantico("No se admiten constantes como parametros por referencia");
				}
			}
		}
	}

	public void checkTypesAsignacion(Attributes at, Attributes at2) {
		if(at2.type == Symbol.Types.ARRAY)
		{
			if(at2.extraType!=at.type)
			{
				throw new ErrorSemantico("Intento de asignar a un array un tipo distinto al de sus elementos");
			}
		}
		else if(at.type == Symbol.Types.FUNCTION){
			if(at.extraType!=at2.type)
			{
				throw new ErrorSemantico("Intento de asignar a una variable una funcion con un tipo distinto de retorno");
			}
		}
		else if(at2.type!=at.type)
		{
			throw new ErrorSemantico("Intento de asignar un tipo distinto a una variable");
		}
	}

	public void cambiarTipos(Attributes at2, Symbol S)
	{
		if(S.type==Symbol.Types.ARRAY)
		{
			if(at2.atts.size()==0)
			{
				at2.type = Symbol.Types.ARRAY;
				at2.extraType = ((SymbolArray)S).baseType;
			}
			else if(at2.atts.size()==1)
			{
				if(at2.atts.size()>0 && (at2.atts.get(0).type==Symbol.Types.ARRAY && at2.atts.get(0).extraType!=Symbol.Types.INT))
				{
					throw new ErrorSemantico("El índice no es un valor array indexado por integer en invocacion a array");
				}
				if(at2.atts.size()>0 && at2.atts.get(0).type==Symbol.Types.FUNCTION && at2.atts.get(0).extraType!=Symbol.Types.INT)
				{
					throw new ErrorSemantico("El índice no es una funcion con retorno de integer en invocacion a array");
				}
				if(at2.atts.get(0).type!=Symbol.Types.ARRAY&&at2.atts.get(0).type!=Symbol.Types.FUNCTION&&at2.atts.get(0).type!=Symbol.Types.INT)
				{
					throw new ErrorSemantico("El índice no es un valor integer en invocacion a array");
				}

				at2.type = ((SymbolArray)S).baseType;
			}
			else
			{
				throw new ErrorSemantico("Demasiados parametros en invocacion a array");
			}



			
			
		}
			
		if(S.type==Symbol.Types.FUNCTION)
		{
			at2.extraType = ((SymbolFunction)S).returnType;
			at2.parList = ((SymbolFunction)S).parList;
		}
		if(S.type==Symbol.Types.PROCEDURE)
		{
			at2.parList = ((SymbolProcedure)S).parList;
		}
	}

	public void checkPrimarioIds(Attributes at){
		if(at.type == Symbol.Types.FUNCTION)
			{
				if(at.atts.size()!=at.parList.size())
				{
					throw new ErrorSemantico("Demasiados parametros para invocacion a funcion");
				}
				for(int i = 0; i < at.atts.size(); i++)
				{
					Attributes a = at.atts.get(i);
					System.out.println("Comparando: " + a.type + " con " + at.parList.get(i).type);
					if(a.type!= at.parList.get(i).type)
					{
						System.out.println("Error en invocacion a funcion: " + at);
						throw new ErrorSemantico("Error de tipos en invocacion a funcion: " + a.type);
					}
				}
			} else if(at.type == Symbol.Types.ARRAY)
			{
				if(at.atts.size()>1)
				{
					throw new ErrorSemantico("Demasiados parametros en invocacion a array");
				}
				if(at.atts.size()>0 && (at.atts.get(0).type==Symbol.Types.ARRAY && at.atts.get(0).extraType!=Symbol.Types.INT))
				{
					throw new ErrorSemantico("El índice no es un valor array indexado por integer en invocacion a array");
				}

				if(at.atts.size()>0 && at.atts.get(0).type==Symbol.Types.FUNCTION && at.atts.get(0).extraType!=Symbol.Types.INT)
				{
					throw new ErrorSemantico("El índice no es una funcion con retorno de integer en invocacion a array");
				}
				if(at.atts.size()>0 && (at.atts.get(0).type != Symbol.Types.ARRAY && at.atts.get(0).type != Symbol.Types.ARRAY && at.atts.get(0).type!=Symbol.Types.INT))
				{
					throw new ErrorSemantico("El índice no es un valor integer en invocacion a array");
				}
			}
	}
}


