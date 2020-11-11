/**
 * 
 */
package JavaIO_Buffer;

import java.io.*;
/**
*  @Description     BufferedOutputStreamDemol类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午11:21:39
*/
public class BufferedOutputStreamDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream output = new FileOutputStream("testIO.txt");
			BufferedOutputStream bos = new BufferedOutputStream(output);
			String content = "刘辰鑫二球";
			bos.write(content.getBytes(),0,content.getBytes().length);
			bos.flush();
			bos.close();
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
