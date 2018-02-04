package leetcode.easy;

/*
 * Repeat.
 */
public class SumOfTwoIntegers {

	public static void main(String[] args) {
		System.out.println("5+7="+Solution35.getSum(5, 7));
	}

}

class Solution35{
	public static int getSum(int a, int b) {
		int carry = a&b;
		System.out.println("carry="+carry+", "+Integer.toBinaryString(carry));
		int result = a^b;
		System.out.println("result="+result+", "+Integer.toBinaryString(result));
		
		while(carry!=0){
			System.out.println("carry="+carry+", "+Integer.toBinaryString(carry));
			
			int shiftedcarry=carry<<1;
			System.out.println("shiftedcarry="+shiftedcarry+", "+Integer.toBinaryString(shiftedcarry));
			
			carry=shiftedcarry&result;
			System.out.println("carry="+carry+", "+Integer.toBinaryString(carry));
			
			result = shiftedcarry^result;
			System.out.println("result="+result+", "+Integer.toBinaryString(result));
		}
		
		return result;		
    }
}