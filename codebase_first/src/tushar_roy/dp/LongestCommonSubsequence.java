package tushar_roy.dp;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		System.out.println(getLCS("acbcf", "abcdaf"));
		System.out.println(getLCS("GXTXAYB", "AGGTAB"));
	}

	public static int getLCS(String s1, String s2){
		StringBuilder sb = new StringBuilder();
		int max=0;
		
		int[][] matrix = new int[s1.length()+1][s2.length()+1];
		for(int i=1;i<matrix.length;i++){
			for(int j=1;j<matrix[i].length;j++){
				char x1 = s1.charAt(i-1);
				char x2 = s2.charAt(j-1);
				if(x1 == x2){
					matrix[i][j] = matrix[i-1][j-1] + 1;
				}
				else{
					matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
				if(matrix[i][j]>max){
					max = matrix[i][j];				
				}		
			}
		}
		
		int i=s1.length();
		int j = s2.length();
		while(i>0 && j>0){
			if(s1.charAt(i-1) == s2.charAt(j-1)){
				sb.append(s1.charAt(i-1));
				i--;j--;
			}
			else if(matrix[i-1][j]>matrix[i][j-1]){
				i--;
			}
			else{
				j--;
			}
		}
		
		System.out.println(sb.reverse().toString());
		return max;
	}
}
