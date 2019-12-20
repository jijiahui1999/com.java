package com.baozhuanglei;

public class E_18 {

	public static void main(String[] args) {
		int num=123;
		
		System.out.println("1-----------");
		String string=String.valueOf(num);
		System.out.println("将int变量转换为字符串的结果是："+string);
		
		System.out.println("2-----------");
		String str="998";
		Integer integer=Integer.valueOf(num);
		Integer integer2=Integer.valueOf(str);
		System.out.println("将int变量转换为包装类的结果是："+integer);
		System.out.println("将字符串变量转换为包装类的结果是："+integer2);
		
		System.out.println("3-----------");
		Integer	integer3=new Integer(num);
		Integer integer4=Integer.valueOf(str);
		System.out.println("通过构造器将int变量转换为包装类的结果是"+integer3);
		System.out.println("通过构造器将字符串变量转换为包装类的结果是"+integer4);
		
		System.out.println("4-----------");
		int parseInt=Integer.parseInt(str);
		System.out.println("将字符串变量转换为基本类型的结果是："+parseInt);
		
		System.out.println("5-----------");
		String string2=integer.toString();
		System.out.println("将包装类转换为字符串结果是："+string2);
		
		System.out.println("5-----------");
		String s="88";
		String s1=s+10;
		System.out.println("字符串连接的结果为"+s1);
		
		System.out.println("6-字符串转换成整数---");
		String m="88";
		System.out.println("NO.1:通过包装类的valueOf方法：");
		int i_1=integer.valueOf(m);
		System.out.println(i_1+10);
		System.out.println("NO.2:通过包装类的parseXXX方法：");
		int i_2=integer.parseInt(m);
		System.out.println(i_2+10);
		System.out.println("NO.3:通过包装类的构造方法：");
		int i_3=new Integer(m);
		System.out.println(i_3+10);
		
		/*System.out.println("7-整数转换成字符串---");
		Integer j=88;
		System.out.println("NO.1:通过String类的静态valueOf方法：");
		int s_1=String.valueOf(d);
		System.out.println(s1);
		System.out.println("NO.2:通过包装类的toString方法：");
		int s_2=integer.parseInt(d);
		System.out.println(i_2+10);
		System.out.println("NO.3:通过空串连接整数的方法：");
		int s_3=""+j;
		System.out.println(s_3);*/
	}

}
