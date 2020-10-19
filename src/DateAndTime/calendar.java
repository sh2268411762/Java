/**
 * 
 */
package DateAndTime;

import java.util.Calendar;
/**
*  @Description     Calendar.getInstance()方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月19日下午11:07:30
*/
public class calendar
{
	public static void main(String[] args)
	{
		System.out.println("Calendar类不能直接用new关键字来初始化新对象，\n但它提供了getIntance()方法，用来获得Calendar类的对象");
		Calendar cal = Calendar.getInstance();
		System.out.println("当前时间：" + cal.toString());
		
		System.out.println("设置特定时间：");
		System.out.println("当前日期：" + cal.getTime());
		cal.set(1999, 8-1,17);   // 月份是从0开始，需要减一
		System.out.println("修改后日期为：" + cal.getTime());
	}
}
