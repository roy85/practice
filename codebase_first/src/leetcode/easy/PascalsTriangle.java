package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
//		System.out.println(generate(1));
//		System.out.println(generate(2));
		System.out.println(generate(3));
		System.out.println(generate(4));
		System.out.println(generate(5));
	}

	public static List<List<Integer>> generate(int numRows){
		List<List<Integer>>	triangle = new ArrayList<>();
		
		if(numRows==0)
			return triangle;
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		triangle.add(list);
		if(numRows==1)
		{
			return triangle;
		}
		
		list = new ArrayList<>();
		list.add(1);
		list.add(1);
		triangle.add(list);
		if(numRows==2)
		{
			return triangle;
		}
		
		getLists(triangle, 1, numRows-1);
		
		return triangle;
	}

	private static void getLists(List<List<Integer>> triangle,
			int previousRow, int numRows) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		for(int i=0;i<triangle.get(previousRow).size()-1;i++){
			list.add(triangle.get(previousRow).get(i)
					+triangle.get(previousRow).get(i+1));
		}
		list.add(1);
		triangle.add(list);
		if(previousRow<numRows-1)
			getLists(triangle, previousRow+1, numRows);
	}
}
