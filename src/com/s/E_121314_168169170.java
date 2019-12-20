package com.s;

import java.io.IOException;

//Runtine()
public class E_121314_168169170 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("�������ĸ�����"+rt.availableProcessors()+"��");
		System.out.println("�����ڴ��С��"+rt.freeMemory()/1024/1024+"��");
		System.out.println("�������ڴ��С��"+rt.maxMemory()/1024/1024+"��");
		//---------------------------------------------------------------
		Process process=rt.exec("notepad.exe");
		Thread.sleep(3000);//��������3��
		process.destroy();//�رս���
	}
	
	
}
