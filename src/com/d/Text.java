package com.d;

import javax.swing.table.TableStringConverter;

public class Text {
	
	public Text() {
		System.out.println("���췽��һ������");
	}
	public Text(int x) {
		this();
		System.out.println("���췽����������");
	}
	public Text(boolean b) {
		this(1);
		System.out.println("���췽����������");
	}


	public static void main(String[] args) {
		new Text(true);

	}

}
