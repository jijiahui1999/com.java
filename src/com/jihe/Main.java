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
		System.out.println("��ArrayList����15���Ԫ�ػ���ʱ�䣺"+(endtime1-starttime1)+"����");
		
		long starttime3=System.currentTimeMillis();
		test.listRead(arrayList);
		long endtime3=System.currentTimeMillis();
		System.out.println("��ArrayList��ȡ15���Ԫ�ػ���ʱ�䣺"+(endtime3-starttime3)+"����");
		
		LinkedList linkedList=new LinkedList<>();
		long starttime2=System.currentTimeMillis();
		test.listTest(linkedList);
		long endtime2=System.currentTimeMillis();
		System.out.println("��linkedList����15���Ԫ�ػ���ʱ�䣺"+(endtime2-starttime2)+"����");
		
		long starttime4=System.currentTimeMillis();
		test.listRead(linkedList);
		long endtime4=System.currentTimeMillis();
		System.out.println("��linkedList��ȡ15���Ԫ�ػ���ʱ�䣺"+(endtime4-starttime4)+"����");
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

