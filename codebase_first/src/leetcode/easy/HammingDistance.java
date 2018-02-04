package leetcode.easy;

public class HammingDistance {

	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println("2,4="+sol.hammingDistance(2, 4));
		System.out.println("1,4="+sol.hammingDistance(1, 4));
		System.out.println("1098,4="+sol.hammingDistance(1098, 4));
		System.out.println("9,9="+sol.hammingDistance(9,9));
		System.out.println("4,14="+sol.hammingDistance(4, 14));
		System.out.println("14,4="+sol.hammingDistance(14, 4));
		System.out.println("1577962638, 1727613287="+sol.hammingDistance(1577962638, 1727613287));
	}

}

class Solution23{
//	public int hammingDistance(int x, int y) {
//		int distance=0;
//		int difference = 0;
//		
//		StringBuilder xString = new StringBuilder(Integer.toBinaryString(x));
//		StringBuilder yString = new StringBuilder(Integer.toBinaryString(y));
//		
//		
//		if(xString.length() < yString.length()){
//			difference = yString.length() - xString.length();
//			for(int i=0;i<difference;i++){
//				xString.insert(0, '0');
//			}
//		}
//		else{
//			difference = xString.length() - yString.length();
//			for(int i=0;i<difference;i++){
//				yString.insert(0, '0');
//			}
//		}
//		
//		
//		for(int i=0;i<xString.length();i++){
//			if(xString.charAt(i) != yString.charAt(i)){
//				distance++;
//			}
//		}
//		
//		return distance;
//    }
	
	public int hammingDistance(int x, int y) {
		int distance=0;
		int xLength = Integer.toBinaryString(x).length();
		int yLength = Integer.toBinaryString(y).length();
		int numBits=xLength<yLength? yLength : xLength;
		
		for(int i=0;i<numBits;i++){
			if((x&1) != (y&1)){
				distance++;
			}
			x>>=1;
			y>>=1;
		}
		
		return distance;
    }
	
	//Worse runtime with String or StringBuilder
//	public int hammingDistance(int x, int y) {
//		int distance=0;
//		int difference = 0;
//		
//		String xString = Integer.toBinaryString(x);
//		String yString = Integer.toBinaryString(y);
//		
//		
//		if(xString.length() < yString.length()){
//			difference = yString.length() - xString.length();
////			System.out.println(String.format("%1$"+(difference+xString.length())+"s", xString.toString()).replace(' ', '0'));
//			xString = String.format("%1$"+(difference+xString.length())+"s", xString).replace(' ', '0');
//		}
//		else{
//			difference = xString.length() - yString.length();
////			System.out.println(String.format("%1$"+(difference+yString.length())+"s", yString.toString()).replace(' ', '0'));
//			yString = String.format("%1$"+(difference+yString.length())+"s", yString).replace(' ', '0');
//		}
//		
//		
//		for(int i=0;i<xString.length();i++){
//			if(xString.charAt(i) != yString.charAt(i)){
//				distance++;
//			}
//		}
//		
//		return distance;
//    }
}