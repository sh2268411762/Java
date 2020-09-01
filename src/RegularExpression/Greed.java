/**
 * 
 */
package RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*  @Description     贪婪匹配与非贪婪匹配
*  @author          孙豪
*  @version         1.0
*  @Date            2020年9月1日下午7:19:30
*/
public class Greed 
{
	public static void main(String[] args) 
	{
		//示例1
		String str = "Are you OK?No,I am not ok";
		String regex = ".+";//贪婪
		Matcher matcher = Pattern.compile(regex).matcher(str);
		if(matcher.find())
		{
			System.out.println(matcher.group());
		}
		regex = ".+?";//非贪婪
		matcher = Pattern.compile(regex).matcher(str);
		if(matcher.find())
		{
			System.out.println(matcher.group());
		}
		
		//示例2
		str = "<this><is><an><example>";
		regex = "<.+>";//非贪婪
		matcher = Pattern.compile(regex).matcher(str);
		if(matcher.find())
		{
			System.out.println(matcher.group());
		}
		regex = "<.+?>";//非贪婪
		matcher = Pattern.compile(regex).matcher(str);
		if(matcher.find())
		{
			System.out.println(matcher.group());
		}
	}
}
