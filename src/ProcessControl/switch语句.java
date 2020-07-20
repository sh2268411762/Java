/**
 * 
 */
package ProcessControl;

/**
*  @Description     switch语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月16日上午11:08:11
*/
public class switch语句 
{
	public static void main(String[] args) 
	{
		int num = 101;
		switch(num)
		{
		case 2:
			System.out.println(num + "等于2");
			break;
			
		case 20:
			System.out.println(num + "等于20");
			break;
			
		case 101:
			System.out.println(num + "等于101");
			break;
			
		default:
			System.out.println(num + "不在定义的值中");
			break;
		}
	}
}
