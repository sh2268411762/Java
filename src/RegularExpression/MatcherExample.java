/**
 * 
 */

package RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
*  @Description     Pattern类示例Matcher类分组
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月1日下午6:14:19
*/
public class MatcherExample 
{
	public static void main(String[] args) 
	{
		String str = "一二三四a01bcdefg.ggggfsdg.ffdf.com";
		String regex = "[0-1A-Za-z](.*)(\\.)";//满足多个字符串
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int groupCount = matcher.groupCount();
		System.out.println("匹配到组合数量为：" + groupCount);
		if(matcher.find())
		{
			for(int i = 0;i <= groupCount;i++)
			{
				System.out.println("匹配到字符组合：" + matcher.group(i));
			}
		}
		else
		{
			System.out.println("未找到匹配正则的字符组合");
		}
	}
}

