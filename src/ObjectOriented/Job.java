/**
 * 
 */
package ObjectOriented;

/**
*  @Description     Job类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月16日上午12:42:26
*/
public class Job
{
	private String jobName = "Java";  //工作名称属性定义
	private String dec;      //工作描述属性定义
	private int workYear;    //工作年限属性定义
	
	
	String getJob(String jobName)
	{
		return "找到工作" + jobName;
	}
	public void findJavaJob()
	{
		if(jobName.equals("Java"))
		{
			System.out.println("边学Java边找工作！");
			return ;
		}
		System.out.println("该语句不被执行");
	}
}
