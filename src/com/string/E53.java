package com.string;

public class E53 {

	public static void main(String[] args) {
		String str="jc1dg8r我t2jiu9ih5爱ja97sdf5你ghj7kc6xwa6ek";
		char[] charArray=str.toCharArray();
		System.out.print("将字符串转为字符数组的遍历结果：");
		
		
		for(int i=0;i<charArray.length;i++) {
			if (i !=charArray.length -1) {
				System.out.print(charArray[i]+",");
			}
			else {
				System.out.println(charArray[i]);
			}
		}
		
		System.out.print("字符串中的数字为：");
		for(char zf:charArray) {
			if (zf>='0'&&zf<='9') {
				System.out.print(zf);
			}	
		}	
		System.out.print("\n字符串中的汉字为：");
		for(char zf1:charArray) {
			if (zf1>='\u4E00' && zf1<='\u9FA5') {
				System.out.print(zf1);
			}
		}
		System.out.println("\n将int值转换为String类型之后的结果："+String.valueOf(12));
		System.out.println("将字符串转换大写之后的结果："+str.toUpperCase());	
	}
	}
