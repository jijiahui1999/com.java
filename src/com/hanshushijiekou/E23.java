package com.hanshushijiekou;
//��������һ���޲Ρ��޷���ֵ�ĺ���ʽ�ӿ�����ֻ��һ�����󷽷��Ľӿ�
@FunctionalInterface
interface Animal{
	void shout();
}
//��������һ���޲Ρ��޷���ֵ�ĺ���ʽ�ӿ�����ֻ��һ�����󷽷��Ľӿ�
@FunctionalInterface
interface Calculoate{
	int sum(int a,int b);
}

public class E23 {

	public static void main(String[] args) {
	animalshout(()->System.out.println("�޲Ρ��޷���ֵ�ĺ���ʽ�ӿڵ���"));
	showSum(10,20,(x,y)->x+y);
	}

	private static void showSum(int x, int y, Calculoate c) {
		System.out.println(x+"+"+y+"�ĺ�Ϊ:"+c.sum(x, y));
	}

	private static void animalshout(Animal an) {
		an.shout();	
	}

}
