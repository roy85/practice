package leetcode.easy;

public class ReverseString_1 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		System.out.println(sol.reverseString("hello"));
	}

}

class Solution8{
	public String reverseString(String s) {
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++){
        	arr[i]=s.charAt(s.length()-1-i);
        }
        return new String(arr);
    }
	
//	public String reverseString(String s) {
//        return new StringBuilder(s).reverse().toString();
//    }
}