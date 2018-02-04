package leetcode.easy;

public class GuessNumberHigherOrLower {

	public static void main(String[] args) {

	}

	//22.35%
	public static int guessNumber(int n) {
		
		int start =0;
		int end = n;
		
		if(guess(n)==0){
			return n;
		}
		else if(guess(0)==0){
			return 0;
		}
		else{
			while(start<end){
				int mid = start + (end-start)/2;
				if(guess(mid)==0){
					return mid;
				}
				else if(guess(mid)==-1){
					end = mid;
				}
				else if(guess(mid)==1){
					start=mid+1;
				}
			}
		}
		
		return 0;
	}
}
