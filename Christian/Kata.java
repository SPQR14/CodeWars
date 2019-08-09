import java.util.StringTokenizer;

public class Kata {

    public static void main(String[] args) {
        System.out.println("Respuesta: " + findShort("Palabra mas corta"));
    }

    public static int findShort(String s) {
        int n = 0, t = 0;
        StringTokenizer token = new StringTokenizer(s);
        n = token.nextToken().length();

        while(token.hasMoreTokens()) {
            t = token.nextToken().length();
            if(t<n) {
                n = t;
            }
        }
        return n;
        }


}


