package com.d;

import javax.swing.table.TableStringConverter;

public class Text {
	
	public Text() {
		System.out.println("构造方法一被调用");
	}
	public Text(int x) {
		this();
		System.out.println("构造方法二被调用");
	}
	public Text(boolean b) {
		this(1);
		System.out.println("构造方法三被调用");
	}


	public static void main(String[] args) {
		new Text(true);

	}

}
