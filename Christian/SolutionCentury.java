public class SolutionCentury {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Resultado: " + century(number));

    }

    public static int century(int number) {
        if(number < 100 && number > 0){
            number = 1;
        } else if (number % 100 == 0)
        {
            number = number/100;
        } else{
            number = (number/100) +1 ;
        }
        return number;
    }

}
