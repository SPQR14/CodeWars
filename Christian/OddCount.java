/*
https://www.codewars.com/kata/59342039eb450e39970000a6/train/java

No pasa el Attempt -> Luego lo reviso 
*/
import java.util.ArrayList;

public class Kata {

    public static int oddCount(int n){
        ArrayList lista = new ArrayList();
        for (int i = 0; i < n; i++){
            if(i%2 != 0){
                lista.add(i);
            }
        }
        return lista.size();
    }

}
