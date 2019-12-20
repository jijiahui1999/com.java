package com.string;

import javax.swing.text.StyledEditorKit.FontFamilyAction;

public class E52 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		System.out.println("字符串a的长度"+a.length);

		String s= "abcabcbacdba";
		String s1= "abcdba.text";
		System.out.println("----------------------------------------");
		System.out.println("字符串s的长度"+a.length);
		System.out.println("字符串第一个字符:"+s.charAt(0));
		System.out.println("字符串第一次出现的位置:"+s.indexOf('c'));
		System.out.println("字符串最后一次出现的位置:"+s.lastIndexOf('c'));
		System.out.println("子字符串第一次出现的位置:"+s.indexOf("ab"));
		System.out.println("子字符串最后一次出现的位置:"+s.indexOf("ab"));
		System.out.println("----------------------------------------");
		System.out.println("字符串是否以.text结尾"+s1.endsWith(".text"));
		System.out.println("字符串是否以ab开始"+s1.endsWith("ab"));
		System.out.println("字符串是否包含子字符串cd"+s1.contains("cd"));
		System.out.println("字符串是否为空"+s1.isEmpty());
		System.out.println("两个字符串是否相等"+s1.equals(s));
		System.out.println("----------------------------------------");
		char[] charArray=s.toCharArray();
		System.out.println("将字符串转为字符数组的遍历结果：");
		for(int i=0;i<charArray.length;i++) {
			if (i !=charArray.length -1) {
				System.out.println(charArray[i]+",");
			}
			else {
				System.out.println(charArray[i]);
			}
		}
	}
}
