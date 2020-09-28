/**
 * 
 */
package ObjectOriented;

/**
*  @Description     对象克隆
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月28日下午11:25:40
*/
public class Cat implements Cloneable
{
	private String name;
	private int age;
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
	@Override
	public String toString()
	{
		return "Cat [姓名=" + name + ", 年龄=" + age + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
