/**
 * 
 */
package ProcessControl;

/**
*  @Description     if...else语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月16日上午10:25:12
*/
public class ifelse语句 
{
	public static void checkNumber(int number)
	{
		if(number <= 100)
		{
			if(number % 2 == 0)
			{
				System.out.println(number + "能够被2整除");
			}
			else
			{
				System.out.println(number + "不能被2整除");
				if(number % 3 == 0)
				{
					System.out.println(number + "能够被3整除");
				}
			}
		}
		else
		{
			System.out.println(number + "大于100");
		}
	}
	public static void main(String[] args) 
	{
		int num = 10;
		System.out.println(num + "大于100吗？");
		if(num > 100)
		{
			System.out.println(num + "大于100");
		}
		else
		{
			System.out.println(num + "小于或等于100");
		}
		System.out.println();
		
		checkNumber(4);
		checkNumber(99);
		checkNumber(101);
	}
}
