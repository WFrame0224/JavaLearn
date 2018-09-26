package day16._02_Link;

//����˫���б�ļ���
public class MyLinkList {

	 protected Node first;//����ĵ�һ���ڵ�
	 protected Node last; //��������һ���ڵ�
	 protected int size = 0; //�ڵ������

	//�����еĽڵ�
	protected class Node {
		public Node prev;//��һ���ڵ����
		public Node next;//��һ���ڵ����
		public Object ele;//��ǰ�ڵ��д洢������

		public Node(Object ele) {
			this.ele = ele;
		}
	}
//   ------------------------------------

	//��   ����β    �����µ�Ԫ��
	public void addLast(Object ele) {
		Node node = new Node(ele);//��Ҫ�����һ���ڵ����

		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			//�������Ľڵ���Ϊ֮ǰ������һ���ڵ�
			this.last.next = node;
			//��֮ǰ���һ���ڵ���Ϊ�����ڵ�� ��һ���ڵ�
			node.prev = this.last;
			//�������ڵ���Ϊ���һ���ڵ�
			this.last = node;
		}
		size ++;
	}
	//��  ����ͷ   �����µ�Ԫ��
	public void addFirst(Object ele){
		Node node = new Node(ele);//��Ҫ�����һ���ڵ����
		
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			//��֮ǰ��һһ���ڵ���Ϊ�����ڵ�� ��һ���ڵ�
			node.next = this.first;
			//�������Ľڵ���Ϊ֮ǰ��һ������һ���ڵ�
			this.first.prev = node;
			//�������ڵ���Ϊ��һһ���ڵ�
			this.first = node;
		}
		size ++;
	}
//  ------------------------------------
	//����ָ��Ԫ�أ��ҵ���Ӧ�Ľڵ�
	public Node search(Object ele){
		int i = 0;
		//�ҵ���ɾ���Ľڵ�
		Node current = this.first;//��һ���ڵ�
		while(i < size){
			if(!current.ele.equals(ele)){
				if(current.next == null){
					return null;
				}
				current = current.next;//��ȡ�Լ�����һ���ڵ�
			}
			i++;
		}
		System.out.println("current=" + current.ele);//����Ƿ��ҵ��˵�ǰ�ڵ�
		return current;
	}
//  ------------------------------------
	//ɾ��ָ��Ԫ��ֵ�Ľڵ�
	public void remove(Object ele){
		int i = 0;
		//�ҵ���ɾ���Ľڵ�
		Node current = this.first;//��һ���ڵ�
		while(i < size){
			if(!current.ele.equals(ele)){
				if(current.next == null){
					return;
				}
				current = current.next;//��ȡ�Լ�����һ���ڵ�
			}
			i++;
		}
		//System.out.println("current=" + current.ele);//����Ƿ��ҵ��˵�ǰ�ڵ�
		//ɾ���ڵ�
		if(this.first == current){     //���ɾ�����ǵ�һ���ڵ�
			this.first = current.next;
			this.first.prev = null;
		}else if(this.last == current){//���ɾ���������һ���ڵ�
			this.last = current.prev;
			this.last.next = null;
		}else{							  //���ɾ�������м�Ľڵ�
			//��ɾ���ڵ����һ���ڵ���Ϊɾ���ڵ���һ���ڵ��prev
			current.next.prev = current.prev;
			//��ɾ���ڵ����һ���ڵ���Ϊɾ���ڵ����һ���ڵ��next
			current.prev.next = current.next;
		}
		current.ele = null;
		
		size --;
	}
//  ------------------------------------	
	//��ӡ���϶���
	public String toString(){
		if(size == 0){
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 +1);
		Node current = this.first;//��һ���ڵ�
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(current.ele);
			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
			current = current.next;//��ȡ�Լ�����һ���ڵ�
		} 
		return sb.toString();
	}
}
