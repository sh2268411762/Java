package com.sunhao123456;

public class DoubleIntro 
{
	public static void main(String[] args)
	{
		double number = 10.001;
		double neNumber = -54321.12345;
		System.out.println("double类型变量number为：" + number);
		System.out.println("double类型变量neNumber为：" + neNumber);
		
		System.out.println("\n包装类：java.lang.Double");
		System.out.println("基本类型：double 二进制数位：" + Double.SIZE);
		System.out.println("double最小值：" + Double.MIN_VALUE);
		System.out.println("double最大值：" + Double.MAX_VALUE);
	}
}
