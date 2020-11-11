/**
 * 
 */
package JavaIO_Data;

import java.io.FileOutputStream;
import java.io.*;

/**
*  @Description     Java序列化
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月25日下午5:05:07
*/


public class XuLieHua
{
	public static void main(String[] args)
	{
		Cat cat = new Cat("欣欣",3,"喵喵喵");
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream("cat.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(cat);
			out.close();
			fileOut.close();
			System.out.println("序列化后存储在文件：cat.ser");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
