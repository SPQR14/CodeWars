/*
Create a method take that accepts a list/array and a number n, and returns a list/array array of the first n elements from the list/array.

If you need help, here's a reference:

https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int[],%20int,%20int)

https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java

*/
public class Zyw0o {


    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        int n = 3;
        int [] respuesta = take(arr, n);
        System.out.println("Los primeros digitos son: " + respuesta);
    }

    public static int[] take(int[] arr, int n) {
        int[] respuesta = new int[n];
        for (int i = 0; i < n; i++){
            respuesta[i] = arr[i];
        }
        return respuesta;
    }
}
