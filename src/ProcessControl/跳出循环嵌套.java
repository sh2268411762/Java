/**
 * 
 */
package ProcessControl;

/**
*  @Description     让程序跳出指定的循环语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月22日下午6:37:33
*/
public class 跳出循环嵌套
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		boolean flag = true;
		if(flag == false)
		{
			outer_LOOP://外层循环标签
				for(int i = 0;i < 4;i++)
				{
					System.out.println("外层循环，i = " + i);
					inner_LOOP://内层循环标签
						for(int j = 0;j < i;j++)
						{
							if(i + j > 2)
							{
								System.out.println(i + "+" + j + "> 2 ,内层循环执行continue到外层标签的语句");
								continue outer_LOOP;
							}
							System.out.println("内层循环，i = " + i + ",j = " + j);
						}
					System.out.println("被continue中断过循环，该条语句不是每次都会被执行");
				}
		}
		else
		{
			outer_LOOP://外层循环标签
				for(int i = 0;i < 4;i++)
				{
					System.out.println("外层循环，i = " + i);
					inner_LOOP://内层循环标签
						for(int j = 0;j < i;j++)
						{
							if(i + j > 2)
							{
								System.out.println(i + "+" + j + "> 2 ,内层循环执行break到外层标签的语句");
								break outer_LOOP;
							}
							System.out.println("内层循环，i = " + i + ",j = " + j);
						}
					System.out.println("被break中断过循环，该条语句不是每次都会被执行");
				}
		}
	}
}
