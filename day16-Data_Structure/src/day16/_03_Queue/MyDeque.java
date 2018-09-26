package day16._03_Queue;

import day16._02_Link.MyLinkList;

//双向队列
public class MyDeque extends MyLinkList{
	
	//在   链表尾    加入新的元素
		public void addLast(Object ele) {
			super.addLast(ele);
		}
		//在  链表头   加入新的元素
		public void addFirst(Object ele){
			super.addFirst(ele);
		}
		
		//删除第一个节点
		public void removeFirst(){
			Node current = this.first;//第一个节点
			this.first = current.next;
			this.first.prev = null;
			
			current.ele = null;
			size --;
		}
		//删除最后一个节点
		public void removeLast(){
			Node current = this.last;//第一个节点
			this.last = current.prev;
			this.last.next = null;
			
			current.ele = null;
			size --;
		}
		
		//查询队列的第一个元素
		public Object getFirst(){
			return this.first.ele;
		}
		//查询队列的最后一个元素
		public  Object getLast(){
			return this.last.ele;
		}
		
		
		//测试代码 
		public static void main(String[] args) {
			MyDeque deque = new MyDeque();
			
			deque.addLast("B");
			deque.addFirst("A");
			deque.addLast("C");
			System.out.println(deque);
			
			System.out.println(deque.getFirst());
			System.out.println(deque.getLast());
			
			deque.removeFirst();
			System.out.println(deque);
			deque.removeLast();
			System.out.println(deque);
			
		}
} 
