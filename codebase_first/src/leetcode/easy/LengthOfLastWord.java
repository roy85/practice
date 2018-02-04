package leetcode.easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(Solution46.lengthOfLastWord("Hello World"));
		System.out.println(Solution46.lengthOfLastWord(""));
		System.out.println(Solution46.lengthOfLastWord("Given a string s consists of upper/lower-case alphabets and empty space characters"));
	}

}

class Solution46{
	public static int lengthOfLastWord(String s) {
		int ret =0;
		
		String arr[] = s.split(" ");
		if(arr.length>0){
			ret = arr[arr.length-1].length();
		}
		
		return ret;
    }
}