package day16._02_Link;

//基于双向列表的集合
public class MyLinkList {

	 protected Node first;//链表的第一个节点
	 protected Node last; //链表的最后一个节点
	 protected int size = 0; //节点的数量

	//链表中的节点
	protected class Node {
		public Node prev;//上一个节点对象
		public Node next;//下一个节点对象
		public Object ele;//当前节点中存储的数据

		public Node(Object ele) {
			this.ele = ele;
		}
	}
//   ------------------------------------

	//在   链表尾    加入新的元素
	public void addLast(Object ele) {
		Node node = new Node(ele);//需要保存的一个节点对象

		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			//把新增的节点作为之前最后的下一个节点
			this.last.next = node;
			//把之前最后一个节点作为新增节点的 上一个节点
			node.prev = this.last;
			//把新增节点作为最后一个节点
			this.last = node;
		}
		size ++;
	}
	//在  链表头   加入新的元素
	public void addFirst(Object ele){
		Node node = new Node(ele);//需要保存的一个节点对象
		
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			//把之前第一一个节点作为新增节点的 下一个节点
			node.next = this.first;
			//把新增的节点作为之前第一个的下一个节点
			this.first.prev = node;
			//把新增节点作为第一一个节点
			this.first = node;
		}
		size ++;
	}
//  ------------------------------------
	//根据指定元素，找到相应的节点
	public Node search(Object ele){
		int i = 0;
		//找到被删除的节点
		Node current = this.first;//第一个节点
		while(i < size){
			if(!current.ele.equals(ele)){
				if(current.next == null){
					return null;
				}
				current = current.next;//获取自己的下一个节点
			}
			i++;
		}
		System.out.println("current=" + current.ele);//输出是否找到了当前节点
		return current;
	}
//  ------------------------------------
	//删除指定元素值的节点
	public void remove(Object ele){
		int i = 0;
		//找到被删除的节点
		Node current = this.first;//第一个节点
		while(i < size){
			if(!current.ele.equals(ele)){
				if(current.next == null){
					return;
				}
				current = current.next;//获取自己的下一个节点
			}
			i++;
		}
		//System.out.println("current=" + current.ele);//输出是否找到了当前节点
		//删除节点
		if(this.first == current){     //如果删除的是第一个节点
			this.first = current.next;
			this.first.prev = null;
		}else if(this.last == current){//如果删除的是最后一个节点
			this.last = current.prev;
			this.last.next = null;
		}else{							  //如果删除的是中间的节点
			//把删除节点的上一个节点作为删除节点下一个节点的prev
			current.next.prev = current.prev;
			//把删除节点的下一个节点作为删除节点的上一个节点的next
			current.prev.next = current.next;
		}
		current.ele = null;
		
		size --;
	}
//  ------------------------------------	
	//打印集合对象
	public String toString(){
		if(size == 0){
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 +1);
		Node current = this.first;//第一个节点
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(current.ele);
			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
			current = current.next;//获取自己的下一个节点
		} 
		return sb.toString();
	}
}
