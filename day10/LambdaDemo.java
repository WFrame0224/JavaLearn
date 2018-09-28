interface Command
{
	// �ӿ��ﶨ���process�������ڷ�װ��������Ϊ��
	void process(int[] target);
} 
class ProcessArray
{
	public void process(int[] target, Command cmd)
	{
		cmd.process(target);
	}
}
public class LambdaDemo
{
	public static void main(String[] args) 
	{
		ProcessArray pa = new ProcessArray();
		int[] array = {3,-4,6,4};
		// ���������ڲ������ʽʵ��
		pa.process(array, new Command()
		{
			public void process(int[] target)// ��Ϊ�ӿ��е�Ĭ�Ϸ���ʵ��ȫ������public abstract ���εģ���˷���ʵ��Ҳ�������public����
			{
				int sum = 0;
				for(int temp : target)
				{
					sum += temp;
				}
				System.out.println("-------�˴����õķ������������ڲ���ʵ��------\r\n����Ԫ�ص��ܺ��ǣ�" + sum);
			}
		});
		// ����lambda���ʽʵ��
		pa.process(array,(int[] target)->{
			int sum = 0;
			for(int temp : target)
			{
				sum += temp;
			}
			System.out.println("-------�˴����õķ�������Lambda���ʽʵ��------\r\n����Ԫ�ص��ܺ��ǣ�" + sum);
		});
		/**
			������ı��ʽ���Կ�����
				��ʹ��lambda���ʽ���������ڲ��ഴ������ʱ��Lambda���ʽ�Ĵ���齫�����ʵ�ֳ��󷽷��ķ����壬Lambda���ʽ���൱��һ����������
				������Lambda���ʽ�������������
					1���β��б��β��б�����ʡ���β����͡�����β��б���ֻ��һ���������������β��б��Բ���Ŷ�����ʡ��
					2����ͷ��->��������ͨ��Ӣ���л��ߺźʹ��ڷ������
					3������顣���Lambda������н���һ��ʡ��return����䣬Lambda���ʽ���Զ�������������ֵ
		 */
	}
}

