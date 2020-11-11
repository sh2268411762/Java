/**
 * 
 */
package Abnormal;

/**
*  @Description     抛出异常：throws
*  @author          孙豪
*  @version         版本
*  @Date            2020年11月1日下午4:20:14
*/
public class ThrowsDemo
{
	public static void main(String[] args)
	{
		System.out.println("throws关键字用于指定方法可能抛出的异常，多个异常之间通过逗号分隔：");
//		test();
		
//		secondException();
	}
	
	public static void firstException() throws Exception
	{
		throw new IllegalArgumentException("方法体内抛出异常...");
	}
	
	public static void secondException() throws Exception
	{
		firstException();
	}
	
	public static void test() throws Exception
	{
		throw new IllegalArgumentException("方法体内抛出异常");
	}
}
