/**
 * 
 */
package JavaIO;

import java.io.*;
/**
*  @Description     FileOutputStream类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午9:36:40
*/
public class FileOutputStreamDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream input = new FileInputStream("Data.json");
			FileOutputStream output = new FileOutputStream("output.json");
			byte[] byteArray = new byte[input.available()];
			input.read(byteArray);
			output.write(byteArray);   //将data.json内容复制到output.json中
			input.close();
			output.close();
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("系统异常" + e.getMessage());
		}
	}
}
