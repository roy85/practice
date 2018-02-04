package leetcode;

public class ReverseBits {

	public static void main(String[] args) {
		System.out.println("43261596="+Solution32.reverseBits(43261596));
	}

}

class Solution32{
	public static int reverseBits(int n) {
		int reverseNum = 0;
		
		StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
		System.out.println("n="+sb.toString());
		System.out.println("reverse n="+sb.reverse().toString());
		reverseNum = Integer.parseInt(sb.reverse().toString(), 2);
		System.out.println(Integer.parseInt(sb.toString(), 2)+","+Integer.parseInt(sb.reverse().toString(), 2));
		System.out.println("reverseNum="+reverseNum);
		return reverseNum;
    }
}