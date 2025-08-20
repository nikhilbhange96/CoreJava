class Deque{
	public static void main(String args[]){
		Queue<Integer> list=new ArrayDeque<Integer>();
		list.add(100);
		list.add(2);
		list.add(30);
		System.out.println(list);
		for(Integer in:list){
			System.out.println(in);
		}
		System.out.println();
		System.out.println(list.poll());
		System.out.println(list);
	}
}