package com.sunhao123456;

public class CharIntro 
{
	public static void main(String[] args)
	{
		char c1 = 'a';
		char c2 = '零';
		char c3 = ' ';
		System.out.println("字符类型数值为：" + c1);
		System.out.println("字符类型数值为：" + c2);
		System.out.println("字符类型数值为：" + c3);
		System.out.println("字符类型当做数字使用：" + (int)c1);
		
		System.out.println("\n包装类：java.lang.Character");
		System.out.println("基本类型：char 二进制数位：" + Character.SIZE);
		System.out.println("char最小值：" + (int)Character.MIN_VALUE);
		System.out.println("char最大值：" + (int)Character.MAX_VALUE);
	}
}
