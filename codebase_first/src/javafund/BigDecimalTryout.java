package javafund;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalTryout {

	public static void main(String[] args) {
		BigInteger bigD = new BigInteger("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
		System.out.println("%=" + bigD.remainder(new BigInteger("2")));
		
		BigInteger big = new BigInteger("2");
		System.out.println("2="+big.getLowestSetBit());
		
		big = new BigInteger("8");
		System.out.println("8="+big.getLowestSetBit());
		
		big = new BigInteger("4");
		System.out.println("4="+big.getLowestSetBit());
		
		big = new BigInteger("6");
		System.out.println("6="+big.getLowestSetBit());
	}

}
