

public class MergeTwoSortedList {

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

        //creating a dummy node
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);

        //creating a copy of this node to iterate while solving the problem

        ListNode headNode = returnNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                returnNode.next = list1;
                list1 = list1.next;
            } else {
                returnNode.next = list2;
                list2 = list2.next;
            }

            returnNode = returnNode.next;
        }

        //append the remaining list
        if (list1 == null) {
            returnNode.next = list2;
        } else if (list2 == null) {
            returnNode.next = list1;
        }

        return headNode.next;

    }

    public static void main(String[] args) {


        // Create the first sorted linked list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Create the second sorted linked list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode mergedList = mergeTwoLists(list1, list2);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }

    }
}
