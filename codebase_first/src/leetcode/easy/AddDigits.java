package leetcode.easy;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(Solution39.addDigits(39));
	}

}

class Solution39{
	public static int addDigits(int num) {
		
		while(num>9){
	        int arr[] = new int[Integer.toString(num).length()];
	        
	        int x=num;
	        int y=0;
	        for(int i=0;i<arr.length;i++){
	        	y=x%10;
	        	x=((x-y)/10);
	        	arr[i]=y;
	        }
	        
	        y=0;
	        for(int i=0;i<arr.length;i++){
	        	y+=arr[i];
	        }
	        num=y;
        }
		
		return num;
    }
}