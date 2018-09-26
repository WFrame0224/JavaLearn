package day16._04_Stack;

import day16._01_array.MyArrayList;
/*
 * �����ǻ�������ʵ�ֵ�ջ�ṹ�����涨��
 *		1����������һλΪջ����
 *		2������λ��Ϊ0��λ��Ϊջ��
 */
public class MyStack extends MyArrayList{
	//��ջ
	public void push(Object ele){
		super.add(ele);
	}
	//��ջ
	public void pop(){
		int index = size()-1;
		super.deleteEle(index);
	}
	//�鿴��ջ�����Ķ��󣬵����Ӷ�ջ���Ƴ���
	public Object peek(){
		int index = size()-1;
		return super.get(index);
	}
	
	//���Զ�ջ�Ƿ�Ϊ��
	public boolean empty(){
		return super.isEmpty();
	}
	//���ض����ڶ�ջ�е�λ�ã��� 1 Ϊ����
	public int search(Object ele){
		return super.getIndex(ele)+1;
	}
	
/**************************����*******************************/
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		System.out.println(stack.isEmpty());
		stack.push("A");
		stack.push("Frame");
		stack.push(10);
		stack.push(11.5);
		stack.push(false);
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		
		System.out.println(stack.search("Frame"));
		
		
	}
}
