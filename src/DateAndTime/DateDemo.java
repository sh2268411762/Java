/**
 * 
 */
package DateAndTime;

import java.util.Date;
/**
*  @Description     Date类初始化及常用方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月19日下午10:21:16
*/
public class DateDemo
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		System.out.println("直接创建一个Date对象为：" + d1.toString());
		System.out.println("返回Date对象内容毫秒级格式：" + d1.getTime());
		Date d2 = new Date(d1.getTime() - 1000);
		System.out.println(d1.toString() + "是否在" + d2.toString() + "之前：" + d1.before(d2));
		System.out.println(d1.toString() + "是否在" + d2.toString() + "之后：" + d1.after(d2));
		System.out.println("比较两个日期：" + d1.compareTo(d2));
		System.out.println("比较两个日期：" + d2.compareTo(d1));
		System.out.println("比较两个日期：" + d1.compareTo(d1));
		System.out.println("比较两个日期是否相同：" + d1.equals(d2));
		System.out.println("d1的哈希值：" + d1.hashCode());
		
		System.out.println();
		fun();
	}
	
	
	public static void fun()
	{
		System.out.println("Date类用来表示日期和时间（入参为long类型的整数）：");
		Date d1 = new Date();
		System.out.println("直接创建一个Date对象为：" + d1.toString());
		Date d2 = new Date(System.currentTimeMillis());
		System.out.println("获取系统当前时间来创建Date对象：" + d2.toString());
	}
}
