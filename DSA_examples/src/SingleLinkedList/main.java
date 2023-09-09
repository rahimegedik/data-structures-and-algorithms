package SingleLinkedList;

public class main {

	public static void main(String[] args) {
		linkedLists list= new linkedLists();
		list.insertFirst(5);
		list.insertFirst(9);
		list.insertFirst(4);
		list.insertFirst(2);
		list.insertFirst(9);
		list.insertFirst(57);
		list.insertLast(258);
		list.insert(154, 2);
		//list.display();
		//System.out.println(list.deleteFirst());
		list.display();
		System.out.println(list.deleteLast());
		list.display();
		System.out.println(list.delete(4));
		list.display();
		
		
		
		

	}

}
