/**
 * 
 */
package Abnormal;

/**
*  @Description     finally用法
*  @author          孙豪
*  @version         版本
*  @Date            2020年11月1日下午4:58:39
*/
public class TryFinallyDemo
{
	public static void main(String[] args)
	{
		System.out.println("通常情况下，try catch语句后边会跟着finally语句，无论程序是否有异常，finally代码块都会正常运行。");
		try
		{
			Class.forName("className");
		} catch (Exception e)
		{
			System.out.println("捕获异常：" + e.getClass().getName());//异常名
			System.out.println("异常内容为：" + e.getMessage());   //获取发生异常的详细信息
		}
		finally
		{
			System.out.println("finally最后运行");
		}
	}
}
