package lib.attributes;

import java.util.ArrayList;

import lib.symbolTable.Symbol;


public class Attributes implements Cloneable {
    public Symbol.Types type;
    public Symbol.ParameterClass parClass;
    public ArrayList<Symbol> parList;
    public int nivel;
    public String code;
    public int inicio;
    public int fin;
    public ArrayList<Attributes> atts;
    

    public Attributes() {
        this.type = Symbol.Types.UNDEFINED;
        this.parClass = Symbol.ParameterClass.NONE;
        this.parList = new ArrayList<Symbol>();
        this.nivel = -1;
        this.code = "";
        this.atts = new ArrayList<Attributes>();
    }

    public Attributes clone() {
        try {
            return (Attributes) super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    public String toString() {
        return toString(0);
    }

    private String toString(int depth) {
        if (depth > 10) { // limit recursion depth to 10
            return "Recursion depth limit reached";
        }
        String atris = "";
        for (Attributes a : atts) {
            atris += "\n" + "\t".repeat(depth + 1) + a.toString(depth + 1);
        }
        return "Type: " + type + " ParClass: " + parClass + " Nivel: " + nivel + " Code: " + code + "\n" + atris;
    }


}
