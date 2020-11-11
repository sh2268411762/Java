/**
 * 
 */
package Abnormal;

import java.util.ArrayList;
import java.util.List;

/**
*  @Description     编译错误
*  @author          孙豪
*  @version         版本
*  @Date            2020年11月1日下午3:54:42
*/
public class Demo
{
	public static void main(String[] args)
	{
		main2();
	}
	public static void main2()
	{
		List<ErrorAbnormal> bas = new ArrayList<ErrorAbnormal>(2);
		for (int i = 0; i < 2; i++)
		{
			try
			{
				bas.add(new ErrorAbnormal(String.valueOf(i)));  //抛出NoClassDeFoundError
			} catch (Throwable t)
			{
				t.printStackTrace();
			}
		}
	}
	public static void main1(String[] args)
	{
		System.out.println("错误代码");
		System.out.println("没有;");
		System.out.println("语法错误，Syntax Error");
	}
}
