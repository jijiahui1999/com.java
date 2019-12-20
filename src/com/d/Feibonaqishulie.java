package com.d;

public class Feibonaqishulie {
	public static int f(int  n) {
		//f(1)=1 f(2)=2
		//return语句在方法中执行以后，方法将终止，不再执行return后面的语句
		if (n==1) return 1;
		if (n==2) return 2;
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		//1,1,2,3,5 
		System.out.println("斐波那契数列的第6的数是"+f(6));
	}

}
