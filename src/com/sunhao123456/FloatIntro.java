package com.sunhao123456;

public class FloatIntro 
{
	public static void main(String[] args)
	{
		float number = 10.001F;
		float neNumber = -54321.12345F;
		System.out.println("float类型变量number为：" + number);
		System.out.println("float类型变量neNumber为：" + neNumber);
		
		System.out.println("\n包装类：java.lang.Float");
		System.out.println("基本类型：float 二进制数位：" + Float.SIZE);
		System.out.println("float最小值：" + Float.MIN_VALUE);
		System.out.println("float最大值：" + Float.MAX_VALUE);
	}
}
