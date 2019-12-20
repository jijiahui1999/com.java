package com.s;

import java.util.*;

public class E59 {

	public static void main(String[] args) {
		Properties Properties=System.getProperties();
		System.out.println(Properties);
		Set<String>  PropertyNames=Properties.stringPropertyNames();
		for(String key:PropertyNames) {
			String value=System.getProperty(key);
			System.out.println(key+"---"+value);
		}
	}

}
