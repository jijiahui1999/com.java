package com.baozhuanglei;

public class E_18 {

	public static void main(String[] args) {
		int num=123;
		
		System.out.println("1-----------");
		String string=String.valueOf(num);
		System.out.println("��int����ת��Ϊ�ַ����Ľ���ǣ�"+string);
		
		System.out.println("2-----------");
		String str="998";
		Integer integer=Integer.valueOf(num);
		Integer integer2=Integer.valueOf(str);
		System.out.println("��int����ת��Ϊ��װ��Ľ���ǣ�"+integer);
		System.out.println("���ַ�������ת��Ϊ��װ��Ľ���ǣ�"+integer2);
		
		System.out.println("3-----------");
		Integer	integer3=new Integer(num);
		Integer integer4=Integer.valueOf(str);
		System.out.println("ͨ����������int����ת��Ϊ��װ��Ľ����"+integer3);
		System.out.println("ͨ�����������ַ�������ת��Ϊ��װ��Ľ����"+integer4);
		
		System.out.println("4-----------");
		int parseInt=Integer.parseInt(str);
		System.out.println("���ַ�������ת��Ϊ�������͵Ľ���ǣ�"+parseInt);
		
		System.out.println("5-----------");
		String string2=integer.toString();
		System.out.println("����װ��ת��Ϊ�ַ�������ǣ�"+string2);
		
		System.out.println("5-----------");
		String s="88";
		String s1=s+10;
		System.out.println("�ַ������ӵĽ��Ϊ"+s1);
		
		System.out.println("6-�ַ���ת��������---");
		String m="88";
		System.out.println("NO.1:ͨ����װ���valueOf������");
		int i_1=integer.valueOf(m);
		System.out.println(i_1+10);
		System.out.println("NO.2:ͨ����װ���parseXXX������");
		int i_2=integer.parseInt(m);
		System.out.println(i_2+10);
		System.out.println("NO.3:ͨ����װ��Ĺ��췽����");
		int i_3=new Integer(m);
		System.out.println(i_3+10);
		
		/*System.out.println("7-����ת�����ַ���---");
		Integer j=88;
		System.out.println("NO.1:ͨ��String��ľ�̬valueOf������");
		int s_1=String.valueOf(d);
		System.out.println(s1);
		System.out.println("NO.2:ͨ����װ���toString������");
		int s_2=integer.parseInt(d);
		System.out.println(i_2+10);
		System.out.println("NO.3:ͨ���մ����������ķ�����");
		int s_3=""+j;
		System.out.println(s_3);*/
	}

}
