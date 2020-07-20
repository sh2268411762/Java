/**
 * 
 */
package com.sunhao123456;

/**
*  @Description     逻辑运算符使用
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日上午9:09:59
*/
public class LogicOperation 
{
	public static void main(String[] args)
	{
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("isTrue && isFalse = " + (isTrue && isFalse));
		System.out.println("isTrue || isFalse = " + (isTrue || isFalse));
		System.out.println(" ! (isTrue && isFalse) = " + !(isTrue && isFalse));
	}
}
