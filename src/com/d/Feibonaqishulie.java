package com.d;

public class Feibonaqishulie {
	public static int f(int  n) {
		//f(1)=1 f(2)=2
		//return����ڷ�����ִ���Ժ󣬷�������ֹ������ִ��return��������
		if (n==1) return 1;
		if (n==2) return 2;
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		//1,1,2,3,5 
		System.out.println("쳲��������еĵ�6������"+f(6));
	}

}
