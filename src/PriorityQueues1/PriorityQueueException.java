package PriorityQueues1;

//public class PriorityQueueException extends Exception{
//
//
//}


import java.util.ArrayList;

class PQ {

    private ArrayList<Integer> heap;

    public PQ() {
        heap = new ArrayList<Integer>();
    }
    // Complete this class
    boolean isEmpty() {
        if(heap.size() == 0){
            return true;
        }
        return false;
    }

    int getSize() {
        return heap.size();
    }

    int getMax() throws PriorityQueueException {
        if (isEmpty()) {
            // Throw an exception
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }


    void insert(int element) {

        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1)/2;

        while(childIndex > 0) {
            if (heap.get(childIndex) > heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, heap.get(childIndex));
                childIndex = parentIndex;
                parentIndex = (childIndex - 1)/2;
            }else{
                return;
            }
        }

//        heap.add(element);
//        int childIndex = heap.size() - 1;
//        int parentIndex = (childIndex - 1) / 2;
//
//        while (childIndex > 0) {
//            if (heap.get(childIndex) < heap.get(parentIndex)) {
//                int temp = heap.get(childIndex);
//                heap.set(childIndex, heap.get(parentIndex));
//                heap.set(parentIndex, temp);
//                childIndex = parentIndex;
//                parentIndex = (childIndex - 1) / 2;
//            } else {
//                return;
//            }
//        }

    }

    int removeMax() throws PriorityQueueException {
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        int removed = heap.get(0);
        int ans = removed;

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int parentIndex = 0;
        int leftChildIndex = 2*parentIndex + 1;
        int rightChildIndex = 2*parentIndex + 2;

        while(leftChildIndex < heap.size()) {
            int maxIndex = parentIndex;
            if (heap.get(leftChildIndex) > heap.get(maxIndex)) {
                maxIndex = leftChildIndex;
            }

            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
                maxIndex = rightChildIndex;
            }

            if(maxIndex == parentIndex){
                break;
            }

            int temp = heap.get(maxIndex);
            heap.set(maxIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            parentIndex = maxIndex;
            leftChildIndex = 2*parentIndex+1;
            rightChildIndex = 2*parentIndex+2;
        }

        return ans;


//        int removed = heap.get(0);
//        int ans = removed;
//
//        heap.set(0, heap.get(heap.size() - 1));
//        heap.remove(heap.size() - 1);
//
//        int parentIndex = 0;
//        int leftChildIndex = 2*parentIndex + 1;
//        int rightChildIndex = 2*parentIndex + 2;
//
//        while(leftChildIndex < heap.size()) {
//            int minIndex = parentIndex;
//            if (heap.get(leftChildIndex) < heap.get(minIndex)) {
//                minIndex = leftChildIndex;
//            }
//
//            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
//                minIndex = rightChildIndex;
//            }
//
//            if(minIndex == parentIndex){
//                break;
//            }
//
//            int temp = heap.get(minIndex);
//            heap.set(minIndex, heap.get(parentIndex));
//            heap.set(parentIndex, temp);
//            parentIndex = minIndex;
//            leftChildIndex = 2*parentIndex+1;
//            rightChildIndex = 2*parentIndex+2;
//        }
//
//        return ans;


    }
}

class PriorityQueueException extends Exception {

}