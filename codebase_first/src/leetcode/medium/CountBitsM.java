package leetcode.medium;

import java.util.Arrays;

public class CountBitsM {

	public static void main(String[] args) {
//		System.out.println(Solution33.countBitsE3(5));
		System.out.println("8="+Arrays.toString(Solution33.countBits(5)));
	}

}

class Solution33{
	public static int[] countBits(int num) {
		int[] returnArray = new int[num+1];
		for(int j=0;j<=num;j++){
			int ret=0;
		    ret = (j & 0x55555555)
		        + ((j >> 1) & 0x55555555);
		    ret = (ret & 0x33333333)
		        + ((ret >> 2) & 0x33333333);
		    ret = (ret & 0x0F0F0F0F)
		        + ((ret >> 4) & 0x0F0F0F0F);
		    ret = (ret & 0x00FF00FF)
		        + ((ret >> 8) & 0x00FF00FF);
		    ret = (ret & 0x0000FFFF)
		        + ((ret >> 16) & 0x0000FFFF);
		    
		    returnArray[j] = ret;
		}		
		return returnArray;
    }
	
	public static int countBitsE2(int num){
		//http://www.toves.org/books/bitops/
		//right-shift the number 32 times, counting the number of times you right-shift a one bit off.
		/*
		 * 101 & 111=101
		 */
		int ret = 0;
	    int cur = num;
	    int i;
	    for (i = 0; i < 32; i++) {System.out.println("i="+i);
	        ret += cur & 1;System.out.println("ret="+Integer.toBinaryString(ret)+", cur="+Integer.toBinaryString(cur)
	        +", cur & 1="+Integer.toBinaryString(cur&1));
	        cur >>= 1;System.out.println("cur="+Integer.toBinaryString(cur));
	    }
	    return ret;
	}
	
	public static int countBitsE3(int num){
		int ret = 0;
	    int mask = 1;
	    int i;
	    for (i = 0; i < 32; i++) {
	    	//System.out.println("num&mask="+(num&mask));
	        if ((num & mask) != 0) ret++;
	        mask <<= 1;
	    }
	    return ret;
	}
	
	public static int countBitsE(int num){
		int n =0;
		
		while(num>0){
			num=num&(num-1);System.out.println("num="+num);
			n++;
		}
		
		return n;
	}
}