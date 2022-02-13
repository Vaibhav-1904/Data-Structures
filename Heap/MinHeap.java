package DS.Heap;

public class MinHeap {
    private int curSize;
    private final int maxSize;
    private final int[] arr;

    public MinHeap() {
        curSize = 0;
        maxSize = 100;
        arr = new int[maxSize + 1]; // 1-based indexing
    }

//    // Insert operation --> T = O(log n)
//    // For Inserting N elements T = O(n*log n)
//    void insert(int value) throws Exception{
//        curSize++;
//        if(curSize > maxSize)
//            throw new Exception("Heap is Full");
//        int n = curSize;
//        arr[n] = value;
//        int i = n;
//
//        //Heapifying
//        while(i > 1){
//            int parent = i>>1;
//            if(arr[parent] >= arr[i])
//                break;
//            int temp = arr[parent];
//            arr[parent] = arr[i];
//            arr[i] = temp;
//            i = parent;
//        }
//    }

    // Below insert and heapify operation take O(n) time for inserting n Nodes
    void insert(int value) throws Exception {
        if(curSize > maxSize)
            throw new Exception("Heap is Full");
        arr[++curSize] = value;
        if(curSize > 1)
            heapify(curSize); // heapify the inserted element
    }
    void heapify(int i) {
        int parent = i >> 1; //divide by 2

        if(parent >= 1) {
            if(arr[parent] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
            }

            // Recursively heapify the parent Node.
            heapify(parent);
        }
    }

    public void delete() throws Exception{
        if(curSize == 0)
            throw new Exception("Heap is Empty");
        arr[1] = arr[curSize]; // Bring rightmost element to the top
        arr[curSize] = 0;
        curSize--;
        int i = 1;
        //Heapify
        while(i < curSize) {
            int leftChild = arr[2*i];
            int rightChild = arr[2*i + 1];
            if(arr[i] <= Math.min(leftChild, rightChild))
                break;
            int child = (leftChild < rightChild) ? 2*i : 2*i + 1;// To swap with MIN(from 2 children)

            int temp = arr[i];
            arr[i] = arr[child];
            arr[child] = temp;

            i = child;
        }
    }

    void printHeap(){
        System.out.println();
        for(int i = 1; i <= curSize; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
