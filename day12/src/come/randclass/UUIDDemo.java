package come.randclass;

import java.util.UUID;

/**
 * UUID��ͨ��Ψһʶ��Universally unique Identifier����һ̨��е�����ɵ����֣�����֤��ͬһʱ���е����еĻ�������Ψһ��
 * UUID����һ��128λ�������֣�һ����16���Ʊ�ʾ���㷨�ĺ���˼���ǽ�ϻ���������������ʱ�䡢һ�������������UUID
 * ����һ��������ʾ�������Ψһ���ַ���
 */
public class UUIDDemo {
	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);//2bfa9267-44a1-42f5-93b6-a3b09692b646
	}
}
