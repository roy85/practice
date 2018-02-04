package leetcode.easy;

public class JudgeRouteCircle {

	public static void main(String[] args) {
		System.out.println(judgeCircle("UD"));
		System.out.println(judgeCircle("Udd"));
	}

	public static boolean judgeCircle(String moves){
		int hor=0, vert=0;
		moves = moves.toUpperCase();
		
		for(char c : moves.toCharArray()){
			if(c=='U')
				vert++;
			else if(c=='D')
				vert--;
			else if(c=='L')
				hor++;
			else if(c=='R')
				hor--;
		}
		
		return (hor==0) && (vert==0);
	}
}
