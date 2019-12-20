package com.hanshushijiekou2;

@FunctionalInterface
interface Printable{
void  print(StringUtils su,String src);
}

class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}

public class E27 {
	
	private static void printUpper(StringUtils su, String text, Printable pt) {
		pt.print(su, text);
		
	}
	public static void main(String[] args) {
		// 使用lambda表达式
		printUpper(new StringUtils(),"hello",(Object,t)->Object.printUpperCase(t));
		// 使用方法引用的方式
		printUpper(new StringUtils(),"would",StringUtils::printUpperCase);
	}

	

}
