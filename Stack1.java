import java.util.*;
import java.util.Stack;

class Stack1{
	public static void main(String args[]){
		Stack<Integer> obj=new Stack<Integer>();
		obj.push(1);
		obj.push(22);
		obj.push(3);
		obj.push(95);
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
		System.out.println(obj.peek());
		//System.out.println(obj.poll());
		int a=obj.search(22);
		System.out.println(a);
		Iterator itr=obj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}
}