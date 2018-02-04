package leetcode.easy;

public class PowerOfTwo {

	public static void main(String[] args) {
		Solution26 sol = new Solution26();
		
		for(int i=0;i<100;i++){
			System.out.println(i+"="+sol.isPowerOfTwo(i));
		}
		
	}

}

class Solution26 {
    public boolean isPowerOfTwo(int n) {
        boolean isPowerOfTwo = false;
        
    	if(n>0 && (n&(n-1)) == 0){
    		isPowerOfTwo = true;
    	}
    	
    	return isPowerOfTwo;
    }
}