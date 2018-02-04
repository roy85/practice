package leetcode.easy;

public class ShortestWordDistance {

	public static void main(String[] args) {
		System.out.println(shortestDistance(
				new String[] {"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice"));
		System.out.println(shortestDistance(
				new String[] {"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding"));
		System.out.println(shortestDistance(
				new String[] {"a","c","a","b"}, "a","b"));
	}

	public static int shortestDistance(String[] words, String word1, String word2) {
		int p1 = -1, p2 = -1, min = Integer.MAX_VALUE;
	    
	    for (int i = 0; i < words.length; i++) {
	        if (words[i].equals(word1)) 
	            p1 = i;

	        if (words[i].equals(word2)) 
	            p2 = i;
	            
	        if (p1 != -1 && p2 != -1)
	            min = Math.min(min, Math.abs(p1 - p2));
	    }
	    
	    return min;
	}
	
	///wrong answerSystem.out.println(shortestDistance(new String[] {"a","c","a","b"}, "a","b"));
//	public static int shortestDistance(String[] words, String word1, String word2) {
//		int distance =Integer.MAX_VALUE;
//		int l1 =-1;
//		int l2 =-1;
//		
//		for(int i=0;i<words.length;i++){
//			if(words[i].equals(word1)){
//				if(l1==-1){
//					l1=i;
//				}
//				if(l2>-1 && distance > Math.abs(l2-i)){
//					l1 = i;
//					distance = Math.abs(l2-i);
//				}
//			}
//			else if(words[i].equals(word2)){
//				if(l2==-1){
//					l2 = i;
//				}
//				if(l1>-1 && distance> Math.abs(l1-i)){
//					l2=i;
//					distance = Math.abs(l1-i);
//				}
//			}
//		}
//		
//		return distance;
//	}
}
