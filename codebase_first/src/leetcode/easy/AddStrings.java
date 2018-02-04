package leetcode.easy;

public class AddStrings {

	public static void main(String[] args) {
		System.out.println(addStrings("1", "2"));
		System.out.println(addStrings("1", "12"));
	}

	public static String addStrings(String num1, String num2){
		int carry=0, sum=0;
		StringBuilder sb = new StringBuilder();
		
		int i=0;
		int totalLength = Math.max(num1.length(), num2.length());
		
		for(;i<totalLength;i++){
			sum=carry;
			
			if(i<num1.length()){
				sum+=Integer.parseInt(Character.toString(num1.charAt(num1.length()-i-1)));
			}
			
			if(i<num2.length()){
				sum+=Integer.parseInt(Character.toString(num2.charAt(num2.length()-i-1)));
			}
			
			sb.append(sum%10);
			carry = sum/10;
		}
		
		if(carry>0)
			sb.append(carry);
			
		return sb.reverse().toString();
	}
}
