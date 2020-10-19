/**
 * 
 */
package CollectionClasses;

import java.util.Iterator;
import java.util.TreeMap;


/**
*  @Description     TreeMap
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月8日上午11:48:03
*/
class Person_one implements Comparable<Person>
{
	public int age;
	public String name;
	/**
	 * @param age
	 * @param name
	 */
	public Person_one(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Person person)
	{
		int num = this.age - person.age;
		return num;
	}

	@Override
	public String toString()
	{
		return "年龄=" + age + ", 姓名=" + name;
	}
}
public class UseTreeMap
{
    public static void main(String[] args) {
        TreeMap<Person_one, String> treeMap = new TreeMap<>();
        treeMap.put(new Person_one(22, "小刘"), "上大学");
        treeMap.put(new Person_one(11, "小王"), "上小学");
        treeMap.put(new Person_one(33, "老李"), "已工作");
        Iterator<Person_one> personIterator = treeMap.keySet().iterator();
        while (personIterator.hasNext()) {
            Person_one person = personIterator.next();
            System.out.println(person.toString());
        }
    }
}
