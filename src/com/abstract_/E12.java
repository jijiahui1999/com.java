package com.abstract_;
//���������
abstract class Animal{
	public abstract void shout();
}
//
class Dog extends Animal{
	public void shout() {
		System.out.println("����...");
	}
}
//���������
public class E12 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
	}
}
