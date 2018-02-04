package leetcode.hard;
//https://github.com/IDeserve/learn/blob/master/PalindromePartitionMinCut.java
public class PalindromePartitioning2 {

	public static void main(String[] args) {
		System.out.println(minCut("anana"));
	}

	public static int minCut(String s) {
			if(s==null || s.isEmpty())
				return -1;
		  int n = s.length();//get length of string
		  //creating a boolean matrix
		  boolean T[][] = new boolean[n][n];
		  
		  //Trivial case: single letter palindromes
		  for (int i = 0; i < n; i++) {
			  T[i][i] = true;
		  }
		  
		  //Finding palindromes of two characters.
		  for (int i = 0; i < n-1; i++) {
		    if (s.charAt(i) == s.charAt(i+1)) {
		      T[i][i+1] = true;
		    }
		  }
		  
		  //Finding palindromes of length 3 to n
		  for (int curr_len = 3; curr_len <= n; curr_len++) {
		    for (int i = 0; i < n-curr_len+1; i++) {
		      int j = i+curr_len-1;
		      if (s.charAt(i) == s.charAt(j)//1. The first and last characters should match 
		    	  && T[i+1][j-1]) //2. Rest of the substring should be a palindrome
		      {
		    	T[i][j] = true; 
		      }
		    }
		  }
		  
		  int[] cutsArray = new int[n];
		  for(int i=0; i<n; i++)
		  {
			  int temp = Integer.MAX_VALUE;
			  if(T[0][i])
				  cutsArray[i] = 0;
			  else
			  {
				  for(int j=0; j<i; j++)
				  {
					 if((T[j+1][i]) && temp > cutsArray[j] + 1) 
					 {
						 temp = cutsArray[j] + 1;
					 }
				  }
				  cutsArray[i] = temp;
			  }			  
		  }
		  return cutsArray[n-1];
	}
}
