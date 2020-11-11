/**
 * 
 */
package Abnormal;

/**
*  @Description     抛出异常：throw
*  @author          孙豪
*  @version         版本
*  @Date            2020年11月1日下午4:14:09
*/
public class ThrowDemo
{
	public static void main(String[] args)
	{
		System.out.println("throw关键字可以用于在方法中的任意地方使用以抛出异常，当执行到throw语句时会直接抛出异常，不再执行后面的代码。");
		System.out.println("直接在代码中抛出异常：");
		System.out.println("111");
		throw new RuntimeException("异常信息，之后的代码不会被运行，在此处终止程序。");
//		System.out.println("222");
	}
}
