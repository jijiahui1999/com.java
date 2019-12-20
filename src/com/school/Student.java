package com.school;

public class Student {
	//定义2个成员变量
	private String name;
	//private:类可见性 当前属性只能在本类中被访问
	//将成员变量定义为私有的，就是类的封装
	//外部方法要访问这个成员变量，必须通过共有的getter setter方法
	private int score;
	//没有修饰符：包可见性 当前属性只能在本包中被访问
	
	//如果没有任何定义构造方法，java虚拟机会自动创建一个无参的构造方法
	//定义无参的构造方法：
	//构造方法是一种特殊的方法：修饰符+类名（[参数类型 参数名]）{}
	public Student() {}
	//定义有参的构造方法：
	public Student(String name,int score) {
	this.name = name;
	this.score = score;
	}
	//定义2个getter setter方法
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
