package com.jicheng;
	//���嶯����
	class Animal{
		String name;
		//���嶯��еķ���
		public Animal() {
			System.out.println("����");
			}
		public Animal(String name) {
			System.out.println("��ʿ��"+name);
		}
		void shout() {
			System.out.println("�����㱼����");
		}
		}
	
	//����Dog��̳�Animal��
	class Dog extends Animal{
	public Dog() {
		super("������");
	}
	void printName() {
		System.out.println("�������ֽ�"+name);
	}
@Override//��д ǰ��Override��ע��
	void shout() {
	super. shout();
		System.out.println("��������......�Ľ���");
	}
	}
	//���������
public class E01 {
public static void main(String[] args) {
	Dog dog=new Dog();
	//dog. name="��ʿ��";
	//dog.printName();//�����Լ��ķ���
	//dog.shout();//���ø���ķ���
	}
}
