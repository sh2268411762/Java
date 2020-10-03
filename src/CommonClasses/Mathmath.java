/**
 * 
 */
package CommonClasses;

/**
*  @Description     Math类其他数学函数
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午2:17:03
*/
public class Mathmath
{
	public static void main(String[] args)
	{
		System.out.println("最大值：" + Math.max(3.44, 9.088));
		System.out.println("最小值：" + Math.min(3.33, 4.44));
		System.out.println("绝对值：" + Math.abs(-8.9909));
		System.out.println("返回比入参大一些的浮点数：" + Math.nextUp(5.67));
		System.out.println("返回比入参小一些的浮点数：" + Math.nextDown(4.35));
	}
}
