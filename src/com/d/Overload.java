package com.d;

public class Overload {
	//方法的重载：
	//在一个类里，若干个方法的名字相同(名字相同的方法，或者返回值不一样，
	//或者参数类型不一样，或者参数个数不一样)
	//两个整数的加法：
	public static int add(int x,int y) {
		return x+y;
	}
	//三个整数的加法：
		public static int add(int x,int y,int z) {
			return x+y+z;
	}
	//两个浮点数数的加法：
	public static double add(double x,double y) {
			return x+y;
	}
	public static void main(String[] args) {
		//System.out.println(add(3,5));
		//System.out.println(add(3,5,6));
		//System.out.println(add(3.1,5.2));
		
	}

}
