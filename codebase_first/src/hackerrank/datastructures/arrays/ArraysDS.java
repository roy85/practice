package hackerrank.datastructures.arrays;

import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        
        for(int i=0;i<size;i++)
        {
        	arr[i] = scan.nextInt();
        }
        
        scan.close();
        
        for(int i=size-1;i>=0;i--){
        	System.out.print(arr[i]);
        	if(i>0)
        		System.out.print(" ");
        }
	}

}
