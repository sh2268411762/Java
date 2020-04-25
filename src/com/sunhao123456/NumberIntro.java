package com.sunhao123456;

//进制存储输出
public class NumberIntro 
{
	public static void main(String[] args)
	{
		int a = 0b0000_0001;//二进制
		int b = 1010;//十进制
		int c = 01234;//八进制
		int d = 0xF1E3;//十六进制
		System.out.println("二进制数值输出：" + a);
		System.out.println("十进制数值输出：" + b);
		System.out.println("八进制数值输出：" + c);
		System.out.println("十六进制数值输出：" + d);
		//保留格式输出成字符串
		System.out.println("二进制数值输出：" + Integer.toBinaryString(a));
		System.out.println("八进制数值输出：" + Integer.toOctalString(c));
		System.out.println("十六进制数值输出：" + Integer.toHexString(d));
	}
}
