/**
 * 
 */
package CollectionClasses;

import java.util.*;

/**
*  @Description     TreeSet使用
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月5日下午11:07:40
*/
class Person implements Comparable<Person>
{
	int age;
	String name;
	/**
	 * @param age
	 * @param name
	 */
	public Person(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Person person)
	{
		int num = this.age - person.age;
		return num;
	}
}
public class UseTreeSet
{
	public static void main(String[] args)
	{
		TreeSet<Integer>t1 = new TreeSet<>();
		t1.add(22);
		t1.add(33);
		t1.add(44);
		t1.add(55);
		t1.add(22);
		Iterator<Integer>iterable = t1.iterator();
		while(iterable.hasNext())
		{
			System.out.print(iterable.next() + " ");
		}
		
		TreeSet<Person>p1 = new TreeSet<>();
		p1.add(new Person(20,"孙豪"));
		p1.add(new Person(21,"王翔"));
		p1.add(new Person(22,"张三"));
		
		Iterator<Person> p2 = p1.iterator();
		System.out.println("按照年龄排序：");
		while(p2.hasNext())
		{
			Person p3 = p2.next();
			System.out.println("姓名：" + p3.name + "，年龄：" + p3.age);
		}
	}
}
