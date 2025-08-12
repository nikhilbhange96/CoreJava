interface Father{
	void display();
}

interface Mother{
	void fun();
}

class Children implements Father,Mother{
	public void display(){
		System.out.println("Hello");
	}
	public void fun(){
		System.out.println("Enjoy");
	}
	public static void main(String args[]){
		Children c=new Children();
		c.display();
		c.fun();
	}
}