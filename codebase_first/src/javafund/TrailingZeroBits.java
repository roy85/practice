package javafund;

public class TrailingZeroBits {

	public static void main(String[] args) {
		System.out.println("Result = "+getCountBits(2));
	}

	public static int getCountBits(int num){
		int nbrOfBits=0;
		
		nbrOfBits = Integer.numberOfTrailingZeros(num);
		
		return nbrOfBits;
	}
	
}
