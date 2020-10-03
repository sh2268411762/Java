/**
 * 
 */
package CommonClasses;

/**
*  @Description     Character字符类常量
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午12:40:03
*/
public class CharacterConstant
{
	public static void main(String[] args)
	{
		System.out.println("char类型中最大值，为'\\uFFFF：" + Character.MAX_VALUE);
		System.out.println("char类型中最小值，为'\\u0000；" + Character.MIN_VALUE);
		System.out.println("char类型的无符号二进制位数：" + Character.SIZE);
		System.out.println("char类型的Class对象：" + Character.TYPE);
		System.out.println("Unicode规范中的'Co'类别：" + Character.PRIVATE_USE);
	}
}
