package others;

/*
 * http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 * If n is even then k = n/2:
F(n) = [2*F(k-1) + F(k)]*F(k)

If n is odd then k = (n + 1)/2
F(n) = F(k)*F(k) + F(k-1)*F(k-1)
How does this formula work?
The formula can be derived from above matrix equation.
fibonaccimatrix

Taking determinant on both sides, we get
(-1)n = Fn+1Fn-1 – Fn2
Moreover, since AnAm = An+m for any square matrix A, the following identities can be derived (they are obtained form two different coefficients of the matrix product)

FmFn + Fm-1Fn-1 = Fm+n-1

By putting n = n+1,

FmFn+1 + Fm-1Fn = Fm+n

Putting m = n

F2n-1 = Fn2 + Fn-12

F2n = (Fn-1 + Fn+1)Fn = (2Fn-1 + Fn)Fn (Source: Wiki)

To get the formula to be proved, we simply need to do following
If n is even, we can put k = n/2
If n is odd, we can put k = (n+1)/2
 */
public class FibonacciLessThanOn {

	public static void main(String[] args) {
		System.out.println(fib(9));
	}
	
	static int[] F = new int[1000];	

	public static int fib(int n){
		if(n==0)
			return 0;
		
		if(n==1 || n==2)
			return 1;
		
		if(F[n]>0)
			return F[n];
		
		int k = (n%2==0) ? n/2 : (n+1)/2;
		
		F[n] = (n%2==0) ? (2*fib(k-1) + fib(k))*fib(k) : (fib(k)*fib(k) + fib(k-1)*fib(k-1));
		
		return F[n];
	}
	
}
