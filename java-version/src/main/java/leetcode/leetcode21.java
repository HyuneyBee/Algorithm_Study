package leetcode;

public class leetcode21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode origin;

        if(list1.val <= list2.val){
            origin = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            origin = new ListNode(list2.val);
            list2 = list2.next;
        }

        ListNode current = origin;

        while (list1 != null || list2 != null){
            if(list1 == null){
                current.next = list2;
                break;
            } else if (list2 == null) {
                current.next = list1;
                break;
            }

            if(list1.val <= list2.val){
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }

        return current;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
