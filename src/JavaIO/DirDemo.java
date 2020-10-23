/**
 * 
 */
package JavaIO;

import java.io.*;

/**
*  @Description     创建目录
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月23日下午11:34:40
*/
public class DirDemo
{
	public static void main(String[] args)
	{
		String dirName = "jjjjj";
		File file = new File(dirName);
		System.out.println("创建目录，是否成功（第一次成功后续由于已经创建好了则返回false）：" + file.mkdirs());
	}
}
