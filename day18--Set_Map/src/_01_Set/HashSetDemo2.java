package _01_Set;
/**
 * *******************************************************
	1��**HashSet��Set�ӿ���õ�ʵ���࣬����˼�壬�ײ�����˹�ϣ��ɢ�У��㷨
   ��ײ���ʵҲ�Ǹ����飬���ڵ��������ṩ��ѯ�ٶȣ������ٶ�Ҳ�ǱȽϿ죬�����������������ݵĲ������
   
	2��**��HashSet������ж����������Ƿ�����ͬ���⣺
		1�������������hashCode��������ֵ�Ƿ����
		2�������������equals�Ƚ��Ƿ���ȣ�����true����˵������ͬ����
		
		�����hashCodeֵ������Ԫ���ڹ�ϣ���еĴ洢λ��
		     ********** ***        *****    ******
		-->����ȱһ����
		
		����HashSet����������µĶ����ʱ�����жϸö���ͼ��϶����е�hashCodeֵ
			1�������ȣ�ֱ�ӰѸ��µĶ��󴢴浽hashCodeָ����λ��
			2������ȣ��ټ����ж϶���ͼ��϶����е�equals���Ƚ�
				1>hashCode��ͬ��equalsΪtrue������Ϊ��ͬһ�������򲻱����ڹ�ϣ����
				2>hashCode��ͬ��equalsΪfalse���ǳ��鷳���洢��֮ǰ����ͬ��λ��������(�ܾ��������Ƚ��鷳)
		���������hashCode��equals��������Ҫ�ԣ�
			ÿһ���洢��hash���еĶ��󣬶����ṩhashCode��equals�����������ж��Ƿ���ͬһ������		
		------------------------------------------------
		�洢�ڹ�ϣ���еĶ��󣬶�Ӧ�ø���equals������hashCode���������ұ�֤equals��ȵ�ʱ��hashCodeҲ���
	
	3����ͬ������������μ���hashCodeֵ��
		Eclipse�����Զ�����hashCode��equals����					
   		--�����Ҫ�������Զ���Ķ��󴢴浽��ϣ���У������͵Ķ���Ӧ�ø���equals��hashCode���������ڸ÷������ṩ�Լ���
   		�жϹ��򡣣�����ʹ��Eclipse�����Զ�����hashCode��equals������
	
 */
import java.util.HashSet;
import java.util.Set;

class A {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

class B {
	@Override
	public int hashCode() {
		return 1;
	}
}

class C {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	@Override
	public int hashCode() {
		return 2;
	}
}

public class HashSetDemo2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new A());
		set.add(new A());
		set.add(new B());
		set.add(new B());
		set.add(new C());
		set.add(new C());//֤����Ҫ�ж�����Ԫ���Ƿ���ȣ�ͬʱ��Ҫ��������equals��hashCode����
		System.out.println(set.size());
		System.out.println(set);
	}
}
