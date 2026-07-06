import java.util.*;
class max{
	public static void main(String[] args){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(45);
		pq.add(11);
		pq.add(72);
		pq.add(23);
	System.out.println("The smallest element"+ pq.peek());
	System.out.print("The min heap");
	while ( !pq.isEmpty()){
		System.out.println( " "+pq.poll());
	}
	}
}