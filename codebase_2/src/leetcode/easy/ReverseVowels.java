package leetcode.easy;

import java.util.Arrays;

public class ReverseVowels {

	public static void main(String[] args) {
		System.out.println(reverseVowels("Hello"));
	}

	public static String reverseVowels(String s){
		char[] carr = s.toCharArray();
		
		int p1=-1,p2=-1;
		
		for(int i=0,j=carr.length-1;i<j;){
			if(isVowel(carr[i])){
				if(p1<0)
					p1=i;
			}
			else{
				i++;
			}
			if(isVowel(carr[j])){
				if(p2<0)
					p2=j;
			}
			else
				j--;
			
			if(p1>=0 && p2>=0){
				char temp = carr[p1];
				carr[p1] = carr[p2];
				carr[p2] = temp;
				p1=-1;p2=-1;i++;j--;
			}
		}
		
		return new String(carr);
	}
	
	private static boolean isVowel(char c){
		return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
}
