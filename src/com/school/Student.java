package com.school;

public class Student {
	//����2����Ա����
	private String name;
	//private:��ɼ��� ��ǰ����ֻ���ڱ����б�����
	//����Ա��������Ϊ˽�еģ�������ķ�װ
	//�ⲿ����Ҫ���������Ա����������ͨ�����е�getter setter����
	private int score;
	//û�����η������ɼ��� ��ǰ����ֻ���ڱ����б�����
	
	//���û���κζ��幹�췽����java��������Զ�����һ���޲εĹ��췽��
	//�����޲εĹ��췽����
	//���췽����һ������ķ��������η�+������[�������� ������]��{}
	public Student() {}
	//�����вεĹ��췽����
	public Student(String name,int score) {
	this.name = name;
	this.score = score;
	}
	//����2��getter setter����
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
