/**
 * 
 */
package ObjectOriented;

/**
*  @Description     CatAction类
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午5:22:43
*/
public class CatAction implements Cloneable
{
	private String eat;

	/**
	 * @return eat
	 */
	public String getEat()
	{
		return eat;
	}

	/**
	 * @param eat 要设置的 eat
	 */
	public void setEat(String eat)
	{
		this.eat = eat;
	}

	@Override
	public String toString()
	{
		return "CatAction [" + eat + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
