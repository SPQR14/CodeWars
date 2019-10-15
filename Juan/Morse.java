import java.util.StringTokenizer;

public class Morse {
	static String final_str = "";
	static String stack_str = "";
	static String sub1 = "";
	static String sub2 = "";
	static int n_spaces = 0;
	public static void main(String...Args) {
		String text_morse = " .... . -.--   .--- ..- -.. . ...---...";
		System.out.println("Enviando: "+text_morse);
		System.out.println("Respuesta: "+decode(text_morse));
	}

	public static String decode(String morseCode) {
        if(morseCode.contains(" ")) {
			/*StringTokenizer one_space = new StringTokenizer(morseCode);
			
			while(one_space.hasMoreTokens()) {
				stack_str = one_space.nextToken();
				System.out.println(stack_str);
				final_str += (alphabet(stack_str) != null ? alphabet(stack_str) : "");
			}*/

			for(int x = 0; x < morseCode.length(); x++) {
				if(morseCode.charAt(x) != ' ') {
					stack_str += morseCode.charAt(x);

					if(n_spaces == 1 && !stack_str.isEmpty()) {
						System.out.println(stack_str);
						/*Sacar el stack y pasar a final sin espaciado de palabra*/
						final_str += (alphabet(stack_str) != null ? alphabet(stack_str) : "");
					} else if(n_spaces > 1 && !stack_str.isEmpty()) {
						System.out.println(stack_str);
						/*Sacar el stack y pasar a final con espaciado de palabra*/
						final_str += (alphabet(stack_str) != null ? alphabet(stack_str)+" " : "");
						n_spaces = 0;
					} else {
						n_spaces = 0;
					}
				} else {
					/*Encuentra un espacio*/
					n_spaces++;
				}
			}

			return final_str;
		} else {
			return alphabet(morseCode);
		}
	}
	
	public static String alphabet(String morseText) {
		if(morseText.equals("...---...")) {
			return "SOS";
		} else if(morseText.equals(".-")){
			return "A";
		} else if(morseText.equals("-...")){
			return "B";
		} else if(morseText.equals("-.-.")) {
			return "C";
		} else if(morseText.equals("-..")){
			return "D";
		} else if(morseText.equals(".")) {
			return "E";
		} else if(morseText.equals("..-.")) {
			return "F";
		} else if(morseText.equals("--.")) {
			return "G";
		} else if(morseText.equals("....")) {
			return "H";
		} else if(morseText.equals("..")) {
			return "I";
		} else if(morseText.equals(".---")) {
			return "J";
		} else if(morseText.equals("-.-")) {
			return "K";
		} else if(morseText.equals(".-..")) {
			return "L";
		} else if(morseText.equals("--")) {
			return "M";
		} else if(morseText.equals("-.")) {
			return "N";
		} else if(morseText.equals("---")) {
			return "O";
		} else if(morseText.equals(".--.")) {
			return "P";
		} else if(morseText.equals("--.-")) {
			return "Q";
		} else if(morseText.equals(".-.")) {
			return "R";
		} else if(morseText.equals("...")) {
			return "S";
		} else if(morseText.equals("-")) {
			return "T";
		} else if(morseText.equals("..-")) {
			return "U";
		} else if(morseText.equals("...-")) {
			return "V";
		} else if(morseText.equals(".--")) {
			return "W";
		} else if(morseText.equals("-..-")) {
			return "X";
		} else if(morseText.equals("-.--")) {
			return "Y";
		} else if(morseText.equals("--..")) {
			return "Z";
		} else {
			return null;
		}
	}
}