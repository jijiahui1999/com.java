package com.string;

public class E56 {

	public static void main(String[] args) {
		String string="1998-12-12";
		System.out.println("�����ǣ�"+string.substring(8)+"��");
		System.out.println("�����ǣ�"+string.substring(5,7)+"��");
		System.out.println("�����ǣ�"+string.substring(0,4)+"��");
		
		//regex ������ʽ
		String[] stringArray=string.split("-");
		System.out.println("�����ǣ�"+stringArray[0]+"��"+stringArray[1]+"��"+stringArray[2]+"��");
		
		
		//System.out.println("�ӵ������ַ���ȡ��ĩβ�����"+string.substring(5));
		//System.out.println("�ӵ������ַ���ȡ�����߸��ַ������"+string.substring(5,7));
	}

}
