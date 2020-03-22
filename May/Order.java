/************************
https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java/5e6ab4dcb76a680033dc4987
- Your order, please -
@May
***************/
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Order {
  public static String order(String words) {
    
    boolean found = false;
    String[] currencies = words.split(" ");
    StringBuilder sb = new StringBuilder();
    int cont = 0;
    int variable;
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    String cadena = "";
    
    if (words.isEmpty() || words==" ") {
            System.out.println("Cadena vacia");
            return "";
        } else {

            for (int i = 0; i < currencies.length; i++) {
                System.out.println("Palabra [" + i + "] = " + currencies[i]);
                variable = Integer.parseInt(currencies[i].replaceAll("\\D+", ""));
                map.put(currencies[i], variable);
            }
            System.out.println(Arrays.asList(map));


            Object[] a = map.entrySet().toArray();
            Arrays.sort(a, new Comparator() {
                public int compare(Object o1, Object o2) {
                    return ((Map.Entry<String, Integer>) o1).getValue()
                            .compareTo(((Map.Entry<String, Integer>) o2).getValue());
                }
            });
            for (Object e : a) {
                cont++;
                if (cont == map.size()) {
                    cadena = cadena + ((Map.Entry<String, Integer>) e).getKey();
                } else {
                    cadena = cadena + ((Map.Entry<String, Integer>) e).getKey() + " ";
                }
            }

            System.out.println("-->" + cadena);
            return cadena;
        }
    }    
}