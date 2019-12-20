package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Test test=new Test();
		
		ArrayList arrayList=new ArrayList<>();
		long starttime1=System.currentTimeMillis();
		test.listTest(arrayList);
		long endtime1=System.currentTimeMillis();
		System.out.println("用ArrayList插入15万个元素花费时间："+(endtime1-starttime1)+"毫秒");
		
		long starttime3=System.currentTimeMillis();
		test.listRead(arrayList);
		long endtime3=System.currentTimeMillis();
		System.out.println("用ArrayList读取15万个元素花费时间："+(endtime3-starttime3)+"毫秒");
		
		LinkedList linkedList=new LinkedList<>();
		long starttime2=System.currentTimeMillis();
		test.listTest(linkedList);
		long endtime2=System.currentTimeMillis();
		System.out.println("用linkedList插入15万个元素花费时间："+(endtime2-starttime2)+"毫秒");
		
		long starttime4=System.currentTimeMillis();
		test.listRead(linkedList);
		long endtime4=System.currentTimeMillis();
		System.out.println("用linkedList读取15万个元素花费时间："+(endtime4-starttime4)+"毫秒");
	}

}
class Test{
	public void listTest(List list) {
		//Random random=new Random();
		for(int i=0;i<150000;i++) {
			list.add(0,i);
		}
	}
	public void listRead(List list) {
	//Random random=new Random();
		for(int i=150000-1;i>=0;i--) {
			list.get(i);
		
	}
}
}

