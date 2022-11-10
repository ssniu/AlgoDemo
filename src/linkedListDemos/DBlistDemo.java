package linkedListDemos;

public class DBlistDemo {

	public static void main(String[] args) {
		
		DblinkedListTest d = new DblinkedListTest();
		 DbLinkedList db1 = new DbLinkedList(1,"001");
			DbLinkedList db2 = new DbLinkedList(2,"002");
			DbLinkedList db3 = new DbLinkedList(3,"003");
			DbLinkedList db4 = new DbLinkedList(4,"004");
			DbLinkedList db5 = new DbLinkedList(5,"005");
			d.add(db1);
			d.add(db2);
			d.add(db3);
			d.add(db4);
			d.list();
//			d.update(db4,"eer");
//			d.list();
//			d.update(db5,"44");
			d.del(3);
			d.list();
			
		}
	}

