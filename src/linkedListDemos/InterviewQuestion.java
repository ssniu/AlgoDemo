package linkedListDemos;

import java.util.Stack;

public class InterviewQuestion {

	public int getLength(HeroNode head) {
		
		if(head.next == null) {
			return 0;
		}
		int total = 0;
		HeroNode tmp = head.next;
		
		while(tmp != null) {
			total++;
			tmp = tmp.next;
		}
		return total;
	}
	
	public HeroNode findKthNode(HeroNode head, int k) {
		if(head.next == null) {
			return null;
		}
		
		int size = getLength(head);
		if(k <= 0 || k > size) {
			return null;
		}
		HeroNode tmp = head.next;
		for(int i = 0; i<size-k; i++) {
			tmp = tmp.next;	
		}
		return tmp;
	}
	
	public void reverseNodes(HeroNode head) {
		if(head.next == null) {
			return;
		}
		HeroNode tmp = head.next;
		HeroNode nxt = null;//the node next to current node
		HeroNode revHead = new HeroNode(0,0);
		
		while(tmp != null) {
			nxt = tmp.next;//save current node
			tmp.next = revHead.next;//tmp points to revHead.next
			revHead.next = tmp;//revHead point to new added node
			tmp = nxt;//pointer moves forward
			
		}
		
		head.next = revHead.next;
	}
	
	public void reversePrint(HeroNode head) {
		if(head.next == null) {
			return;
		}
		
		Stack<HeroNode> s = new Stack<HeroNode>();
		HeroNode tmp = head.next;
		while(tmp != null) {
			s.push(tmp);
			tmp = tmp.next;
		}
		while(s.size()>0) {
			System.out.println("result: "+s.pop().ind );
		}
		
	}
}
