package Test7;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static ListNode<Integer> FindNode(ListNode<Integer> head, int N) {
        /* Your class should be named solution.
         * Don't write main().
         * Don't take input, it is passed as function argument.
         * Don't print output.
         * Taking input and printing output is handled automatically.
         */
//        Set<ListNode<Integer>> visited = new HashSet<ListNode<Integer>>();
//        ListNode<Integer> node = head;
//        ListNode<Integer> temp = head;
//        int res = 0;
//        while(node != null){
//            if(visited.contains(node)){
//                res = node.data;
//            }
//            visited.add(node);
//            node = node.next;
//        }
//        int count = 1;
//        while(temp != null){
//            if(temp.data == res){
//                break;
//            }
//            temp = temp.next;
//            count = count + 1;
//        }
//
//        int target = count - N;
//        ListNode<Integer> result = head;
//
//        int c = 0;
//        while(c <= target){
//            result = result.next;
//            c = c+1;
//        }
//        return result;

        ListNode<Integer> p = head;
        ListNode<Integer> f = head;

        int cnt = 1;

        while(cnt <= N-1){
            f = f.next;
            cnt = cnt + 1;
        }

        while(f.next != null){
            f = f.next;
            p = p.next;
        }

        return p;


    }

    public static ListNode<Integer> FindNodeHelper(ListNode<Integer> head, int N) {
        /* Your class should be named solution.
         * Don't write main().
         * Don't take input, it is passed as function argument.
         * Don't print output.
         * Taking input and printing output is handled automatically.
         */
        ListNode<Integer> temp = head;
        int len = 0;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        if(len < N){
            return null;
        }
        temp = head;

        for(int i = 1; i < len - N + 1; i++){
            temp = temp.next;
        }

        return temp;

    }



}
