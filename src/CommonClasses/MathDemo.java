/**
 * 
 */
package CommonClasses;

/**
*  @Description     Math类指数函数方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午2:09:19
*/
public class MathDemo
{
	public static void main(String[] args)
	{
		System.out.println("取e的次方：" + Math.exp(2));
		System.out.println("取自然对数：" + Math.log(Math.pow(Math.E, 2)));
		System.out.println("取底数为10的对数：" + Math.log10(1000));
		System.out.println("取平方根：" + Math.sqrt(100));
		System.out.println("取立方根：" + Math.cbrt(1000));
		System.out.println("取第一个数的多少次方：" + Math.pow(10, 4));
	}
}
