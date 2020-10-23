/**
 * 
 */
package JavaIO;

import java.io.*;

/**
*  @Description     读取目录下的文件和目录
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月23日下午11:43:38
*/
public class ReadDir
{
	public static void main(String[] args)
	{
		String dirName = "jjjjj";
		File file = new File(dirName);
		if (file.isDirectory())
		{
			System.out.println("访问目录：" + dirName);
			String s[] = file.list();   //获取指定目录下的文件和目录列表
			for (int i = 0; i < s.length; i++)
			{
				File tempFile = new File(dirName + "/" + s[i]);
				if(tempFile.isDirectory())
				{
					System.out.println(s[i] + "是一个目录");
				}
				else
				{
					System.out.println(s[i] + "是一个文件");
				}
			}
		}
		else
		{
			System.out.println(dirName + "不是一个目录");
		}
	}
}
