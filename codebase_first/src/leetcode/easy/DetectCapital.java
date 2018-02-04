package leetcode.easy;

public class DetectCapital {

	public static void main(String[] args) {
		System.out.println(Solution45.detectCapitalUse("USA"));
		System.out.println(Solution45.detectCapitalUse("USa"));
		System.out.println(Solution45.detectCapitalUse("flag"));
		System.out.println(Solution45.detectCapitalUse("FlaG"));
		System.out.println(Solution45.detectCapitalUse("Flag"));
		System.out.println(Solution45.detectCapitalUse("flaG"));
		System.out.println(Solution45.detectCapitalUse("fLag"));
		System.out.println(Solution45.detectCapitalUse("fLaG"));
		System.out.println(Solution45.detectCapitalUse("FlAg"));
		System.out.println(Solution45.detectCapitalUse("FlAG"));
	}

}

class Solution45{
	public static boolean detectCapitalUse(String word) {		
		boolean isUpper=false;
		boolean isLower=false;
		int upper=0;
		for(char ch : word.toCharArray()){
			if(ch>=65 && ch<=90){
				if(!isUpper && isLower){
					return false;
				}
				else if(isUpper && !isLower){
					upper++;
				}
				else if(isUpper && isLower){
					return false;
				}
				else{
					upper++;
					isUpper=true;
				}				
			}
			else if(ch>=97 && ch<=122){
				if(upper>1){
					return false;
				}
				isLower=true;
			}			
		}
		
		
		return true;
	}
}