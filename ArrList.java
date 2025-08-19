import java.util.*;
import java.util.ArrayList;


class ArrList{
	public static void main(String args[]){

		ArrayList<String> obj=new ArrayList<>();
		obj.add("Nikhil");
		obj.add("Ram");
		obj.add("Jay");
		obj.add("Abhi");
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		obj.set(0,"Sheetal");
		System.out.println(obj);
		System.out.println(obj.get(1));

		System.out.println("Iterations");
		for(String str:obj)	
		System.out.println(obj);
		Iterator itr= obj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
}