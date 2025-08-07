class ClassEx{
	
	//fields(instance variable)

	String name;
	int Rollno;
	String address;

	//constructor

	ClassEx(){
		System.out.println("Default constructor called...");
	}

	ClassEx(String nm, int rno, String addr){
		nm=name;
		rno=Rollno;
		addr=address;
	}
	public static void main(String args[]){
		ClassEx obj=new ClassEx();
System.out.println(obj.nm);
		
	}
}