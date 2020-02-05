/*
Welcome! To the world of robots. You need to create your own simple robot and make your robot tell you the reverse of every word you tell to the robot.Eg. If you say "hello" to your robot, your robot will say "olleh". That's it! Simple Enjoy!!

Link: https://www.codewars.com/kata/56576f15a00ccb1c8f000088/train/java
*/

public class Robot {

    public static void main(String[] args) {
        String str = "Emma";
        System.out.println(reverse(str));
    }

    public static String reverse(String str)
    {
        StringBuilder palabra = new StringBuilder(str).reverse();
        System.out.println(palabra);

        return "";
    }


}
