package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		list.add("l");
		
		
//		list.add("l");
//		list.add("c");
//		list.add("e");
//		list.add("d");
//		list.add("e");
//		list.add("o");
//		list.add("e");
//		list.add("t");
//		list.add("e");
		
//		list.add("leet");
//		list.add("code");
//		list.add("aaaa");
//		System.out.println(wordBreak("leetcode",list));
		System.out.println(wordBreak("l",list));
	}

	public static boolean wordBreak(String s, List<String> wordDict){
		boolean isSuccess=false;
		
		StringBuilder sb = new StringBuilder(s);
		
		
		for(int i=0;i<wordDict.size();i++){
			String word = wordDict.get(i);
			int index = sb.indexOf(word);
			if(index>=0 && sb.length()>=(index+word.length())){
				sb.delete(index, index+word.length());
			}
		}
		
		if(sb.length()==0)
			isSuccess=true;
		
		return isSuccess;
	}
}
