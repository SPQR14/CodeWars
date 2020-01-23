/*
Si enumeramos todos los números naturales por debajo de 10 que son múltiplos de 3 o 5, obtenemos 3, 5, 6 y 9. La suma de estos múltiplos es 23.

Termine la solución para que devuelva la suma de todos los múltiplos de 3 o 5 por debajo del número pasado.

Nota: Si el número es un múltiplo de 3 y 5, solo cuente una vez.

Link: https://www.codewars.com/kata/514b92a657cdc65150000006/train/java

*/

public class Multiples3and5 {
    public static void main(String[] args){
        int number = 10;
        System.out.println("Respuesta: " + solution(number));
    }

    public static int solution(int number) {
        int suma = 0;
        for (int i = 3; i < number; i++){
            if(i % 3 == 0 || i % 5 == 0){
                suma = suma + i;
            }
        }
        return suma;
    }
}
