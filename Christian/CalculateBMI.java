/*
https://www.codewars.com/kata/57a429e253ba3381850000fb/train/java
*/

public class CalculateBMI {

    public static void main(String[] args) {
        System.out.println(bmi(80,1.80));
    }

    public static String bmi(double weight, double height) {
        String esta = "";
        double indice = (weight/(height*height));
        if (indice <= 18.5){
            esta = "Underweight";
        } else if (indice <= 25){
            esta = "Normal";
        }else if (indice <= 30){
            esta = "Overweight";
        }else if (indice > 30){
            esta = "Obese";
        }
        return esta;
    }
}
