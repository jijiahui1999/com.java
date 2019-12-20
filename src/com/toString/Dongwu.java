package com.toString;

 final class Animal extends java.lang.Object{
	public String toString(){
		return "这是一只小动物";	
	}
}
class Dog extends java.lang.Object{
	public String toString(){
		return "这是一只小狗";	
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
