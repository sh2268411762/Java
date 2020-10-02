/**
 * 
 */
package ObjectOriented;

import java.io.*;

/**
*  @Description     序列化进行深克隆
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午6:03:32
*/
public class Cat_new implements Serializable
{
	private String name;
	private int age;
	private CatAction_new catAction;
	/**
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age 要设置的 age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	/**
	 * @return catAction
	 */
	public CatAction_new getCatAction()
	{
		return catAction;
	}
	/**
	 * @param catAction 要设置的 catAction
	 */
	public void setCatAction(CatAction_new catAction)
	{
		this.catAction = catAction;
	}
	
	public String toString()
	{
		return "Cat [姓名=" + name + ", 年龄=" + age + "]," + catAction.toString();
	}
	
	public Object deepClone() throws Exception
	{
		//序列化
		ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(this);
		
		//反序列化
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		return new ObjectInputStream(byteArrayInputStream).readObject();
	}
}
