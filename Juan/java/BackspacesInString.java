/*
	Link: https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java
	Estado: En curso
	Descripción:
	Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"

	Your task is to process a string with "#" symbols.

	Examples
	"abc#d##c"      ==>  "ac"
	"abc##d######"  ==>  ""
	"#######"       ==>  ""
	""              ==>  ""
*/

public class BackspacesInString {
	public String cleanString(String s) {
		return s.replaceAll("[^a-zA-Z]*", "");
	}

	public static void main(String...Args) {
		BackspacesInString obj = new BackspacesInString();
		System.out.println(obj.cleanString("a[b]dgcb##dskdd#"));
	}
}