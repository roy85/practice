package leetcode.medium;

import java.util.LinkedList;
import java.util.List;

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

 * 
 * https://discuss.leetcode.com/topic/8724/easy-to-understand-java-backtracking-solution/15
 */
public class GenerateParenthesis {

	public static void main(String[] args) {

	}

	 public List<String> generateParenthesis(int n) {
	        List<String> result = new LinkedList<>();
	        char[] sample = new char[2*n];
	        generate(sample, 0, 0, result);
	        return result;
	    }
	    
	    private void generate(char[] s, int open, int closed, List<String> result) {
	        if (open + closed == s.length) {
	            result.add(new String(s));
	            return;
	        }
	        if (open < s.length/2) {
	            s[open+closed] = '(';
	            generate(s, open+1, closed, result);
	        }
	        if (open > closed) {
	            s[open+closed] = ')';
	            generate(s, open, closed+1, result);
	        }
	    }
}
