class Test01{
	public static void main(String args[]){
		int num=5234;
		int count=0;
		while(num>0){
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
			