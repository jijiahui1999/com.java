package com.hanshushijiekou;
@FunctionalInterface
interface Printable{
void  print(String src)	;
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println( str.toUpperCase());
	}
}
public class E25 {

	public static void main(String[] args) {
		StringUtils stu=new StringUtils();
		// 使用lambda表达式
	printUpper("hello",t->stu.printUpperCase(t));
		// 使用方法引用的方式
	printUpper("hello",stu::printUpperCase);
	}

	private static void printUpper(String text, Printable pt) {
		pt.print(text);
		
	}

}
