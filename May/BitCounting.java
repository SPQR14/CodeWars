/* https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java */

public class BitCounting {

	public static int countBits(int n){
	
    int cont=0;
    String binario;
     binario= Integer.toBinaryString(n);
    
    for(int i=0; i<binario.length(); i++)
    {
       if(binario.charAt(i)=='1'){
         cont++;
       }
    }   
    
    return cont;
	}	
}
