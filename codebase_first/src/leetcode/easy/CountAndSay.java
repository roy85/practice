package leetcode.easy;
//exceeded 30 mins
//https://leetcode.com/problems/count-and-say/description/
//
public class CountAndSay {

	public static void main(String[] args) {
//		System.out.println(countAndSay(3));
		System.out.println(countAndSay(5));
	}

	public static String countAndSay(int n){
		int x=1;
		
		for(int i=1;i<n;i++){
			String number = Integer.toString(x);
			char temp = number.charAt(0);
			int count = 1;
			StringBuilder SB = new StringBuilder();
			
			for(int j=1;j<number.length();j++){
				if(temp == number.charAt(j)){
					count++;					
				}
				else{
					SB.append(count); SB.append(temp);
					count=1; temp=number.charAt(j);
				}
			}
			
			if(count>0){
				SB.append(count); SB.append(temp);
			}
			
			x = Integer.parseInt(SB.toString());
		}
		
		return Integer.toString(x);
	}
	
}
