
class RotateNodes {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;

        while (true) {

            ListNode kth = prevGroup;

            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            if (kth == null) {
                break;
            }

            ListNode nextGroup = kth.next;

            ListNode prev = nextGroup;
            ListNode curr = prevGroup.next;

            while (curr != nextGroup) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode temp = prevGroup.next;
            prevGroup.next = kth;
            prevGroup = temp;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.val);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        RotateNodes obj = new RotateNodes();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.print("Original List: ");
        printList(head);

        head = obj.reverseKGroup(head, k);

        System.out.print("Reversed List: ");
        printList(head);
    }
}
