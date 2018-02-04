package leetcode.medium;

public class ShortestWordDistance3 {

	public static void main(String[] args) {
		System.out.println(shortestWordDistance(
				new String[] {"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice"));
		System.out.println(shortestWordDistance(
				new String[] {"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding"));
		System.out.println(shortestWordDistance(
				new String[] {"a","c","a","b"}, "a","b"));
		System.out.println(shortestWordDistance(new String[] {"b","a","x","s","a","a"}, "a", "a"));
		System.out.println(shortestWordDistance(new String[] {"a","x","s","a","s","a","a"}, "a", "a"));
	}

	//50.85%
    public static int shortestWordDistance(String[] words, String word1, String word2) {
        int distance = Integer.MAX_VALUE;
        int p1=-1;
        int p2=-1;
        boolean isSame = false;
        boolean isWords1Set = false;
        
        if(word1.equals(word2)){
        	isSame = true;
        }
        
        for(int i =0;i<words.length;i++){
           if(words[i].equals(word1)){
               if((isSame && p1==-1) || !isSame)
               {
            	   p1 = i;
            	   isWords1Set=true;
               }
           }
           if(words[i].equals(word2) && !isWords1Set){
            	if((isSame && p2==-1) || !isSame)
            		p2 = i;
            }
           if(p1>-1 && p2>-1 && distance>Math.abs(p1-p2)){
        	   distance = Math.abs(p1-p2);
        	   if(isSame){
        		   p1 = Math.max(p1, p2);
        		   p2 = -1;
        	   }
           }
           isWords1Set=false;
        }
        
        return distance;
    }

}
