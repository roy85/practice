package leetcode.hard;

public class ValidNumber {

	public static void main(String[] args) {
		System.out.println(isNumber(" "));
		System.out.println(isNumber("0"));
		System.out.println(isNumber("0.1"));
		System.out.println(isNumber("0.1."));
		System.out.println(isNumber(" 0 "));
		System.out.println(isNumber("2e10"));
		System.out.println(isNumber("e"));
		System.out.println(isNumber("e2"));
		System.out.println(isNumber("2e"));
		System.out.println(isNumber("959440.94f"));
		System.out.println(isNumber("."));
		System.out.println(isNumber(".2"));
		System.out.println(isNumber("2."));
		System.out.println(isNumber("-2."));
		System.out.println(isNumber("+2."));
		System.out.println(isNumber("-.2."));
		System.out.println(isNumber("-.2"));
		System.out.println(isNumber("+.2"));
	}

	//85.24% - https://discuss.leetcode.com/topic/9490/clear-java-solution-with-ifs
	/*
	 * We start with trimming.

If we see [0-9] we reset the number flags.
We can only see . if we didn't see e or ..
We can only see e if we didn't see e but we did see a number. We reset numberAfterE flag.
We can only see + and - in the beginning and after an e
any other character break the validation.
At the and it is only valid if there was at least 1 number and if we did see an e then a number after it as well.

So basically the number should match this regular expression:

[-+]?(([0-9]+(.[0-9]*)?)|.[0-9]+)(e[-+]?[0-9]+)?
	 */
	public static boolean isNumber(String s) {
        s = s.trim();

        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;
        for(int i=0; i<s.length(); i++) {
            if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberSeen = true;
                numberAfterE = true;
            } else if(s.charAt(i) == '.') {
                if(eSeen || pointSeen) {
                    return false;
                }
                pointSeen = true;
            } else if(s.charAt(i) == 'e') {
                if(eSeen || !numberSeen) {
                    return false;
                }
                numberAfterE = false;
                eSeen = true;
            } else if(s.charAt(i) == '-' || s.charAt(i) == '+') {
                if(i != 0 && s.charAt(i-1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return numberSeen && numberAfterE;
    }
	
	//failed at 1477/1481 test
//public static boolean isNumber(String s) {
//		
//		try{
////			if(s.con)
//			Double.parseDouble(s);
//		}catch(NumberFormatException nfe){
//			return false;
//		}
//		
//		return true;
//	}
	
	
	//Solution at: https://discuss.leetcode.com/topic/9490/clear-java-solution-with-ifs
	
	//https://discuss.leetcode.com/topic/1095/the-worst-problem-i-have-ever-met-in-this-oj. 
	//Failing at: -+.
//	public static boolean isNumber(String s) {
//		
//		if(s==null || s.length()==0)
//			return false;
//		
//		s = s.trim();
//		if(s.length()==0)
//			return false;
//		
//		int countDots=0;
//		int countE=0;
//		int countMinus=0;
//		int countPlus=0;
//		char[] chars = s.toCharArray();
//		
//		if(chars.length==1){
//			if((int)chars[0]<47 || (int)chars[0]>57)
//				return false;
//		}
//		
//		for(int i=0;i<chars.length;i++){
//			char c = chars[i];
//			if((int)c==45)//45=- sign, 43=+ sign
//			{
//				if(countMinus==0)
//					countMinus++;
//				else
//					return false;
//			}
//			else if((int)c==43){
//				if(countPlus==0)
//					countPlus++;
//				else
//					return false;
//			}
//			else if((int)c==46)//.
//			{	
//				if((i+1)<chars.length && ((int)chars[i+1]<47 || (int)chars[i+1]>57))
//					return false;
//				if(countDots>0)
//					return false;
//				countDots++;
//			}
//			else if((int)c==101 || (int)c==69){
//				if(countE>0)
//					return false;
//				if(i+1>chars.length-1 || i==0)//e cannot be last character in string & e cannot be first char in string
//					return false;
//				if((int)chars[i+1]<47 || (int)chars[i+1]>57)
//				{
//					if((int)chars[i+1]==45 || (int)chars[i+1]==43)//45= - sign; 43= + sign
//					{
//						if(i+2>chars.length-1)//- sign is last char of string
//							return false;
//						else if((int)chars[i+2]<47 || (int)chars[i+2]>57){
//							return false;
//						}
//						else{
//							i=i+2;
//							continue;
//						}
//					}
//					return false;
//				}
//				i++;
//				countE++;
//				
//			}
//			
//			else if((int)c<47 || (int)c>57)
//				return false;
//		}
//		
//		return true;
//	}
}
