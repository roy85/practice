package foo.bar.bigd;

import java.math.BigInteger;

//package com.google.challenges; 

public class Answer {   
    public static int answer(String n) { 
        
		int steps = 0;
		BigInteger num= new BigInteger("0");
		
		try{
			num = new BigInteger(n);
		}
		catch(NumberFormatException exception){
			return 0;
		}
		
		while (num.compareTo(new BigInteger("1")) != 0){
			{	
				//even numbers
				while(Integer.parseInt(num.remainder(new BigInteger("2")).toString()) == 0){					
					num = num.divide(new BigInteger("2"));
					steps++;				
				}
				
				if(num.compareTo(new BigInteger("3")) == 0){
					num = new BigInteger("1");
					steps += 2;
					break;
				}
				
				//Odd numbers, not equal to 1
				if(Integer.parseInt(num.remainder(new BigInteger("2")).toString())!=0 && num.compareTo(new BigInteger("1")) != 0){
					if((num.subtract(new BigInteger("1")).getLowestSetBit()) > (num.add(new BigInteger("1")).getLowestSetBit())){
						num = num.subtract(new BigInteger("1"));
					}
					else
					{
						num = num.add(new BigInteger("1"));
					}
					steps += 1;
				}
			}
		}
		return steps;
    }
}
