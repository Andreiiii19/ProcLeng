//*****************************************************************
// File:   CGUtils.java
// Author: Procesadores de Lenguajes-University of Zaragoza
// Date:   abril 2022
// Coms:   Librería con el método para crear etiquetas frescas y 
// 			una variable estática para llevar la traza de las 
// 			direcciones de memoria 
//*****************************************************************

package lib.tools.codeGeneration;
import java.util.*;

import lib.tools.codeGeneration.PCodeInstruction.OpCode;

public class CGUtils {
	
	private static int l=0;
	
	private static ArrayList<Integer> dirs;
	
	public static String newLabel () {
		return "L"+(l++); 
	}
	
	public static void initializeCGUtils()
	{
		dirs = new ArrayList<Integer>();
		dirs.add(3); 
	}

	public static int getInvocDir() {
		return (int)dirs.get(dirs.size()-1);
	}

	public static int getDir() {
		dirs.set(dirs.size()-1,dirs.get(dirs.size()-1)+1);
		return dirs.get(dirs.size()-1)-1;
	}

	public static void addLevel() {
		dirs.add(3); 
	}

	public static void removeLevel() {
		if(dirs.size()>1)
		{
			dirs.remove(dirs.size()-1); 
		}
	}


	
	// campo requeridos para la generación de código
	public static int memorySpaces[] = new int[100];
	
}
