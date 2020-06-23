/**
 * 
 */
package com.sunhao123456;

/**
*  @Description     强制转换
*  @author          孙豪
*  @version         1.0
*  @Date            2020年6月23日上午8:57:25
*/
public class HardConvert 
{
	public static void main(String[] args)
	{
		int intNum = 8;
		byte byteNum = (byte)intNum;
		char charNum = (char)95.123;
		System.out.println("由int强制转换为byte ：" + byteNum);
		System.out.println("将95.123强制转换为字符char ：" + charNum);
		
		System.out.println("\n强制转换有可能带来数据的丢失，使得数组不准确");
		intNum = 8888;
		byteNum = (byte)intNum;//超出最大值 127
		charNum = (char)987654321.123;//超出最大值65535
		System.out.println("由int强制转换为 byte ：" + byteNum);
		System.out.println("将987654321.123强制转换为字符char ：" + charNum);
	}
}
