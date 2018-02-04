package leetcode.easy;

public class CountPrimes {

	public static void main(String[] args) {
		System.out.println(Solution36.countPrimes(10));
		System.out.println(Solution36.countPrimes(25));
		System.out.println(Solution36.countPrimes(251232343));
		System.out.println(Solution36.countPrimes(0));
		System.out.println(Solution36.countPrimes(1));
	}

}

class Solution36{

	/*
	 * Need to code this.
	 * Logic: 
	 * Each prime is like:
	 *   10
	 *   11
	 *  101
	 *  110
	 * 1011
	 * 1111
	 * .
	 * .
	 * .
	 * .
	 * 
	 */
//	public static int countPrimes(int n) {
//        int count=0;
//        
//        int x=~0;
//        StringBuilder sb = new StringBuilder(Integer.toBinaryString(x));
////        System.out.println(sb.toString());
//        int sbLength = sb.length();
//        int nBinLength = Integer.toBinaryString(n).length();
//        
//        for(int i=2;i<=nBinLength;i++){
//
//        	String n1 = sb.substring(sbLength-i);
//        	System.out.println("n1="+n1);
//        	
//        	if(Integer.parseInt(n1,2)<n){
//        		count++;
//        	}
//        	System.out.println(sb.replace(sbLength-i, sbLength, "0").toString());
//        	n1 = sb.replace(sbLength-i, sbLength, "0").toString().substring(sbLength-i-1);
//        	System.out.println("n1="+n1);
//        	if(Integer.parseInt(n1,2)<n){
//        		count++;
//        	}
//        	
//        }
//        
//        return count;
//    }
	
	//62.01% - https://discuss.leetcode.com/topic/13654/my-simple-java-solution
	public static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }
	
//    public static int countPrimes(int n) {
//        int count=0;
//        if(n>1){
//        int arr[] = new int[n];
//        arr[0]=-1;
//        arr[1]=-1;
//        
//        //22.xx% = 54ms
////        for(int i=2;i<n && (2*i<=n);i++){
//        //28.88% = 44ms
//        for(int i=2;i<n && (i<=Math.sqrt(n));i++){
//        	if(arr[i]==0){
//        		for(int k=(i*2);k<n;k+=i){
//        			if(arr[k]==0){
//        				arr[k] = -1;
//        			}
//        		}
//        	}
//        }
//        
//        for(int i=0;i<n;i++){
//        	if(arr[i]==0){
//        		count++;
//        	}
//        }
//        }
//        return count;
//    }
}