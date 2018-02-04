package leetcode.medium;
/*
 * https://leetcode.com/problems/game-of-life/description/
 * According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies, as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population..
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
Write a function to compute the next state (after one update) of the board given its current state.

Follow up: 
Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
 */
public class GameOfLife {

	public static void main(String[] args) {

	}

	public void gameOfLife(int[][] board){
		
	}
	
	private int getLiveNeighbors(int value, int i, int j, int[][] arr){
		int n=0;
		int x=arr.length; int y = arr[0].length;
		
		if(i>0 && j>0 && arr[i-1][j-1]==1) n++;
		if(i>0){
			if(arr[i-1][j]==1) n++;
			if(j<arr.length-1 && arr[i-1][j+1]==1) n++;				
		}
		if(j>0 && arr[i][j-1]==1) n++;
		if(i<x-1 && j<y-1 && arr[i+1][j+1]==1) n++;
		if(i>0 &&)
		
		return n;
	}
}
