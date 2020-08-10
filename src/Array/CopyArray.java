/**
 * 
 */
package Array;

import java.util.Arrays;

/**
*  @Description     数组赋值
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午10:37:24
*/
public class CopyArray 
{
	public static void main(String[] args) 
	{
		char[] charArray = new char[] {'天','下','无','双'};
		System.out.println("原数组为：" + Arrays.toString(charArray));
		char[] copyArray1 = Arrays.copyOf(charArray, 4);
		System.out.println("复制长度为4，复制后数组为：" + Arrays.toString(copyArray1));
		char[] copyArray2 = Arrays.copyOf(charArray, 1);
		System.out.println("复制长度为1，复制后数组为：" + Arrays.toString(copyArray2));
		char[] copyArray3 = Arrays.copyOf(charArray, 8);
		System.out.println("复制长度为8，复制后数组为：" + Arrays.toString(copyArray3));
		System.out.println("复制后数组与原来数组引用地址相同吗：" + (copyArray1 == charArray));
	}
}
