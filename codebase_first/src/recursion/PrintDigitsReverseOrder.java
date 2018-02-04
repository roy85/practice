package recursion;

public class PrintDigitsReverseOrder {

	public static void main(String[] args) {
		printDigitsReverse(5324);
		System.out.println("----");
		printDigitsReverse(510);
	}

	private static void printDigitsReverse(int n){
		int x = n%10;
		System.out.println(x);
		n=n/10;
		if(n>0 && x!=n)
			printDigitsReverse(n);
	}
}
