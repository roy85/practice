package hackerrank.practice.thirtydaysofcode;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		int i=1;
		double d = 2.0;
		String s = "Hi";
		
		Scanner scan = new Scanner(System.in);
		int i2 = scan.nextInt();
		double d2 = scan.nextDouble();
        scan.nextLine();
		String s2 = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);
        System.out.println(d+d2);
        
        System.out.println(s+s2);
		
		scan.close();
	}

}
