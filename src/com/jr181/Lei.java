package com.jr181;

import java.io.Serializable;

public class Lei extends Object implements Serializable{
	//�������η�+class+����
	//extends���̳йؼ��֣������ʶ��+implements��ʵ����ؼ��֣������
	public static final class Abc extends Object implements Serializable {}
	private static final class Bcd extends Object implements Serializable {}
	protected static final class Cde extends Object implements Serializable {}
	//�����Ա���������η�+������������+������ʶ��
	private static int age=0;
	private static final String name="";
	//�����Ա���������η�+�������ص�֪����������+������ʶ��
	
	void setAge(int nianling) {
		age=nianling;
	}
	public int getAge() {
		return age;
		
	}
}
