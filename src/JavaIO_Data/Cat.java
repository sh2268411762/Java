/**
 * 
 */
package JavaIO_Data;

import java.io.Serializable;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月25日下午8:18:25
*/
public class Cat  implements Serializable   //该接口仅仅是标志了该对象可以被序列化
{
	public String name;
	public Integer age;
	public String desc;
	/**
	 * @param name
	 * @param age
	 * @param desc
	 */
	public Cat(String name, Integer age, String desc)
	{
		super();
		this.name = name;
		this.age = age;
		this.desc = desc;
	}
	@Override
	public String toString()
	{
		return "Cat [name=" + name + ", age=" + age + ", desc=" + desc + "]";
	}
	
	
}
