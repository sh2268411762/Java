package com.sunhao123456;

public class EscapeChar 
{
	public static void main(String[] args)
	{
		char c1 = '\\';
		char c2 = '\t';
		char c3 = '\u2501';
		char c4 = '\'';
		
		System.out.println("转义符：{" + c1 + "}");
		System.out.println("转义符：{" + c2 + "}");
		System.out.println("转义符：{" + c3 + "}");
		System.out.println("转义符：{" + c4 + "}");
	}
}
