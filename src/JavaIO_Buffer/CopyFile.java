/**
 * 
 */
package JavaIO_Buffer;

import java.io.*;
/**
*  @Description     使用BufferedInputStream 和 BufferedOutputStream复制文件
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午11:27:29
*/
public class CopyFile
{
	public static void main(String[] args)
	{
		try
		{
			long beginTime = System.currentTimeMillis();
			FileInputStream fileInput = new FileInputStream("testIO.txt");
			BufferedInputStream input = new BufferedInputStream(fileInput);
			
			FileOutputStream fileOutput = new FileOutputStream("testIO_Copy.txt");
			BufferedOutputStream output = new BufferedOutputStream(fileOutput);
			
			int size = 0;
			byte[] buffer = new byte[1024];
			//将文件写入缓存输入流
			while((size = input.read(buffer)) != -1)
			{
				output.write(buffer,0,size);
				//将缓存输入流中的数据通过缓存输出流写入目标文件
			}
			//刷新缓存的输出流，保证数据全部被写出
			output.flush();
			input.close();
			output.close();
			System.out.println("复制文件完毕——耗时为：" + (System.currentTimeMillis() - beginTime) + "毫秒");
		} catch (Exception e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
