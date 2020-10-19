/**
 * 
 */
package ReflectionAndAnnotation;

/**
*  @Description     java.lang.Class包
*  					获取Class对象的方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月8日上午11:56:16
*/
class student1
{

}

public class Test
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		System.out.println("使用对象的getClass()方法获取Class对象的引用：");
		// 创建一个student类对象
		student1 stu1 = new student1();

		// 通过getClass()方法获取Class对象
		Class c1 = stu1.getClass();
		System.out.println(c1);
		
		//通过静态变量class获取Class对象的引用
		Class c2 = student1.class;
		System.out.println(c2);
		
		//使用静态方法forName()
		try
		{
			Class c3 = Class.forName("ReflectionAndAnnotation.student1"); //包名  .  类名
			System.out.println(c3);
		} catch (ClassNotFoundException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
