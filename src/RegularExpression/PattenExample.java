/**
 * 
 */
package RegularExpression;
import java.util.regex.Pattern;
/**
*  @Description     Pattern类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月1日下午6:05:18
*/
public class PattenExample 
{
	public static void main(String[] args) 
	{
		String str = "等风来不如追风去";
//		String regex = ".*不如.*";
		String regex = ".*二球.*";
//		System.out.println("字符串中是否包括‘不如’? " + Pattern.matches(regex, str));
		System.out.println("字符串中是否包括‘二球’? " + Pattern.matches(regex, str));
	}
}
