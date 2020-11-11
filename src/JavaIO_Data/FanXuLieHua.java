/**
 * 
 */
package JavaIO_Data;

import java.io.*;

/**
*  @Description     反序列化示例
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月25日下午6:05:54
*/
public class FanXuLieHua
{
	public static void main(String[] args)
	{
		Cat cat = null;
		try
		{
			FileInputStream fileIn = new FileInputStream("cat.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			cat = (Cat)in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException e)
		{
			e.printStackTrace();
			return;
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("无法找到Cat类");
			e.printStackTrace();
			return;
		}
		
		System.out.println("反序列化Cat对象：");
		System.out.println("cat.name = " + cat.name);
		System.out.println("cat.age  = " + cat.age);
		System.out.println("cat.desc = " + cat.desc);
//		System.out.println(cat.toString());
	}
}
