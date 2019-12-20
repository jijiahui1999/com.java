package com.hanshushijiekou;
//声明这是一个无参、无返回值的函数式接口有且只有一个抽象方法的接口
@FunctionalInterface
interface Animal{
	void shout();
}
//声明这是一个无参、无返回值的函数式接口有且只有一个抽象方法的接口
@FunctionalInterface
interface Calculoate{
	int sum(int a,int b);
}

public class E23 {

	public static void main(String[] args) {
	animalshout(()->System.out.println("无参、无返回值的函数式接口调用"));
	showSum(10,20,(x,y)->x+y);
	}

	private static void showSum(int x, int y, Calculoate c) {
		System.out.println(x+"+"+y+"的和为:"+c.sum(x, y));
	}

	private static void animalshout(Animal an) {
		an.shout();	
	}

}
