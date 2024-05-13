/* alikeTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. alikeTokenManager.java */
package traductor;
//...

import lib.symbolTable.*;
import lib.attributes.*;
import lib.symbolTable.exceptions.*;
import java.util.ArrayList;
import java.util.Collections;
import lib.errores.*;
import lib.tools.SemanticFunctions;
import lib.tools.codeGeneration.*;
import static lib.symbolTable.Symbol.Types.*;
import java.io.*;

/** Token Manager. */
@SuppressWarnings ("unused")
public class alikeTokenManager implements alikeConstants {
        static void CommonTokenAction(Token token) {
                alike.linea = token.beginLine;
                // System.err.println("(" + token.beginLine + ", "
                // 			+ token.beginColumn + "): "+ alikeConstants.tokenImage[token.kind] + " " + token.image);
        }

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x80000000000L) != 0L)
            return 0;
         if ((active0 & 0xff83003bec3f80L) != 0L)
         {
            jjmatchedKind = 59;
            return 21;
         }
         if ((active0 & 0x12c000L) != 0L)
         {
            jjmatchedKind = 59;
            return 8;
         }
         return -1;
      case 1:
         if ((active0 & 0x20001801000L) != 0L)
            return 21;
         if ((active0 & 0x120000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 1;
            return 4;
         }
         if ((active0 & 0xff81003a6cef80L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 1;
            return 21;
         }
         return -1;
      case 2:
         if ((active0 & 0x120000L) != 0L)
            return 22;
         if ((active0 & 0x881001a400000L) != 0L)
            return 21;
         if ((active0 & 0xf70000202cef80L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 59;
               jjmatchedPos = 2;
            }
            return 21;
         }
         return -1;
      case 3:
         if ((active0 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 3;
            return 20;
         }
         if ((active0 & 0x1400000008a000L) != 0L)
            return 21;
         if ((active0 & 0xa3000028244f80L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 3;
            return 21;
         }
         if ((active0 & 0x100000L) != 0L)
            return 7;
         return -1;
      case 4:
         if ((active0 & 0x20000000244400L) != 0L)
            return 21;
         if ((active0 & 0xc0000000000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 4;
            return 20;
         }
         if ((active0 & 0x3000028000b80L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 4;
            return 21;
         }
         return -1;
      case 5:
         if ((active0 & 0x20000000L) != 0L)
            return 21;
         if ((active0 & 0x3000008000b80L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 5;
            return 21;
         }
         if ((active0 & 0xc0000000000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 5;
            return 20;
         }
         return -1;
      case 6:
         if ((active0 & 0xc0000000000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 6;
            return 20;
         }
         if ((active0 & 0x280L) != 0L)
            return 21;
         if ((active0 & 0x3000008000900L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 6;
            return 21;
         }
         return -1;
      case 7:
         if ((active0 & 0x2000008000000L) != 0L)
            return 21;
         if ((active0 & 0xc0000000000000L) != 0L)
            return 20;
         if ((active0 & 0x1000000000900L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 7;
            return 21;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 30);
      case 41:
         return jjStopAtPos(0, 31);
      case 42:
         return jjStopAtPos(0, 45);
      case 43:
         return jjStopAtPos(0, 42);
      case 44:
         return jjStopAtPos(0, 46);
      case 45:
         return jjStartNfaWithStates_0(0, 43, 0);
      case 46:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1L);
      case 47:
         jjmatchedKind = 44;
         return jjMoveStringLiteralDfa1_0(0x800000000L, 0x0L);
      case 58:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x100000000L, 0x0L);
      case 59:
         return jjStopAtPos(0, 26);
      case 60:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x400000000L, 0x0L);
      case 61:
         return jjStopAtPos(0, 36);
      case 62:
         jjmatchedKind = 37;
         return jjMoveStringLiteralDfa1_0(0x200000000L, 0x0L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x10000000400L, 0x0L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x200080L, 0x0L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80000000000100L, 0x0L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x12c000L, 0x0L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x22000000000000L, 0x0L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x8000000000000L, 0x0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x40000001001200L, 0x0L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x80000L, 0x0L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x800000000000L, 0x0L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4000002000000L, 0x0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x20000800000L, 0x0L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x18000800L, 0x0L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x20400000L, 0x0L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L, 0x0L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000000002000L, 0x0L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x40000L, 0x0L);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0, long active1){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 46:
         if ((active1 & 0x1L) != 0L)
            return jjStopAtPos(1, 64);
         break;
      case 61:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000000L, active1, 0L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000020600000L, active1, 0L);
      case 70:
      case 102:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 21);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(1, 23, 21);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000042100L, active1, 0L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000L, active1, 0L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000L, active1, 0L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40010000120200L, active1, 0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x800002080080L, active1, 0L);
      case 82:
      case 114:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 41, 21);
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000c00L, active1, 0L);
      case 83:
      case 115:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 24, 21);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x6000018000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000100L);
      case 68:
      case 100:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 21);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 47, 21);
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 70:
      case 102:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 21);
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000040000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x24000000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x80880L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0xc000L);
      case 84:
      case 116:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(2, 25, 21);
         else if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 51, 21);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000028000200L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 50:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000000L);
      case 95:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000800L);
      case 69:
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 21);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 52, 21);
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x204000L);
      case 76:
      case 108:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 50, 21);
         return jjMoveStringLiteralDfa4_0(active0, 0x40080L);
      case 78:
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 21);
         break;
      case 80:
      case 112:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 21);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000100L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 50:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000000L);
      case 95:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000000L);
      case 69:
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 21);
         else if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 53, 21);
         return jjMoveStringLiteralDfa5_0(active0, 0x880L);
      case 70:
      case 102:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 21);
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x8100000L);
      case 78:
      case 110:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 21);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000000L);
      case 89:
      case 121:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 10, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x82000008000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(5, 29, 21);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(6, 7, 21);
         return jjMoveStringLiteralDfa7_0(active0, 0x80000008000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000100000L);
      case 82:
      case 114:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(6, 9, 21);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(7, 27, 21);
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      case 78:
      case 110:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 49, 21);
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000000000L);
      case 80:
      case 112:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(7, 20);
         break;
      case 82:
      case 114:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 54, 20);
         return jjMoveStringLiteralDfa8_0(active0, 0x800L);
      case 84:
      case 116:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 55, 20);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(8, 11, 21);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 48, 21);
         break;
      case 82:
      case 114:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(8, 8, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 21;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 8:
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 59)
                     kind = 59;
                  { jjCheckNAdd(20); }
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAdd(20); }
                  }
                  else if (curChar == 32)
                     { jjCheckNAddTwoStates(5, 7); }
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 57)
                        kind = 57;
                     { jjCheckNAdd(13); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddStates(0, 2); }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 7:
               case 5:
                  if (curChar == 32)
                     { jjCheckNAddTwoStates(5, 7); }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 59)
                     kind = 59;
                  { jjCheckNAdd(20); }
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 59)
                     kind = 59;
                  { jjCheckNAdd(20); }
                  break;
               case 0:
                  if (curChar == 45)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 1:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 10 && kind > 1)
                     kind = 1;
                  break;
               case 10:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if (curChar == 39 && kind > 56)
                     kind = 56;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  { jjCheckNAdd(13); }
                  break;
               case 14:
               case 16:
                  if (curChar == 34)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 15:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 17:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 34 && kind > 58)
                     kind = 58;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 8:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAdd(20); }
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAddTwoStates(19, 20); }
                  }
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 22:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAdd(20); }
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAddTwoStates(19, 20); }
                  }
                  break;
               case 3:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAddTwoStates(19, 20); }
                  }
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 7:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 4:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAdd(20); }
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAddTwoStates(19, 20); }
                  }
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 21:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAdd(20); }
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                     { jjCheckNAddTwoStates(19, 20); }
                  }
                  break;
               case 1:
                  { jjAddStates(3, 4); }
                  break;
               case 6:
                  if ((0x4000000040L & l) != 0L && kind > 16)
                     kind = 16;
                  break;
               case 9:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 11:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 15:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjAddStates(0, 2); }
                  break;
               case 19:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 59)
                     kind = 59;
                  { jjCheckNAddTwoStates(19, 20); }
                  break;
               case 20:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 59)
                     kind = 59;
                  { jjCheckNAdd(20); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(3, 4); }
                  break;
               case 11:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 15:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 2); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 21 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, "\73", 
null, null, null, "\50", "\51", "\72\75", "\76\75", "\74\75", "\57\75", "\75", 
"\76", "\74", "\72", null, null, "\53", "\55", "\57", "\52", "\54", null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
"\56\56", };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   15, 17, 18, 1, 2, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      CommonTokenAction(matchedToken);
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         CommonTokenAction(matchedToken);
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public alikeTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public alikeTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 21; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffffffffff81L, 0x1L, 
};
static final long[] jjtoSkip = {
   0xf000000000000002L, 0x0L, 
};
static final long[] jjtoSpecial = {
   0x2L, 0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[21];
    static private final int[] jjstateSet = new int[2 * 21];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
