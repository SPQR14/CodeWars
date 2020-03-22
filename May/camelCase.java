/************************
https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java
- CamelCase Method -
@May
***************/

public class Solution {

    public static String camelCase(String str) {
  
        String after, cadena="";
        String[] words;
        System.out.println("Antes: "+str);
        after = str.trim().replaceAll(" +", " ");
        System.out.println("Después: "+after);

       if(str.isEmpty()|| str==""){
        
        return "";
       
       }
       else{

        // String whiteSpaceRegex = "\\s";
        words = after.split("\\s");

        for (int n=0; n<words.length;n++) {
           System.out.println("array["+n+"] = "+words[n]);
           cadena=cadena+words[n].substring(0, 1).toUpperCase() + words[n].substring(1);
        }

        System.out.println("cadena:"+cadena);
        return cadena;
      
      }
  
    }

}