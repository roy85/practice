package leetcode.easy;

public class ReverseString_2 {

	public static void main(String[] args) {

		Solution7 sol = new Solution7();
		System.out.println(sol.reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl", 39));
//		System.out.println(sol.reverseStr("abcdefgh", 2));
//		System.out.println(sol.reverseStr("abcdefg", 4));
//		System.out.println(sol.reverseStr("abcdefg", 8));
		
	}

}

class Solution7 {
	public String reverseStr(String s, int k) {
        int len = s.length();
        char[] arr = s.toCharArray();
        boolean isReversedK=false;
        
        for(int i=0;i<len;){
        	if(!isReversedK){
        		if(i+k<len)
        		{
        			reverse(arr,i,i+k-1);
        			i+=k;
        		}
        		else
        		{
        			reverse(arr,i,(len-1));
        			i=len;
        		}
        		isReversedK=true;
        	}
        	else{
        		if(i+k<len)
        			i+=k;
        		else
        			i=len;
        		isReversedK=false;
        	}
        }
        
        return new String(arr);
    }

	private void reverse(char[] arr, int i, int j) {
		while(i<j){
			char temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
	}
	
//    public String reverseStr(String s, int k) {
//        if(s.length() <=k){
//        	return new StringBuilder(s).reverse().toString();
//        }
//        
//        int num = s.length()/k;
//        boolean isReverse = true;
//        StringBuilder sb = new StringBuilder();
//        int start = 0;
//        
//        for(int i=0;i<num;i++, start=k*i){
//        	
//        	StringBuilder sb1 = new StringBuilder(s.substring(start, start + k));
//        	
//        	if(isReverse){
//        		sb = sb.append(sb1.reverse());
//        		isReverse = false;
//        	}
//        	else{
//        		sb = sb.append(sb1);
//        		isReverse = true;
//        	}
//        }
//        
//        if(start < s.length()){
//        	if(isReverse)
//        	{
//        		sb.append(new StringBuilder(s.substring(start, s.length())).reverse());
//        	}
//        	else{
//        		sb.append(new StringBuilder(s.substring(start, s.length())));
//        	}
//        }
//        
//        return sb.toString();
//        
//    }
}
