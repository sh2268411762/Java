package com.sunhao123456;

public class ShortIntro 
{
	public static void main(String[] args)
	{
		short number = 12345;//short类型定义
		short x = 32767;//大于32767数值溢出short类型最大值
//		short x = 12345 + 54321;//溢出
		System.out.println("short类型变量number我、的值为：" + number);
		System.out.println("short类型变量溢出结果为：" + x);
	}
}
