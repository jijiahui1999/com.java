package com.s;

public class S164 {

	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		if (s1.equals(s2)) {
			System.out.println("s1��s2���");
		}
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		if (s1.equals(s2)) {
			System.out.println("s1��s2�����");
		}

	}

}
