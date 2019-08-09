public class Square {

    public static void main(String[] args) {
        System.out.println("Is: "+isSquare(5));
    }

    public static boolean isSquare(int n) {

        return Math.sqrt(n)%1==0 ? true : false;
    }
}