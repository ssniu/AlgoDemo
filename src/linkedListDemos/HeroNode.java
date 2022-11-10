package linkedListDemos;

public class HeroNode {
	public int ind;
	public int val;
	public HeroNode next;
	
	public HeroNode(int i, int val) {
		this.ind = i;
		this.val = val;
//		this.next = node;
	}

	public int getInd() {
		return ind;
	}

	public void setInd(int ind) {
		this.ind = ind;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public HeroNode getNext() {
		return next;
	}

	public void setNext(HeroNode next) {
		this.next = next;
	}
	

}