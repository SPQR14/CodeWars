public class MostDigits {
    public static void main(String[] args) {
        int[] numbers = {4555547, 11, -626922313, 2355, -1106717937};
        System.out.println("Resultado: " +findLongest(numbers));
    }

    public static int findLongest(int[] numbers) {
        int indicador = 0, p = 0;
        boolean isM = false;
        for (int i = 0; i < numbers.length; i++){
            isM = (numbers[i] < 0) ? true : false;
            if (indicador < (String.valueOf(numbers[i]).length() - (isM ? 1 : 0))){
                indicador = String.valueOf(numbers[i]).length() - (isM ? 1 : 0);
                p = i;
            }
        }

        return numbers[p];
    }
}
