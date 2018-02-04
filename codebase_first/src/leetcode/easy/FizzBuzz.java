package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		for(String s : Solution41.fizzBuzz(31)){
			System.out.println(s);
		}
	}

}

class Solution41{
	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		
		for(int i=1;i<=n;i++){
			if(i%3==0 && i%5!=0){
				list.add("Fizz");
			}
			else if(i%5==0 && i%3!=0){
				list.add("Buzz");
			}
			else if(i%5==0 && i%3==0){
				list.add("FizzBuzz");
			}
			else{
				list.add(Integer.toString(i));
			}
		}
		
		return list;		
    }
}