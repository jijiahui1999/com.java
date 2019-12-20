package com.jicheng;
	//定义动物类
	class Animal{
		String name;
		//定义动物叫的方法
		public Animal() {
			System.out.println("狗是");
			}
		public Animal(String name) {
			System.out.println("哈士奇"+name);
		}
		void shout() {
			System.out.println("看见你奔向你");
		}
		}
	
	//定义Dog类继承Animal类
	class Dog extends Animal{
	public Dog() {
		super("激动地");
	}
	void printName() {
		System.out.println("狗的名字叫"+name);
	}
@Override//重写 前面Override是注解
	void shout() {
	super. shout();
		System.out.println("发出汪汪......的叫声");
	}
	}
	//定义测试类
public class E01 {
public static void main(String[] args) {
	Dog dog=new Dog();
	//dog. name="哈士奇";
	//dog.printName();//调用自己的方法
	//dog.shout();//调用父类的方法
	}
}
