/**
 * 
 */
package DateAndTime;

import java.text.DateFormat;
import java.util.Date;

/**
*  @Description     DateFormat格式化风格
*  					DateFormat类parse()方法
*  					DateFormat类format()方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月19日下午11:30:02
*/
public class DateFormatDemo
{	
	public static void main(String[] args)
	{
		Date now = new Date();
		DateFormat d = DateFormat.getDateInstance();
		
		System.out.println("(Default)今天日期为：" + d.format(now));  //默认
		d = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("(SHORT)今天日期为：" + d.format(now));    //短
		d = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("(MEDIUM)今天日期为：" + d.format(now));   //中
		d = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("(LONG)今天日期为：" + d.format(now));     //长
		d = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("(FULL)今天日期为：" + d.format(now));     //最长
		
		
		d = DateFormat.getDateInstance();
		try
		{
			Date date = d.parse("2000-08-27");
			System.out.println("将字符串转换为Date对象为：" + date.toString());
			
			date = new Date();
			System.out.println("将Date对象转为字符串：" + d.format(date));

		} catch (Exception e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.exit(0);
	}
}
