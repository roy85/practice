package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

	public static void main(String[] args) {
		//create map for numbers, string = 2,abc
		//based on input, and length of inputs, create char arrays from strings and loop -?
		
		
		//create map - 
		
	}

}
//M
class Solution14{
	private Map<Integer, String> mapInt;
	
	public Solution14(){
		init();
	}
	
	private void init(){
		mapInt = new HashMap<>();
		mapInt.put(1,",");
		mapInt.put(2, "abc");
		mapInt.put(3, "def");
		mapInt.put(4, "ghi");
		mapInt.put(5, "jkl");
		mapInt.put(6, "mno");
		mapInt.put(7, "pqrs");
		mapInt.put(8, "tuv");
		mapInt.put(9, "wxyz");
		mapInt.put(0, " ");
	}
	
	
	
	public List<String> letterCombinations(String digits) {
		
		List<String> listCodes = new ArrayList<>();
		//digits = 235
		/*combos from: abc,def,jkl
		 * adj,adk,adl,aej,aek,ael,afj,afk,afl,
		 * bdj,bdk,bdl,bej,bek,bel.bfj,bfk,bfl,
		 * cdj,cdk,cdl,cej,cek,cel,cfj,cfk,cfl
		 * 
		 */
		for(char c : digits.toCharArray()){
			int number = Integer.parseInt(Character.toString(c));
			String code = mapInt.get(number);//abc
			listCodes.add(code);			
		}
		
		char[] charArr = new char[listCodes.size()];
		
		String[] arr = {"abc","def","jkl"};
		
		for(int i=0;i<arr.length;i++){
			StringBuilder sb = new StringBuilder();
			
		}
		
		return null;
    }
}