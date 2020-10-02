/**
 * 
 */
package CommonClasses;

/**
*  @Description     Double类构造方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午9:55:51
*/
public class DoubleConstructor
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Double d1 = new Double(10.01);
		Double d2 = new Double("10.01");
		
		System.out.println("以double类型为入参构造Double对象：" + d1);
		System.out.println("以String类型为入参构造Double对象：" + d2);
	}
}
