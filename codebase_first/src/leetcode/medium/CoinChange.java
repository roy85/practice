package leetcode.medium;

public class CoinChange {

	public static void main(String[] args) {
		System.out.println(coinChange(new int[] {7,2,3,6}, 13));
		System.out.println(coinChange(new int[] {1,2,5}, 11));
	}

	public static int coinChange(int[] coins, int amount) {
		
		int[] T = new int[amount+1];
		int[] R = new int[amount+1];
		T[0] = 0;
		
		for(int i=1;i<=amount;i++)
		{
			R[i] = -1;
			T[i] = Integer.MAX_VALUE-1;
		}
		
		for(int j=0;j<coins.length;j++)
		{
			for(int i=1;i<=amount;i++)
			{
				if(i >= coins[j])
				{
					if(T[i-coins[j]]+1<T[i])
					{
						T[i] = 1+ T[i-coins[j]];
						R[i] = j;
					}
				}				
			}
		}
		
		if(R[R.length-1] == -1)
		{
			System.out.println("No Solution");
			return -1;
		}
		
		int start = R.length-1;
		int numOfCoins = 0;
		
		while(start>0){
			int j = R[start];
			numOfCoins++;//System.out.println(coins[j]+"");
			start = start-coins[j];			
		}
		
		return numOfCoins;
	}
}
