package day16._03_Queue;

import day16._02_Link.MyLinkList;

//˫�����
public class MyDeque extends MyLinkList{
	
	//��   ����β    �����µ�Ԫ��
		public void addLast(Object ele) {
			super.addLast(ele);
		}
		//��  ����ͷ   �����µ�Ԫ��
		public void addFirst(Object ele){
			super.addFirst(ele);
		}
		
		//ɾ����һ���ڵ�
		public void removeFirst(){
			Node current = this.first;//��һ���ڵ�
			this.first = current.next;
			this.first.prev = null;
			
			current.ele = null;
			size --;
		}
		//ɾ�����һ���ڵ�
		public void removeLast(){
			Node current = this.last;//��һ���ڵ�
			this.last = current.prev;
			this.last.next = null;
			
			current.ele = null;
			size --;
		}
		
		//��ѯ���еĵ�һ��Ԫ��
		public Object getFirst(){
			return this.first.ele;
		}
		//��ѯ���е����һ��Ԫ��
		public  Object getLast(){
			return this.last.ele;
		}
		
		
		//���Դ��� 
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
