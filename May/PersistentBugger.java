class Persist 
{

static long[] intArray = new long[20];    
static String cadena;
static long resultadoRecibido;


public static int persistence(long n) 
{
    int contador=0;

   cadena = String.valueOf(n);
   
   int valor;
   
   valor= cadena.length();
   
   while(valor!=1){
   resultadoRecibido=operacion(cadena);
    
    System.out.println("Resultado devuelto es= "+resultadoRecibido);
  
    cadena=String.valueOf(resultadoRecibido);
    System.out.println("Nuevo valor de cadena es=" +cadena);    
    System.out.println("Longitud = "+cadena.length());
    contador++;
    
    if(cadena.length()==1){
     break;  //fin while infinito :P
    }
   
   }
   
	 
 return contador;
 
}


public static long operacion(String cadena){
	
	int contador=0;

	for(int i = 0; i < cadena.length(); i++) {
		  int j = Character.digit(cadena.charAt(i), 10);
		  System.out.println("digito: " + j);
		  intArray[i]=j;    
		  contador++;
	}

	long resultado=1;

	for(int j=0; j<cadena.length();j++)
	{
	  resultado=resultado*intArray[j];
	}

  return resultado;
  
}

}
