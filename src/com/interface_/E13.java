package com.interface_;
//定义抽象类
interface Animal{
	//接口中没有成员变量
	//只有public  static final的成员变量
	//（public  static final）可以省略
	int ID=1;
	//接口中的（public abstract）可以省略
	public abstract void shout();
	static int getID() {
		return Animal.ID;
	}
}

interface LandAnimal extends Animal{
	void run();
}
class Dog implements LandAnimal{
	@Override
	public void shout() {
		System.out.println("汪汪...");
	}
	@Override
	public void run() {
		System.out.println("小狗在跑")	;
	}
}
//定义测试类
public class E13 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		dog.run();
		System.out.println(Animal.getID());
	}
}
