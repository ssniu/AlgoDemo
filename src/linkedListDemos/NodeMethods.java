package linkedListDemos;

import java.util.Stack;

public class NodeMethods{
	HeroNode head = new HeroNode(0,0);
	
	public void add(HeroNode node) {
		HeroNode tmp = head;
		
		while(true) {
			if(tmp.next == null) break;
			tmp = tmp.next;
		}
		tmp.next = node;
	}
	
	public void list() {
		if(head.next == null) {
			return;
		}
		HeroNode tmp = head.next;
		while(true) {
			if(tmp == null) {
				break;
			}
			System.out.println("result list is: " +
			tmp.getInd() + " : " + tmp.getVal());
			tmp = tmp.next;
		}
	}
	public void add2(HeroNode node) {
		HeroNode tmp = head;
		boolean flag = false;
		
		while(true) {
			if(tmp.next==null) {
				break;
			}
			if(tmp.next.ind > node.ind) {
				break;
			}else if(tmp.next.ind == node.ind) {
				flag = true;
				break;
			}
			tmp = tmp.next;
		}
		if(!flag) {
			node.next = tmp.next;
			tmp.next = node;
		}else {
			System.out.println(node.ind + " node already exists");
		}
	}
	
	public void updateNode(HeroNode node, int i) {
		if(head.next == null) {
			return;
		}
		HeroNode tmp = head.next;
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
			tmp.val = i;
		}else {
			System.out.println("not able to find it");
		}
	}
	
	public void del(HeroNode node) {
		if(head.next == null) return;
		
		HeroNode tmp = head;
		boolean flag = false;
		while(true) {
			if(tmp.next == null) {
				break;
			}
			if(tmp.next.ind == node.ind) {
				flag = true;
				break;
			}
			tmp = tmp.next;
		}

		if(flag) {
			tmp.next = tmp.next.next;
			
		}else {
			System.out.println("no node " + node.ind);
		}
	}
	
	
}
