package hackerrank.practice.java.intro;

import java.util.Scanner;
import java.util.*;

public class JavaOutputFormatting {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s", s1);
            System.out.printf("%03d", x);
            System.out.println();
        }
        System.out.println("================================");

        

        List<Integer> l = new ArrayList<>();
        Arrays.toString(l.toArray());
        
        sc.close();
	}

}