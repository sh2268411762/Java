/**
 * 
 */
package CommonClasses;

/**
*  @Description     Integer类中的构造函数（以int类型传入和以String传入）
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午8:59:10
*/
public class IntegerConstructor
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Integer i1 = new Integer(100);
		Integer i2 = new Integer("100");

		System.out.println("以int类型为入参构造Integer对象   ：" + i1);
		System.out.println("以String类型为入参构造Integer对象：" + i2);  //自动转换为Integer对象
	}
}
