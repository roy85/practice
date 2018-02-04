package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution15{
	public List<String> generateParenthesis(int n) {
		List<String> listInput = new ArrayList<>();
		
		Parenthesis[] arr = new Parenthesis[n];
		
		Stack s = new Stack();
		for(int i=0;i<n;i++){
//			s.push(arg0)
			
		}
		
		//Push all, pop all
		//push 1, pop1 - repeat
		//push 2, pop2 - repeat - n# of times
		//push1, pop1, push2, pop2, etc..
		
		//(((())))=()()()(),(())(()),()((()))
		
	
		
        return null;
    }
}

class Parenthesis{
	private String open="(";
	private String close=")";
}