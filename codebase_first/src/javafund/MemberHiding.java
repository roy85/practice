package javafund;

public class MemberHiding {

	public static void main(String[] args) {
		MyBase base = new MyBase();
		System.out.println(base.iVal);

		MyDerived derived = new MyDerived();
		System.out.println(derived.iVal);
		
		MyBase base2 = new MyDerived();
		System.out.println(base2.iVal);
	}

}
