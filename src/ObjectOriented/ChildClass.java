/**
 * 
 */
package ObjectOriented;

/**
*  @Description     子类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月16日下午5:47:12
*/
public class ChildClass extends ParentClass  //继承ParentClass
{
	
	public ChildClass(String name)
	{
		super(name);
	}

	public ChildClass()
	{
		super();
	}

	@SuppressWarnings("unused")
	private String childName;  //子类属性
	public String name = "子类名称";
	@SuppressWarnings("unused")
	private String childMethod()
	{
		return "子类方法";
	}
	
	//重写
	@Override
	public String parentMethod()
	{
		return "子类重写方法";
	}
	public void callParentMethod()
	{
		System.out.println("调用父类中被重写方法：" + super.parentMethod());
	}


	public static void main(String[] args)
	{
		ChildClass child = new ChildClass("传入名称");
		System.out.println("子类继承父类属性：" + child.parentName);//父
		System.out.println("子类覆盖父类属性：" + child.name);//子
		System.out.println("子类继承父类方法：" + child.parentMethod());//父（重写前）
		System.out.println("子类重写父类方法：" + child.parentMethod());//子重写
		child.callParentMethod();
		
	}
}
