/**
 * 
 */
package ProcessControl;

/**
*  @Description     continue语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月22日下午6:11:00
*/
public class continue语句 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		if(flag == true)
		{
			for(int i = 0;i < 5;i++)
			{
				if(i == 3)
				{
					System.out.println("执行continue语句，跳出 i = 3 当前循环");
					continue;
				}
				System.out.println("此时 i = " + i);
			}
		}
		else
		{
			for(int i = 0;i < 4;i++)
			{
				for(int j = 0;j < 2;j++)
				{
					if(j == 1)
					{
						System.out.println("当前 j = " + j + "，执行continue语句");
						continue;
					}
					System.out.println("内层循环 j = " + j);
				}
				System.out.println("外层循环，内部循环的continue语句不会影响外层循环：i = " + i);
			}
		}
	}
}
