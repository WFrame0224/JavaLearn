package day11.JavaDoc;
/**
 * 猫，包含了猫相关的行为动作....
 * @author Frame
 * @since Version1.0
 * @see 百度：http://www.baidu.com/
 */
public class Cat implements IWalkable{

	@Override
	public void wail() {
		System.out.println("走猫步.....");
		
	}
}
