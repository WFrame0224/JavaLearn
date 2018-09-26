package come.regex;
/**正则表达式（Regex）：表示表达式正确的规则
 * 主要用于（*匹配判断*，分割操作，替换操作（网络爬虫））
 * ---------------------------------------------------------
 */
public class RegexDemo {

	public static void main(String[] args) {
		String input  = "123456";
		System.out.println(input.matches("\\d{5,10}"));
		
		//判断一个手机号码是否符合规则
		input = "12190866172";
		String regex = "^1[5|8|3|4]\\d{9}$";
		System.out.println(input.matches(regex));
/*		boolean status = isNumber(input);
		System.out.println(status);*/
	}
/*	//案例：判断一个字符串全部由数字组成
	private static boolean isNumber(String str){
		char[] arr= str.toCharArray();
		for (char c : arr) {
			if(c < '0' || c > '9'){
				return false;
			}
		}
		return true;
	}*/
}
