package Days.Day5;

public class _876_MiddleOfTheLinkedList {
    public static void main(String[] args){
        ListNode head5 = new ListNode(5);
        ListNode head4 = new ListNode(4, head5);
        ListNode head3 = new ListNode(3, head4);
        ListNode head2 = new ListNode(2, head3);
        ListNode head1 = new ListNode(1, head2);
        System.out.println(middleNode(head1).val);
    }
    //=====Method 1: My Way=====/
    public static ListNode middleNode(ListNode head){
        ListNode tmp = head;
        int count = 0;
        while(tmp != null){
            count++;
            tmp = tmp.next;
        }
        tmp = head;
        int middleIndex = count/2;
        count = 0;
        while(tmp != null){
            if(count == middleIndex){
                return tmp;
            }
            count++;
            tmp = tmp.next;
        }
        return null;
    }

    //=====Method 2: =====/
    public static ListNode middleNode2(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }

    //=====Method 3: Two pointer=====//
    public static ListNode middleNode3(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
