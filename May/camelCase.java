/******************************************************
https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java
AÚN ESTÁ EN PROCESO DE TERMINACIÓN, no lo COPÍEN TODAVÍA, por fa :)
******************************/

public class Solution {

    public static String camelCase(String str) {
      
      String cadena, nuevaCadena="";
      
      // your code here
      //  String hola="Hola";
    //  System.out.println("Imprimiendo: "+str);
     // System.out.println("Imprimiendo: "+str.length());
      
      //primero quitamos espacios en blanco
      
     // nuevaCadena=(Character.toString(c))
      
     /* cad=str.replaceAll("\\s+","");*/
    //+  System.out.println("Imprimiendo: "+cad);
     //+ System.out.println("Imprimiendo: "+cad.length());
      
      
        
      int longitud=str.length();
        
       for (int n=0; n<longitud;n++){
       
        //1st word must be an upper
      if(n==0){
      nuevaCadena=nuevaCadena+Character.toString(str.charAt(0));
      } 
      else{
      
    //   if(str.charAt(n)==" "){
    
      // }
      nuevaCadena=nuevaCadena+str.charAt(n);
      } 
      
       //+ char c=str.charAt(n);
//+        nuevaCadena
     //+  System.out.println ("char: "+c+"\n");
   //+     cadena=Character.toString(c);
      //+  System.out.println("A mayuscula: "+cadena.toUpperCase())     
        
        
        
       // str.charAt(n).toUpperCase());
        
        }
         System.out.println("VALIDEMOS: "+nuevaCadena);  
        
       return str;
    }

}
