/**
 * 
 */
package ProcessControl;

/**
*  @Description     if
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月16日上午10:22:49
*/
public class if语句 
{
	public static void main(String[] args) 
	{
		int num = 101;
		System.out.println(num + "大于100吗？");
		if(num > 100)
		{
			System.out.println(num + "大于100");
		}
		
		if(num > 100 && num < 200)
		{
			System.out.println(num + "大于100并且小于200");
		}
		
		if(num % 2 > 0 || num % 3 > 0)
		{
			System.out.println(num + "不能被2整除或者不能被3整除");
		}
		
		if(num % 2 > 0 && (num - 100) > 0 && num % 3 > 0)
		{
			System.out.println("多条复合条件语句被判断执行");
		}
	}
}
