package leetcode.easy;

public class AddDigit {

	public static void main(String[] args) {
		System.out.println(addDigits(38));
		System.out.println(addDigits(3813));
	}

	public static int addDigits(int num) {
		if(num<10)
			return num;
		
		int sum=0;
		while(num>0){
			sum+=num%10;
			num/=10;
		}
		
		return addDigits(sum);
	}
}
