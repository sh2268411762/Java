/**
 * 
 */
package ProcessControl;

/**
*  @Description     if...else if语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月16日上午10:39:11
*/
public class ifElseif语句 
{
	public static void fun(int number)
	{
		System.out.println(number + "在哪个范围内");
		if(number < 100)
		{
			System.out.println(number + "小于100");
		}
		else if(number < 200)
		{
			System.out.println(number + "大于100小于200");
		}
		else if(number < 300)
		{
			System.out.println(number + "大于200小于300");
		}
		else
		{
			System.out.println(number + "大于或等于300");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		fun(90);
		fun(199);
		fun(250);
		fun(400);
	}
}
