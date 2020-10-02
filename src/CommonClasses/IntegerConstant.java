/**
 * 
 */
package CommonClasses;

/**
*  @Description     Integer包装类中的常量
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午8:51:43
*/
public class IntegerConstant
{
	public static void main(String[] args)
	{
		int maxIntValue = Integer.MAX_VALUE;
		int minIntValue = Integer.MIN_VALUE;
		int intSize = Integer.SIZE;
		int intBytes = Integer.BYTES;
		System.out.println("int类型最大值        ：" + maxIntValue);
		System.out.println("int类型最小值        ：" + minIntValue);
		System.out.println("int类型的二进制补码位数 ：" + intSize);
		System.out.println("int类型的二进制补码字节数：" + intBytes);
		System.out.println("int类型的类型        ：" + Integer.TYPE);
	}
}
