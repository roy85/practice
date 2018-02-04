package foo.bar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersStationCodedMessage1 {

	public static void main(String[] args) {
		
		NumbersStationCodedMessage num = new NumbersStationCodedMessage();
//		int[] l = {4,3,5,7,8};
//		int[] l = {1,2,3,4};
//		int[] l = {4,3,10,2,8};
		int[] l = {4};
		int t = 4;
		int[] result = num.answer(l, t);		
		for(int i=0;i<result.length;i++){
			System.out.println("result = "+result[i]);
		}
	}

}

class NumbersStationCodedMessage {
	public int[] answer(int[] l, int t){
		int sum =0;
		List<Integer> indexes = new ArrayList<>();
		
		for(int j=0;j<l.length;j++){
			sum = 0;
			indexes.clear();
			for(int i=j;i<l.length;i++){
				
				sum += l[i];
				indexes.add(i);
				
				if(sum >= t){
					break;
				}
				
			}
			
			if(sum == t){
				break;
			}
			else if(sum > t){
				continue;
			}
			else{
				return new int[] {-1,-1};
			}
			
		}
		
		int[] returnArray = new int[2];
		
		if(indexes.size()>0){
			returnArray[0] = indexes.get(0);
			returnArray[1] = indexes.get(indexes.size()-1);
		}
		
		return returnArray;
	}
}