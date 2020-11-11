/**
 * 
 */
package JavaIO_Data;

import java.io.*;

/**
*  @Description     DataInputStream和DataOutputStream示例
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月25日下午2:13:46
*/
public class Demo
{
	//将byte转换为十六进制的字符串
	private static String byteToHexString(byte val)
	{
		return Integer.toHexString(val & 0xff);
	}
	//将char转换为十六进制的字符串
	private static String charToHexString(char ch)
	{
		return Integer.toHexString(ch);
	}
	//将short转换为十六进制的字符串
	private static String shortToHexString(short val)
	{
		return Integer.toHexString(val & 0xffff);
	}
	
	public static void main(String[] args)
	{
		testDataOutputStream();   //写入
		testDataInputStream();    //使用输入流读取数据
	}

	/**
	 * 	使用输入流读取数据
	 */
	private static void testDataInputStream()
	{
		try
		{
			File file = new File("testIO.txt");
			DataInputStream input = new DataInputStream(new FileInputStream(file));
			
			System.out.println("读取数据：");
			System.out.printf("readShort():0x%s\n", shortToHexString(input.readShort()));
			System.out.printf("readInt():0x%s\n", Integer.toHexString(input.readInt()));
			System.out.printf("readLong():0x%s\n", Long.toHexString(input.readLong()));
			System.out.printf("readBoolean():%s\n", input.readBoolean());
			System.out.printf("byteToHexString(0x8F):0x%s\n", byteToHexString((byte)(0x8F)));
			System.out.printf("charToHexString(0x8FCF):0x%s\n", charToHexString((char)0x8FCF));
			System.out.printf("readByte():0x%s\n", byteToHexString(input.readByte()));
			System.out.printf("readChar():0x%s\n", charToHexString(input.readChar()));
			System.out.printf("readUTF():0x%s\n", input.readUTF());
			input.close();
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * 	将数据写入到输出流中
	 */
	private static void testDataOutputStream()
	{
		try
		{
			File file = new File("testIO.txt");
			DataOutputStream out = new DataOutputStream(new FileOutputStream(file));  //创建输出流
			
			System.out.println("开始写入数据：");
			out.writeBoolean(true);
			out.writeByte((byte)0x11);
			out.writeChar((char)0x5133);
			out.writeShort((short)0x4146);
			out.writeInt(0x23456789);
			out.writeLong(0x0FEDCBA123456789L);
			out.writeUTF("一二三四五");
			out.close();   //关闭
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
