package day16._04_Stack;

import day16._01_array.MyArrayList;
/*
 * 这里是基于数组实现的栈结构，并规定：
 *		1：数组的最后一位为栈顶；
 *		2：索引位置为0的位置为栈底
 */
public class MyStack extends MyArrayList{
	//入栈
	public void push(Object ele){
		super.add(ele);
	}
	//出栈
	public void pop(){
		int index = size()-1;
		super.deleteEle(index);
	}
	//查看堆栈顶部的对象，但不从堆栈中移除它
	public Object peek(){
		int index = size()-1;
		return super.get(index);
	}
	
	//测试堆栈是否为空
	public boolean empty(){
		return super.isEmpty();
	}
	//返回对象在堆栈中的位置，以 1 为基数
	public int search(Object ele){
		return super.getIndex(ele)+1;
	}
	
/**************************测试*******************************/
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
