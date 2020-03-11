/*
https://www.codewars.com/kata/5861d28f124b35723e00005e/train/java
*/

public class WillYouMakeIt {
    public static void main(String[] args) {
        System.out.println(zeroFuel(100,50,1));
    }
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        boolean indicador;
        if (fuelLeft * mpg == distanceToPump){
            indicador = true;
        } else {
            indicador = false;
        }
        return indicador;
    }
}
