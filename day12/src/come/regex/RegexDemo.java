package come.regex;
/**������ʽ��Regex������ʾ���ʽ��ȷ�Ĺ���
 * ��Ҫ���ڣ�*ƥ���ж�*���ָ�������滻�������������棩��
 * ---------------------------------------------------------
 */
public class RegexDemo {

	public static void main(String[] args) {
		String input  = "123456";
		System.out.println(input.matches("\\d{5,10}"));
		
		//�ж�һ���ֻ������Ƿ���Ϲ���
		input = "12190866172";
		String regex = "^1[5|8|3|4]\\d{9}$";
		System.out.println(input.matches(regex));
/*		boolean status = isNumber(input);
		System.out.println(status);*/
	}
/*	//�������ж�һ���ַ���ȫ�����������
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
