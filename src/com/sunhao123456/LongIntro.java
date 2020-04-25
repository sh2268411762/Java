package com.sunhao123456;

public class LongIntro 
{
	public static void main(String[] args)
	{
		long number = 123495L;
		long x = 123456789 * 987654321;//数字会默认为int进行运算，数值溢出后类型强制转换为long
		long y = 123456789L * 987654321L;//数字被认为long进行运算
		System.out.println("long类型number的值为：" + number);
		System.out.println("long类型x的值为：" + x);
		System.out.println("long类型y的值为：" + y);
	}
}
