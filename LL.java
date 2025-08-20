import java.util.*;

class LL{
	public static void main(String args[]){
		LinkedList<Integer> li=new LinkedList<>();
		li.add(3);
		System.out.println(li);

		li.addFirst(1);
		li.add(1,2);

		li.addLast(6);
		li.add(10);
		System.out.println(li);

		li.removeFirst();
		System.out.println("First removed:"+li);

		li.removeLast();
		System.out.println("Last Removed:"+li);

		li.remove(1);
		System.out.println(li);

		System.out.println(li.getFirst());

		li.forEach((n)->{
			System.out.println(n);
		});

	}
}