/**
 * 
 */
package Array;

import java.util.Arrays;

/**
*  @Description     数组内容比较
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午10:53:15
*/
public class CompareArray 
{
	public static void main(String[] args) 
	{
		char[] charArray = new char[] {'天','下','无','双'};
		System.out.println("原来数组为：" + Arrays.toString(charArray));
		char[] copyArray1 = Arrays.copyOf(charArray, 4);
		System.out.println("复制长度为4，复制后copyArray1为：" + Arrays.toString(copyArray1));
		char[] copyArray2 = Arrays.copyOf(charArray, 1);
		System.out.println("复制长度为1，复制后copyArray2为：" + Arrays.toString(copyArray2));
		char[] copyArray3 = Arrays.copyOf(charArray, 8);
		System.out.println("复制长度为8，复制后copyArray3为：" + Arrays.toString(copyArray3));
		
		System.out.println("复制后copyArray1与原数组内容相同吗：" + (Arrays.equals(copyArray1, charArray)));
		System.out.println("复制后copyArray2与原数组内容相同吗：" + (Arrays.equals(copyArray2, charArray)));
		System.out.println("复制后copyArray3与原数组内容相同吗：" + (Arrays.equals(copyArray3, charArray)));
	}
}
