/**
 * 
 */
package JavaIO_Data;

import java.io.Serializable;

/**
*  @Description     ObjectOutputStream和ObjectInputStream类创建
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月25日下午5:52:44
*/
public class CreateObject implements Serializable
{
	public static void main(String[] args)
	{
		System.out.println("ObjectOutputStream类用来序列化一个对象，其父类是OutputStream类，使用时必须配合其他输出流对象：");
		//ObjectOutputStream();   //直接实例化ObjectOutputStream对象，不初始化该类中的其他成员信息
		//ObjectOutputStream(OutputStream out);  //根据入参OutputStream对象创建ObjectOutputStream对象
		
		
		System.out.println("ObjectInputStream类用来序列化一个对象，其父类是InputStream类，使用时必须配合其他输入流对象：");
		//ObjectInputStream();   //直接实例化ObjectInputStream对象，不初始化该类中的其他成员信息
		//ObjectInputStream(InputStream in);  //根据入参InputStream对象创建ObjectInputStream对象
  	}
}
