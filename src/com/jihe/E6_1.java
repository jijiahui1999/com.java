package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class E6_1 {

public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("s1");
	list.add("s2");
	list.add("s3");
	list.add("s4");
	System.out.println("���ϳ�����"+list.size());
	System.out.println("�ڶ���Ԫ����"+list.get(1));
		
	System.out.println("------------");
	//���Ԫ��	
	LinkedList<String> link=new LinkedList<String>();
	link.add("s1");
	link.add("s2");
	link.add("s3");
	link.add("s4");
	System.out.println(link);
	
	link.offer("offer");//β�����Ԫ��
	link.push("puth");//ͷ�����Ԫ��
	System.out.println(link);
	//��ȡԪ��
	Object object=link.peek();//��ȡ���ϵ�һ��Ԫ��
	System.out.println(object);
	//ɾ��Ԫ��
	link.removeFirst();//ɾ�����ϵ�һ��Ԫ��
	link.pollLast();//ɾ���������һ��Ԫ��
	System.out.println(link);
		
		
		
	}

}
