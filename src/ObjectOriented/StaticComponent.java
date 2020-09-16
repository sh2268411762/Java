/**
 * 
 */
package ObjectOriented;


/**
*  @Description     静态方法(内部不允许有this关键字)
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月16日下午1:15:48
*/
public class StaticComponent
{
	public String name = "实例化成员属性";
	
	public void nonStaticMethod()
	{
		System.out.println("实例化成员方法");
	}
	public static void printName()
	{
		System.out.println("这是静态方法");
		//nonStaticMethod();       静态方法中不允许调用非静态方法
	}
	static //静态代码块只能在类里定义，不能在方法里定义，在类被加载时，静态代码块最先被调用一次
	{
		System.out.println("静态代码块");
	}
	{
		System.out.println("非静态代码块");//非静态代码块在每次对象实例化时都会被执行一次
	}
	
	
	
	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args)
	{
		StaticComponent a1 = new StaticComponent();
		StaticComponent a2 = new StaticComponent();
		a1.printName();
		StaticComponent.printName();
	}
}
