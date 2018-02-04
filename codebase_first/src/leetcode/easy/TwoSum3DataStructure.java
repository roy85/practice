package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.Map.Entry;

/*
 * 170. Two Sum III - Data structure design
 * Design and implement a TwoSum class. It should support the following operations: add and find.

add - Add the number to an internal data structure.
find - Find if there exists any pair of numbers which sum is equal to the value.

For example,
add(1); add(3); add(5);
find(4) -> true
find(7) -> false

Companies: Linkedin
 */

public class TwoSum3DataStructure {

	public static void main(String[] args) {
		TwoSum3 t = new TwoSum3();
		t.add(1);
		t.add(3);
		t.add(5);
		System.out.println(t.find(4));
		System.out.println(t.find(7));
		System.out.println(t.find(1));
		
		TwoSum3 t2 = new TwoSum3();
		t2.add(1);
		t2.add(5);
		t2.add(1);
		System.out.println(t2.find(2));
	}

	
}

//Another option:https://discuss.leetcode.com/topic/32449/trade-off-in-this-problem-should-be-considered -- not working now.
//but clever:
/*
 * 
 */
//Much better soln: https://discuss.leetcode.com/topic/32786/beats-100-java-code
//92.02%
class TwoSum3 {
    private List<Integer> list = new ArrayList<Integer>();
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    /** Initialize your data structure here. */
    public TwoSum3() {

    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
    	if (map.containsKey(number)) map.put(number, map.get(number) + 1);
	    else {
	        map.put(number, 1);
	        list.add(number);
	    }
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
    	for (int i = 0; i < list.size(); i++){
	        int num1 = list.get(i), num2 = value - num1;
	        if ((num1 == num2 && map.get(num1) > 1) || (num1 != num2 && map.containsKey(num2))) return true;
	    }
	    return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */


//61.10% - https://discuss.leetcode.com/topic/32786/beats-100-java-code/8
//class TwoSum3{
////	List<Integer> list;
//	// inspired by: https://leetcode.com/discuss/19515/my-solutions-java-and-python-time-for-add-time-for-find-space
//		// to use Entry<Key,Val> to optimize, but still no where near the performance
//		// using a List<Key> that contains all distinct values from: 
//		// https://leetcode.com/discuss/76823/beats-100%25-java-code
//		
//		// I suspect that this is due to the performance drag by the Set's iterator 
//		
//	    Map<Integer, Boolean> num2dupMap = new HashMap<Integer, Boolean>();
//	/** Initialize your data structure here. */
//    public TwoSum3() {
//        
//    }
//    
//    /** Add the number to an internal data structure.. */
//    public void add(int number) {
//    	// add number to a map, if already exist, set it to true    	
//    	num2dupMap.put(number, num2dupMap.containsKey(number));
//    }
//    
//
//    /** Find if there exists any pair of numbers which sum is equal to the value. */
//    public boolean find(int value) {
//    	// for each of the number in the map, get the (value - number)
//    	// try to find (value - number) in the map
//    	// if it exits in the map, 
//    	for(Map.Entry<Integer, Boolean> entry: num2dupMap.entrySet()){
//    		int num1 = entry.getKey();
//    		int num2 = value - num1;
//    		if (num1 == num2 && entry.getValue()){
//    			// 1. could be number2 = (value - number1) hence to make sure it not only 
//    			// 	just found the original number, but a 2nd number of the same value, 
//    			// 	we need to && map.get(number2) == true
//    			//  then return true
//    			return true;
//    		} else if (num1 != num2 && num2dupMap.containsKey(num2)){
//    			// 2. could be number2 != (value - number1), and if we `enter code here`found it, we 
//    			// 	found a winner
//    			return true;
//    		}
//    	}
//    	return false;
//    }
////TLE
//    //    public boolean find(int value) {
////        boolean isSuccess = false;
////        
////        for(int i=0;i<list.size();i++){
//////        	int x = list.get(i);
////        	for(int j=0;j<list.size();j++){
////        		if(i!=j && list.get(j)==value-list.get(i)){
////        			return true;
////        		}
////        	}
////        }
////        
////        return isSuccess;
////    }
//}