package com.hanshushijiekou;
@FunctionalInterface
interface Calcable{
	int calc(int num);
}
class mathn{
	public static int abs(int num) {
		if (num<0) {
			return-num;
		}else {
			return num;
		}
	}
}
public class E24 {
	//���þ�̬����
	public static void main(String[] args) {
		// ʹ��lambda���ʽ:��һ�ּ�д��������ؼ������д�ڵ�������
		//printabs(-10,n->Math.abs(n));
		printabs(-10,new Calcable() {
			
			@Override
			public int calc(int num) {
				if (num<0) {
					return-num;
				}else {
					return num;
				}
			}
		});
		// ʹ�÷������õķ�ʽ������������̬������	���滻lambda���ʽ
		printabs(-50,Math::abs);
	}
	//calc�������������ֵ��ʵ�ֵ�
	private static void printabs(int num, Calcable c) {
		System.out.println(c.calc(num));
		
	}

}
