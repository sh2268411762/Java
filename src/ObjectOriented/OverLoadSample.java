/**
 * 
 */
package ObjectOriented;

/**
*  @Description     重载
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月16日下午6:19:48
*/
public class OverLoadSample
{
	public void fun1()
	{
		System.out.println("零入参方法调用");
	}
	public void fun2(String name)
	{
		System.out.println("一个入参方法调用：" + name);
	}
	public void fun3(int i)
	{
		System.out.println("不同类型入参方法调用：" + i);
	}
	public void fun4(String name,String id)
	{
		System.out.println("不同入参个数方法调用");
	}
	
	public static void main(String[] args)
	{
		OverLoadSample s1 = new OverLoadSample();
		s1.fun1();
		;
		s1.fun2("孙豪");
		s1.fun3(88);
		s1.fun4("孙豪", "99");
	}
}
