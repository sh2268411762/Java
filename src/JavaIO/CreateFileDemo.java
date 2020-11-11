/**
 * 
 */
package JavaIO;

import java.io.*;

/**
*  @Description     FileInputStream类和FileOutputStream类创建
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午9:38:46
*/
public class CreateFileDemo
{
	public static void main(String[] args)
	{
		//FileInputStream
		try
		{
			String fileName = "Data.json";
			FileInputStream input1 = new FileInputStream(fileName);
			
			File file = new File("Data.json");
			FileInputStream input2 = new FileInputStream(file);
		} catch (FileNotFoundException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//FileOutputStream
		try
		{
			File file = new File("Data.json");
			FileOutputStream out1 = new FileOutputStream(file);
			
			FileOutputStream out2 = new FileOutputStream("Data.json");
			FileOutputStream out3 = new FileOutputStream("Data.json",true);
			System.out.println("如果该流在打开文件进行操作前目标文件不存在，则会在指定路径创建该文件");
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
