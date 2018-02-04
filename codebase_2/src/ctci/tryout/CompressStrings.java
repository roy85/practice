package ctci.tryout;

public class CompressStrings {

	public static void main(String[] args) {

	}

	
	public static String compressBetter(String str){
		int size = countCompression(str);
		if(size >= str.length()){
			return str;
		}
		
		
	}


	private static int countCompression(String str) {
		if(str == null || str.isEmpty()) 
			return 0;		
		char last = str.charAt(0);
		int size=0;
		int count=1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last)
			{
				count++;
			} else{
				last = str.charAt(i);
				size+= 1+String.valueOf(count).length();
			}
			
		}		
		size+=1+String.valueOf(count).length();
		return size;
	}
}
