package foo.bar;

import java.util.ArrayList;
import java.util.List;

public class En_Route_SaluteClass {

	public static void main(String[] args) {
		Solution22 sol = new Solution22();
		System.out.println("Result = "+sol.answer2("<--->"));
		System.out.println("Result = "+sol.answer2(">--->"));
		System.out.println("Result = "+sol.answer2(">---<"));
		System.out.println("Result = "+sol.answer2("<<>><"));
		System.out.println("Result = "+sol.answer2("--->-><-><-->-"));
		System.out.println("Result = "+sol.answer2("----------------"));
		System.out.println("Result = "+sol.answer2("<<<<<<<<<<<<"));
		System.out.println("Result = "+sol.answer2(">>>>>>>>"));
		System.out.println("Result = "+sol.answer2(">>>>>>><>>>>>>>"));

	}

}

class Solution22{
	public static int answer(String s){
		int salutes =0;
		
		if(s.contains("<") && s.contains(">")){
			List<Integer> rList = new ArrayList<>();
			List<Integer> lList = new ArrayList<>();
			
			
			char[] charArray = s.toCharArray();
			
			for(int i=0;i<s.length();i++){
				if(charArray[i] == '<'){
					lList.add(i);
				}
				else if(charArray[i] == '>'){
					rList.add(i);
				}
			}
			
			for(int i=0;i<lList.size();i++){
				for(int j=0;j<rList.size();j++){
					if(lList.get(i)>rList.get(j)){
						salutes+=2;
					}
					else{
						break;
					}
				}
			}
		}
		
		return salutes;
	}
	
	public static int answer2(String s){
		int salutes =0;
		
		char[] array = s.toCharArray();
		boolean isContainsL = false;
		boolean isContainsR = false;
		List<Integer> lList = new ArrayList<>();
		List<Integer> rList = new ArrayList<>();
		
		for(int i=0;i<array.length;i++){
			if(array[i] == '<'){
				lList.add(i);
				if(!isContainsL){
					isContainsL = true;
				}
				salutes+= (2*rList.size());
			}
			else if(array[i] == '>'){
				rList.add(i);
				if(!isContainsR){
					isContainsR = true;
				}
			}
		}
				
		return salutes;
	}
}
