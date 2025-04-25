public class Examplem2{

	public static String convertWord(String word){
		String reversed = "";
		for ( int i = word.length() - 1; i >= 0; i--){
			reversed += word.charAt(i);
		}
		return reversed;
	}

	public static String addWord(String word1, String word2){
		return word1 + word2;

	}

	public static void main(String[] args){
		System.out.println(convertWord("kerem"));
		System.out.println(addWord("sincap", "Esra"));
	}
}
