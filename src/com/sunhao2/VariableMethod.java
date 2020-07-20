/**
 * 
 */
package com.sunhao2;

/**
*  @Description     可变入参方式定义和使用
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日上午11:06:26
*/
public class VariableMethod 
{
	public static void test(String... args)
	{
		for(String arg:args)
		{
			System.out.println("入参为：" + arg);
		}
	}
	public static void test1(int num,String srg)
	{
		System.out.println("固定参数方法");
	}
	public static void test1(int num,String... args)
	{
		System.out.println("可变参数方法");
	}
	
	public static void main(String[] args)
	{
		test();
		test("A");
		test("A","B","C");
		
		test1(0,"入参1");
		test1(0,"入参1","入参2");
	}
}
