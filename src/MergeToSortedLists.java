import java.util.LinkedList;

public class MergeToSortedLists {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) {
			return null;
		}
		ListNode temp = new ListNode(0);
		ListNode head = temp;
		temp.next = head;
		int i = 0;
		while (i != 1) {
			if (list1 == null && list2 == null) {
				i = 1;
				return temp.next;
			} else if (list1 == null && list2 != null) {
				head.next = list2;
				i = 1;
			} else if (list2 == null && list1 != null) {
				head.next = list1;
				i = 1;
			} else if (list1.val <= list2.val) {
				ListNode T = new ListNode(list1.val);
				head.next = T;
				head = head.next;
				list1 = list1.next;
			} else {
				ListNode T = new ListNode(list2.val);
				head.next = T;
				head = head.next;
				list2 = list2.next;
			}
		}
		return temp.next;
	}

	public static void Print(ListNode head) {
		while (head.next != null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println(head.val);
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		ListNode list2 = new ListNode(1);
		ListNode list3 = new ListNode(2);
		ListNode list4 = new ListNode(3);
		ListNode list5 = new ListNode(4);
		ListNode list6 = new ListNode(4);
		list1.next = list3;
		list3.next = list5;
		list2.next = list4;
		list4.next = list6;
		ListNode head = mergeTwoLists(list1, list2);
		Print(head);
	}

}
