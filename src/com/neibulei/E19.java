package com.neibulei;
class Outer{
	int m=0;
	void test1() {
		System.out.println("�ⲿ���Ա����");
	}
	void test2() {
		class Inner{
			int n=1;
			void show() {
				System.out.println("�ⲿ����� m="+m);	
				test1();
			}
		}
		Inner inner=new Inner();
		System.out.println("�ֲ��ڲ����� n="+inner.n);
		inner.show();
	}
}
public class E19 {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.test2();

	}

}
