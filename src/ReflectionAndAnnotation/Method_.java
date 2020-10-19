/**
 * 
 */
package ReflectionAndAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
*  @Description     获取成员方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月17日下午3:51:35
*/
class Person_three
{
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person_three(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	public void say(String str)
	{
		System.out.println("Saying" + str);
	}
	
	public void run()
	{
		System.out.println("Running...");
	}
	
	public void swim()
	{
		System.out.println("Swimming...");
	}
}

class PrintUtil
{
	public void print(int a,int b)
	{
		System.out.println("相加结果为：" + (a + b));
	}
	
	public void print(String a,String b)
	{
		System.out.println("转换为大写字母的结果为：" + a.toUpperCase() + " " + b.toUpperCase());
	}
	
	public void print()
	{
		System.out.println("Hello world!");
	}
}


public class Method_
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException
	{
		fun(new Person_three("王麻子", 33));
		System.out.println("\n\n");

		PrintUtil p1 = new PrintUtil();
		Class clazz = p1.getClass();

		try
		{
			Method m1 = clazz.getMethod("print", int.class, int.class); // getMethod()获取方法
			m1.invoke(p1, 1, 2); // 调用invoke方法

			Method m2 = clazz.getMethod("print", String.class, String.class);
			m2.invoke(p1, "asdfFsf", "bDDDDssfs");

			Method m3 = clazz.getMethod("print");
			m3.invoke(p1);
		} catch (NoSuchMethodException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SecurityException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

	@SuppressWarnings("rawtypes")
	public static void fun(Object obj)
	{
		Class c = obj.getClass();
		Method[] methods = c.getDeclaredMethods();
		System.out.println("打印类的方法信息：");
		for (Method method : methods)
		{
			Class returnType = method.getReturnType(); // 获取方法的返回值类型
			System.out.print(returnType.getSimpleName());
			// 获取方法名称
			System.out.print("" + method.getName() + "(");
			// 获取参数列表
			Class[] parameterTypes = method.getParameterTypes();
			for (Class paramterType : parameterTypes)
			{
				System.out.print(paramterType.getSimpleName() + ",");
			}
			System.out.println(")");
		}
	}
}
