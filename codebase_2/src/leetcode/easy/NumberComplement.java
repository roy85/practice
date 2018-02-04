package leetcode.easy;

public class NumberComplement {

	public static void main(String[] args) {
//		System.out.println(findComplement(1));
		System.out.println(findComplement(10));
	}

	public static int findComplement(int num){
		String s = Integer.toBinaryString(num);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			int k=(c=='0')?1:0;
			if(sb.length()==0 && k==0)
				continue;
			sb.append(k);
		}
		if(sb.length()==0)
			sb.append(0);
		int n = Integer.parseInt(sb.toString(), 10);
		return n;
	}
}
