/**
 * 
 */
package DateAndTime;

import java.util.Calendar;

/**
*  @Description     Calendar类常用成员属性
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月19日下午11:17:47
*/
public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("当前日期为：" + cal.getTime());
		System.out.println("当前年第几周：" + cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("获取年份：" + cal.get(Calendar.YEAR));
		System.out.println("获取月份：" + (cal.get(Calendar.MONTH) + 1));
		System.out.println("获取日期：" + cal.get(Calendar.DATE));
		System.out.println("获取日期：" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("获取12进制小时：" + cal.get(Calendar.HOUR));
		System.out.println("获取24进制小时：" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("获取分钟：" + cal.get(Calendar.MINUTE));
		System.out.println("获取秒钟：" + cal.get(Calendar.SECOND));
		System.out.println("获取星期几：" + cal.get(Calendar.DAY_OF_WEEK));
		//1代表星期日，2代表星期一......
	}
}
