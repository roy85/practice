package hackerrank.datastructures.arrays;

import java.util.Scanner;

/*
 * HACKERRANK - HARD
 */

/*
 * https://codereview.stackexchange.com/questions/95755/algorithmic-crush-problem-hitting-timeout-errors
 * https://www.hackerrank.com/challenges/crush/forum
 * http://www.geeksforgeeks.org/prefix-sum-array-implementation-applications-competitive-programming/
 * 
 * Alternate solution - slightly diff aproach to calculating max: 
 * https://www.hackerrank.com/challenges/crush/forum/comments/255515
 * 
 * 
 * Visual explanation: 
 * https://s3.amazonaws.com/hr-assets/forumImages/1494402423-5fada8cbf9-pic.png
 * I hope this explanation helps you to understand algorithm.
If we draw a[]'s value into 'line graph', then the graph will looks like a mountain. 
(each a[n]'s value will indicate the height.)
Imagine the mountain tracking from left to right, and 'max' stores the maximum height.
starting point 'p' means go up / end point 'q+1' means go down. then, just adding p and q+1, 
we can know the current height(which is 'x'). and what we need to do is just find the maximum height. image
 * 
 * More verbiage explaining the approach:
 * After contemplating the popular approach for solving this, here is how I wrapped my head around it.
For every input line of a-b-k, you are given the range (a to b) where the values increase by k. 
So instead of keeping track of actual values increasing, just keep track of the rate of change (i.e. a slope) 
in terms of where the rate started its increase and where it stopped its increase. 
This is done by adding k to the "a" position of your array and adding -k to the "b+1" position 
of your array for every input line a-b-k, and that's it. "b+1" is used because the increase still applied at "b".
The maximum final value is equivalent to the maximum accumulated "slope" starting from the first position, 
because it is the spot which incremented more than all other places. 
Accumulated "slope" means to you add slope changes in position 0 to position 1, 
then add that to position 2, and so forth, looking for the point where it was the greatest.

 *
 *
 *Another explanation:
 *Here's a hint if you're struggling to reduce complexity. Using the example from the problem statement:
5 3
1 2 100
2 5 100
3 4 100
Imagine the final array ([100, 200, 200, 200, 100]) like this:
300 
200    --------- 
100 ---         ---
000
     |  |  |  |  |
     1  2  3  4  5
Think about how you can store this without updating every element for each of the given ranges.
 *
 *
 *Another explanation:
 *When we need to operate on a whole interval, we can just process the operation on the first index 
 *and we can do the reversal on the last. Let me give you an example, 
 *Here's an array: 0 0 0 0 0 a = 2 , b = 4 , k = 10 array after operation: 0 10 0 0 -10 
 *Now, start taking the prefix sum. Its 0 , 10 , 10 , 10 , 0. 
 *This is what your array will look like after you'll add 10 to all elements between interval 2 and 4. 
 *You can dry run the code and observe by yourself how the prefix sum array is working as if we're 
 *really adding between the indices.
 *
 *And more: https://codingin.wordpress.com/2017/02/19/solution-algorithmic-crush-in-java/
 */
public class AlgorithmicCrush {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        
        int m = scan.nextInt();
        int a,b,k=-1;
        long max = Long.MIN_VALUE;
        
        for(int i=0;i<m;i++){
            a = scan.nextInt();
            b = scan.nextInt();
            k = scan.nextInt();
            arr[a] += k;
            if(b+1<=n)
            	arr[b+1] -= k;
        }
        
        scan.close();
		long x=0;
		
        for(int i=1;i<=n;i++){
        	x = x+arr[i];
        	if(max<x) max = x;
        }
        
        if(n==0 || m==0)
        	max = 0;
        System.out.println(max);
	}

	
//	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//        
//        int n = scan.nextInt();
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<n;i++)
//        	list.add(0);
//        
//        int m = scan.nextInt();
//        int a,b,k=-1;
//        int max = Integer.MIN_VALUE;
//        
//        for(int i=0;i<m;i++){
//            a = scan.nextInt();
//            b = scan.nextInt();
//            k = scan.nextInt();
//            for(int j=a-1;j<=b-1;j++){
//            	list.set(j, list.get(j)+k);
//            }
//        }
//        
//        scan.close();
//		
//        for(int i=0;i<n;i++)
//        {
//        	if(max<list.get(i))
//        		max = list.get(i);
//        }
//        
//        if(n==0 || m==0)
//        	max = 0;
//        System.out.println(max);
//	}

}
