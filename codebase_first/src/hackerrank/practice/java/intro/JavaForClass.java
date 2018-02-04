package hackerrank.practice.java.intro;

import java.util.Scanner;

public class JavaForClass {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int nbr = scan.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(nbr+" x " + i + " = "+ (nbr*i));
        }
        
        scan.close();
    }
	
}
