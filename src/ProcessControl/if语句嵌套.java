/**
 * 
 */
package ProcessControl;

import java.util.Scanner;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月16日上午10:56:05
*/
public class if语句嵌套 
{
	public static void fun(int number)
	{
		if(number <= 0)
		{
			System.out.println("开始学习Java");
		}
		else if(number <= 2)
		{
			if(number == 2)
			{
				System.out.println("学习了两个月，加油");
			}
			else
			{
				System.out.println("还需要加油");
			}
		}
		else
		{
			if(number > 10)
			{
				System.out.println("大牛啊");
			}
			else if(number > 5)
			{
				System.out.println("初入大牛世界");
			}
			else
			{
				System.out.println("还得努力啊");
			}
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学习Java市场（单位：月）：");
		num = sc.nextInt();
		fun(num);
	}
}
