/**
 * 
 */
package ProcessControl;

/**
*  @Description     break语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月22日下午6:52:29
*/
public class break语句 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		if(flag == true)
		{
			for(int i = 0;i < 5;i++)
			{
				if(i > 3)
				{
					System.out.println("i = " + i + "时，直接跳出循环");
					break;
				}
				System.out.println("当前循环 i = " + i);
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
						System.out.println("当前j = " + j + "，执行break语句");
						break;
					}
					System.out.println("内层循环j = " + j);
				}
				System.out.println("外层循环，内部循环的break语句不会影响外层循环：i = " + i);
			}
		}
	}
}
