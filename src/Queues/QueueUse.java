package Queues;

public class QueueUse {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        int arr [] = {10,20,30,40};
        for(int elem: arr){
            queue.enqueue(elem);
        }

        while(!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }
    }
}
