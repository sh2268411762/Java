/**
 * 
 */
package Array;

import java.util.Arrays;

/**
*  @Description     删除重复元素
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午9:17:41
*/
public class DeleteDuplicateToArray 
{
	/**
	*  删除数组内重复元素
	*  @param array     待删除重复元素的数组
	*  @return          返回没有重复元素的数组
	*/
	private static Object[] deleteDuplicateElement(Object[] a)
	{
		//记录删除重复后的数组长度和临时数组的索引
		int length = 0;
		Object[] tempArray = new Object[a.length];//临时数组
		for (int i = 0; i < a.length; i++)
		{
			boolean isDuplicate = false;
			//内层循环将原数组的元素逐个对比
			for (int j = i + 1; j < a.length; j++) 
			{
				//如果发现重复元素，改变标记状态并结束当次内层循环
				if(a[i] == a[j] || a[i].equals(a[j]))
				{
					isDuplicate = true;
					break;
				}
			}
			//判断是否有重复元素
			if(!isDuplicate)
			{
				tempArray[length] = a[i];//将入参数组的元素赋值给临时数组
				length++;
			}
		}
		Object[] newArray = new Object[length];
		//使用arraycopy方法将去重的数组拷贝到新数组中，去除空的不必要的元素并返回
		System.arraycopy(tempArray, 0, newArray, 0, length);//被拷贝，新创建
		return newArray;
	}
	private static void fun()
	{
		boolean flag = true;
		if(!flag)
		{
			System.out.println("sss");
		}
	}
	public static void main(String[] args) 
	{
		Object[] array = new String[] {"天","天","下","下","无","无","双","双"};
		System.out.println("去重前数组内容为：" + Arrays.toString(array));
		array = deleteDuplicateElement(array);
		System.out.println("去重后数组内容为：" + Arrays.toString(array));
		fun();
	}
}
