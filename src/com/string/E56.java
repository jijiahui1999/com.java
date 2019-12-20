package com.string;

public class E56 {

	public static void main(String[] args) {
		String string="1998-12-12";
		System.out.println("今天是："+string.substring(8)+"日");
		System.out.println("今天是："+string.substring(5,7)+"月");
		System.out.println("今天是："+string.substring(0,4)+"年");
		
		//regex 正则表达式
		String[] stringArray=string.split("-");
		System.out.println("今天是："+stringArray[0]+"年"+stringArray[1]+"月"+stringArray[2]+"日");
		
		
		//System.out.println("从第六个字符截取到末尾结果："+string.substring(5));
		//System.out.println("从第六个字符截取到第七个字符结果："+string.substring(5,7));
	}

}
