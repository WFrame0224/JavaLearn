package day17_集合框架.List._02_Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//栈
public class StackDemo {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push("C");
		s1.push("B");
		s1.push("A");//此时的栈顶元素是“A”
		System.out.println(s1);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		//-------------------------------------------------
		System.out.println("-----------------官方建议的方法----------------------");
		Deque s2 = new ArrayDeque();
		s2.push("C");
		s2.push("B");
		s2.push("A");//此时的栈顶元素是“A”
		System.out.println(s2);
		System.out.println(s2.peek());
		s2.pop();
		System.out.println(s2);
		System.out.println(s2.peek());
	}
}
