/**
 * 
 */
package com.sunhao123456;

/**
*  @Description     位操作符
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日上午9:28:28
*/
public class BitOperation 
{
	public static void main(String[] args)
	{
		int a = 0b1001;//9
		int b = 0b1101;//13
		
		System.out.println("按位与——>a & b :" + (a & b));
		System.out.println("按位或——>a | b ：" + (a | b));
		System.out.println("按位异或——>a ^b :" + (a ^ b));
		System.out.println("按位补——> ~a   :" + (~a));
	}
}
