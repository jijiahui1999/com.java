package com.gc;
class Person{
	public void finalize() {
		System.out.println("���󽫱���Ϊ��������...");
	}
}
public class E37 {
	//��֪ͨǿ���ջ�����
	private static void recyclegWaste1() {
		Person p1=new Person();
		p1=null;
		int i=1;
		while(i<10){
			System.out.println("����һѭ��...........");
			i++;
		}
	}
	//֪ͨǿ���ջ�����
	private static void recyclegWaste2() {
		Person p2=new Person();
		p2=null;
		System.gc();
		int i=1;
		while(i<10){
			System.out.println("������ѭ��...........");
			i++;
		}
		
	}
	public static void main(String[] args) {
		recyclegWaste1();
		System.out.println("===================");
		recyclegWaste2();
	}

	

}
