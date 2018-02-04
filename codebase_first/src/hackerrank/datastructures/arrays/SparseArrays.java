package hackerrank.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        
        int numStrings = scan.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<numStrings;i++){
            String s = scan.next();
            int count=0;
            if(map.containsKey(s))
            	count = map.get(s);
            map.put(s,++count);
        }
        
        int numQueries = scan.nextInt();
        for(int i=0;i<numQueries;i++){
        	String s = scan.next();
        	if(map.containsKey(s))
        		System.out.println(map.get(s));
        	else
        		System.out.println(0);
        }
        
        scan.close();
		
	}

}
