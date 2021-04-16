package demo;

import java.util.HashMap;

public class TwoLinkedListIntersection {
    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        HashMap<ListNode, Boolean> hash = new HashMap<>();

        while(temp1 != null){
            hash.put(temp1, true);
            temp1 = temp1.next;
        }

        while(temp2 != null){
            if(hash.containsKey(temp2)){
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;

    }

}




class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
