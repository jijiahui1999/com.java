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
		// ʹ��lambda���ʽ
	printUpper("hello",t->stu.printUpperCase(t));
		// ʹ�÷������õķ�ʽ
	printUpper("hello",stu::printUpperCase);
	}

	private static void printUpper(String text, Printable pt) {
		pt.print(text);
		
	}

}
