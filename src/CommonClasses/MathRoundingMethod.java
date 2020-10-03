/**
 * 
 */
package CommonClasses;

/**
*  @Description     Math类中取整函数方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午2:03:26
*/
public class MathRoundingMethod
{
	public static void main(String[] args)
	{
		System.out.println("返回大于等于入参的最小整数：" + Math.ceil(5.67));
		System.out.println("返回小于等于入参的最大整数：" + Math.floor(5.66));
		System.out.println("返回与入参最接近或相等的整数，如果两个整数同样接近，则返回是偶数的那个值：" + Math.rint(5.5));
		System.out.println("返回最接近入参的int类型整数：" + Math.round(3.4));
		System.out.println("返回最接近入参的long类型整数：" + Math.round(5.66));
	}
}
