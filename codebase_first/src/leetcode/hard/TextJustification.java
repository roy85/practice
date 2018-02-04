package leetcode.hard;

import java.util.LinkedList;
import java.util.List;

/*
 * Given an array of words and a length L, format the text such that each line has exactly L characters and is 
 * fully (left and right) justified.

You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra 
spaces ' ' when necessary so that each line has exactly L characters.

Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not 
divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

For the last line of text, it should be left justified and no extra space is inserted between words.

For example,
words: ["This", "is", "an", "example", "of", "text", "justification."]
L: 16.

Return the formatted lines as:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
Note: Each word is guaranteed not to exceed L in length.

click to show corner cases.

Corner Cases:
A line other than the last line might contain only one word. What should you do in this case?
In this case, that line should be left-justified.
 */

//25.71% - https://discuss.leetcode.com/topic/4189/share-my-concise-c-solution-less-than-20-lines/2
public class TextJustification {
	public List<String> fullJustify(String[] words, int L) {
        List<String> list = new LinkedList<String>();
        
        for (int i = 0, w; i < words.length; i = w) {
            int len = -1;
            for (w = i; w < words.length && len + words[w].length() + 1 <= L; w++) {
                len += words[w].length() + 1;
            }
            
            StringBuilder strBuilder = new StringBuilder(words[i]);
            int space = 1, extra = 0;
            if (w != i + 1 && w != words.length) { // not 1 char, not last line
                space = (L - len) / (w - i - 1) + 1;//RR: w-i-1 = words processed on this line.
                extra = (L - len) % (w - i - 1);
            }
            for (int j = i + 1; j < w; j++) {//RR:this loop is to fill in space for the words read on the loop above. 
                for (int s = space; s > 0; s--) strBuilder.append(' ');//RR:fill same spaces in the gaps.
                if (extra-- > 0) strBuilder.append(' ');//RR:if extra space needs to be added, add it here.
                strBuilder.append(words[j]);//RR:append the next word.
            }
            int strLen = L - strBuilder.length();//RR: this should be 0 for all lines except last line. 
            while (strLen-- > 0) strBuilder.append(' ');//RR: make last line left justified by appending space to the end.
            list.add(strBuilder.toString());
        }
        
        return list;
    }
}

//25.71% - https://discuss.leetcode.com/topic/9147/simple-java-solution/2
//public class TextJustification {
//	public List<String> fullJustify(String[] words, int L) {
//        List<String> lines = new ArrayList<String>();
//        
//        int index = 0;
//        while (index < words.length) {
//            int count = words[index].length();
//            int last = index + 1;
//            while (last < words.length) {
//                if (words[last].length() + count + 1 > L) break;
//                count += words[last].length() + 1;
//                last++;
//            }
//            
//            StringBuilder builder = new StringBuilder();
//            int diff = last - index - 1;
//            // if last line or number of words in the line is 1, left-justified
//            if (last == words.length || diff == 0) {
//                for (int i = index; i < last; i++) {
//                    builder.append(words[i] + " ");
//                }
//                builder.deleteCharAt(builder.length() - 1);
//                for (int i = builder.length(); i < L; i++) {
//                    builder.append(" ");
//                }
//            } else {
//                // middle justified
//                int spaces = (L - count) / diff;
//                int r = (L - count) % diff;
//                for (int i = index; i < last; i++) {
//                    builder.append(words[i]);
//                    if (i < last - 1) {
//                        for (int j = 0; j <= (spaces + ((i - index) < r ? 1 : 0)); j++) {
//                            builder.append(" ");
//                        }
//                    }
//                }
//            }
//            lines.add(builder.toString());
//            index = last;
//        }
//        
//        
//        return lines;
//    }
//}

//25.71% - https://discuss.leetcode.com/topic/20112/easy-java-implementation
//public class TextJustification {
//
//	
//	private List<String> result;
//
//	public List<String> fullJustify(String[] words, int maxWidth) {
//	    result = new ArrayList<String>();
//	    if (words == null || words.length == 0 || maxWidth < 0) return result;
//	    if (maxWidth == 0) {
//	        result.add("");
//	        return result;
//	    }
//	    helper(words, 0, maxWidth);
//	    return result;
//	}
//
//	public void helper(String[] words, int start, int L) {
//	    if (start >= words.length) return;
//	    
//	    int i = start, len = 0, total = 0, next = -1;
//	    while (total < L && i < words.length) {
//	        total += words[i].length();
//	        if (total > L) { // only in this case we need skip i++
//	            next = i;
//	            break;
//	        }
//	        len += words[i].length();
//	        total++; // count space
//	        i++;
//	    }
//	    
//	    if (next == -1) next = i;
//	    addList(words, start, next, len, L);
//	    
//	    helper(words, next, L);
//	}
//
//	public void addList(String[] words, int i, int j, int len, int L) {
//	    StringBuilder sb = new StringBuilder("");
//	    int count = j-i-1, space = 0, more = 0, s = 0;
//	    if (count == 0 || j == words.length) { // the last line
//	        for (int k = i; k < j; k++) {
//	            sb.append(words[k]);
//	            if (k == j-1) break;
//	            sb.append(" ");
//	        }
//	        space = L - sb.length();
//	        s = 0;
//	        while (s++ < space) sb.append(" ");
//	    } else {
//	        space = (L - len) / count; more = (L - len) % count;
//	        for (int k = i; k < j; k++) {
//	            sb.append(words[k]);
//	            s = 0;
//	            if (k == j-1) break;
//	            while (s++ < space) sb.append(" ");
//	            if (more-- > 0) sb.append(" ");
//	        }
//	    }
//	    
//	    result.add(sb.toString());
//	}
//	
//}


/*
Same solution with more comments:
public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ret = new ArrayList<>();
        if(words.length == 0 || maxWidth == 0) {
            ret.add(""); //for some reason OJ expects list with empty string for empty array input
            return ret;
        }

        for(int i = 0, w; i < words.length; i = w) {
            int len = -1; //We need to skip the space for last word hence start len = -1
            //check how many words fit into the line
            for(w = i; w < words.length && len + words[w].length() + 1 <= maxWidth; w++) {
                len += words[w].length() + 1; // 1 extra for the space
            }
        
            //calculate the number of extra spaces that can be equally distributed
            //also calculate number of extra spaces that need to be added to first few
            //words till we fill the line width
            //For example line width is 20 we have three words of 3 4 2 4 length
            //[our_,life_,is_,good_,_,_,_,_,] ==> [our_,_,_,life_,_,_is_,_,good] 
            //   Note _, indicates space
            //Count number of empty spaces at end of line:= width-len = 20-(15) = 5 
            //These five spaces need to be equally distributed between 4-1 = 3 gaps
            //n words will have n-1 gaps between them
            // 5 / 3 = 1 extra space between each word (in addition to default 1 space, 
            //                                          total space count = 2)
            // 5 % 3 = 2 extra spaces between first three words as shown above

            int evenlyDistributedSpaces = 1; //If we don't enter loop at line # 37 then we need to have default value
            int extraSpaces = 0;
            int numOfGapsBwWords = w-i-1; //w is already ponting to next index and -1 since
                                          //n words have n-1 gaps between them
                                          
            //Moreover we don't need to do this computation if we reached the last word
            //of array or there is only one word that can be accommodate on the line
            //then we don't need to do any justify text. In both cases text can be left,
            //left-aligned 
                                        
            if(w != i+1 && w != words.length) {
                //additional 1 for the default one space between words
                evenlyDistributedSpaces = ((maxWidth-len) / numOfGapsBwWords) + 1;
                extraSpaces = (maxWidth-len)%numOfGapsBwWords;
            }
    
            StringBuilder sb = new StringBuilder(words[i]);
            for(int j = i+1; j < w; j++) {
                for(int s = 0; s < evenlyDistributedSpaces; s++) {
                    sb.append(' ');
                }
                if(extraSpaces > 0) {
                    sb.append(' ');
                    extraSpaces--;
                }
                sb.append(words[j]);
            }
            
            //Handle the above two cases we skipped, where there is only one word on line
            //or we reached end of word array. Last line should remain left aligned.
            int remaining = maxWidth-sb.length();
            while(remaining > 0) {
                sb.append(' ');
                remaining--;
            }
            ret.add(sb.toString());
        }
        return ret;
    }
}

*/

//https://discuss.leetcode.com/topic/4189/share-my-concise-c-solution-less-than-20-lines/9

/*
Yet another implementation with slightly different space layout:
//   0   1  2    3
    // "This is an example..."
    //  i=0, j=3, width=8, space=(16-8)/(3-0-1)=4, extra=0
    // ------------------------------------------------------
    //   3      4   5        6
    // "example of text justification."
    //  i=3, j=6, width=13, space=(16-13)/(3-0-1)=1, extra=1
    // ------------------------------------------------------
    // "justification."
    //  i=6, j=7, space=1, extra=0
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        for (int i = 0, j; i < words.length; ) {
            int width = 0;                                  // width of words without space
            for (j = i; j < words.length && width + words[j].length() + (j - i) <= maxWidth; j++)
                width += words[j].length();                 /* j is the next word */
            
//            int space = 1, extra = 0;                       // for last line, space=1
//            if (j - i != 1 && j != words.length) {          // not 1 word (div-by-zero) and not last line
//                space = (maxWidth - width) / (j - i - 1);   // minus 1 to exclude skip last word
//                extra = (maxWidth - width) % (j - i - 1);
//            }
//            
//            StringBuilder line = new StringBuilder(words[i]);
//            for (i = i + 1; i < j; i++) {                   // move i to j finally
//                for (int s = space; s > 0; s--) line.append(" ");
//                if (extra-- > 0) line.append(" ");
//                line.append(words[i]);
//            }
//            for (int s = maxWidth - line.length(); s > 0; s--) line.append(" ");
//            result.add(line.toString());
//        }
//        return result;
//    }
