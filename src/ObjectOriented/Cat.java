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
	private CatAction catAction;
	
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
	
	//CatAction
	public CatAction getCatAction()
	{
		return catAction;
	}
	
	
	/**
	 * @param catAction 要设置的 catAction
	 */
	public void setCatAction(CatAction catAction)
	{
		this.catAction = catAction;
	}
	@Override
	public String toString()
	{
		return "Cat [姓名=" + name + ", 年龄=" + age + "]," + catAction.toString();
	}
	

	
	
	//重写Object.clone()方法
	public Object clone() throws CloneNotSupportedException
	{
		Cat newCat = (Cat)super.clone();
		newCat.catAction = (CatAction)catAction.clone();
		return super.clone();
	}
	

	
	
}
