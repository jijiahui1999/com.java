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
		
		
		// 使用lambda表达方式
		printName("杨幂",new personBuilder() {
			
			@Override
			public person buildPerson(String name) {
				person ren=new person(name);
				return ren;
			}
		});
		printName("峰", name->new person(name));
		// 使用构造器应用的方式
		printName("赵丽颖", person::new);
	}

	private static void printName(String name, personBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
		
	}

}
