/**
 * 
 */
package com.sunhao2;

/**
*  @Description     引用类型，按引用传递参数
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日上午10:37:37
*/
public class ParameterInMethod_yinyong 
{
	private static void Add(fun f)
	{
		System.out.println("计算前，函数内部num为：" + f.num);
		f.num += 3;
		System.out.println("计算后，函数内部num为：" + f.num);
	}

	public static void main(String[] args)
	{
		fun f = new fun();
		f.num = 5;
		System.out.println("调用函数前，外部num变量为：" + f.num);
		Add(f);
		System.out.println("调用函数后，外部num变量为：" + f.num);
	}
}
