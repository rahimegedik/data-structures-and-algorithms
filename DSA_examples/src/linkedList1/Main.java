package linkedList1;

public class Main {
	public static void main(String[] args) {
		LList list = new LList();
		list.basaEkle(2);
		list.basaEkle(5);
		list.basaEkle(9);
		list.display();

		

		System.out.println();
		list.indexEkle(45, 1);
		list.display();
		System.out.println();
		
		list.bastanSil();
		list.display();
		System.out.println();
		
		list.sondanSil();
		list.display();
		System.out.println();
		
		list.indexSil(10);
		list.display();
		System.out.println();
	}
}