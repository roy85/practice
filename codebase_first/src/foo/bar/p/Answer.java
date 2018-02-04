package foo.bar.p;

//package com.google.challenges; 
import java.util.Stack;

public class Answer {   
    public static int answer(String n) { 

        int steps = 0;
		int finalSteps = 0;
		Stack<NumberObject> s = new Stack<>();
		int num=0;
		
		try{
			num = Integer.parseInt(n);
		}
		catch(NumberFormatException exception){
			return 0;
		}
		if(num <= 1){
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
					System.out.println("finalSteps="+finalSteps+", steps="+steps);
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
