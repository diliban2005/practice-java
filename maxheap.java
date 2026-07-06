import java.util.*;
class maxheap{
	public static void main(String[] args){
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(45);
		pq.add(11);
		pq.add(72);
		pq.add(23);
	System.out.println("The largest element"+ pq.peek());
	System.out.print("The max heap");
	while ( !pq.isEmpty()){
		System.out.println( " "+pq.poll());
	}
	}
}