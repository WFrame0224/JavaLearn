class InstanceofDemo 
{
	public static void main(String[] args) 
	{
		Object hello = "hello";
		// ע�⣺Object�������ࡢ�ӿڵĸ��࣬����������ͽӿڴ��ڼ̳й�ϵ������ǿ������ת��
		System.out.println("�ַ����Ƿ���Object���ʵ����" + (hello instanceof Object));
		System.out.println("�ַ����Ƿ���String���ʵ����" + (hello instanceof String));
		System.out.println("�ַ����Ƿ���Math���ʵ����" + (hello instanceof Math));
		System.out.println("�ַ����Ƿ���Comparable�ӿڵ�ʵ����" + (hello instanceof Comparable));

		
		String a = "hello";
		/**
			InstanceofDemo.java:13: ����: �����ݵ�����: String�޷�ת��ΪMath
			ԭ���ǣ�String����Math��û�м̳й�ϵ�����������������޷�ͨ��
		*/
		//System.out.println("�ַ����Ƿ���Math���ʵ����" + (a instanceof Math));

	}
}
