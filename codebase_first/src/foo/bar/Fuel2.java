package foo.bar;
/*
 * Has Map implementation
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Fuel2 {

	public static void main(String[] args) {
//		System.out.println("Result = "+Solution23.answer("1"));
//		System.out.println("Result = "+Solution23.answer("2"));
//		System.out.println("Result = "+Solution23.answer("3"));
//		System.out.println("Result = "+Solution23.answer("4"));
//		System.out.println("Result = "+Solution23.answer("5"));
		System.out.println("Result = "+Solution24.answer("103"));
		
//		for(int i=0;i<10;i++){
//			System.out.println("Result = "+Solution23.answer(""+i+""));
//		}

	}

}

class Solution24{
	
	public static int answer(String input){
		int steps = 0;
		int finalSteps = 0;
		Stack<NumberObject2> s = new Stack<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		int num = Integer.parseInt(input);
		if(num == 1){
			return 0;
		}
		
		s.push(new NumberObject2(num, steps));
		
		while (!s.isEmpty()){
			{
				NumberObject2 n = (NumberObject2) s.pop();				
				num = n.getNumber();
				steps = n.getSteps();
//				System.out.println("Stack Pop: "+num +";Steps ="+steps);

				if(map.containsKey(num)){
					steps += map.get(num); 
					System.out.println("Continuing for "+num);
					continue;
				}
				
				int preSteps = steps;
				int preNum = num;
				//even numbers
				while(num%2 == 0){
					if(finalSteps > 0 && finalSteps == steps){
						break;
					}
					
					num = num/2;
					steps++;
//					System.out.println("num="+num+", Steps = "+steps);					
				}
				
				if((num == 1) && (steps-preSteps) >0 && !map.containsKey(preNum)){
					map.put(preNum, (steps-preSteps));
				}
				
				if(num%2!=0 && num != 1){
					if(finalSteps > 0 && finalSteps == steps){
						continue;
					}
					steps++;
					s.push(new NumberObject2(num+1, steps));
//					System.out.println("Stack Push: Num="+(num+1)+", Steps="+steps);
					s.push(new NumberObject2(num-1, steps));
//					System.out.println("Stack Push: Num="+(num-1)+", Steps="+steps);
				}
				else{			
					if(finalSteps>0 && steps<finalSteps){
						finalSteps = steps;
					}
					else if(finalSteps == 0){
						finalSteps = steps;
					}
//					System.out.println("finalSteps = "+finalSteps);
				}
			}
		}
		
		
		
		return finalSteps;
	}
}

class NumberObject2{
	private int Number=0;
	private int Steps = 0;
	
	
	public int getNumber() {
		return Number;
	}


	public int getSteps() {
		return Steps;
	}


	public NumberObject2(int Number, int Steps){
		this.Number = Number;
		this.Steps = Steps;
	}
}