package day17_���Ͽ��.List._03_ArrayList;
/**ArrayList����java���Ͽ�ܳ���֮������ȡ��Vector���
 * ���ߵײ�ԭ���ǻ���������㷨��һģһ��
 * -----------------------------------------
 * 	Vector�����еķ�����ʹ����synchronized���η�  ��             �̰߳�ȫ�����ǽ�ArrayList���ܽϵͣ������ڶ��̻߳���
 * 	ArrayList:���еķ�����û��ʹ��synchronized���η���      �̲߳���ȫ�����ǽ�Vector���ܽϸߣ��������ڶ��̻߳���
 * 
 * ****��ʹ�Ժ��ڶ��̻߳����£�����Ҳ��ʹ��Vector�ࣺ****
 * 	ArrayList list = Collections.synchronizedList(new ArrayList(...)); 
 * --------------------------------------------------------------------
 * ���÷�������Vector��,������java7��ʼ֮�󣬴�����Ͽ��ǣ������޸��˴���
 * 
 * 	��ʱ��ĳ��������Ҫ����һ��ArrayList����
 * 	�����ڸ÷����У����һ����û�в�ѯ�������ǲ��᷵��null�����ǻ᷵��һ���ռ�����û��Ԫ�صļ��ϣ�
 * 	public ArrayList getAll()
 * 	{
 * 		//TODO
 * 		//return Collection.emptyList();//��õķ�ʽ
 * 		return new ArrayList();//���Ǻܶ�����ֱ�ۣ����ѡ�õķ�ʽ
 * 	}
 * 	��java7֮ǰ����ʹʹ��new ArrayList��������һ��Ԫ�ض����洢�������ڶѿռ���Ȼ��ʼ���˳���Ϊ10��Object���飬û��Ҫ
 * 	��Java7��ʼ���Ż��������ƣ�new ArrayList����ʵ�ײ㴴����ʹ��һ��������
 * 		Object[] elementData = new Object[]{};
 * 		�ڵ�һ�ε���add������ʱ�򣬲Ż����³�ʼ������
 *
 */
public class ArrayListDemo {

}
