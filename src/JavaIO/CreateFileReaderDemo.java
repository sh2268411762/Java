/**
 * 
 */
package JavaIO;

import java.io.*;

/**
*  @Description     创建FileReader类和FileWriter类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午10:05:19
*/
public class CreateFileReaderDemo
{
	public static void main(String[] args)
	{
		try
		{
			String fileName = "文件名";
			FileReader file1 = new FileReader(fileName);
			
			File f = new File("文件名");
			FileReader file2 = new FileReader(f);
			
			FileDescriptor fd = new FileDescriptor();
			FileReader file3 = new FileReader(fd);
			
			
			
			
			FileWriter fw1 = new FileWriter(f);
			FileWriter fw2 = new FileWriter(f,true);
			FileWriter fw3 = new FileWriter(fd);
			FileWriter fw4 = new FileWriter(fileName,true);
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
