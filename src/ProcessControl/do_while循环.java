/**
 * 
 */
package ProcessControl;

/**
*  @Description     do...while循环
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月22日下午5:58:05
*/
public class do_while循环 
{
	public static void main(String[] args) 
	{
		int i = 0;
		do
		{
			System.out.println("do...while循环，此时 i = " + i);
			i++;
		}while(i < 10);
		
		do
		{
			System.out.println("i = " + i + "，此时该语句仍会被执行一次");
		}while(i < 10);
	}
}
