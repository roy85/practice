package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Incomplete.
 */
public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
//		System.out.println(convertToTitle(23));
//		System.out.println(convertToTitle(28));
//		System.out.println(convertToTitle(260));
		System.out.println(convertToTitle(730));
	}

	private static Map<Integer, Character> map = new HashMap<>();
	
	static{
		map.put(1, 'A');map.put(2, 'B');map.put(3, 'C');map.put(4, 'D');map.put(5, 'E');map.put(6, 'F');
		map.put(7, 'G');map.put(8, 'H');map.put(9, 'I');map.put(10, 'J');map.put(11, 'K');map.put(12, 'L');
		map.put(13, 'M');map.put(14, 'N');map.put(15, 'O');map.put(16, 'P');map.put(17, 'Q');map.put(18, 'R');
		map.put(19, 'S');map.put(20, 'T');map.put(21, 'U');map.put(22, 'V');map.put(23, 'W');map.put(24, 'X');
		map.put(25, 'Y');map.put(26, 'Z');				
	}
	
	public static String convertToTitle(int n) {
		
		StringBuilder sb = new StringBuilder();
		
//		if(n<26){
//			return map.get(n).toString();
//		}
//		if(n>26){
//			
//		}
		
		if(n/26<0){
			return map.get(n).toString();
		}
		else{
			while(n>0){
				if(n/26<=26){
					sb.append(map.get(n));
				}
			}
		}
		
		return null;
	}
	
//	public static String convertToTitle(int n) {
//			
//		if(n<26){
//			return map.get(n);
//		}
//		if(n>26){
//			int x = n-26;
//			
//			int div = x/26;
//			int rem = x%26;
//			
//			String divS = '';
//			String remS='';
//			if(rem>0){
//				remS = map.get(rem);
//			}
//			else{
//				remS='Z';
//			}
//			
//			if(div<26){
//				divS = map.get(div);
//			}
//			else{
//				return convertToTitle(div) + remS; 
//			}
//			
//			return divS+remS;
//			
//		}
//		
//		return null;
//	}
	
//	public static String convertToTitle(int n) {
//		
//		
//		if(n<26){
//			return map.get(n);
//		}
//		if(n>26){
//			int div = n/26;
//			int rem = n%26;
//			
//			String divS = '';
//			String remS='';
//			if(rem>0){
//				remS = map.get(rem);
//			}
//			
//			if(div<26){
//				divS = map.get(div);
//			}
//			else{
//				return convertToTitle(div) + remS; 
//			}
//			
//			return divS+remS;
//			
//		}
//		
//		return null;
//	}
}
