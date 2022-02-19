
/**
 *
 * @author ADMIN
 */
class ListNode {

    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            head.next = removeElements(head.next, val);
            return head.next;
        }
        head.next = removeElements(head.next, val);
        return head;
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode n7 = new ListNode(6, null);
        ListNode n6 = new ListNode(5, n7);
        ListNode n5 = new ListNode(4, n6);
        ListNode n4 = new ListNode(3, n5);
        ListNode n3 = new ListNode(6, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
    }

}
