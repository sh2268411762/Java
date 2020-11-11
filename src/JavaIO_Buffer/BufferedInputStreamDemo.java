/**
 * 
 */
package JavaIO_Buffer;

import java.io.*;

/**
*  @Description     ButteredInputStream类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午10:35:24
*/
public class BufferedInputStreamDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream input = new FileInputStream("testIO.txt");
			BufferedInputStream bufferInput = new BufferedInputStream(input);//默认大小为8192
			String content = "";   //内容
			//定义一个缓冲区
			byte[] buffer = new byte[1024];
			int flag = 1;
			while((flag = bufferInput.read(buffer)) != -1)
			{
				content += new String(buffer,0,flag);
			}
			System.out.println("输出缓存内容为：");
			System.out.println(content);
			bufferInput.close();
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
