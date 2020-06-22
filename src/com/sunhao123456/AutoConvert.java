package com.sunhao123456;

/**
 * 
 * 自动转换
 * 
*/

public class AutoConvert 
{
	public static void main(String[] args)
	{
		byte byteNum = 8;
		int intNum = byteNum;
		int intNum1 = 12345;
		long longNum = intNum1;
		float floatNum = longNum;
		double doubleNum = intNum1;
		System.out.println("byte转为int：" + intNum);
		System.out.println("int转为long：" + longNum);
		System.out.println("long转为float：" + floatNum);
		System.out.println("int转为double：" + doubleNum);
	}
}
