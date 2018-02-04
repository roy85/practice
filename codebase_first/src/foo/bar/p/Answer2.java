package foo.bar.p;

public class Answer2 {

	public static int answer(String n) { 
        int steps = 0;
		int num=0;
		
		try{
			num = Integer.parseInt(n);
		}
		catch(NumberFormatException exception){
			return 0;
		}
		if(num <= 1){
			return 0;
		}
		
		while (num !=1){
			{	
				//even numbers
				while(num%2 == 0){					
					num = num/2;
					steps++;				
				}
				
				if(num == 3){
					num = 1;
					steps += 2;
					break;
				}
				
				//Odd numbers, not equal to 1
				if(num%2!=0 && num != 1){
					if(Integer.numberOfTrailingZeros(num-1) > Integer.numberOfTrailingZeros(num+1)){
						num = (num-1);
					}
					else
					{
						num = (num+1);
					}
					steps += 1;
				}
			}
		}
		return steps;
    } 

	
}
