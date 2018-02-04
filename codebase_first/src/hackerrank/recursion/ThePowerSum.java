package hackerrank.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThePowerSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.close();
	}
	
	
	
	public static int getPS(int x, int n){
		
			
		
		return 0;
	}

	public static int getPowerSum(int x, int n){
		double val=0;
		int variable = 2;
		List<Integer> list = new ArrayList<>();
		int countWays=0;
		
		while(true)
		{
			val = Math.pow(1.0*variable, n);
			if(val>=x)
				break;
			list.add((int)val);			
		}
		
		
		
		return 0;
	}
}
