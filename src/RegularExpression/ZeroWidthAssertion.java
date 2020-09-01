/**
 * 
 */
package RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*  @Description     零宽断言
*  @author          孙豪
*  @version         1.0
*  @Date            2020年9月1日下午7:34:20
*/
public class ZeroWidthAssertion 
{
	public static void main(String[] args) 
	{
		String str = "eating apple seeing paper watching movie";
		String regex = "(\b\\w+)ing";
		Matcher matcher = Pattern.compile(regex).matcher(str);
		if(matcher.find())
		{
			System.out.println(matcher.group());
		}
		regex = "(.+?)(?=ing)";
		matcher = Pattern.compile(regex).matcher(str);
		if(matcher.find())
		{
			System.out.println(matcher.group());
		}
		regex = "(.+?)(?<=ing)";
		matcher = Pattern.compile(regex).matcher(str);
		if(matcher.find())
		{
			System.out.println(matcher.group());
		}
		
		str = "unite one unethical ethics use untie  ultimate";
		regex = "\b(?!un)\\w+\b";
		matcher = Pattern.compile(regex).matcher(str);
		if(matcher.find())
		{
			System.out.println(matcher.group());
		}
		
		regex = "(?<![a-z])\\d{3,}";
		matcher = Pattern.compile(regex).matcher(str);
		if(matcher.find())
		{
			System.out.println(matcher.group());
		}
	}
}
