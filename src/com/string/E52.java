package com.string;

import javax.swing.text.StyledEditorKit.FontFamilyAction;

public class E52 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		System.out.println("�ַ���a�ĳ���"+a.length);

		String s= "abcabcbacdba";
		String s1= "abcdba.text";
		System.out.println("----------------------------------------");
		System.out.println("�ַ���s�ĳ���"+a.length);
		System.out.println("�ַ�����һ���ַ�:"+s.charAt(0));
		System.out.println("�ַ�����һ�γ��ֵ�λ��:"+s.indexOf('c'));
		System.out.println("�ַ������һ�γ��ֵ�λ��:"+s.lastIndexOf('c'));
		System.out.println("���ַ�����һ�γ��ֵ�λ��:"+s.indexOf("ab"));
		System.out.println("���ַ������һ�γ��ֵ�λ��:"+s.indexOf("ab"));
		System.out.println("----------------------------------------");
		System.out.println("�ַ����Ƿ���.text��β"+s1.endsWith(".text"));
		System.out.println("�ַ����Ƿ���ab��ʼ"+s1.endsWith("ab"));
		System.out.println("�ַ����Ƿ�������ַ���cd"+s1.contains("cd"));
		System.out.println("�ַ����Ƿ�Ϊ��"+s1.isEmpty());
		System.out.println("�����ַ����Ƿ����"+s1.equals(s));
		System.out.println("----------------------------------------");
		char[] charArray=s.toCharArray();
		System.out.println("���ַ���תΪ�ַ�����ı��������");
		for(int i=0;i<charArray.length;i++) {
			if (i !=charArray.length -1) {
				System.out.println(charArray[i]+",");
			}
			else {
				System.out.println(charArray[i]);
			}
		}
	}
}
