public class FindOutlier {

    public static void main(String[] args) {
        int[] integers = {3, 5 ,7, 8};
        System.out.println("Respuesta: " + find(integers));
    }


    static int find(int[] integers){
        int nop = 0;
        int pares = 0;
        int nones = 0;
        for(int i =0; i<integers.length; i++){
            if(integers[i]%2 == 0){
                pares ++;
            } else{
                nones ++;
            }
        }
        if(pares > nones){
            for(int j = 0; j < integers.length; j++) {
                if (integers[j] % 2 != 0) {
                    nop = j;
                    break;
                }
            }
        }else{
            for(int j = 0; j < integers.length; j++) {
                if (integers[j] % 2 == 0) {
                    nop = j;
                    break;
                }
            }
        }
        return integers[nop];
    }
}
