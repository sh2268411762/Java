/**
 * 
 */
package com.sunhao5;

/**
*  @Description     创建数组
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日上午10:03:47
*/
public class CreateArrey 
{
	public static void main(String[] args) 
	{
//		int[] a1;//定义了数组类型，没有内容，无法被访问
		
//		直接引用赋值
		int[] a2 = {1,2,3};//指定数组长度为3，分配内存
		
//		使用new初始化数组
		int a3[] = new int[]{1,2,3,4};
		
//		使用new初始化数组，然后给数组内容赋值
		int a4[] = new int[4];
		a4[0] = 1;
		a4[1] = 2;
		a4[2] = 3;
		a4[3] = 4;
		
		for(int i = 0;i < 4;i++)
		{
			System.out.print(" " + a4[i]);
		}
		
	}
}
