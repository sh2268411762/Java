/**
 * 
 */
package Array;

import java.util.Arrays;

/**
*  @Description     数组排序
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午10:27:15
*/
public class SortArray 
{
	public static void fun1() 
	{
		Integer[] intArray = new Integer[]{18,22,39,66,10};
		System.out.println("排序前：" + Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("排序后：" + Arrays.toString(intArray) + "\n");
		
		Character[] charArray = new Character[] {'a','A','z','m'};
		System.out.println("排序前：" + Arrays.toString(charArray));
		Arrays.sort(charArray);
		System.out.println("排序后：" + Arrays.toString(charArray) + "\n");
	}
	//冒泡排序
	private static void bubbleSort(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++) //外层循环控制排序次数
		{
			for (int j = 0; j < a.length - 1 - i; j++) //内层循环控制每一次排序次数
			{
				if(a[j] > a[j + 1])
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] array1 = {9,4,88,39,90,3};
		System.out.println("排序前：" + Arrays.toString(array1));
		bubbleSort(array1);
		System.out.println("排序后：" + Arrays.toString(array1));
	}
}
