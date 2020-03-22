/**********
https://www.codewars.com/kata/56576f15a00ccb1c8f000088/train/java/5e3c97554587f4000f614f7b
Robot
***********/

public class Robot {

    public static String reverse(String str)
    {
        StringBuilder palabra = new StringBuilder(str).reverse();
        System.out.println("Palabra:" +palabra);

        return palabra.toString();
    }


}