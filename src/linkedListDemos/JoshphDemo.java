package linkedListDemos;

public class JoshphDemo {

	public static void main(String[] args) {
		CircleList c = new CircleList();
//        c.addBoy(5);
//		
//		c.showBoy();
		c.add(5);
		c.list();
	}
}

class CircleList{
	//first node
	private Jnode first = null;
	
	public void add(int n) {
		//add the node
		if(n < 1) {
			System.out.println("n is not valid");
			return;
		}
		Jnode tmp = null;
		for(int i = 1; i <= n; i++) {
			Jnode n1 = new Jnode(i);
			if(i == 1) {
				first = n1;
				first.setNext(first);
				tmp = first;
			}else {
				n1.setNext(tmp.getNext());
				tmp.setNext(n1);
//				tmp.setNext(first);
				tmp = n1;
			}
		}
	}
	
	public void list() {
		if(first == null) {
			return;
		}
		
		Jnode tmp = first;
		while(true) {
			System.out.println("result: "+tmp.getNo());
			if(tmp.getNext()==first) {
				break;
			}
			tmp = tmp.getNext();	
		}
	}
	
//	private Boy first = null;
//
//	// 添加小孩节点，构建成一个环形的链表
//	public void addBoy(int nums) {
//		// nums 做一个数据校验
//		if (nums < 1) {
//			System.out.println("nums的值不正确");
//			return;
//		}
//		Boy curBoy = null; // 辅助指针，帮助构建环形链表
//		// 使用for来创建我们的环形链表
//		for (int i = 1; i <= nums; i++) {
//			// 根据编号，创建小孩节点
//			Boy boy = new Boy(i);
//			// 如果是第一个小孩
//			if (i == 1) {
//				first = boy;
//				first.setNext(first); // 构成环
//				curBoy = first; // 让curBoy指向第一个小孩
//			} else {
//				curBoy.setNext(boy);//
//				boy.setNext(first);//
//				curBoy = boy;
//			}
//		}
//	}
//
//	// 遍历当前的环形链表
//	public void showBoy() {
//		// 判断链表是否为空
//		if (first == null) {
//			System.out.println("没有任何小孩~~");
//			return;
//		}
//		// 因为first不能动，因此我们仍然使用一个辅助指针完成遍历
//		Boy curBoy = first;
//		while (true) {
//			System.out.printf("小孩的编号 %d \n", curBoy.getNo());
//			if (curBoy.getNext() == first) {// 说明已经遍历完毕
//				break;
//			}
//			curBoy = curBoy.getNext(); // curBoy后移
//		}
//	}

}

class Jnode {
	private int no;
	private Jnode next;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Jnode getNext() {
		return next;
	}
	public void setNext(Jnode next) {
		this.next = next;
	}
	
	public Jnode(int no) {
		this.no = no;
	}
	
}
class Boy {
	private int no;// 编号
	private Boy next; // 指向下一个节点,默认null

	public Boy(int no) {
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Boy getNext() {
		return next;
	}

	public void setNext(Boy next) {
		this.next = next;
	}

}
