/*
https://www.codewars.com/kata/56f173a35b91399a05000cb7/train/java

Revisar el Intelli
*/
public class SquashBugs {

    public static void main(String[] args) {
        System.out.println(findLongest("Hola hi jjj"));
    }

    public static int findLongest(final String str){
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++){
            if (spl[i].length() > longest){
                longest = spl[i].length();
            }
        }
        return longest;
    }

}
