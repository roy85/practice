package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args){
		List<Interval> list = new ArrayList<>();
//		list.add(new Interval(1, 3));
//		list.add(new Interval(2, 6));
//		list.add(new Interval(8, 10));
//		list.add(new Interval(15, 18));
				
//		list.add(new Interval(1, 21));
//		list.add(new Interval(2, 6));
//		list.add(new Interval(8, 10));
//		list.add(new Interval(15, 18));
		
//		list.add(new Interval(1, 3));
//		list.add(new Interval(1, 6));
//		list.add(new Interval(8, 10));
//		list.add(new Interval(15, 18));
//		
		list.add(new Interval(1, 4));
		list.add(new Interval(0, 0));
				
		List<Interval> result = merge(list);
		if(result!=null && result.size()>0){
		for(Interval i : result){
			System.out.println(i.start+","+i.end);
		}
		}
		else{
			System.out.println(result);
		}
	}
	
	//Best: 94.25% - 
//	public List<Interval> merge(List<Interval> intervals) {
//        // sort start&end
//        int n = intervals.size();
//        int[] starts = new int[n];
//        int[] ends = new int[n];
//        for (int i = 0; i < n; i++) {
//            starts[i] = intervals.get(i).start;
//            ends[i] = intervals.get(i).end;
//        }
//        Arrays.sort(starts);
//        Arrays.sort(ends);
//        // loop through
//        List<Interval> res = new ArrayList<Interval>();
//        for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
//            if (i == n - 1 || starts[i + 1] > ends[i]) {
//                res.add(new Interval(starts[j], ends[i]));
//                j = i + 1;
//            }
//        }
//        return res;
//    }
	
	//42.74% - https://discuss.leetcode.com/topic/4319/a-simple-java-solution/9?page=1 
//	public List<Interval> merge(List<Interval> intervals) {
//        if (intervals == null || intervals.isEmpty())
//		return intervals;
//        Collections.sort(intervals, new Comparator<Interval>() {
//            public int compare(Interval i1, Interval i2) {
//                if (i1.start != i2.start) {
//                    return i1.start - i2.start;
//                }
//                return i1.end - i2.end;
//            }
//        });
//        ListIterator<Interval> it = intervals.listIterator();
//        Interval cur = it.next();
//        while (it.hasNext()) {
//            Interval next = it.next();
//            if (cur.end < next.start) {
//                cur = next;
//                continue;
//            } else {
//                cur.end = Math.max(cur.end, next.end);
//                it.remove();
//            }
//        }
//        return intervals;
//    }
	
//	24.78% - https://discuss.leetcode.com/topic/4319/a-simple-java-solution?page=1 
//	public List<Interval> merge(List<Interval> intervals) {
//	    if (intervals.size() <= 1)
//	        return intervals;
//	    
//	    // Sort by ascending starting point using an anonymous Comparator
//	    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
//	    
//	    List<Interval> result = new LinkedList<Interval>();
//	    int start = intervals.get(0).start;
//	    int end = intervals.get(0).end;
//	    
//	    for (Interval interval : intervals) {
//	        if (interval.start <= end) // Overlapping intervals, move the end if needed
//	            end = Math.max(end, interval.end);
//	        else {                     // Disjoint intervals, add the previous one and reset bounds
//	            result.add(new Interval(start, end));
//	            start = interval.start;
//	            end = interval.end;
//	        }
//	    }
//	    
//	    // Add the last interval
//	    result.add(new Interval(start, end));
//	    return result;
//	}
	
	//41.01% - asked in fb to not use the new keyword.
	//https://discuss.leetcode.com/topic/4319/a-simple-java-solution/32?page=2
//	public List<Interval> merge(List<Interval> intervals) {
//        if (intervals == null)    throw new IllegalArgumentException();
//        
//        Collections.sort(intervals, new Comparator<Interval>(){
//            @Override
//            public int compare(Interval a, Interval b) {
//                if (a.start == b.start)     return b.end - a.end;
//                return a.start - b.start;
//            }
//        });
//        
//        int i = 0;
//        while (i < intervals.size() - 1) {
//            Interval a = intervals.get(i), b = intervals.get(i + 1);
//            if (a.end >= b.start) {
//                a.end = Math.max(a.end, b.end);
//                intervals.remove(i + 1);
//            }
//            else    i++;
//        }
//        return intervals;
//    }
	
	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> list = new ArrayList<>();
		
		int start=0,end=0;
		if(intervals==null || intervals.size()==0)
			return new ArrayList<Interval>();
		
		if(intervals.size()==1)
			return intervals;
		
		start = intervals.get(0).start;
		end = intervals.get(0).end;
		
		for(int i=1;i<intervals.size();i++){
			Interval I = intervals.get(i);
			if(I.start <= end){
				start = Math.min(start, I.start);
				end = Math.max(end,  I.end);
			}
			else{
				Interval I2 = new Interval(start, end);
				list.add(I2);
				start = I.start;
				end = I.end;
			}
		}
		
		list.add(new Interval(start, end));
		
		return list;
	}
	
	
	static class Interval {
		int start;
		int end;
		Interval(){
			start=0;end=0;
		}
		Interval(int s, int e){
			start=s;end=e;
		}
	}
}
