/**
 * 
 */
package JavaIO;

import java.io.FileReader;

/**
*  @Description     FileReader类读取文件
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午10:03:58
*/
public class FileReaderDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fileReader = new FileReader("Data.json");
			char ch = ' ';
			System.out.println("读取文件中的字符：");
			while(ch != '}')
			{
				ch = (char)fileReader.read();
				System.out.print(ch);
			}
			System.out.println("==文件读取完成==");
			fileReader.close();
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
