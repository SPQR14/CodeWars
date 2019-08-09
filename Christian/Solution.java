public class Solution {

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 1};
        System.out.println("Respuesta: " + isSortedAndHow(array));
    }

    public static String isSortedAndHow(int[] array) {
        String frase = "";
        int valor = array[0];
        boolean arriba = false;
        boolean abajo = false;

        for (int j = 1; j < array.length; j++){
            if (valor < array[j]){
                arriba = false;
                break;
            } else{
                arriba = true;
                break;
            }
        }


            for (int i = 1; i < array.length; i++) {
                if (valor < array[i]) {
                    frase = "yes, ascending";
                } else if (valor > array[i]) {
                    frase = "yes, descending";
                }
            }

        return arriba == true ? "no" : frase;
    }
}