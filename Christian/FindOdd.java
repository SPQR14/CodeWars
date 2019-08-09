public class FindOdd {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1,5,4,3,2,10,10};//5(2),4(2),3(2),1(1),10(2)
        System.out.println("Respuesta: " + findIt(a));
    }

    public static int findIt(int[] a) {
        int odd = 0;
        int cont = 0;

        for(int i = 0; i < a.length; i++) {
            cont = 0;
            for(int j = 0; j < a.length; j++) {
                if(a[j] == a[i]) {
                    cont++;
                }
            }

            if(cont%2 == 1) {
                odd = a[i];
                break;
            }
        }
        return odd;
    }
}
