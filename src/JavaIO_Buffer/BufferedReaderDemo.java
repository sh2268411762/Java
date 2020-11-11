/**
 * 
 */
package JavaIO_Buffer;

import java.io.*;

/**
*  @Description     BufferedReader类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午11:46:06
*/
public class BufferedReaderDemo
{
	public static void main(String[] args)
	{
		BufferedReader reader = null;
		try
		{
			//创建一个字符读取流对象和文件相关联
			FileReader fileReader = new FileReader("testIO.txt");
			reader = new BufferedReader(fileReader);   //缓存类BufferedReader类构造方法
			String line;
			
			try
			{
				int i = 1;
				while((line = reader.readLine()) != null)
				{
					System.out.println("读取文件第" + i + "行，数据为：" + line);
					i++;
				}
			} catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(reader != null)
			{
				try
				{
					reader.close();
				} catch (IOException e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
