/**
 * 
 */
package CommonClasses;

/**
*  @Description     枚举类常见方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午2:50:05
*/
public class ColorUseEnum
{
	public static void main(String[] args)
	{
		ColorEnum colorArray[] = ColorEnum.values();   //values 将枚举类型成员属性按数组形式返回
		for (int i = 0; i < colorArray.length; i++)
		{
			System.out.println("依次打印枚举类型成员：" + colorArray[i] + " " + colorArray[i].color);
		}
		
		System.out.println("比较RED和BLUE定义时的前后顺序：" + ColorEnum.RED.compareTo(ColorEnum.BLUE));
		System.out.println("比较BLUE和RED定义时的前后顺序：" + ColorEnum.BLUE.compareTo(ColorEnum.RED));
		//前减后
		for (int i = 0; i < colorArray.length; i++)
		{
			System.out.println("依次获取枚举成员的索引位置：" + colorArray[i].ordinal());
		}
	}
}
