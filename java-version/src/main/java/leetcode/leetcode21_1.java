package leetcode;

public class leetcode21_1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode answer;

        if(list1.val > list2.val){
            answer = new ListNode(list2.val);
            list2 = list2.next;
        } else {
            answer = new ListNode(list1.val);
            list1 = list1.next;
        }

        ListNode head = answer;

        while (list1 != null && list2 != null){
            if(list1.val > list2.val){
                head.next = list2;
                list2 = list2.next;
            } else {
                head.next = list1;
                list1 = list1.next;
            }

            head = head.next;
        }
        if(list1 == null){
            head.next = list2;
        }
        if (list2 == null) {
            head.next = list1;
        }

        return answer;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
