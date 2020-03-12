/*
https://www.codewars.com/kata/5c4b5f06b1fd9b3fec8cb03e/train/java

*/

public class LunarCalculator {
    public static void main(String[] args) {
        System.out.println(add(1, 50));
    }

    public static long add(long number1, long number2)
    {
        String result = "";
        int tamañonumber1 = Long.toString(number1).length();
        int tamañonumber2= Long.toString(number2).length();
        int diferencia = Math.abs(tamañonumber1 - tamañonumber2);
        int bandera = -1;
        int x = 0;
        int tamaño = 0;


        if (tamañonumber1 > tamañonumber2){
            tamaño = tamañonumber1;
        }else{
            tamaño = tamañonumber2;
        }

        int[] primero = new int[tamaño];
        int[] segundo = new int[tamaño];
        String one = String.valueOf(number1);
        String two = String.valueOf(number2);

        for (int i = 0 ; i < tamaño; i++){
            if (tamañonumber1 > tamañonumber2){
                bandera++;
                primero[i] = Integer.parseInt(String.valueOf(one.charAt(i)));
                if (i < diferencia){
                    segundo[i] = 0;
                }else {
                    segundo[i] = Integer.parseInt(String.valueOf(two.charAt(x)));
                    x++;
                }

            } else if (tamañonumber2 > tamañonumber1){
                bandera++;
                segundo[i] = Integer.parseInt(String.valueOf(two.charAt(i)));
                if (i < diferencia){
                    primero[i] = 0;
                }else{
                    primero[i] = Integer.parseInt(String.valueOf(one.charAt(x)));
                    x++;
                }

            } else{
                bandera++;
                primero[i] = Integer.parseInt(String.valueOf(one.charAt(i)));
                segundo[i] = Integer.parseInt(String.valueOf(two.charAt(bandera)));
            }

        }

        for (int j = 0; j < tamaño; j++){
            if (primero[j] > segundo[j]){
                result = result + primero[j];
            }else{
                result = result + segundo[j];
            }
        }

        return Long.valueOf(String.valueOf(result));
    }
}
