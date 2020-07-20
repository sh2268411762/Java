/**
 * 
 */
package com.sunhao123456;

/**
*  @Description     instanceof运算符使用
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日上午9:40:00
*/
public class InstanceOfSample 
{
	public static void main(String[] args)
	{
		String name = "吕布无敌";
		Integer num = 1010;
		System.out.println("name 变量的类型是String？ " + (name instanceof String));
		System.out.println("name 变量的类型是Object？ " + (name instanceof Object));
		System.out.println("num 变量的类型是Integer？ " + (num  instanceof Integer));
	}
}
