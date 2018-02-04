package leetcode.hard;

public class NonNegativeIntegersWithoutConsecutiveOnes {

	public static int count(int n){
        int a[] = new int[n];
        int b[] = new int[n];
        
        a[0] = 1;
        b[0] = 1;
        
        for(int i=1; i < n; i++){
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        
        return a[n-1] + b[n-1];
    }
    
    public static int countSimple(int n){
        int a = 1;
        int b = 1;
        
        for(int i=1; i < n; i++){
            int tmp = a;
        	a = a + b;
            b = tmp;
        }
        
        return a + b;
    }
    
    public static void main(String args[]){
//        CountNumberOfBinaryWithoutConsecutive1s cnb = new CountNumberOfBinaryWithoutConsecutive1s();
        for(int i=0;i<=21;i++)
        	System.out.println(Integer.toBinaryString(i));
//    	System.out.println(count(5));
//        System.out.println(countSimple(5));
    }
	
//	public static int getConsOnes(int num){
//		int count=0;
//		num = (int)num;
//
//		while(num>0){
//			num &= (num<<1);
//			count++;
//		}
//		
//		return count;
//	}
//	
//	public static int findIntegers(int num) {
//		int count=0;
//		
//		for(int i=0;i<=num;i++){
//			int x = i&(i<<1);
//			if(x==0)
//			{
//				count++;
//			}	
//		}
//				
//		return count;
//	}

}
