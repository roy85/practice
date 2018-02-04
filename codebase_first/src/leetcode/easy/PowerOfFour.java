package leetcode.easy;

public class PowerOfFour {

	public static void main(String[] args) {
		
		Solution30 sol = new Solution30();
		
		for(int i=0;i<100;i++){
			System.out.println(i+"="+Integer.toBinaryString(i));
			System.out.println("&"+i+"="+sol.isPowerOfFour(i));
			
		}
		
//		System.out.println(sol.isPowerOfFour(5));
	}

}

class Solution31{
	public boolean isPowerOfFour(int num){
		return (num > 0) && ((num & (num - 1)) == 0) 
                && ((num - 1) % 3 == 0);
	}
}

class Solution30{
	public boolean isPowerOfFour(int num) {
        double logValue = (Math.log(num)/Math.log(4));
        
        
        return logValue%1 ==0;
    }
}


class Solution28{
	public boolean isPowerOfFour(int num) {
        int count=0;
        
        if(num == 0){
        	return false;
        }else if(num == 1){
        	return true;
        }
        
        
        
        if((num & (num - 1))==0){
        	while(num > 1)
            {
              num  >>= 1;
              count += 1;
            }  
        }
        
        
        return count%2==0 && count>0;
    }
}

class Solution27{
	public boolean isPowerOfFour(int num) {
        boolean isPowerOfFour=false;
        
        if((num &(num - 1))==0){
        	String string = Integer.toBinaryString(num);
        	int countZero=0;
        	for(int i=0;i<string.length();i++){
        		if(string.charAt(i) == '0')
        		{
        			countZero++;
        		}
        	}
        	
        	if(countZero%2 == 0){
        		isPowerOfFour=true;
        	}
        }
        
        return isPowerOfFour;
    }
}