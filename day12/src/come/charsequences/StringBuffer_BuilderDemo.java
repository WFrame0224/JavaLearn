package come.charsequences;

public class StringBuffer_BuilderDemo {

	public static void main(String[] args) {
		
		/*********************StringBuffer*****************************/
		StringBuffer sb = new StringBuffer("ABCD");
		System.out.println(sb);
		
		StringBuffer str1 = new StringBuffer("AB");
		StringBuffer str2 = new StringBuffer("C");
		StringBuffer str3 = new StringBuffer("D");
		str1.append(str2);//ƴ�Ӳ���
		System.out.println(str1);
		str1.insert(str1.length(), str3);//�ַ���ָ��λ�ò������
		System.out.println(str1);
		System.out.println("-------------------------------------");
		/*********************StringBuilder*****************************/
		StringBuilder sb1 = new StringBuilder("ABCD");
		System.out.println(sb1);
		
		StringBuilder str11 = new StringBuilder("AB");
		StringBuilder str12 = new StringBuilder("C");
		StringBuilder str13 = new StringBuilder("D");
		str11.append(str12);//ƴ�Ӳ���
		System.out.println(str11);
		str11.insert(str11.length(), str13);//�ַ���ָ��λ�ò������
		System.out.println(str11);
		
		//ɾ�����һ���ַ���G
		String ssb = "ABCDEFG";
		StringBuilder ssb1 = new StringBuilder(ssb).deleteCharAt(6);
		System.out.println(ssb1);
		System.out.println(ssb1.reverse());//��ת�ַ���
		
	}

}
