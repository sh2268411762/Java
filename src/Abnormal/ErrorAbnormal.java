/**
 * 
 */
package Abnormal;

/**
*  @Description     NoClassDeFoundError类
*  @author          孙豪
*  @version         版本
*  @Date            2020年11月1日下午3:58:29
*/
public class ErrorAbnormal
{
	private static String USER_ID = getUserId();   //错误修正：给USER_ID初始值
	public ErrorAbnormal(String id)
	{
		this.USER_ID = id;
	}
	
	private static String getUserId()
	{
		throw new RuntimeException("无法找到USERID...");
	}
}
