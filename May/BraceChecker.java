/************************
ttps://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java
- Valid Braces -
@May
***************/

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class BraceChecker {

  public boolean isValid(String test) {

       Map<Character, Character> parenthesesMapping = new HashMap<>();
        Stack<Character> parentheses = new Stack<>();
     //   String test="[()";


        parenthesesMapping.put('(', ')');
        parenthesesMapping.put('{', '}');
        parenthesesMapping.put('[', ']');


        for(int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);

            if(parenthesesMapping.containsKey(c)) {
                parentheses.push(c);
            } else {
                if(parentheses.isEmpty()) {
                    //System.out.println("FALSE");
                    return false;
                }
                char target = parentheses.pop();
                if(!parenthesesMapping.containsKey(target) || parenthesesMapping.get(target) != c) {
                   // System.out.println("FALSE");
                    return false;
                }
            }
        }
        if(!parentheses.isEmpty()) {
            //System.out.println("FALSE");
            return false;
        }
        //System.out.println("TRUE");
       return true;


  }

}