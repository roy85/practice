package leetcode.easy;

public class HammingWeight {

	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		System.out.println("11="+sol.hammingWeight(11));
		System.out.println("Integer.MIN_VALUE="+sol.hammingWeight(Integer.MIN_VALUE));
		System.out.println("Integer.MAX_VALUE="+sol.hammingWeight(Integer.MAX_VALUE));
		System.out.println("-2="+sol.hammingWeight(-2));
	}

}

class Solution24{
	public int hammingWeight(int n){
		int weight=0;
		
		String nString = Integer.toBinaryString(n);System.out.println("string="+nString);
		
		for(int i=0;i<nString.length();i++){
			if(nString.charAt(i) == '1'){
				weight++;
			}
		}
		
		return weight;
	}
}

/*
* Other Solutions:
*  public int hammingWeight(int n) {
    int sum = 0;
    while (n != 0) {
        sum++;
        n &= (n - 1);
    }
    return sum;
}
    
    AND:
    
    public int hammingWeight(int n) {
    int bits = 0;
    int mask = 1;
    for (int i = 0; i < 32; i++) {
        if ((n & mask) != 0) {
            bits++;
        }
        mask <<= 1;
    }
    return bits;
}
    
*/