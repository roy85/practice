package leetcode.easy;

public class NumberComplement {

	public static void main(String[] args) {
		System.out.println(Solution26.findComplement(5));
		System.out.println(Solution26.findComplement(1));
		System.out.println(Solution26.findComplement(0));
		System.out.println(Solution26.findComplement(1577962638));
	}

}

class Solution26{
//    public static int findComplement(int num) {
//        
//
//        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num));
//        for(int i=0;i<sb.length();i++){
//        	if(sb.charAt(i)=='0'){
//        		sb.setCharAt(i, '1');
//        	}
//        	else{
//        		sb.setCharAt(i, '0');
//        	}
//        }
//        
//        return Integer.parseInt(sb.toString(),2);
//    }
	
	//faster
	public static int findComplement(int num) {
		int ret=0;
		
		ret = ~num;
		int numBinLength = Integer.toBinaryString(num).length();
		ret=Integer.parseInt(Integer.toBinaryString(ret).substring(32-numBinLength),2);
		
        return ret;
    }

}