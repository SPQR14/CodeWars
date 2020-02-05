/*
Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the collection.

For example: ["3:1", "2:2", "0:1", ...]

Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:

    if x>y - 3 points
    if x<y - 0 point
    if x=y - 1 point

Notes:

    there are 10 matches in the championship
    0 <= x <= 4
    0 <= y <= 4


    https://www.codewars.com/kata/5bb904724c47249b10000131/train/java

*/

public class TotalPoints {

    public static void main(String[] args) {
        String[] games = {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"};
        System.out.println(points(games));
    }

    public static int points(String[] games) {
        int puntos = 0, x = 0, y = 0;
        for (int i = 0; i < games.length; i++){
            x = Integer.parseInt(String.valueOf(games[i].charAt(0)));
            y = Integer.parseInt(String.valueOf(games[i].charAt(2)));
            if (x > y){
                puntos = puntos + 3;
            } else if(x < y){
                puntos = puntos +0;
            }else if(x == y){
                puntos = puntos + 1;
            }
        }
        return puntos;
    }
}
