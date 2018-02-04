package hackerrank.practice.java.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
        //int t=in.nextInt();System.out.println("t="+t);
		int t=1;
        for(int i=0;i<t;i++){
//            int a = in.nextInt();System.out.println("a="+a);
//            int b = in.nextInt();System.out.println("b="+b);
//            int n = in.nextInt();System.out.println("n="+n);
            
        	int a = 0;
            int b = 2;
            int n = 10;
        	
            List<Integer> list = new ArrayList<>();
            
            for(int j=1 ; j<=n ; j++){
                int sum = a;    
                for(int k=1; k<=j ; k++){
                    sum += Math.pow(2, k-1) * b;
                }
                list.add(sum);
            }
            for(int m = 0; m<list.size() ; m++){
                System.out.print(list.get(m));
                if(m<list.size()-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        in.close();
	}

}
/*
Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            List<Integer> list = new ArrayList<>();
            
            for(int j=1 ; j<=n ; j++){
                int sum = a;    
                for(int k=1; k<=j ; k++){
                    sum += Math.pow(2, i-1) * b;
                }
                list.add(sum);
            }
            for(int m = 0; m<list.size() ; m++){
                System.out.print(list.get(m));
                if(m<list.size()-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
*/