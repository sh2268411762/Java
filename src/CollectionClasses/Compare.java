/**
 * 
 */
package CollectionClasses;

import java.util.*;

/**
 * @Description ArrayList和LinkedList对比
 * @author 孙豪
 * @version 版本
 * @Date 2020年10月5日下午10:02:33
 */
public class Compare
{
	static final int N = 100000; // 宏

	// 添加费时
	static long countTime(List<Object> list)
	{
		long start = System.currentTimeMillis();
		Object o = new Object();
		for (int i = 0; i < N; i++)
		{
			list.add(i, o);
		}
		return System.currentTimeMillis() - start;
	}

	// 查找费时
	static long readList(List list)
	{
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++)
		{
			list.get(i);
		}
		return System.currentTimeMillis() - start;
	}

	static List addToList(List list)
	{
		Object o = new Object();
		for (int i = 0; i < N; i++)
		{
			list.add(o);
		}
		return list;
	}

	public static void main(String[] args)
	{
		System.out.println("ArrayList添加" + N + "条数据费时 ：" + countTime(new ArrayList()));
		System.out.println("LinkedList添加" + N + "条数据费时：" + countTime(new LinkedList()));

		List listA = addToList(new ArrayList<>());
		List listB = addToList(new LinkedList<>());
		System.out.println("ArrayList查找" + N + "条数据费时 ：" + readList(listA));
		System.out.println("LinkedList查找" + N + "条数据费时：" + readList(listB));
	}
}
