/**
 * 
 */
package com.sunhao123456;

/**
*  @Description     常量定义
*  @author          孙豪
*  @version         1.0
*  @Date            2020年6月23日上午9:24:07
*/



public class ConstantDefination 
{
	//全局 int类型 变量定义，可以在本类中任何地方使用
	private static final int A = 20 * 60 *60;
	private static final int B = 24 * 60 *60;
	private static void printConstant()
	{
		System.out.println("全局常量B：" + B);
	}

	public static final Person PERSON = new Person("孙豪无敌");
	
	public static void main(String[] args)
	{
		final char C = 'x';//char 类型常量定义，只能在本代码块中使用
		System.out.println("全局常量：" + A);
		System.out.println("局部常量：" + C);
		System.out.println("使用其他类中的常量：" + Math.PI);
		
		final char B = 'x';//常量名重复，编译失败
		System.out.println("\n局部常量B：" + B);
		printConstant();
		
		
		System.out.println("定义常量：" + PERSON.name);
	}
}
