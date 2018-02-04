package leetcode.easy;

/*
 * Improve
 */

/*
 * Best:
 * https://discuss.leetcode.com/topic/9764/java-solution-and-optimization/16
 * It seems that HashMap can accelerate the algorithm, but the fact is not as we hope.

If we repeat the function 10,000,000 times, the first algorithm you provide will cost 8,940 ms, 
the second algorithm you provide will cost 12,454 ms, while the following code will cost only 3,500 ms.

The optimized code runs slower.

I think reasons are as follows:

1.In the following code, the bit operation is QUITE FAST, no if/while/for statment, thus no branch predictions, 
and the efficiency of every statement will be almost 100%.

2.In the "cache" solution, the function calls、 brach predictions 、read/write-memory operations or even hash 
collisions will all contribute to the cost of time.
 * public int reverseBits(int n) {
        int ret=n;
        ret = ret >>> 16 | ret<<16;
        ret = (ret & 0xff00ff00) >>> 8 | (ret & 0x00ff00ff) << 8;
        ret = (ret & 0xf0f0f0f0) >>> 4 | (ret & 0x0f0f0f0f) << 4;
        ret = (ret & 0xcccccccc) >>> 2 | (ret & 0x33333333) << 2;
        ret = (ret & 0xaaaaaaaa) >>> 1 | (ret & 0x55555555) << 1;
        return ret;
}
 */

/*
 * https://discuss.leetcode.com/topic/9764/java-solution-and-optimization/2
 * How to optimize if this function is called multiple times? 
 * We can divide an int into 4 bytes, and reverse each byte then combine into an int. 
 * For each byte, we can use cache to improve performance.

// cache
private final Map<Byte, Integer> cache = new HashMap<Byte, Integer>();
public int reverseBits(int n) {
    byte[] bytes = new byte[4];
    for (int i = 0; i < 4; i++) // convert int into 4 bytes
        bytes[i] = (byte)((n >>> 8*i) & 0xFF);
    int result = 0;
    for (int i = 0; i < 4; i++) {
        result += reverseByte(bytes[i]); // reverse per byte
        if (i < 3)
            result <<= 8;
    }
    return result;
}

private int reverseByte(byte b) {
    Integer value = cache.get(b); // first look up from cache
    if (value != null)
        return value;
    value = 0;
    // reverse by bit
    for (int i = 0; i < 8; i++) {
        value += ((b >>> i) & 1);
        if (i < 7)
            value <<= 1;
    }
    cache.put(b, value);
    return value;
}
 */

public class ReverseBits {

	public static void main(String[] args) {
//		System.out.println(reverseBits(43261596));
//		System.out.println(reverseBits(964176192));
		System.out.println(reverseBits(1));
	}
	
	//2.79%
//	public static int reverseBits(int n) {
//		
//		String s2 = String.format("%1$32s", Integer.toBinaryString(n)).replace(' ', '0') ;
//		StringBuilder s = new StringBuilder(s2).reverse();
//		long sum = 0;		
//		
//		for(int i=s.length()-1,j=0;i>=0;i--,j++){
//			sum+=Integer.parseInt(Character.toString(s.charAt(i)))*Math.pow(2, j);
//		}
//		
//		return (int) sum;
//    }

	//3.46%
//	public static int reverseBits(int n) {
//		
//		String x2 = String.format("%1$32s", Integer.toBinaryString(n)).replace(' ', '0');
//		System.out.println(new StringBuilder(x2).reverse().toString());
//		
//		long x3 = Long.parseLong(new StringBuilder(x2).reverse().toString(), 2);
//		
//		return (int)x3;
//    }
	
	//41.81% -- https://discuss.leetcode.com/topic/9764/java-solution-and-optimization
	public static int reverseBits(int n) {
	    int result = 0;
	    for(int i=0; i<32; i++){
	        result <<= 1;
	        result += n&1;
	        n >>= 1;
	    }
	    return result;
	}
}


