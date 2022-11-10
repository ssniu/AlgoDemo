package linkedListDemos;

public class MyLinkedList01 {

	public static void main(String[] args) {
		HeroNode head = new HeroNode(0,22);
		HeroNode hero1 = new HeroNode(1,22);
		HeroNode hero2 = new HeroNode(2,33);
		HeroNode hero3 = new HeroNode(3,44);
		HeroNode hero4 = new HeroNode(4,55);
		HeroNode hero5 = new HeroNode(5,66);
		HeroNode hero6 = new HeroNode(6,767);
		
		NodeMethods n = new NodeMethods();
		n.add(head);
		n.add(hero1);
		n.add(hero2);
		n.add(hero3);
		n.add(hero4);
		n.add(hero5);
		n.add(hero6);
		
		n.list();
		n.add2(hero2);
//		n.updateNode(hero6, 26);
//		n.updateNode(hero5, 26);
		
//		n.del(hero1);
//		n.list();
		InterviewQuestion qu = new InterviewQuestion();
		System.out.println("total is: " +qu.getLength(head));
		HeroNode findNode = qu.findKthNode(head, 2);
		System.out.println("find node index: " + findNode.ind + " : " + findNode.val);
		
//		qu.reverseNodes(head);
//		n.list();
		qu.reversePrint(head);
	}
}


