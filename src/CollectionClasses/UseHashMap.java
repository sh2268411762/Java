/**
 * 
 */
package CollectionClasses;

import java.util.*;

/**
*  @Description     HashMap
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月6日上午1:32:26
*/
//class Person_one implements Comparable<Person>
//{
//	int age;
//	String name;
//	/**
//	 * @param age
//	 * @param name
//	 */
//	public Person_one(int age, String name)
//	{
//		this.age = age;
//		this.name = name;
//	}
//	
//	public int compareTo(Person person)
//	{
//		int num = this.age - person.age;
//		return num;
//	}
//
//	@Override
//	public String toString()
//	{
//		return "年龄=" + age + ", 姓名=" + name;
//	}
//}
public class UseHashMap
{
	public static void main(String[] args)
	{
		Map<String,String>h1 = new HashMap();
		h1.put("小明", "14岁");
		h1.put("小黑", "15岁");
		h1.put("小程", "55岁");
		//使用key集合遍历
		System.out.println("通过Map.keyset遍历key和value：");
		for(String key:h1.keySet())
		{
			System.out.println("key = " + key + " and value = " + h1.get(key));
		}
		//使用Map.Entry的迭代器遍历
		System.out.println("\n通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<String, String>>i1 = h1.entrySet().iterator();
		while(i1.hasNext())
		{
			Map.Entry<String,String>entry = i1.next();
			System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
		}
		//使用Map.entrySet()遍历
		System.out.println("\n通过Map.entrySet遍历key和value：");
		for (Map.Entry<String, String> entry : h1.entrySet())
		{
			System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
		}
		//通过Map.values遍历所有的值
		System.out.println("\n通过Map.values()变量里所有的value，但不可以遍历key：");
		for (String string : h1.values())
		{
			System.out.println("value = " + string);
		}
	}
}
