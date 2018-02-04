package foo.bar.bigd;

//package com.google.challenges; 
import java.math.BigInteger;

public class Answer2 {   
    public static String answer(String M, String F) { 

        try{
			BigInteger numM = new BigInteger(M);
	        BigInteger numF = new BigInteger(F);

	        String output = "impossible";
	        long count = 0;
	        BigInteger one = new BigInteger("1");
	        BigInteger zero = new BigInteger("0");

			BigInteger divFactor = new BigInteger("0");
			
			if(numM.compareTo(numF) == 1){
				divFactor = numM.divide(numF);				
			}
			else if (numF.compareTo(numM) == 1){
				divFactor = numF.divide(numM);
			}
			
			while(numM.compareTo(one) ==1 || numF.compareTo(one) ==1){
				if (!checkIsValid(numM, numF)) {
	                numM = numF = zero;
	            }
				else if (numM.compareTo(numF) == 1) {
					numM = numM.subtract(numF.multiply(divFactor));
	                count = count + divFactor.intValue();	                
	            }
	            else if (numF.compareTo(numM) == 1) {
	                numF = numF.subtract(numM.multiply(divFactor));
	                count = count + divFactor.intValue();
	            }
			}
			
			if (numM.compareTo(one) == 0 && numF.compareTo(one) == 0) {
	            output = ""+count;
	        }

	        return output;	 
		}
		catch(NumberFormatException e){
			return "impossible";
		}
    }
    
    private static boolean checkIsValid(BigInteger numM, BigInteger numF) {
	    boolean valid = true;
	    BigInteger zero = new BigInteger("0");
	    BigInteger one = new BigInteger("1");
	    BigInteger two = new BigInteger("2");
	    if (numM.remainder(two).intValue() == 0 && numF.remainder(two).intValue() == 0) {
	        valid = false;
	    }
	    else if (numM == numF) {
	        valid = false;
	    }
	    else if (numM.compareTo(zero) == -1 || numF.compareTo(zero) == -1) {
	        valid = false;
	    }
	    else if (numM.compareTo(one) == 1 && numF.remainder(numM).intValue() == 0) {
	        valid = false;
	    }
	    else if (numF.compareTo(one) == 1 && numM.remainder(numF).intValue() == 0) {
	        valid = false;
	    }

	    return valid;
	}

}