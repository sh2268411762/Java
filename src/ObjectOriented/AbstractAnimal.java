/**
 * 
 */
package ObjectOriented;

/**
*  @Description     抽象类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午6:22:58
*/
public abstract class AbstractAnimal
{
	public String name;
	public String color;
	
	public abstract void eat();  //抽象方法
	
	public void getDesc1()
	{
		System.out.println("动物抽象类");
	}
	
	public void getDesc()
	{
		System.out.println("动物类：" + name);
	}
}
