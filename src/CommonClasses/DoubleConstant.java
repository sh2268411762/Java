/**
 * 
 */
package CommonClasses;

/**
*  @Description     Double类中常量
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午9:44:28
*/
public class DoubleConstant
{
	public static void main(String[] args)
	{
		System.out.println("double类型最大正有限值：" + Double.MAX_VALUE);
		System.out.println("double类型最小正非零值：" + Double.MIN_VALUE);
		System.out.println("返回int，有限double类型可能具有的最大指数：" + Double.MAX_EXPONENT);
		System.out.println("返回int，标准化double类型可能具有的最小指数：" + Double.MIN_EXPONENT);
		System.out.println("double类型的负无穷大值：" + Double.NEGATIVE_INFINITY);
		System.out.println("double类型的正无穷大值：" + Double.POSITIVE_INFINITY);
		System.out.println("double类型的NaN值的常量，表示不是一个数字（Not a Number）：" + Double.NaN);
		System.out.println("double类型以二进制补码的形式所占的位数：" + Double.SIZE);
		System.out.println("double类型以二进制补码的形式所占的字节数：" + Double.BYTES);
		System.out.println("double类型的class对象：" + Double.TYPE);
	}
}
