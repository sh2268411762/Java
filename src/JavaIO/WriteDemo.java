/**
 * 
 */
package JavaIO;

import java.io.*;
/**
*  @Description     字符输出类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月23日下午10:55:58
*/
public class WriteDemo
{
	public static void main(String[] args)
	{
		try
		{
			Reader re = new FileReader("Data.json");
			Writer wr = new FileWriter("output.json");
			
			int i = 0;
			while(i != -1)
			{
				i = re.read();
				wr.write(i);
			}
			
			re.close();
			wr.close();
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
