package project;

public class SLinkedList<E> {
	public SNode head;
	public SNode tail;
        int size;
	
	public SLinkedList() {
		head =  null;
		tail =  null;
                size = 0;
	}
        public void addFiest(SNode node){
            if(head == null){
                head = node;
                tail = node;
            }
        }

	public void addFirst(int ID,String name,String BD,String mobile,String address,String spec,double gpa) {
		SNode n = new SNode(ID,name,BD,mobile,address,spec,gpa,null);
		 
		if (head == null) {
			head =  n;
			tail = n;
		}
		else {
			n.next = head;
			head = n;
		}
	}

	public SNode removeFirst() {
		if (head == null) {
			return null;
		}
		else {
			SNode e = head;
			head = head.getNext();
			if (head == null) {
				tail =  null;
			}
			return e;
		}
	}

	public SNode first() {
		if (head == null) {
			return null;
		}
		else {
			SNode e = head;
			return e;
		}
	}

	public boolean isEmpty() {
            return head == null;
	}

	
}
