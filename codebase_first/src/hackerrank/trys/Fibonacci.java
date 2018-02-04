package hackerrank.trys;

public class Fibonacci {

	public static void main(String[] args) {

	}

	private static int fib(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		int[][] M = {{1,1},{1,0}};
		int[][] res = matrix_pow(M,n-1);
		return res[0][0];
	}
	
	private static int[][] matrix_pow(int[][] A, int p){
		if(p==1)
			return A;
		if(p%2==1)
			return A*matrix_pow(A,p-1);
	}
	
}
