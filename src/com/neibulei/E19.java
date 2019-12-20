package com.neibulei;
class Outer{
	int m=0;
	void test1() {
		System.out.println("外部类成员变量");
	}
	void test2() {
		class Inner{
			int n=1;
			void show() {
				System.out.println("外部类变量 m="+m);	
				test1();
			}
		}
		Inner inner=new Inner();
		System.out.println("局部内部变量 n="+inner.n);
		inner.show();
	}
}
public class E19 {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.test2();

	}

}
