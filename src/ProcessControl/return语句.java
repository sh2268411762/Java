/**
 * 
 */
package ProcessControl;

/**
*  @Description     return语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月22日下午7:54:54
*/
public class return语句 
{
	public static void printMeyhod()
	{
		for(int i = 0;i < 4;i++)
		{
			if(i == 3)
			{
				System.out.println("执行return语句直接返回，中断当前循环");
				return;
			}
			System.out.println("循环i = " + i);
		}
	}
	public static void main(String[] args) 
	{
		printMeyhod();
	}
}
