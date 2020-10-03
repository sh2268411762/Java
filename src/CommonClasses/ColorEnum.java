/**
 * 
 */
package CommonClasses;

/**
*  @Description     颜色枚举值定义
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午2:47:48
*/
public enum ColorEnum
{
	RED("红色"),
	GREEN("绿色"),
	YELLOW("黄色"),
	BLUE("蓝色");

	public String color;
	private ColorEnum()
	{
		
	}
	private ColorEnum(String color)
	{
		this.color = color;
	}
	//可以直接通过枚举类名.枚举值名来访问
}
