package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
/*
 * Improve
 * 3.41%
 */
public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("A"));
		System.out.println(titleToNumber("F"));
		System.out.println(titleToNumber("AZ"));
		System.out.println(titleToNumber("DF"));
		System.out.println(titleToNumber("AZZ"));
	}

	private static Map<Character, Integer> map = new HashMap<>();
	
	static{
		map.put('A', 1);map.put('B', 2);map.put('C',3);map.put('D',4);map.put('E',5);map.put('F',6);
		map.put('G',7);map.put('H', 8);map.put('I',9);map.put('J',10);map.put('K',11);map.put('L',12);
		map.put('M', 13 );map.put('N', 14);map.put('O',15);map.put('P',16);map.put('Q',17);map.put('R',18);
		map.put('S', 19);map.put('T', 20);map.put('U',21);map.put('V',22);map.put('W',23);map.put('X',24);
		map.put('Y', 25);map.put('Z', 26);				
	}
	
	public static int titleToNumber(String s) {
		int sum=0;
		
		if(s==null || s.length()==0){
			return 0;
		}
		
		for(int i=s.length()-1, j=0;i>=0;i--,j++){
			sum += (map.get(s.charAt(i))*Math.pow(26, j));
		}
		
		return sum;
	}
}
