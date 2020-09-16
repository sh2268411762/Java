/**
 * 
 */
package ObjectOriented;

/**
*  @Description     创建引用——对象
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月16日上午12:39:11
*/
public class JobReference
{
	public static void main1(String[] args)
	{
		Job job1 = new Job();
		Job job2 = job1;
		Job job3 = new Job();
		System.out.println("job1和job2相等：" + job1.equals(job2)); //t
		System.out.println("job3和job1相等：" + job3.equals(job1)); //f
		System.out.println("job2和job3相等：" + job2.equals(job3)); //f
	}
	
	
	public String name;
	public static void doSomething()
	{
		Job job = new Job();
		job.findJavaJob();   //方法体中调用其他方法
	}
	public static void main(String[] args)
	{
		doSomething();
	}
}
