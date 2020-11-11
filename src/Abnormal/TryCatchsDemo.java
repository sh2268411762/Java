/**
 * 
 */
package Abnormal;

import java.io.IOException;

/**
*  @Description     多重catch语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年11月1日下午4:48:13
*/
public class TryCatchsDemo
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("多重catch语句时，子类异常定义在前，父类异常定义在后");
			System.out.println("由于实际代码中并不会出现IOException异常，所以在编译时会抛出错误");
			Class.forName("className");
		} catch (IllegalArgumentException e)
		{
			System.out.println("捕获异常：" + e.getClass().getName());//异常名
			System.out.println("异常内容为：" + e.getMessage());   //获取发生异常的详细信息
		}
//		catch(IOException e)
//		{
//			System.out.println("捕获异常：" + e.getClass().getName());//异常名
//			System.out.println("异常内容为：" + e.getMessage());   //获取发生异常的详细信息
//		}
		catch(Exception e)
		{
			System.out.println("捕获异常：" + e.getClass().getName());//异常名
			System.out.println("异常内容为：" + e.getMessage());   //获取发生异常的详细信息
		}
	}
}
