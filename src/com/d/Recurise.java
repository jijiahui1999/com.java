package com.d;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Recurise {
		//�ݹ����
		//�ڷ������ڲ��Լ������Լ����ͽз����ĵݹ顣һ����˵����ֵ��һ��
		public static int getSun(int n) {
			//���ղ���ֵ
			if(n==1)return 1;
			int temp=getSun(n-1);
			//��1���⣬������ǰ��Ԫ�صĺ��Լ�Ԫ�ر���
			return n+temp;
		}
		public static void main(String[]args) {
			System.out.println("1��100�ĺ���"+getSun(100));
		}
	

}
