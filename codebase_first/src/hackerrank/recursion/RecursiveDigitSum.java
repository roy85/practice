package hackerrank.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveDigitSum {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		int k = scan.nextInt();
//		
//		scan.close();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<10;i++){
			sb.append(593);
		}
		int P = Integer.parseInt(sb.toString());
		System.out.println(getSuperDigit(P));
//		list.clear();
//		System.out.println(getSuperDigit(9875));
	}

	static List<Integer> list = new ArrayList<Integer>();
	
	private static int getSuperDigit(int num){
		int sum=0;
		int val = num;
		while(val>0){
			sum+=val%10;
			val = (val-val%10)/10;
		}
		if(sum<10)
			return sum;
		else if(!list.contains(sum))
		{
			list.add(sum);
		}
		else
			return -1;
		
		return getSuperDigit(sum);	
	}
}
