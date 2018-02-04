package ctci.tryout.ch9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParens {

	public static void main(String[] args) {
		List<String> l = generateParens(3);
	}
	
	private static void addParen(List<String> list, int leftRem, int rightRem, char[] str, int count)
	{
		if(leftRem<0 || rightRem<leftRem)
			return;
		
		if(leftRem==0 && rightRem==0){
			String s = String.copyValueOf(str);
			System.out.println("adding to list="+s);
			list.add(s);
		}
		else{
			if(leftRem>0){
				str[count] = '(';System.out.println("adding left paren="+Arrays.toString(str)
				+"; leftRem="+leftRem+"; rightRem="+rightRem+"; count="+count);
				addParen(list, leftRem-1, rightRem, str, count+1);
			}
			
			if(rightRem>leftRem){
				str[count] = ')';System.out.println("adding right paren="+Arrays.toString(str)
				+"; leftRem="+leftRem+"; rightRem="+rightRem+"; count="+count);
				addParen(list, leftRem, rightRem-1, str, count+1);
			}
		}
	}
	
	public static List<String> generateParens(int count){
		char[] str = new char[count*2];
		List<String> list = new ArrayList<>();
		addParen(list, count, count, str, 0);
		return list;
	}
}
