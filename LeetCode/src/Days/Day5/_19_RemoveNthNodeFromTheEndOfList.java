package Days.Day5;
public class _19_RemoveNthNodeFromTheEndOfList {
    public static void main(String[] args){

    }
    //=====Method 1: My way=====//
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode tmp = head;
        ListNode before = tmp;
        while(tmp != null){
            count++;
            before = tmp;
            tmp = tmp.next;
        }
        tmp = head;
        count -= n;
        if(count == 0){
            return tmp.next;
        }
        while(tmp != null){
            count--;
            if(count == 0){
                ListNode tmp2 = tmp.next;
                tmp.next = tmp2.next;
                tmp2.next = null;
                break;
            }
            tmp = tmp.next;
        }
        return head;
    }

    //======Method 2: Two Pointer=====//
    public ListNode removeNthFromEnd2(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start;
    }
}
