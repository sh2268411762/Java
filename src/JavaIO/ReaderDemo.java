/**
 * 
 */
package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
*  @Description     Reader类
*  					字符输入流
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月20日下午6:34:51
*/
public class ReaderDemo
{
	public static void main(String[] args)
	{
		try
		{
			Reader reader = new FileReader("testIO.txt");
			System.out.println("创建输入流：" + reader.toString());
			boolean b = reader.ready();
			System.out.println("判断文件是否准备好被操作：" + b);
			if(b)
			{
				System.out.println("读取字符：" + reader.read());
			}
			reader.close();
			
			//reader.mark(int readAheadLinmit)  标记流的当前位置
			//reader.markSupported()            判断流是否支持mark()方法
			//reader.reset()                    重置流
			//reader.skip()						跳过当前字符
		} catch (Exception e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
