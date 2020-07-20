/**
 * 
 */
package com.sunhao2;

/**
*  @Description     基本类型包装类也是按值传递
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日上午10:51:33
*/
public class ParameterInMethod_baozhuang 
{
	private static void Add(Integer num)
	{
		System.out.println("计算前，函数内部num变量为：" + num);
		num += 3;
		System.out.println("计算后，函数内部num变量为：" + num);
	}
	
	public static void main(String[] args)
	{
		Integer num = 5;
		System.out.println("调用函数前，外部num变量为：" + num);
		Add(num);
		System.out.println("调用函数后，外部num变量为：" + num);
	}
}
