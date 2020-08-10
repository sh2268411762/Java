/**
 * 
 */
package Array;

import java.util.Arrays;

/**
*  @Description     数组常见操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午7:55:07
*/
public class Operation 
{
	private static String[] deleteElement(String[] a,int index)//删除数组元素，数组，索引
	{
		String[] deleteArray = new String[a.length - 1];
		for (int i = 0; i < deleteArray.length; i++) 
		{
			if(i < index)
			{
				deleteArray[i] = a[i];
			}
			else
			{
				deleteArray[i] = a[i + 1];
			}
		}
		return deleteArray;
	}
	private static String[] insertElement(String[] a,int index,String value)//增加数组元素，数组，索引，要添加的元素
	{
		String[] insertArray = new String[a.length + 1];
		for (int i = 0; i < a.length + 1; i++) 
		{
			if(i < index)
			{
				insertArray[i] = a[i];
			}
			if(i == index)
			{
				insertArray[i] = value;
			}
			if(i > index)
			{
				insertArray[i] = a[i - 1];
			}
		}
		return insertArray;
	}
	
	public static void main(String[] args) 
	{
		//数组长度
		String[] array1 = new String[4];
		System.out.println("数组长度为：" + array1.length + "\n\n");
		char charArray1[][] = new char[][] {{'一','二','三','四'},{'狗','熊'}};
		System.out.println("二维数组行长度为：" + charArray1.length + "\n二维数组第零列长度为：" + charArray1[0].length + "\n二维数组第一列长度为：" + charArray1[1].length + "\n\n");
		
		//向数组中添加元素
		int[] intArray2 = new int[3];
		Arrays.fill(intArray2, 20);
		System.out.println("intArray2数组内被批量填充为：" + Arrays.toString(intArray2));
		int[] intArray22 = new int[] {1,2,3,4};
		System.out.println("intArray22数组未被填充为：" + Arrays.toString(intArray22));
		Arrays.fill(intArray22, 0, 3, 7);
		System.out.println("intArray22数组索引0到3被批量填充为：" + Arrays.toString(intArray22));
		String[] a2 = new String[] {"天","下","双"};
		System.out.println("添加前数组内容：" + Arrays.toString(a2));
		a2 = insertElement(a2,2,"无");
		System.out.println("添加后数组内容：" + Arrays.toString(a2) + "\n\n");
		
		//删除数组元素
		String[] array3 = new String[] {"天","下","00","无","双"};
		System.out.println("删除前数组内容：" + Arrays.toString(array3));
		array3 = deleteElement(array3,2);
		System.out.println("删除后数组内容：" + Arrays.toString(array3) + "\n\n");
	}
}
