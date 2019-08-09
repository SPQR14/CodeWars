public class Kataa {

    public static void main(String[] args) {
        double[] arr = {0.0, 0.0, 5.0, 0.0, 0.0};
        System.out.println("Respuesta: " + findUniq(arr));
    }
    public static double findUniq(double arr[]) {

        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == arr[i]) {
                cont++;
            }
        }
        if(cont == 1){
            cont = 0;
        } else{
            for (int j = 0; j < arr.length; j++) {
                if (arr[0] != arr[j]) {
                    cont = j;
                    break;
                }
            }
        }
        return arr[cont];
    }
}
