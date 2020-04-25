package com.sunhao123456;

public class FoodClass 
{
	//成员变量，在Food类中各处可调用，也可被其他类文件调用
	public static String name;
	//成员变量，在Food类中各处可调用，不可被其他类文件调用
	private static String size;
	private static void eat()
	{
		//私有方法，仅在Food类中被调用
		System.out.println("eat\n");
	}
	public static void main(String[] args)
	{
		String variable = "局部变量\n";
		System.out.println("这个是局部变量" + variable);
		System.out.println("这个是全局变量" + size);
		eat();//调用eat方法
	}
}
