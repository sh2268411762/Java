/**
 * 
 */
package com.sunhao2;

/**
*  @Description     方法定义和使用
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日上午10:07:44
*/
public class MethodDefination 
{
	static int Add(int a,int b,int c)
	{
		return a + b + c;
	}
	
	public static void main(String[] args)
	{
		int ret = Add(1,2,3);
		System.out.println(ret);
		ret = Add(7,9,80);
		System.out.println(ret);
		ret = fun.Sub(4, 8);
		System.out.println(ret);
	}
}
