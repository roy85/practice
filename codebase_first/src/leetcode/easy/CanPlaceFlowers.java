package leetcode.easy;

public class CanPlaceFlowers {

	public static void main(String[] args) {
//		System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1},1));
//		System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1},2));
//		System.out.println(canPlaceFlowers(new int[]{1,1,0,0},1));
//		System.out.println(canPlaceFlowers(new int[]{1,1,1,0},1));
		System.out.println(canPlaceFlowers(new int[]{1,0,0,0,0,0,0,1,0,0},2));
		System.out.println(canPlaceFlowers(new int[]{0,0,1,0,1},0));
	}
	
	//79.6%-https://discuss.leetcode.com/topic/91303/java-greedy-solution-o-flowerbed-beats-100
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
        for(int i = 0; i < flowerbed.length && count < n; i++) {
            if(flowerbed[i] == 0) {
	     //get next and prev flower bed slot values. If i lies at the ends the next and prev are considered as 0. 
               int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
               int prev = (i == 0) ? 0 : flowerbed[i - 1];
               if(next == 0 && prev == 0) {
                   flowerbed[i] = 1;
                   count++;
               }
            }
        }
        
        return count == n;
    }

	//79.6% - leetcode article
//	public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int i = 0, count = 0;
//        while (i < flowerbed.length) {
//            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) 
//                && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
//                flowerbed[i++] = 1;
//                count++;
//            }
//             if(count>=n)
//                return true;
//            i++;
//        }
//        return false;
//    }
	
	//42.3%
//	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//        
//		boolean isSuccess=false;		
//		
//		for(int i=0;i<flowerbed.length;i++){
//			if(flowerbed[i]==0 && n>0){
//				if((i+1<flowerbed.length && flowerbed[i+1]==0) || i==flowerbed.length-1){
//					if(i==0 || flowerbed[i-1]==0)
//					{
//						n--;
//						flowerbed[i]=1;
//					}
//					else
//						continue;
//				}
//			}
//			if(n==0)
//				break;
//		}
//		
//		if(n==0)
//			isSuccess=true;
//		
//		return isSuccess;
//    }
	
//	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//        
//		boolean isSuccess=false;
//		boolean canPlot = false;
//		
//		for(int i=0;i<flowerbed.length;i++){
//			if(flowerbed[i]==1)
//				continue;
//			
//			if(flowerbed[i]==0)
//			{
//				if(!canPlot)
//					canPlot=true;
//				else if((i+1<flowerbed.length && flowerbed[i+1]==0) || (i==flowerbed.length-1))
//				{
//					n--; canPlot=false;
//				}				
//			}
//		}
//		
//		if(n==0)
//			isSuccess=true;
//		
//		return isSuccess;
//    }
}
