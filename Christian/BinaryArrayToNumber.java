import java.util.ArrayList;
import java.util.List;

public class BinaryArrayToNumber {
    public static void main(String[] args) {
        int[] binaryCode = {1, 0, 1, 1};
        List<Integer> binarios = new ArrayList<Integer>();
        for (int i : binaryCode)
        {
            binarios.add(i);
        }

        System.out.println("Resultado: "+ConvertBinaryArrayToInt(binarios));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int n = 0;
        for(int e = 0, p = binary.size()-1; e<binary.size(); e++, p--) {
            if(binary.get(p) == 1) {
                n += (int)Math.pow(2, e);
            }
        }
        return n;
    }
}