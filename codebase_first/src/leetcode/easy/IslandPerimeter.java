package leetcode.easy;

public class IslandPerimeter {

	public static void main(String[] args) {
		System.out.println(islandPerimeter(null));
		int[][] grid = {{0,1,0,0},
		                {1,1,1,0},
		                {0,1,0,0},
		                {1,1,0,0}};
		System.out.println(islandPerimeter(grid));
	}

	public static int islandPerimeter(int[][] grid){		
		int countBoundaries = 0;
		
		if(grid==null || grid.length==0 || grid[0].length==0)
			return countBoundaries;
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				if(grid[i][j]==1){
					countBoundaries += getCountBoundaries(i,j, grid);
				}					
			}
		}
		
		return countBoundaries;
	}

	private static int getCountBoundaries(int i, int j, int[][] grid) {
		int boundaries=0;
		
		if((i>0 && grid[i-1][j]==0) || i==0)
			boundaries++;
		if((j>0 && grid[i][j-1]==0) || j==0)
			boundaries++;
		if((i+1<grid.length && grid[i+1][j]==0) || i==grid.length-1)
			boundaries++;
		if((j+1<grid[0].length && grid[i][j+1]==0) || j==grid[i].length-1)
			boundaries++;
		return boundaries;
	}
}
