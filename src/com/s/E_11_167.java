package com.s;

public class E_11_167 {
//���鿽��
	public static void main(String[] args) {
		int[] srcArray= {101,102,103,104,105,106};
		int[] destArray= {201,202,203,204,205};
		System.arraycopy(srcArray,1,destArray,0,3);
		for (int i=0;i<destArray.length;i++) {
			System.out.println(i+":"+destArray[i]);
		}
		
	}

}
