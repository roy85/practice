package leetcode.easy;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		System.out.println(reverseWords("This is my house "));
	}

	public static String reverseWords(String s) {
		StringBuilder reverse= new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			reverse.append(s.charAt(i));
		}
		String[] words = reverse.toString().split(" ");
		StringBuilder returnSB = new StringBuilder();
		for(int i=words.length-1;i>=0;i--){
			returnSB.append(words[i]);
			if(i>0)
				returnSB.append(" ");
		}
		return returnSB.toString();
	}
	
	public static String r2everseWords(String s) {
		
		String[] strings = s.split(" ");
		
		String returnString = "";
		
		for(int i=0;i<strings.length;i++){
			returnString+=reverse(strings[i]);
			if(i<strings.length-1){
				returnString+=" ";
			}
		}
		
		return returnString;
	}

	private static String reverse(String string) {
		char[] stringArray = string.toCharArray();
		int Lptr=0,Rptr=stringArray.length-1;
		
		for(;Lptr<Rptr;Lptr++, Rptr--){
			char temp = stringArray[Rptr];
			stringArray[Rptr]=stringArray[Lptr];
			stringArray[Lptr] = temp;
		}
		
		return new String(stringArray);
	}
}
