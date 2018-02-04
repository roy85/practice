package leetcode.easy;

public class PowerOfThree {

	public static void main(String[] args) {
		for(int i=0;i<245;i++){
//			System.out.println(i+"="+Integer.toBinaryString(i));
//			System.out.println(i+"="+((Math.log(i)/Math.log(3))%1==0));
			System.out.println(i+"="+Solution29.isPowerOfThree(i));
		}
		System.out.println((Math.log(81)/Math.log(3)));
		System.out.println("3pow="+((Math.log(28)/Math.log(3))%1==0));
	}

}

class Solution29{

	public static boolean isPowerOfThree(int n){
		return Integer.toString(n, 3).matches("10*");
	}
	
}