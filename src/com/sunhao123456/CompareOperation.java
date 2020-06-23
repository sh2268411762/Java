/**
 * 
 */
package com.sunhao123456;

/**
*  @Description     比较运算符使用
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午3:00:23
*/
public class CompareOperation 
{
	public static void main(String[] args)
	{
		int a = 123;
		System.out.println("变量a的值为：" + a);
		System.out.println("使用不同比较运算符进行演示，成立返回true，不成立返回false");
		System.out.println("a < 100 的结果是：" + (a < 100));
		System.out.println("a > 100 的结果是：" + (a > 100));
		System.out.println("a <= 200 的结果是：" + (a <= 200));
		System.out.println("a >= 200 的结果是：" + (a >= 200));
		System.out.println("a == 123 的结果是：" + (a == 123));
		System.out.println("a != 123 的结果是：" + (a != 123));
	}
	
}
