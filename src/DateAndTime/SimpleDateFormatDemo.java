/**
 * 
 */
package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
*  @Description     SimpleDateFormat类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月20日上午12:31:13
*/
public class SimpleDateFormatDemo
{
	public static void main(String[] args)
	{
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
		System.out.println(s.toString()); //对象内存地址
		System.out.println("格式化当前时间为：" + s.format(new Date()));
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String str = "1999-08-27";
		long time = 01;
		try
		{
			time = f.parse(str).getTime();
		} catch (ParseException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(str + "转换为毫秒数为：" + time);
		f = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
		System.out.println(time + "毫秒转化为时间：" + f.format(time));
	}
}
