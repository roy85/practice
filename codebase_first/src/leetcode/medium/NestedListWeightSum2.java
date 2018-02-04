package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a nested list of integers, return the sum of all integers in the list weighted by their depth.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.

Different from the previous question where weight is increasing from root to leaf, now the weight is defined from bottom up. i.e., the leaf level integers have weight 1, and the root level integers have the largest weight.

Example 1:
Given the list [[1,1],2,[1,1]], return 8. (four 1's at depth 1, one 2 at depth 2)

Example 2:
Given the list [1,[4,[6]]], return 17. (one 1 at depth 3, one 4 at depth 2, and one 6 at depth 1; 1*3 + 4*2 + 6*1 = 17)
 */
public class NestedListWeightSum2 {
	private static Map<Integer, Integer> map = new HashMap<>();	
	
	public static void main(String[] args) {
		List<NestedInteger> list = new ArrayList<>();
		NestedInteger n1 = new NestedInteger();
		n1.add(new NestedInteger(1));
		n1.add(new NestedInteger(1));			
		list.add(n1);
		n1 = new NestedInteger(2);
		list.add(n1);
		n1 = new NestedInteger();
		n1.add(new NestedInteger(1));
		n1.add(new NestedInteger(1));			
		list.add(n1);
		System.out.println(depthSumInverse(list));
	}

	//71.18% - copied from https://discuss.leetcode.com/topic/49041/no-depth-variable-no-multiplication
	public static int depthSumInverse(List<NestedInteger> nestedList) {
		int unweighted = 0, weighted = 0;
	    while (!nestedList.isEmpty()) {
	        List<NestedInteger> nextLevel = new ArrayList<>();
	        for (NestedInteger ni : nestedList) {
	            if (ni.isInteger())
	                unweighted += ni.getInteger();
	            else
	                nextLevel.addAll(ni.getList());
	        }
	        weighted += unweighted;
	        nestedList = nextLevel;
	    }
	    return weighted;
	}
	
//	public static int depthSumInverse(List<NestedInteger> nestedList) {
//		int sum = 0;
//		
//		calcDepth(nestedList, 1);
//		
//		for(int n: map.keySet()){
//			sum += n*map.get(n);
//		}		
//		return sum;
//	}

//	private static void calcDepth(List<NestedInteger> nestedList, int depth) {
//		for(NestedInteger i : nestedList){
//			if(i.isInteger())
//				map.put(i.getInteger(), depth);
//			else
//				calcDepth(nestedList, depth+1);
//		}
//	}

	private static class NestedInteger{
		private int value;
		private List<NestedInteger> list;
		
		public NestedInteger(){
			list = new ArrayList<>();
		}
		
		public NestedInteger(int value){
			super();
			this.value=value;
		}
		
		public boolean isInteger(){
			if(this instanceof NestedInteger && list.size()==0){
				return true;
			}
			return false;
		}
		
		public Integer getInteger(){
			if(!this.isInteger()){
				return this.value;
			}
			return null;
		}
		
		public void setInteger(int value){
			this.value=value;
		}
		
		public void add(NestedInteger ni){
			if(ni != null && ni instanceof NestedInteger){
				this.list.add(ni);
			}
		}
		
		public List<NestedInteger> getList(){
			return this.list;
		}
	}
}

