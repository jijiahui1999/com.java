package com.string;

public class E53 {

	public static void main(String[] args) {
		String str="jc1dg8r��t2jiu9ih5��ja97sdf5��ghj7kc6xwa6ek";
		char[] charArray=str.toCharArray();
		System.out.print("���ַ���תΪ�ַ�����ı��������");
		
		
		for(int i=0;i<charArray.length;i++) {
			if (i !=charArray.length -1) {
				System.out.print(charArray[i]+",");
			}
			else {
				System.out.println(charArray[i]);
			}
		}
		
		System.out.print("�ַ����е�����Ϊ��");
		for(char zf:charArray) {
			if (zf>='0'&&zf<='9') {
				System.out.print(zf);
			}	
		}	
		System.out.print("\n�ַ����еĺ���Ϊ��");
		for(char zf1:charArray) {
			if (zf1>='\u4E00' && zf1<='\u9FA5') {
				System.out.print(zf1);
			}
		}
		System.out.println("\n��intֵת��ΪString����֮��Ľ����"+String.valueOf(12));
		System.out.println("���ַ���ת����д֮��Ľ����"+str.toUpperCase());	
	}
	}
