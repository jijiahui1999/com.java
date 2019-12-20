package com.jr181;

import java.io.Serializable;

public class Lei extends Object implements Serializable{
	//定义修饰符+class+类名
	//extends（继承关键字）父类标识符+implements（实现类关键字）父借口
	public static final class Abc extends Object implements Serializable {}
	private static final class Bcd extends Object implements Serializable {}
	protected static final class Cde extends Object implements Serializable {}
	//定义成员变量：修饰符+变量所属类型+变量标识符
	private static int age=0;
	private static final String name="";
	//定义成员方法：修饰符+方法返回得知的数据类型+方法标识符
	
	void setAge(int nianling) {
		age=nianling;
	}
	public int getAge() {
		return age;
		
	}
}
