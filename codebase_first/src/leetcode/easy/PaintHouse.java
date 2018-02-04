package leetcode.easy;

public class PaintHouse {

	public static void main(String[] args) {
		System.out.println(minCost(new int[][]{{1,2,3},{1,2,3},{2,1,3},{1,3,2}}));
		System.out.println(minCost(new int[][]{{5,8,6},{19,14,13},{7,5,12},{14,15,17},{3,20,10}}));
	}

	/*
	 * https://discuss.leetcode.com/topic/32408/share-my-very-simple-java-solution-with-explanation
	 * The basic idea is when we have painted the first i houses, and want to paint the i+1 th house, we have 3 choices: 
	 * paint it either red, or green, or blue. If we choose to paint it red, we have the follow deduction:
		paintCurrentRed = min(paintPreviousGreen,paintPreviousBlue) + costs[i+1][0]
		Same for the green and blue situation. And the initialization is set to costs[0], so we get the code:
	 */
	public static int minCost(int[][] costs) {
		if(costs.length==0) return 0;
	    int lastR = costs[0][0];
	    int lastG = costs[0][1];
	    int lastB = costs[0][2];
	    for(int i=1; i<costs.length; i++){
	        int curR = Math.min(lastG,lastB)+costs[i][0];
	        int curG = Math.min(lastR,lastB)+costs[i][1];
	        int curB = Math.min(lastR,lastG)+costs[i][2];
	        lastR = curR;
	        lastG = curG;
	        lastB = curB;
	    }
	    return Math.min(Math.min(lastR,lastG),lastB);
    }

	
//	public static int minCost(int[][] costs) {
//        
//		if(costs == null || costs.length==0)
//			return 0;
//		int sum=0;
//		int[] sums = new int[3];
//		int n = costs.length;
//		int[] val = new int[n];
//		int neighbor = -1;
//		
//		
//		for(int j=0;j<3;j++){
//			
//			val[0] = costs[0][j];
//			neighbor = j;
//			for(int i=1;i<costs.length;i++){
//				if(neighbor==0){
//					if(costs[i][1]<costs[i][2]){
//						val[i] = costs[i][1];
//						neighbor = 1;
//					}
//					else{
//						val[i] = costs[i][2];
//						neighbor = 2;
//					}
//				}
//				else if(neighbor ==1)
//				{
//					if(costs[i][0]<costs[i][2]){
//						val[i] = costs[i][0];
//						neighbor = 0;
//					}
//					else{
//						val[i] = costs[i][2];
//						neighbor = 2;
//					}
//				}
//				else{
//					if(costs[i][1]<costs[i][0]){
//						val[i] = costs[i][1];
//						neighbor = 1;
//					}
//					else{
//						val[i] = costs[i][0];
//						neighbor = 0;
//					}
//				}				
//			}
//			
//			for(int i=0;i<val.length;i++){
//				sums[j]+=val[i];
//			}
//
//			val = new int[n];
//		}
//		
//		sum = Math.min(sums[0], Math.min(sums[1], sums[2]));
//		return sum;
//    }
}
