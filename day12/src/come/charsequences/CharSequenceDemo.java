package come.charsequences;

public class CharSequenceDemo {
	//�ֱ�ʹ��String/StringBuilder/StringBuffer��ƴ��30000���ַ���
	public static void main(String[] args) {
		testString();
		testStringBuffer();
		testStringBuilder();
	}

	public static void testString() {
		String sb = "";
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("String: " + (end - begin));
	}

	public static void testStringBuffer() {
		long begin = System.currentTimeMillis();
		StringBuffer str1 = new StringBuffer("");
		for (int i = 0; i < 10000; i++) {
			str1.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (end - begin));
	}

	public static void testStringBuilder() {
		long begin = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder("");
		for (int i = 0; i < 10000; i++) {
			str2.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (end - begin));
	}

}
