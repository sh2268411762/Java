/**
 * 
 */
package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
*  @Description     DateTimeFormatter类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月20日上午12:39:15
*/
public class DateTimeFormatterDemo
{
	public static void main(String[] args)
	{
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:ss");
		LocalDateTime time = LocalDateTime.parse("2020-10-20 00:41:44",f);
		System.out.println("日期格式为：" + f.format(time));
	}
}
