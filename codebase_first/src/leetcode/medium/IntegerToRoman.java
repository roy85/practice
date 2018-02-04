package leetcode.medium;

import java.util.TreeMap;

public class IntegerToRoman {

	public static void main(String[] args) {
		System.out.println(intToRoman(3987));
		System.out.println(intToRoman(3999));
		System.out.println(intToRoman(1));
		System.out.println(intToRoman(12));
		System.out.println(intToRoman(99));
		System.out.println(intToRoman(999));
		System.out.println(intToRoman(5));
		System.out.println(intToRoman(10));
		System.out.println(intToRoman(50));
		System.out.println(intToRoman(100));
		System.out.println(intToRoman(500));
		System.out.println(intToRoman(1000));
	}

	private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

	//13.81%
	public static String intToRoman(int num) {
		
		int l =  map.floorKey(num);
        if ( num == l ) {
            return map.get(num);
        }
        return map.get(l) + intToRoman(num-l);
	}

	//TLE
//	public static String intToRoman(int num) {
//		StringBuilder s = new StringBuilder();
//		
//		if(num>=1000){
//			int x=num/1000;
//			for(int y=0;y<x;y++){
//				s.append("M");
//			}
//			num=num-(x*1000);
//		}
//		if(num>=500){
//			int x=(num-500)/100;
//			if(x==4) s.append("CM");
//			else{
//				s.append("D");
//				for(int y=0;y<x;y++){
//					s.append("C");
//				}
//			}
//			num=num-(x*100)-500;
//		}
//		if(num>=100){
//			int x=num/100;
//			if(x==4) s.append("CD");
//			else {
//				for(int y=0;y<x;y++){
//					s.append("C");
//				}
//			}
//			num=num-(x*100);
//		}
//		if(num>=50){
//			int x=(num-50)/10;
//			if(x==4) s.append("XC");
//			else{
//				s.append("L");
//				for(int y=0;y<x;y++){
//					s.append("X");
//				}
//			}
//			num = num-50-(x*10);
//		}
//		if(num>=10){
//			int x=num/10;
//			if(x==4) s.append("XL");
//			else{
//				for(int y=0;y<x;y++){
//					s.append("X");
//				}
//			}
//			num=num-(x*10);
//		}
//		if(num>=5){
//			int x=num-5;
//			if(x==4) s.append("IX");
//			else{
//				s.append("V");
//				for(int y=0;y<x;y++){
//					s.append("I");
//				}
//			}
//			num=num-5-x;
//		}
//		if(num>=1){
//			if(num==4) s.append("IV");
//			else{
//				for(int y=0;y<num;y++){
//					s.append("I");
//				}
//			}
//			num = 0;
//		}
//		
//		return s.toString();
//	}
}
