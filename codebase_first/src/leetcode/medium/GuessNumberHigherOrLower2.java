package leetcode.medium;

/*
 * Incomplete
 */
public class GuessNumberHigherOrLower2 {

	public static void main(String[] args) {

	}

	public static int getMoneyAmount(int n) {
		int sum=0;
		
		int start =0;
		int end = n;
		
		if(guess(0)==0){
			return 0;
		}
		
		if(guess(n)==0){
			return n;
		}
		
		while(start<end){
			int mid = start + (end-start)/2;
			int result = guess(mid);
			
			if(result==0){	
				break;
			}
			else if(result==-1){
				end = mid;
				sum+=mid;
			}
			else if(result==1){
				start=mid+1;
				sum+=mid;
			}
		}		
		
		return sum;
	}
}
