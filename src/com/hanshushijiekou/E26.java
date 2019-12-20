package com.hanshushijiekou;
@FunctionalInterface
interface personBuilder{
	person buildPerson(String name);
}
class person{
	private String name;
	public person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}	
}
public class E26 {
	public static void main(String[] args) {
		
		
		// ʹ��lambda��﷽ʽ
		printName("����",new personBuilder() {
			
			@Override
			public person buildPerson(String name) {
				person ren=new person(name);
				return ren;
			}
		});
		printName("��", name->new person(name));
		// ʹ�ù�����Ӧ�õķ�ʽ
		printName("����ӱ", person::new);
	}

	private static void printName(String name, personBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
		
	}

}
