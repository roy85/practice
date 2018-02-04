package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Numbers can be regarded as product of its factors. For example,

8 = 2 x 2 x 2;
  = 2 x 4.
Write a function that takes an integer n and return all possible combinations of its factors.

Note: 
You may assume that n is always positive.
Factors should be greater than 1 and less than n.
Examples: 
input: 1
output: 
[]
input: 37
output: 
[]
input: 12
output:
[
  [2, 6],
  [2, 2, 3],
  [3, 4]
]
input: 32
output:
[
  [2, 16],
  [2, 2, 8],
  [2, 2, 2, 4],
  [2, 2, 2, 2, 2],
  [2, 4, 4],
  [4, 8]
]

 */


//Recursive Solution: https://discuss.leetcode.com/topic/21082/my-recursive-dfs-java-solution/3

public class FactorCombinations {

	public static void main(String[] args) {
//		System.out.println(getFactors(25));
//		System.out.println(getFactors(12));
//		System.out.println(getFactors(16));
//		System.out.println(getFactors(32));
	}

	//74.22% - Backtracking - https://discuss.leetcode.com/topic/42288/very-easy-to-understand-2ms-java-backtracking-solution
	/*
	 * The upper bound for the factors of n is (int)sqrt(n), and when you find one factor of n, then put the factor 
	 * and its corresponding factor to a temp list, and add the temp list to the result list. Then we remove the larger 
	 * factor from the temp list, and recursively do the larger factor from the smaller factor to upper bound for the 
	 * same procedure.

For example, n = 16. Let the variable i be from 2 to 4, when i = 2, then i is one factor of 16, and its corresponding 
factor is 8, so we add 2 and 8 to a temp list, then add the temp list to the result list. And remove 8 from the temp 
list, and recursively do 8 from 2 to 2 for the same procedure.

The result should be:
[2, 8]
[2, 2, 4]
[2, 2, 2, 2]
[4, 4]
	 */
	public List<List<Integer>> getFactors(int n) {
	    List<List<Integer>> res = new ArrayList<>();
	    backTrack(res, new ArrayList<Integer>(), 2, n);
	    return res;
	}

	public void backTrack(List<List<Integer>> res, List<Integer> cur, int start, int n) {
	    int upper = (int)Math.sqrt(n);
	    for(int i = start; i <= upper; i++) {
	        int factor = -1;
	        if(n % i == 0) {
	            factor = n/i;
	        }
	        if(factor != -1) {
	            cur.add(i);
	            cur.add(factor);
	            res.add(new ArrayList<Integer>(cur));
	            cur.remove(cur.size()-1);
	            backTrack(res, cur, i, factor);
	            cur.remove(cur.size()-1);
	        }
	    }
	}
	
	//74.22% - https://discuss.leetcode.com/topic/30752/my-short-java-solution-which-is-easy-to-understand
//	public List<List<Integer>> getFactors(int n) {
//        List<List<Integer>> ret = new LinkedList<List<Integer>>();
//        if(n <= 3)  return ret;
//        List<Integer> path = new LinkedList<Integer>();
//        getFactors(2, n, path, ret);
//        return ret;
//    }
//    
//    private void getFactors(int start, int n, List<Integer> path, List<List<Integer>> ret){
//       for(int i = start; i <= Math.sqrt(n); i++){
//           if(n % i == 0 && n/i >= i){  // The previous factor is no bigger than the next
//               path.add(i);
//               path.add(n/i);
//               ret.add(new LinkedList<Integer>(path));
//               path.remove(path.size() - 1);
//               getFactors(i, n/i, path, ret);
//               path.remove(path.size() - 1);
//           }
//       }
//    }
	
//	public static List<List<Integer>> getFactors(int n) {
//		if(n<2)
//			return null;
//		
//		List<List<Integer>> L2 = new ArrayList<List<Integer>>();
//		
//		for(int i=2;i<n/2;i++){
//			if(n%i==0){
//				List<Integer> L1 = new ArrayList<>();
//				int m=n;
//				int j=i;
//				while(m>0 && j<n){
//					if(m%j==0){
//						m=m/j;
//						if(m<j)
//						{
//							break;
//						}
//						L1 = new ArrayList<>(L1);
//						if(L1.size()>0)
//							L1.remove(L1.size()-1);
//						L1.add(j); L1.add(m);
//						L2.add(L1);
//						if(m<2*j)
//							break;
//						continue;
//					}
//					j++;
//				}
//			}
//			
//		}
//		
//		return L2;
//	}
}
