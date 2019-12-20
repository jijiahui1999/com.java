package com.yihchang;

public class E29 {
	//����ʵ�������������
		public static int divide(int x,int y) {
		//divide���������
		//ִ�е�һ�����Ͳ�ִ�еڶ������
		try {
			int result=x/y;
			return result;
		} 
		catch (Exception e) {
			System.out.println("�����쳣��ϢΪ��"+e.getMessage());
		}
		finally {
			System.out.println("ִ��fanally����飬���۳����Ƿ��쳣������ִ��һ������");
		}
		return -1;
		}
		
		public static void main(String[] args) {
			int result=divide(4,2);	//����divide()����
			if (result==-1) {
				System.out.println("�������쳣��");
			}
			else {
				System.out.println(result);
			}
		}
}
