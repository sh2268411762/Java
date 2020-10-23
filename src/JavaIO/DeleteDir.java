/**
 * 
 */
package JavaIO;

import java.io.*;

/**
*  @Description     File类删除操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月23日下午11:54:07
*/
public class DeleteDir
{
	public static void main(String[] args)
	{
		File file = new File("test4");
		file = new File("test4/jjjjj");
		System.out.println("创建文件夹test4" + file.mkdir());
		File folder = new File("test4");
		deleteFolder(folder);
	}

	/**
	 * @param folder
	 */
	private static void deleteFolder(File folder)
	{
		File[] files = folder.listFiles();
		if(files != null)
		{
			for(File f:files)
			{
				if(f.isDirectory())
				{
					deleteFolder(f);//递归调用
				}
				else
				{
					System.out.println("删除文件" + f.getName() + "是否成功" + f.delete()); //删除文件
				}
			}
		}
		System.out.println("删除文件" + folder.getName() + "是否成功" + folder.delete());//删除文件夹
	}
}
