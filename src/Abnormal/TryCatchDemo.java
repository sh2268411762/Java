/**
 * 
 */
package Abnormal;

/**
*  @Description     try catch捕获异常
*  @author          孙豪
*  @version         版本
*  @Date            2020年11月1日下午4:42:16
*/
public class TryCatchDemo
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("className");
		} catch (Exception e)
		{
			System.out.println("捕获异常：" + e.getClass().getName());//异常名
			System.out.println("异常内容为：" + e.getMessage());   //获取发生异常的详细信息
		}
	}
}
