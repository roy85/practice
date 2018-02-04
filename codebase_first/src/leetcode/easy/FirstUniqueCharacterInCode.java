package leetcode.easy;

/*
 * Improve
 */
public class FirstUniqueCharacterInCode {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(firstUniqChar(""));
		System.out.println(firstUniqChar(null));
		System.out.println(firstUniqChar("cc"));
		System.out.println(firstUniqChar("aadadaad"));
		System.out.println(firstUniqChar("dddccdbba"));
	}

	//25.32%
	public static int firstUniqChar(String s) {
		if(s==null) return -1;
		if(s.length() == 1) return 0;
		
		int index =-1;
		char arr[] = s.toCharArray();
		
		for(int i=0;i<arr.length;i++){
			boolean isUnique = true;
						
			for(int j=0;j<arr.length;j++){
				if(i!=j && arr[i]==arr[j]){
					isUnique=false;
					break;
				}
			}
			
			if(isUnique){
				index = i;
				break;
			}
		}
		
		return index;
	}
}
