package leetcode.easy;

public class RansomNote {

	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "ab"));
		System.out.println(canConstruct("aa", "aab"));
		System.out.println(canConstruct("aaa", "aab"));
		System.out.println(canConstruct("a", "b"));
		System.out.println(canConstruct("", "aab"));
		System.out.println(canConstruct("aa", ""));
		System.out.println(canConstruct("", ""));
	}

	//66.10%
	public static boolean canConstruct(String ransomNote, String magazine) {
		if(magazine.equals(ransomNote) || magazine.contains(ransomNote)){
			return true;
		}
		
		boolean isConstruct = false;
		
		char r[] = ransomNote.toCharArray();
		char m[] = magazine.toCharArray();
		
		for(int i=0;i<r.length;i++){
			isConstruct=false;
			for(int j=0;j<m.length;j++){
				if(r[i]==m[j]){
					m[j]='-';
					isConstruct=true;
					break;
				}
			}
			
			if(!isConstruct){
				return false;
			}			
		}
		
		return isConstruct;
	}
}
