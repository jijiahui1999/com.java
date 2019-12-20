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
	System.out.println("集合长度是"+list.size());
	System.out.println("第二个元素是"+list.get(1));
		
	System.out.println("------------");
	//添加元素	
	LinkedList<String> link=new LinkedList<String>();
	link.add("s1");
	link.add("s2");
	link.add("s3");
	link.add("s4");
	System.out.println(link);
	
	link.offer("offer");//尾部添加元素
	link.push("puth");//头部添加元素
	System.out.println(link);
	//获取元素
	Object object=link.peek();//获取集合第一个元素
	System.out.println(object);
	//删除元素
	link.removeFirst();//删除集合第一个元素
	link.pollLast();//删除集合最后一个元素
	System.out.println(link);
		
		
		
	}

}
