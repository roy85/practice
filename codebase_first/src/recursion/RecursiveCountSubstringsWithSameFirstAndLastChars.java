package recursion;

public class RecursiveCountSubstringsWithSameFirstAndLastChars {

	public static void main(String[] args) {
//		System.out.println(fun(0,"abracadabra",0));
//		System.out.println(fun(0,"abra",0));
//		System.out.println(fun(0,"abrab",0));
		System.out.println(fun(0,"abcab",0));
	}

	public static int fun(int l, String s, int count){
		if(l==s.length())
			return count;
		
		for(int r= s.length()-1;r>=l;r--){
			if(s.charAt(l)==s.charAt(r))
				count++;
			
		}
		return fun(l+1,s,count);
	}
}
