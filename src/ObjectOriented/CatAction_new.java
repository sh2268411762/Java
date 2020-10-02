/**
 * 
 */
package ObjectOriented;
import java.io.Serializable;
/**
*  @Description     
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午6:11:43
*/
public class CatAction_new implements Serializable
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
		return "CatAction_new [" + eat + "]";
	}
	
	
}
