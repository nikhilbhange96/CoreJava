class Hello{
	static int rollno=10;
	int a=5;

	//priority of execution static >> constructor >> non static

	static{
		System.out.println("Static block is executed...");

	}
	/*static void display(){
		rollno=101;
		System.out.println(rollno);
	}
	

	public static void main(String args[]){
		System.out.println("Static variable does not need to create object for calling , we can call with help of className...");
		System.out.println(Hello.rollno);
		System.out.println("Non static variable need to create object for calling...");
		Hello h= new Hello();
		System.out.println(h.a);
		Hello.display();
	}*/
}