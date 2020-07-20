/**
 * 
 */
package com.sunhao2;

/**
*  @Description     基本类型按值传递参数，按值传递
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日上午10:25:14
*/
public class ParameterInMethod 
{
	private static void calc(int num)
	{
		System.out.println("计算前，函数内部num变量为：" + num);
		num += 3;
		System.out.println("计算后，函数内部num变量为：" + num);
	}
	
	public static void main(String[] args)
	{
		int num = 5;
		System.out.println("调用函数前，外部num变量为：" + num);
		calc(num);
		System.out.println("调用函数后，外部num变量为：" + num);
	}
}
