package com.string;

public class E54 {

	public static void main(String[] args) {
		String s="   http ://localhost : 8080   ";
		System.out.println(s);
		System.out.println("去掉字符串两端空格:"+s.trim());
		System.out.println("去掉所有空格:"+s.replace(" ",""));
		System.out.println("去掉所有空格(用正则表达式):"+s.replaceAll("\\s+",""));
	}

}
