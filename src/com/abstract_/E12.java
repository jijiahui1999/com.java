package com.abstract_;
//定义抽象类
abstract class Animal{
	public abstract void shout();
}
//
class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪...");
	}
}
//定义测试类
public class E12 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
	}
}
