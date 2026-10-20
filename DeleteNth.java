class DeleteNth {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
            int sz = 0;
            ListNode temp = head;
            while(temp!=null){
                temp = temp.next;
                sz++;
            }
            if(n==sz){
                head = head.next;
                return head;
            }
            int i = 1;
            int iToFind = sz-n;
            ListNode prev = head;
            while(i<iToFind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return head;
        
    }
    public void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        DeleteNth obj = new DeleteNth();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        obj.printList(head);

        int n = 2; 
        ListNode modifiedHead = obj.removeNthFromEnd(head, n);

        System.out.println("Linked List after removing " + n + "th node from the end:");
        obj.printList(modifiedHead);
    }
}