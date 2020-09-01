/**
 * 
 */
package RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*  @Description     patternSyntaxException示例
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月1日下午7:14:09
*/
public class PatternSyntaxException 
{
	public static void main(String[] args) 
	{
		String str = "零壹快学www.01kuaixue.com";
		String regex = "[0-1A-Xa-z](.*)";//字母Z应该在a前面，a-Z非法错误
		Pattern pattern = Pattern.compile(regex);//抛出异常
	}
}
