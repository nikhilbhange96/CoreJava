package com.java;

//Single Inheritance
class Parent{

	Parent(){}

	void display(){
		System.out.println("Parent class");

	}
}
class Child extends Parent{
	Child(){}

	void fun(){
		System.out.println("Child class");

	}
}
class Animal{
	Animal(){
		
	}
	void leg() {
		
		System.out.println("Animal has four legs");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Bow bow");
	}
}
class Course{
	void exam() {
		System.out.println("This is tough");
	}
	int math() {
		int square= 5*5;
		System.out.println(square);
		return 5*5;
	}
}
class Student extends Course{
	void pass() {
		System.out.println("Student clear the exam");
	}
}

//Multilevel Inhertancce 

class Advanto{
	void demo() {
		System.out.println("various courses");
	}
}
class Swapnali extends Advanto{
	void teach() {
		System.out.println("java fullstack");
	}
}
class Nikhil extends Swapnali{
	void learn() {
		System.out.println("java and data analytics");
	}
}
class Vehicle{
	void brand() {
		System.out.println("Hyundai");
	}
}
class FourWheeler extends Vehicle{
	void model() {
		System.out.println("Creta");
	}
}
class Car extends FourWheeler{
	void color() {
		System.out.println("The color of vehicle is white");
	}
}
public class Inheritance {
	public static void main(String args[]){
		Child c= new Child();
		Dog d= new Dog();
		Student s= new Student();
		Nikhil n= new Nikhil();
		Car c1=new Car();
		c1.brand();
		c1.model();
		c1.color();
		n.demo();
		n.teach();
		n.learn();
		s.math();
		s.exam();
		s.pass();
		d.sound();
		d.leg();
		c.fun();
		c.display();
	}
}
