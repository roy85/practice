package leetcode.medium;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int fun(int dividend, int divisor){
		int over = 0;
        if(dividend == Integer.MIN_VALUE){
            if(divisor == -1){
                return Integer.MAX_VALUE;
            }
            else if(divisor == 1){
                return dividend;
            }
            else if(divisor == Integer.MIN_VALUE){
                return 1;
            }
            else{
                over = 1;
            }
            
        }
        
        if(divisor == Integer.MIN_VALUE){
            return 0;
        }
        else{
            int flag = 1;
            if((divisor < 0 && dividend > 0) || (divisor > 0 && dividend < 0) ){
                flag = -1;
            }
            divisor = Math.abs(divisor);
            dividend = Math.abs(dividend + over);
        
            int result = 0;
            while(dividend >= divisor){
                int power = divisor;
                int mul = 1;
                while(dividend > power){
                    int temp = power;
                    power <<= 1;
                    if((power >> 1) != temp){
                        power = temp;
                        break;
                    }
                    else{
                        mul <<= 1;
                    }
                }
                if(dividend < power){
                    mul >>= 1;
                    power >>= 1;
                }
                
                result += mul;
                dividend -= power;
                dividend += over;
                over = 0;
            }
            
            
            return result * flag;
	}
	}
}
