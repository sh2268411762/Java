/**
 * 
 */
package com.sunhao123456;

/**
*  @Description     自增自减运算符
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日上午9:01:18
*/
public class SelfOperation 
{
	public static void main(String[] args)
	{
		int a = 5;
		System.out.println("a的值是：" + a);
		int a1 = ++a;
		System.out.println("前置++,a = " + a + "  a1 = " + a1);
		int a2 = a++;
		System.out.println("后置++,a = " + a + "  a2 = " + a2);
		
		int b = 5;
		System.out.println("b的值是：" + b);
		int b1 = --b;
		System.out.println("前置--,b = " + b + "  b1 = " + b1);
		int b2 = b--;
		System.out.println("后置--,b = " + b + "  b2 = " + b2);
	}
}
