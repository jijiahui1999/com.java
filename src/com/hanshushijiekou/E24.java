package com.hanshushijiekou;
@FunctionalInterface
interface Calcable{
	int calc(int num);
}
class mathn{
	public static int abs(int num) {
		if (num<0) {
			return-num;
		}else {
			return num;
		}
	}
}
public class E24 {
	//公用静态方法
	public static void main(String[] args) {
		// 使用lambda表达式:是一种简化写法，将最关键的语句写在第三部分
		//printabs(-10,n->Math.abs(n));
		printabs(-10,new Calcable() {
			
			@Override
			public int calc(int num) {
				if (num<0) {
					return-num;
				}else {
					return num;
				}
			}
		});
		// 使用方法引用的方式：类名：：静态方法名	来替换lambda表达式
		printabs(-50,Math::abs);
	}
	//calc方法是用求绝对值来实现的
	private static void printabs(int num, Calcable c) {
		System.out.println(c.calc(num));
		
	}

}
