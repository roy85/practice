package leetcode.easy;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AddBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("10", "101"));
		System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", 
				"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
	}

//	public static String addBinary2(String a, String b) {
//
//	}
	
	public static String addBinary(String a, String b) {

		int x = Integer.parseInt(a, 2);
		int y = Integer.parseInt(b, 2);
		
		return Integer.toBinaryString(x+y);
	}

	
//	public static String addBinary(String a, String b) {
//
//		BigInteger c = new BigInteger(a, 2);
//		BigInteger d = new BigInteger(b, 2);
//		
//		return d.add(c).toString();
//	}
}

class Solution40{
    public static String addBinary(String a, String b) {
        int carry=0;
        int sum=0;
        char x,y;
        StringBuilder sb = new StringBuilder();
        int i=0;
    	for(i=0;i<a.length() && i<b.length();i++){
    		x= Integer.parseInt( Character.toString(a.charAt(a.length()-i-1)));
			y=b.charAt(b.length()-i-1);
			if(carry>0){
				carry=carry&x&y;
				sum = carry^x^y;    				
			}
			else{
				carry = x&y; 
    			sum = x^y;
			}
			
			sb.append(sum);
    	}
    	String temp="";
    	if(i<a.length()){
    		temp=a;
    	}
    	else if(i<b.length()){
    		temp=b;
    	}
        
    	carry=0;
    	sum=0;
    	for(;i<temp.length();i++){
    		x=temp.charAt(a.length()-i-1);			
			if(carry>0){
				carry=carry&x;
				sum = carry^x;    				
			}
			else{
    			sum = x;
			}
			sb.append(sum);
    	}
    	sb.reverse();
    	
    	return null;
    }
}