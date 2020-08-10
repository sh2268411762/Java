/**
 * 
 */
package Array;

import java.util.Arrays;

/**
*  @Description     数组查找
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午9:56:13
*/
public class SearchArray 
{
	private static int bin(int[] a,int value)//数组，元素
	{
		return Arrays.binarySearch(a, value);
	}
	private static int bin1(Object[] a,Object value)//数组，元素
	{
		return Arrays.binarySearch(a, value);
	}
	private static int searchElement(Object[] a,Object value)//数组，要查找的元素
	{
		int i = 0;
		for (; i < a.length; i++) 
		{
			if(a[i] == value || a[i].equals(value))
			{
				break;
			}
		}
		if(i == a.length)
		{
			return -1;
		}
		return i;
	}
	public static void main(String[] args) 
	{
		Object array[] = new String[] {"1","2","3","4","5"};
		System.out.println("查找“5”的索引：" + (searchElement(array,"5") != -1 ? searchElement(array,"5") : "不存在该元素"));
		System.out.println("查找“9”的索引：" + (searchElement(array,"9") != -1 ? searchElement(array,"9") : "不存在该元素"));
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println("查找“6”的索引：" + (bin(arr,6) != -1 ? bin(arr,6) : "不存在该元素"));
		System.out.println("查找“9”的索引：" + (bin(arr,9) != -1 ? bin(arr,9) : "不存在该元素"));
		System.out.println("查找“5”的索引：" + (bin1(array,"5") != -1 ? bin1(array,"5") : "不存在该元素"));
		System.out.println("查找“9”的索引：" + (bin1(array,"9") != -1 ? bin1(array,"9") : "不存在该元素"));
	}
}
