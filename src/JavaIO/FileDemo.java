/**
 * 
 */
package JavaIO;

import java.io.*;

/**
*  @Description     File类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月23日下午11:06:44
*/
public class FileDemo
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("Data.json");
			System.out.println("创建文件Data.json");
			System.out.println("创建成功？：" + file.createNewFile());        //原本就有
			System.out.println("判断文件名是否为绝对路径：" + file.isAbsolute());  //相对路径
			System.out.println("判断指定路径是否为目录：" + file.isDirectory());  //文件
			System.out.println("判断指定路径是否为文件：" + file.isFile());		  //文件
			System.out.println("判断指定路径是否为隐藏文件：" + file.isHidden());  //不是隐藏文件
			System.out.println("文件是否是可执行文件：" + file.canExecute());    //是可执行文件
			System.out.println("文件是否可读：" + file.canRead());            //可读
			System.out.println("文件是否可写：" + file.canWrite());           //可写
			System.out.println("判断文件是否存在：" + file.exists());          //存在
			System.out.println("绝对路径名字的字符串：" + file.getAbsolutePath());//绝对路径名
			System.out.println("获取文件或目录的名称：" + file.getName());      //文件名
			System.out.println("获取文件或目录的父目录名称(不存在返回null)：" + file.getParent());
			System.out.println("获取相对路径名称的字符串：" + file.getPath());   //相对路径名称
			System.out.println("返回相对路径的哈希值：" + file.hashCode());     //哈希值
			System.out.println("获取指定文件字节长度：" + file.length());       //文件字节长度
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
