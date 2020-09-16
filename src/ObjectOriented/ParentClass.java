/**
 * 
 */
package ObjectOriented;

/**
*  @Description     父类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月16日下午5:45:34
*/
public class ParentClass
{
	public String name = "父类名称";
	public String parentName = "父类名称";
	
	
	public ParentClass()
	{
		System.out.println("父类无参构造方法！");
	}

	
	public ParentClass(String name)
	{
		this.name = name;
		System.out.println("父类有参构造方法：" + name);
	}

	protected String parentMethod()   //子类无法访问private
	{                                 //只能访问public和protected
		return "父类方法";
	}
}
