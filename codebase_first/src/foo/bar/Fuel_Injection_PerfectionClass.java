package foo.bar;

import java.util.Stack;

public class Fuel_Injection_PerfectionClass {

	public static void main(String[] args) {
//		System.out.println("Result = "+Solution23.answer("1"));
//		System.out.println("Result = "+Solution23.answer("2"));
//		System.out.println("Result = "+Solution23.answer("3"));
//		System.out.println("Result = "+Solution23.answer("4"));
//		System.out.println("Result = "+Solution23.answer("5"));
		System.out.println("Result = "+Solution23.answer("17"));
		
//		for(int i=0;i<10;i++){
//			System.out.println("Result = "+Solution23.answer(""+i+""));
//		}

	}

}

class Solution23{
	
	public static int answer(String n){
		int steps = 0;
		int finalSteps = 0;
		Stack<NumberObject> s = new Stack<>();
		
		
		int num = Integer.parseInt(n);
		if(num == 1){
			return 0;
		}
		
		s.push(new NumberObject(num, steps));
		
		while (!s.isEmpty()){
			{
				NumberObject nObject = (NumberObject) s.pop();				
				num = nObject.getNumber();
				steps = nObject.getSteps();							
				
				//even numbers
				while(num%2 == 0){
					if(finalSteps > 0 && finalSteps == steps){
						break;
					}
					
					num = num/2;
					steps++;				
				}
				
				//Odd numbers, not equal to 1
				if(num%2!=0 && num != 1){
					if(finalSteps > 0 && finalSteps == steps){
						continue;
					}
					steps++;
					s.push(new NumberObject(num+1, steps));
					s.push(new NumberObject(num-1, steps));
				}
				else{					
					finalSteps = steps;
				}
			}
		}
		return finalSteps;
	}
}

class NumberObject{
	private int Number=0;
	private int Steps = 0;
	
	
	public int getNumber() {
		return Number;
	}


	public int getSteps() {
		return Steps;
	}


	public NumberObject(int Number, int Steps){
		this.Number = Number;
		this.Steps = Steps;
	}
}