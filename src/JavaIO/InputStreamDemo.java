/**
 * 
 */
package JavaIO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 
 */

/**
*  @Description     InputStream类
*  					字节输出流
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月20日下午6:05:46
*/
public class InputStreamDemo
{
	public static void main(String[] args)
	{
		try
		{
			InputStream input = new FileInputStream("testIO.txt");
			System.out.println("创建输入流：" + input.toString());
			System.out.println("返回输入流中预估的可读字节数：" + input.available());
			boolean b = input.markSupported();
			System.out.println("判断输入流是否支持mark()和reset()方法：" + b);
			System.out.println("输入流读取字符：" + input.read());
			input.close();  //关闭输入流并释放资源
			
			//mark(int readlimit)     标记输入流中的当前位置
			//reset()                 将输入流重新定位到上次在此输入流调用mark()方法的位置
			//skip(long n)            跳过并丢弃输入流n个字节数据
		} catch (Exception e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
