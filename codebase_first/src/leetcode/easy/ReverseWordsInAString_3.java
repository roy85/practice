package leetcode.easy;

import java.util.Arrays;

public class ReverseWordsInAString_3 {

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
				
		System.out.println(sol.reverseWords("This Let's is a sentence"));
	}

}

class Solution6{
	public String reverseWords(String s) {
		
		String[] strings = s.split(" ");
		
		String returnString = "";
		
		for(int i=0;i<strings.length;i++){
			returnString+=reverse(strings[i]);
			if(i<strings.length-1){
				returnString+=" ";
			}
		}
		
		return returnString;
	}

	private String reverse(String string) {
		char[] stringArray = string.toCharArray();
		int Lptr=0,Rptr=stringArray.length-1;
		
		for(;Lptr<Rptr;Lptr++, Rptr--){
			char temp = stringArray[Rptr];
			stringArray[Rptr]=stringArray[Lptr];
			stringArray[Lptr] = temp;
		}
		
		return new String(stringArray);
	}
}

class Solution5{
	private char[] arr;
	public String reverseWords(String s) {
		arr = s.toCharArray();
		
		int Lptr=0,Rptr=0,Fptr=0;
		
		for(; Lptr<arr.length;Lptr=Fptr,Rptr=Fptr){
			
			while((Rptr<arr.length-1) && arr[Rptr+1] != ' '){
				Rptr++;
			}
			
			Fptr = Rptr;
			
			while(Lptr<Rptr && Rptr<arr.length){
				swap(Lptr, Rptr);
				Lptr++;
				Rptr--;
			}
			
			++Fptr;
			while(Fptr<arr.length && arr[Fptr] == ' '){
				//loop - pass all the whitespace
				Fptr++;
			}
			
			if(Fptr>=arr.length-1){
				return new String(arr);
			}
		
		}
		
		throw new IllegalArgumentException("No solution for ReverseWordsInAString_3");
    }
	
	
	private void swap(int l, int r) {
		if(arr.length>0){
			if(l < r){
				char temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
	}
}