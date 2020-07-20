/**
 * 
 */
package ProcessControl;

/**
*  @Description     for循环
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月16日上午11:55:38
*/
public class for循环
{
	public static void main(String[] args) 
	{
		for(int i = 0;i < 5;i++)
		{
			System.out.println("每次循环i都会加1，当前i等于：" + i);
		}
		for(char c = 0;c < 5;c++)
		{
			System.out.print("每次循环c都会加1，当前字符c等于： " + c);
			System.out.println("转换为int型数值为：" + (int)c);
		}
	}
}
