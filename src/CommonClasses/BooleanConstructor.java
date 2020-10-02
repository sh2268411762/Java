/**
 * 
 */
package CommonClasses;

/**
*  @Description     Boolean类构造方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午10:24:43
*/
public class BooleanConstructor
{
	public static void main(String[] args)
	{
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		
		System.out.println("以Boolean类型为入参构造Boolean对象：" + b1);
		System.out.println("以String类型为入参构造Boolean对象：" + b2);
	}
}
