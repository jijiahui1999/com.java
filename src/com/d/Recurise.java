package com.d;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Recurise {
		//递归求和
		//在方法的内部自己调用自己，就叫方法的递归。一般来说参数值不一样
		public static int getSun(int n) {
			//最终参数值
			if(n==1)return 1;
			int temp=getSun(n-1);
			//除1以外，都加上前面元素的和以及元素本身
			return n+temp;
		}
		public static void main(String[]args) {
			System.out.println("1到100的和是"+getSun(100));
		}
	

}
