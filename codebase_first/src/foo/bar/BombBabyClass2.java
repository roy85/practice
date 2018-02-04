package foo.bar;

import java.math.BigInteger;

public class BombBabyClass2 {

	public static void main(String[] args) {
//		System.out.println("4,7="+answer("4","7"));
//		System.out.println("0,100="+answer("0", "100"));
//		System.out.println("-2, -121212121212121212="+answer("-2", "-121212121212121212"));
//		System.out.println("-1,0="+answer("-1", "0"));
//		System.out.println("-3,-2"+answer("-3", "-2"));
//		System.out.println("3,2="+answer("3", "2"));
//		System.out.println("1,1="+answer("1", "1"));
//		System.out.println("2,4="+answer("2", "4"));
//		System.out.println("2,121212121212121212="+answer("2", "121212121212121212"));
//		System.out.println("0,0="+answer("0", "0"));
//		System.out.println("100,188="+answer("100", "188"));
//		System.out.println("101,1500="+answer("101", "1500"));
//		System.out.println("1000121212985638, 1000121212985639="+answer("1000121212985638", "1000121212985639"));
		System.out.println("1000121212985639, 1000121212985638="+answer("1000121212985639", "1000121212985638"));
//		System.out.println("200,1400="+answer("200", "1400"));
//		System.out.println("200,400="+answer("200", "400"));
//		System.out.println("9,9="+answer("9", "9"));
//		System.out.println("9,9="+answer("2", "3"));
	}

	public static String answer(String M, String F) {
		String output = "impossible";
		
		try{
			BigInteger numM = new BigInteger(M);
	        BigInteger numF = new BigInteger(F);
	        BigInteger one = new BigInteger("1");
	        	        
	        if(numM.compareTo(one) < 0 || numF.compareTo(one) < 0 || numM.multiply(numF).intValue() == 0){
	        	return "impossible";
	        }
	        
	        BigInteger g = numM.gcd(numF);
	        
	        if((g.compareTo(one) >0 || g.compareTo(one) < 0) && (numM.subtract(numF).abs().remainder(g).intValue() == 0)){
//	        	System.out.println("gcd="+g.intValue());
	        	return "impossible";
	        }
	        
	        BigInteger cycles = getCycles(numM, numF);
	        output = cycles.toString();
		}
		catch(NumberFormatException nfe){
			return "impossible";
		}
		
		
		return output;
	}
	
	private static BigInteger getCycles(BigInteger numM, BigInteger numF){
		BigInteger one = new BigInteger("1");
		
		if(numM.compareTo(one) == 0){
			BigInteger res = numF.subtract(one);
        	return res;
        }
        else if(numF.compareTo(one) == 0){
        	BigInteger res = numM.subtract(one);
        	return res;
        }
        else if(numF.compareTo(numM) == 1) {
        	return getCycles(numF, numM);
        }
        else{
        	BigInteger divFactor = numM.divide(numF);        	
        	return divFactor.add(getCycles(numM.subtract(numF.multiply(divFactor)), numF));
        }
	}
	
	
}

