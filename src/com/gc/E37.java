package com.gc;
class Person{
	public void finalize() {
		System.out.println("对象将被作为垃圾回收...");
	}
}
public class E37 {
	//不通知强制收回垃圾
	private static void recyclegWaste1() {
		Person p1=new Person();
		p1=null;
		int i=1;
		while(i<10){
			System.out.println("方法一循环...........");
			i++;
		}
	}
	//通知强制收回垃圾
	private static void recyclegWaste2() {
		Person p2=new Person();
		p2=null;
		System.gc();
		int i=1;
		while(i<10){
			System.out.println("方法二循环...........");
			i++;
		}
		
	}
	public static void main(String[] args) {
		recyclegWaste1();
		System.out.println("===================");
		recyclegWaste2();
	}

	

}
