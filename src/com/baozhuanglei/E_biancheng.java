package com.baozhuanglei;

public class E_biancheng {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("HelloWorld");
		String zfc=s.reverse().toString();
		System.out.println("1."+zfc);
		
		StringBuffer kc=new StringBuffer();
		char[] zf=zfc.toCharArray();
		for(int i=0;i<zf.length;i++) {
			char c=zf[i];
			if (Character.isUpperCase(c)) {
				String dx=(""+c).toLowerCase();
				kc.append(dx);
			}
			else if (Character.isUpperCase(c)) {
				String dx=(""+c).toLowerCase();
				kc.append(dx);
			}
		}
		System.out.println("2."+s.toString());
	}

}
