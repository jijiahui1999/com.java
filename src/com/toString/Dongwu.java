package com.toString;

 final class Animal extends java.lang.Object{
	public String toString(){
		return "����һֻС����";	
	}
}
class Dog extends java.lang.Object{
	public String toString(){
		return "����һֻС��";	
	}
}
public class Dongwu {

	public static void main(String[] args) {
		 Animal dongwu=new Animal();
		Dog dog=new Dog();
		 System.out.println(dongwu.toString());
		 System.out.println(dog.toString());
	}
}
