package leetcode.easy;

public class ImplementStrStr {

	public static void main(String[] args) {
		System.out.println(strStr(null, null));
		System.out.println(strStr("Returns the index of the first occurrence of needle "
		+"in haystack, or -1 if needle is not part of the haystack", "the"));
	}

	public static int strStr(String haystack, String needle) {
		
		if(haystack==null || needle==null)
			return -1;
        
        if(haystack.length()==0 && needle.length()==0)
            return 0;
        		
		for(int i=0;i<haystack.length();i++){
			if(haystack.charAt(i)==needle.charAt(0)){
				if(needle.length()==1)
					return i;
				
				for(int j=1;j<needle.length();j++){
					if(haystack.charAt(i+j)!=needle.charAt(j)){
						i+=j;
						break;
					}
					if(j==needle.length()-1)
						return i; 
				}				
			}
		}
		
		return -1;
	}
}
