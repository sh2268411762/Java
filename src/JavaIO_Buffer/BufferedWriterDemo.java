/**
 * 
 */
package JavaIO_Buffer;

import java.io.*;

/**
*  @Description     BufferedWriter类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月25日上午1:21:41
*/
public class BufferedWriterDemo
{
	public static void main(String[] args)
	{
		FileWriter fileWriter = null;
		BufferedWriter writer = null;
		try
		{
			fileWriter = new FileWriter("testIO.txt");
			writer = new BufferedWriter(fileWriter);
			
			System.out.println("向文件写入内容：");
			writer.write("开始写入：\n");
			for (int i = 0; i < 4; i++)
			{
				String str = "第" + i +"行文字";
				System.out.println(str);
				writer.write(str);
				writer.newLine();  //写入行分隔符，另起一行
				writer.flush();    //刷新
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				//关闭缓存对象
				writer.close();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
