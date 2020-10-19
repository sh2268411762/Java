/**
 * 
 */
package ReflectionAndAnnotation;

import java.lang.reflect.Field;

/**
*  @Description     获取成员变量
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月17日下午3:32:30
*/
class Person_two
{
	@SuppressWarnings("unused")
	private String name = "小明";
	@SuppressWarnings("unused")
	private int age = 18;
}


public class MemberVariable
{
	public static void main(String[] args)
	{
		fun(new Person_two());
	}

	@SuppressWarnings("rawtypes")
	public static void fun(Object obj)
	{
		Class c = obj.getClass();
		Field[] fields = c.getDeclaredFields(); // 所有字段，不包含继承的字段
		for (Field field : fields)
		{
			Class fieldType = field.getType();
			String typeName = fieldType.getSimpleName(); // 获取字段的声明类型
			String fieldName = field.getName(); // 获取字段名称
			// 打印类的所有成员变量信息
			System.out.println("字段的信息类型：" + typeName + "，名称：" + fieldName);
		}
		
		System.out.println();
		try
		{
			Field f1 = c.getDeclaredField("name");
			Class c1 = f1.getType();
			System.out.println(c1.getSimpleName());
			System.out.println(f1.getName());
		} catch (NoSuchFieldException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SecurityException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
