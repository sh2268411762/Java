/**
 * 
 */
package JavaIO;

import java.io.*;
/**
*  @Description     字节输出流
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月23日下午10:37:53
*/
public class OutStreamDemo
{
	public static void main(String[] args)
	{
		try
		{
			File inputFile = new File("Data.json");
			File outputFile = new File("output.json");
			InputStream inputStream = new FileInputStream(inputFile);
			OutputStream outputStream = new FileOutputStream(outputFile);
			
			int i = 0;
			while(i != -1)
			{
				i = inputStream.read();
				outputStream.write(i);
			}
			
			inputStream.close();
			outputStream.close();
		} catch (Exception e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}