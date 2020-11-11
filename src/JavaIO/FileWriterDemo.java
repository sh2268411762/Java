/**
 * 
 */
package JavaIO;

import java.io.*;

/**
*  @Description     FileWriter类写入文件
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午10:13:27
*/
public class FileWriterDemo
{
	public static void main(String[] args)
	{
		try
		{
			String fileName = "testIO.txt";
			writeFile(fileName);
			readFile(fileName);
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}

	/**
	 * @param 读取文件
	 * @throws IOException 
	 */
	private static void readFile(String fileName) throws IOException
	{
		FileReader fileReader = new FileReader(fileName);
		char ch = ' ';
		System.out.println("读取文件中的字符：");
		while(ch != '9')
		{
			ch = (char)fileReader.read();
			System.out.print(ch);
		}
		System.out.println("==文件读取完成==");
		fileReader.close();
	}

	/**
	 * @param 写入文件
	 * @throws IOException 
	 */
	private static void writeFile(String fileName) throws IOException
	{
		FileWriter fileWriter = new FileWriter(fileName);
		System.out.println("开始写入文件：");
		//依次写入
		for (int i = 0; i < 10; i++)
		{
			fileWriter.write(String.valueOf(i));
		}
		fileWriter.close();
	}
}
