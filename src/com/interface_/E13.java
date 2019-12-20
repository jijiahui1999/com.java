package com.interface_;
//���������
interface Animal{
	//�ӿ���û�г�Ա����
	//ֻ��public  static final�ĳ�Ա����
	//��public  static final������ʡ��
	int ID=1;
	//�ӿ��еģ�public abstract������ʡ��
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
		System.out.println("����...");
	}
	@Override
	public void run() {
		System.out.println("С������")	;
	}
}
//���������
public class E13 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		dog.run();
		System.out.println(Animal.getID());
	}
}
