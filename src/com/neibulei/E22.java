package com.neibulei;
interface Animal{
	void  shout();
}

public class E22 {
	public static void main(String[] args) {
		String name="С��";
		animalShout(new Animal(){
			public void shout() {
				System.out.println("�����ڲ��������"+name+"����������");
			}
		});
animalShout(()->System.out.println(name+"����..."));
}

	private static void animalShout(Animal animal) {
		animal.shout();
		
	}

}
