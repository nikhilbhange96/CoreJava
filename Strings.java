import java.util.*;

class Strings{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string :");
		String str=sc.nextLine();

		System.out.println("Enter a char");
		char ch=sc.nextLine().charAt(0);

		int count=0;

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		System.out.println(count);

		/*
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();

		String str;

		if(str1.length()==str2.length()){
			str=str1+str2;
			System.out.println(str.contains(str2)+": str1 and str2 are rotations");
		}
		else{
			System.out.println("str1  and str2 are not rotations");
		}
		*/

		/*
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		if(str1.length()==str2.length()){
			
			//convert strings into char array

			char[] charArr1=str1.toCharArray();
			char[] charArr2=str2.toCharArray();

			//sort the char array
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);

			boolean result=Arrays.equals(charArr1,charArr2);

			if(result){
				System.out.println(str1+" and "+str2 +" are anagram");
			}
			else{
				System.out.println("Strings are not anagram");
			}
		}
		else{
			System.out.println("Length is not equal");
		}
		*/

		/*//Check Palindrome
		System.out.println("Enter string :");
		String str=sc.nextLine();

		String temp=str;
		String revStr="";

		for(int i=str.length()-1; i>=0; i--){
			revStr+=str.charAt(i);
		}
		System.out.println("Reversed string : "+revStr);

		if(temp.equals(revStr)){
			System.out.println("string is Palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
		*/

		/*//change the case of string
		//step 1: convert string into char
		//step 2:for(int i=0; i<str.length(); i++)
		//step 3: ASCII value A to Z (65 to 90) a to z (97 to 122)

		String str= "Nikhil";
		char [] charArr=str.toCharArray();
		
		for(int i=0; i<str.length(); i++){
			char currentchar=charArr[i];

			//check if letter is an uppercase letter
			if(currentchar>='a' && currentchar<='z'){

				charArr[i]=(char)(currentchar-32);
			}
			
			
		}

		//convert char Array back to String
		String us=new String(charArr);
		
		System.out.println("Original String : "+str);
		System.out.println("Uppercased String : "+us);
		*/
		

	}
}