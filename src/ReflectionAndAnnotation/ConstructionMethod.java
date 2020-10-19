/**
 * 
 */
package ReflectionAndAnnotation;

import java.lang.reflect.Constructor;

/**
*  @Description     获取构造方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月17日下午1:42:47
*/
class Person_one
{
	private String name = "张三";
	private int age = 0;

	//无参构造函数
	public Person_one()
	{
		super();
	}

	//有参数构造函数
	public Person_one(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	//私有有参数构造函数
	@SuppressWarnings("unused")
	private Person_one(String name)
	{
		super();
		this.name = name;
		this.age = 0;
	}

	public void say()
	{
		System.out.println("姓名：" + name + ", 年龄：" + age);
	}
}
public class ConstructionMethod
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception
	{
		// 通过forName()方法获取class对象
		Class clazz = Class.forName("ReflectionAndAnnotation.Person_one");

		// 1、获取Constructor[] 数组并打印构造方法信息(所有公共构造方法，不包括私有及受保护构造方法)
		Constructor[] c1 = clazz.getConstructors();
		for (Constructor constructor : c1)
		{
			System.out.println("公共构造方法：" + constructor);
		}
		// 2、获取Constructor[] 数组并打印构造方法信息(所有构造方法，包括私有及受保护构造方法)
		Constructor[] c2 = clazz.getDeclaredConstructors();
		for (Constructor constructor : c2)
		{
			System.out.println("所有构造方法：" + constructor);
		}

		// 3、获取单个默认Constructor，并创建类的实例
		Constructor c3 = clazz.getConstructor();
		// 调用Constructor的newInstance()方法来实例化对象
		Object o1 = c3.newInstance();
		Person_one p1 = (Person_one) o1;
		p1.say();

		// 4、获取带参的Constructor，并创建类的实例
		Constructor c4 = clazz.getConstructor(String.class, int.class);
		// 调用Constructor的newInstance()方法来实例化对象
		Object o2 = c4.newInstance("李四", 24);
		Person_one p2 = (Person_one) o2;
		p2.say();

//		// 5、私有的构造方法   （异常）
//		Constructor c5 = clazz.getConstructor(String.class);
//		Object o3 = c5.newInstance("王五");
//		Person_one p3 = (Person_one) o3;
//		p3.say();
	}
}
