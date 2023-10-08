package main.java;

public class Merge2Lists {

//    public static void main(String[] args) {
//        ListNode list1 = new ListNode(
//                1, new ListNode(
//                        2, new ListNode(
//                                4, new ListNode(
//                                        5, null))));
//
//        ListNode list2 = new ListNode(
//                1, new ListNode(
//                3, new ListNode(
//                4, null)));
//
//       ListNode n = new Merge2Lists().mergeTwoLists(list1, list2);
//    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstVal1 = list1;
        ListNode firstVal2 = list2;
        ListNode result = new ListNode();
        ListNode current = result;

        int count = 0;
        while(list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                if (count == 0) {
                    current.val = list2.val;
                }
                else {
                    current.next = new ListNode(list2.val);
                    current = current.next;
                }

                list2 = list2.next;
            }
            else if (list1.val < list2.val) {
                if (count == 0) {
                    current.val = list1.val;
                }
                else {
                    current.next = new ListNode(list1.val);
                    current = current.next;
                }

                list1 = list1.next;
            }
            else {
                if (count == 0) {
                    current.val = list1.val;
                    current.next = new ListNode(list2.val);
                    current = current.next;
                }
                else {
                    current.next = new ListNode(list1.val);
                    current = current.next;
                    current.next = new ListNode(list2.val);
                    current = current.next;
                }

                list1 = list1.next;
                list2 = list2.next;
            }

            count++;
        }

        if (list1 == null && list2 != null) {
            if (firstVal1 == null) {
                current.val = list2.val;
                current.next = list2.next;
            }
            else {
                current.next = list2;
            }
        }
        else if (list2 == null && list1 != null) {
            if (firstVal2 == null) {
                current.val = list1.val;
                current.next = list1.next;
            }
            else {
                current.next = list1;
            }
        }

        return (firstVal1 == null && firstVal2 == null) ? null : result;
    }

//    Preferred solution
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//        if(list1!=null && list2!=null){
//            if(list1.val<list2.val){
//                list1.next=mergeTwoLists(list1.next,list2);
//                return list1;
//            }
//            else{
//                list2.next=mergeTwoLists(list1,list2.next);
//                return list2;
//            }
//        }
//        if(list1==null)
//            return list2;
//        return list1;
//    }


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

}
