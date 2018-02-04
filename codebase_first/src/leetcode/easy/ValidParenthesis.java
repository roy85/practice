package leetcode.easy;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
//		System.out.println(isValid("(())"));
//		System.out.println(isValid(""));
//		System.out.println(isValid("(()){"));
//		System.out.println(isValid("()[]{}"));
//		System.out.println(isValid("()"));
//		System.out.println(isValid("(;"));
//		System.out.println(isValid("(]"));
//		System.out.println(isValid("([)]"));
		System.out.println(isValid("]"));
	}

	//28.88%
	public static boolean isValid(String s) {
		
		if(s!=null && s.length()>0){
			Stack<Character> stack = new Stack<>();
			
			char arr[] = s.toCharArray();
			
			for(int i=0;i<arr.length;i++){
				if(arr[i]=='(' || arr[i]=='{' || arr[i]=='['){
					stack.push(arr[i]);
				}
				else if(!stack.isEmpty()){
					char ret = stack.pop();
					switch(ret){
					case '{':
						if(arr[i]!='}')
							return false;
						break;						
					case '[':
						if(arr[i]!=']')
							return false;
						break;						
					case '(':
						if(arr[i]!=')')
							return false;
						break;
					default:
						return false;
					}
				}
				else if(stack.isEmpty()){
					return false;
				}
			}
			
			if(!stack.isEmpty())
				return false;
		}else{
			return true;
		}
		
		
		return true;
	}
}
