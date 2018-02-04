package foo.bar;
import java.util.Arrays;

public class Staircase {

	public static void main(String[] args){
		System.out.println("1="+answer(1));
		System.out.println("2="+answer(2));
		System.out.println("3="+answer(3));
		System.out.println("5="+answer(5));
		System.out.println("7="+answer(7));
		System.out.println("10="+answer(10));
		System.out.println("20="+answer(20));
		System.out.println("200="+answer(200));
		System.out.println("12="+answer(12));
	}
	
	public static int answer(int n){
		int sum =0;
				
		int[][] array = new int[n][n];		
		for(int[] eachrow : array){
			Arrays.fill(eachrow, -1);
		}
		
		for(int i=(int)(Math.floor(Math.sqrt(2*n)));i<=n-1;i++)
		{
			sum+=getSum(n-i,i,array);
		}
	    return sum;
	}
	
	private static int getSum(int left, int prev,int[][] array)
    {
		int sum=0;
		
		if(left==0||prev==1) {
        	return 0;
        }
		
        if(array[left][prev]!=-1) {
        	return array[left][prev];
        }
        
        if(prev>left) {
        	sum++;
        }
        
       for(int i=(int)Math.floor(Math.sqrt(left*2));i<=left-1;i++)
       {
           if(i>=prev){
        	   break;
           }
           sum += getSum(left-i,i,array);
       }
       
       array[left][prev]=sum;
       return sum;
    }
	
}
