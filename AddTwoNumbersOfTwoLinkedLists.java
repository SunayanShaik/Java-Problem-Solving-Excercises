package leetcode.questions.practice;

public class AddTwoNumbersOfTwoLinkedLists {

	ListNode head = null;

	public void push(int item) {

		if (head == null) {
			System.out.println("creating head");
			head = new ListNode(item);
		} else {
			ListNode newNode = new ListNode(item);
			newNode.next = head;
			head = newNode;
		}
	}

	public int pop() {
		int item;

		if (head == null) {
			System.out.println("Empty linked list.");
			return -1;
		} else {
			item = head.val;
			head = head.next;
		}
		return item;

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode p = head;

		ListNode p1 = l1;
		ListNode p2 = l2;
		int carry = 0;
		while (p1 != null && p2 != null) {
			int sum = p1.val + p2.val + carry;
			carry = 0;
			if (sum > 10) {
				carry = sum / 10;
				sum = sum % 10;
			} 
			ListNode newNode = new ListNode(sum);
			p1 = p1.next;
			p2 = p2.next;
		}
		return head.next;
	}

	public void printLinkedList() {
		ListNode tail = head;
		System.out.println("The current llist is : ");
		while (tail != null) {
			System.out.print(tail.val + " ");
			tail = tail.next;
		}
	}

	public static void main(String[] args) {
		AddTwoNumbersOfTwoLinkedLists l1 = new AddTwoNumbersOfTwoLinkedLists();
		l1.push(2);
		l1.push(4);
		l1.push(3);

		AddTwoNumbersOfTwoLinkedLists l2 = new AddTwoNumbersOfTwoLinkedLists();
		l2.push(5);
		l2.push(6);
		l2.push(4);

		addTwoNumbers(l1.head, l2.head);
		AddTwoNumbersOfTwoLinkedLists testObj = new AddTwoNumbersOfTwoLinkedLists();
		testObj.printLinkedList();

	}

}
