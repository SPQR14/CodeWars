/*
https://www.codewars.com/kata/57f24e6a18e9fad8eb000296/train/java

No entiendo porque no pasa 
*/

public class Sid {

    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(5));
    }

    public static String howMuchILoveYou(int nb_petals) {
        String frase = "";
        switch (nb_petals){
            case 1:
                frase = "I love you";
                break;
            case 2:
                frase = "a little";
                break;
            case 3:
                frase = "a lot";
                break;
            case 4:
                frase = "passionately";
                break;
            case 5:
                frase = "madly";
                break;
            case 6:
                frase = "not at all";
                break;
            default:
                frase = "no";
                break;
        }
        return frase;
    }
}
