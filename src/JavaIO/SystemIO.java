/**
 * 
 */
package JavaIO;

import java.io.*;

/**
*  @Description     系统预定义流
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月23日下午11:02:31
*/
public class SystemIO
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入字符串：");
			System.out.println("输入内容为：" + reader.readLine());
		} catch (IOException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
