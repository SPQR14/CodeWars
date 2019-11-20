var alphabet = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"];

function getValueAlphabet(letra) {
	switch(letra) {
		case 'A': return 1;
		case 'B': return 2;
		case 'C': return 3;
		case 'D': return 4;
		case 'E': return 5;
		case 'F': return 6;
		case 'G': return 7;
		case 'H': return 8;
		case 'I': return 9;
		case 'J': return 10;
		case 'K': return 11;
		case 'L': return 12;
		case 'M': return 13;
		case 'N': return 14;
		case 'O': return 15;
		case 'P': return 16;
		case 'Q': return 17;
		case 'R': return 18;
		case 'S': return 19;
		case 'T': return 20;
		case 'U': return 21;
		case 'V': return 22;
		case 'W': return 23;
		case 'X': return 24;
		case 'Y': return 25;
		case 'Z': return 26;
		default: return 0;
	}
}

alphabetPosition("x+y^8>e^");

function alphabetPosition(text) {
	text = text.toUpperCase();
	var final = "";
	var valor = 0;

	for(x = 0; x < text.length; x++) {
		valor = (alphabet.includes(text.charAt(x)) ? getValueAlphabet(text.charAt(x)) : 0);
		if(final.length > 0 && valor > 0) {
			final += " " + valor;
		} else if(valor > 0) {
			final += valor;
		}
	}
	console.log(final);
	return final;
}