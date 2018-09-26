package day16._02_Link;

public class MyLinkListDemo {
	public static void main(String[] args) {
		MyLinkList list = new MyLinkList();
		System.out.println(list);
		list.addLast("B");
		list.addLast("C");
		list.addLast("D");
		System.out.println(list);
		list.addFirst("A");
		list.addLast("E");
		System.out.println(list);
		
		list.remove("A");
		System.out.println(list);
		list.remove("D");
		System.out.println(list);
		list.remove("E");
		System.out.println(list);
		
	}
}
