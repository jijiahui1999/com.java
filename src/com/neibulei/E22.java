package com.neibulei;
interface Animal{
	void  shout();
}

public class E22 {
	public static void main(String[] args) {
		String name="小花";
		animalShout(new Animal(){
			public void shout() {
				System.out.println("匿名内部类输出："+name+"喵喵。。。");
			}
		});
animalShout(()->System.out.println(name+"喵喵..."));
}

	private static void animalShout(Animal animal) {
		animal.shout();
		
	}

}
