/**
 * 
 */
package com.sunhao123456;

/**
*  @Description     变量定义
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午2:19:19
*/
public class VariableDefination 
{
	private static int count = 1;//类变量
	public String name = "吕布天下无双";
	
	public static void main(String[] args)
	{
		boolean isTrue;
		String passWord;
		passWord = "www.sunhao123456";
		count++;
		isTrue = false;
		VariableDefination varible = new VariableDefination();
		System.out.println("类静态变量：" + count);
		System.out.println("类实例变量：" + varible.name);
		System.out.println("方法变量isTrue：" + isTrue);
		System.out.println("方法变量passWord：" + passWord);
	}
}
