package linkedList1;

public class LList {
	Node head;
	Node tail;

	public LList() {
		head = null;
		tail = null;

	}

	public void basaEkle(int num) {
		Node node = new Node(num);
		if (doluMu()) {
			node.next = head;
			head = node;

		} else {
			// if list is empty
			head = node;
			tail = node;
		}

	}

	public void sonaEkle(int num) {
		Node node = new Node(num);
		if (doluMu()) {
			tail.next = node;
			node = tail;

		} else {
			// if list is empty
			head = node;
			tail = node;
		}

	}

	public void indexEkle(int num, int index) {
		Node node = new Node(num);
		if (doluMu()) {
			if (index == 0) {
				// baþa ekleme
				node.next = head;
				head = node;
			} else {
				// ortada bir yer
				Node pointer1 = null;
				Node pointer2 = head;
				int currIndex = 0;
				while (pointer2 != null && currIndex < index) {
					pointer1 = pointer2;
					pointer2 = pointer2.next;
					currIndex++;
				}
				if (pointer2 == null) {
					// sona ekleme
					tail.next = node;
					tail = node;

				} else {
					// ortada
					node.next = pointer2;
					pointer1.next = node;
				}

			}

		} else {
			head = node;
			tail = node;
		}
	}

	public void bastanSil() {
		if (doluMu()) {
			if (head == tail) {
				// list has 1 element
				head = null;
				tail = null;

			} else {
				Node newHead = head.next;
				head.next = null;
				head = newHead;
			}
		}
	}

	public void sondanSil() {
		if (doluMu()) {
			if (head == tail) {
				// list has 1 element
				head = null;
				tail = null;
			} else {
				Node pointer = head;
				while (pointer.next != tail) {
					pointer = pointer.next;
				}
				pointer.next = null;
				pointer = tail;

			}
		}
	}

	public void indexSil(int index) {
		if (doluMu()) {
			if (head == tail) {
				// list has 1 element
				head = null;
				tail = null;
			} else {
				if (index == 0) {
					// baþtan silme
					Node newHead = head.next;
					head.next = null;
					head = newHead;
				} else {
					// ortadan silme
					Node pointer1 = null;
					Node pointer2 = head;
					int currIndex = 0;
					while (pointer2 != null && currIndex < index) {
						pointer1 = pointer2;
						pointer2 = pointer2.next;
						currIndex++;

					}
					if (pointer2 != null) {
						if (pointer2 == tail) {
							// sondan silme
							tail = pointer1;
							pointer1.next = null;

						} else {
							// ortadan silme
							Node pointer3 = pointer2.next;
							pointer2.next = null;
							pointer1.next = pointer3;

						}

					}
				}
			}
		}

	}

	public void display() {
		Node dummyHead = head;
		while (dummyHead != null) {
			System.out.print(dummyHead.num + " - ");
			dummyHead = dummyHead.next;
		}
	}

	public boolean doluMu() {
		if (head != null) {
			return true;

		} else {
			return false;

		}
	}

}
