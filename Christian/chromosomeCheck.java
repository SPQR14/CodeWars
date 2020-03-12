/*
https://www.codewars.com/kata/56530b444e831334c0000020/train/java
*/
public class areaOrPerimeter {
    public static void main(String[] args) {
        System.out.println(chromosomeCheck("XX"));
    }
    public static String chromosomeCheck(String sperm) {
        return sperm == "XY" ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }
}
