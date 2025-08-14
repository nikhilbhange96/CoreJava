interface A{
	void fun();
}

interface B extends A{
	void gun();
}

class Child3 implements B{
	public void fun(){
		System.out.println("abc");
	}
	public void gun(){
		System.out.println("This is gun method");
	}
	void sun(){
		System.out.println("This is sun method");
	}
	public static void main(String args[]){
		Child c= new Child();
		/*c.fun();
		c.gun();
		c.sun();*/
		A obj= new A(){
		
			public void fun(){
				System.out.println("Hello world");
			}
			
		};
		obj.fun();
	}
interface A{
	void add(int x, int y);
}

interface B{
	void sub(int x, int y);
}
class Child implements A,B{
	public void add(int x, int y){
		System.out.println(x+y);
	}
	public void sub(int x, int y){
		System.out.println(x-y);
	}
	public static void main(String args[]){
		Child c=new Child();
		c.add(20,10);
		c.sub(100,10);
	}
}
}
