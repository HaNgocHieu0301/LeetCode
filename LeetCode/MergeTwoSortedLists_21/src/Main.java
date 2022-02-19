
/**
 *
 * @author ADMIN
 */
/**
 * Definition for singly-linked list.
 */
class ListNode {

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

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode resNode = res;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                resNode.next = list2;
                list2 = list2.next;
            } else {
                resNode.next = list1;
                list1 = list1.next;
            }
            resNode = resNode.next;
        }
        if (list1 == null) {
            resNode.next = list2;
        } else {
            resNode.next = list1;
        }
        return res.next;
        //=================using recurison
//        if(list1.val <= list2.val){
//            list1.next = mergeTwoLists(list1.next, list2);
//            return list1;
//        }else{
//            list2.next = mergeTwoLists(list1, list2.next);
//            return list2;
//        }
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode node3 = new ListNode(4, null);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node3_ = new ListNode(4, null);
        ListNode node2_ = new ListNode(3, node3_);
        ListNode node1_ = new ListNode(1, node2_);

        s.mergeTwoLists(node1, node1_);
    }

}
