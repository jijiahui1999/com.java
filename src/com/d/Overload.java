package com.d;

public class Overload {
	//���������أ�
	//��һ��������ɸ�������������ͬ(������ͬ�ķ��������߷���ֵ��һ����
	//���߲������Ͳ�һ�������߲���������һ��)
	//���������ļӷ���
	public static int add(int x,int y) {
		return x+y;
	}
	//���������ļӷ���
		public static int add(int x,int y,int z) {
			return x+y+z;
	}
	//�������������ļӷ���
	public static double add(double x,double y) {
			return x+y;
	}
	public static void main(String[] args) {
		//System.out.println(add(3,5));
		//System.out.println(add(3,5,6));
		//System.out.println(add(3.1,5.2));
		
	}

}
