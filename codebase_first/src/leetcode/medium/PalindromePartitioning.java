package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		List<List<String>> list = partition("aab");
		if(list==null || list.size()==0)
			System.out.println("No results returned");
		
		for(List<String> l : list){
			for(String s : l){
				System.out.print(s+"\t");
			}
		}
 	}

	public static List<List<String>> partition(String s) {
		if(s==null || s.isEmpty())
			return null;
	  int n = s.length();
	  boolean T[][] = new boolean[n][n];
	  List<List<String>> list = new ArrayList<>();
	  List<String> l1 = new ArrayList<>();
	  
	  for (int i = 0; i < n; i++) {
		  T[i][i] = true;
		  l1.add(Character.toString(s.charAt(i)));
	  }
	  list.add(l1);
	  
	  List<String> l2 = new ArrayList<>();
	  for (int i = 0; i < n-1; i++) {
	    if (s.charAt(i) == s.charAt(i+1)) {
	      T[i][i+1] = true;
	      l2.add(s.substring(i, i+2));
	    }
	  }
	  list.add(l2);
	  
	  List<String> l3 = new ArrayList<>();
	  for (int curr_len = 3; curr_len <= n; curr_len++) {
	    for (int i = 0; i < n-curr_len+1; i++) {
	      int j = i+curr_len-1;
	      if (s.charAt(i) == s.charAt(j) 
	    	  && T[i+1][j-1]) 
	      {
	    	T[i][j] = true;
	    	l3.add(s.substring(i, j));
	      }
	    }
	  }	  	
	  list.add(l3);	  
	  
	  return list;
	}
}
