package com.string;
public class StringBuffer_TEST {

	public static void main(String[] args) {
		System.out.println("1.���.................");
		add();
		System.out.println("2.�޸�.................");
		update();
		System.out.println("3.ɾ��.................");
		delete();
	}

	
		private static void delete() {
			StringBuffer sb=new StringBuffer("ABCDEFG");
			sb.delete(3,7);
			System.out.println("ɾ��ָ��λ�ý��Ϊ��"+sb);
			sb.deleteCharAt(2);
			System.out.println("ɾ��ָ��λ�ý��Ϊ��"+sb);
			sb.delete(0,sb.length());
			System.out.println("��ջ��������Ϊ��"+sb);
		
	}


		private static void add() {
			StringBuffer sb=new StringBuffer();
			sb.append("ABC");
			System.out.println("append��ӽ��Ϊ��+sb");
			sb.insert(3,"DE");
			System.out.println("insert��ӽ��Ϊ��+sb");
		}
	
	
	private static void update() {
		StringBuffer sb=new StringBuffer("ABAAA");
		sb.setCharAt(2,'C');
		System.out.println("�޸�ָ��λ�ý��Ϊ��+sb");
		sb.replace(3,5,"DE");
		System.out.println("�滻ָ��λ���ַ����������Ϊ��+sb");
		System.out.println("�ַ�����ת������Ϊ��+sb");
	}
	
	

	

	

}
