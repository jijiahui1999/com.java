package com.string;

public class E54 {

	public static void main(String[] args) {
		String s="   http ://localhost : 8080   ";
		System.out.println(s);
		System.out.println("ȥ���ַ������˿ո�:"+s.trim());
		System.out.println("ȥ�����пո�:"+s.replace(" ",""));
		System.out.println("ȥ�����пո�(��������ʽ):"+s.replaceAll("\\s+",""));
	}

}
