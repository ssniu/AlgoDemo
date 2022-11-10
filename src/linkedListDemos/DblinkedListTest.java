package linkedListDemos;

public class DblinkedListTest {

	private DbLinkedList head = new DbLinkedList(0,"");

	public DbLinkedList getHead() {
		return head;
	}

	public void setHead(DbLinkedList head) {
		this.head = head;
	}
	
	public void list() {
		if(head.next == null) {
			return;
		}
		
		DbLinkedList tmp = head.next;
		while(true) {
			if(tmp == null) {
				break;
			}
			System.out.println("list : " + tmp.ind + " : "+ tmp.val);
			tmp = tmp.next;
		}
	}
	
	public void add(DbLinkedList node) {
		DbLinkedList tmp = head;
		while(true) {
			if(tmp.next == null) {
				break;
			}
			tmp = tmp.next;
			
		}
		tmp.next = node;
		node.pre = tmp;
	}
	
    public void update(DbLinkedList node, String s) {
    	if(head.next == null) {
    		return;
    	}
    	DbLinkedList tmp = head.next;
    	boolean flag = false;
    	
    	while(true) {
    		if(tmp == null) {
    			break;
    		}
    		if(tmp.ind == node.ind) {
    			flag = true;
    			break;
    		}
    		tmp = tmp.next;
    	}
    	if(flag) {
    		tmp.val = s;
    	}else {
    		System.out.println("not able to find it");
    	}
    }
    
    public void del(int i) {
    	if(head.next == null) {
    		System.out.println("no elements");
    		return;
    	}
    	DbLinkedList tmp = head.next;
    	boolean flag = false;
    	while(true) {
    		if(tmp == null) {
    			break;
    		}
    		if(tmp.ind == i) {
    			flag = true;
    			break;
    		}
    		tmp = tmp.next;
    	}
    	if(flag) {
    		tmp.pre.next = tmp.next;
    		//if the node is last node
    		if(tmp.next != null) {  
    		tmp.next.pre = tmp.pre;
    		}
    	}else {
    		System.out.println("not found");
    	}
    	
    }
}
