package com.yihchang;
class DivideByMinusException extends Exception{

	public DivideByMinusException() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public DivideByMinusException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}
//����ʵ�������������������throws�ؼ����׳��쳣
public class E31 {
	public static int divide(int x,int y) throws Exception {
		if (y==0) {
			throw new DivideByMinusException("����Ϊ0");
		}
		int result=x/y;
		return result;
		}
	
	public static void main(String[] args) throws Exception  {
		try {
			int result=divide(4,2);
			System.out.println(result);			
	
		} 
		catch (Exception e) {
			System.out.println("�����쳣��ϢΪ��"+e.getMessage());
		}
	}
	}


