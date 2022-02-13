package DS.Heap;

public class MaxHeap {

    private static int curSize;
    private static int maxSize;
    private static int[] arr;

    public MaxHeap(){
        curSize = 0;
        maxSize = 100;
        arr = new int[maxSize + 1];
    }

//    // Insert operation --> T = O(log n)
//    // For Inserting N elements T = O(n*log n)
//    void insert(int value) throws Exception{
//        size++;
//        if(size > maxSize)
//            throw new Exception("Heap is Full");
//        int n = size;
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
    static void insert(int value) throws Exception{
        if(curSize > maxSize)
            throw new Exception("Heap is Full");
        arr[++curSize] = value;
        if(curSize > 1)
            heapify(curSize);
    }

    // parent access of a child -> i / 2
    // child access of a parent -> 2*i, 2*i + 1
    static void heapify(int i) {
        int parent = i >> 1; // i / 2
        
        if(parent >= 1) {
            if(arr[i] > arr[parent]){
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
            }
            // Recursively heapify the parent Node.
            heapify(parent);
        }
    }

    public void delete() throws Exception {
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
            if(arr[i] >= Math.max(leftChild, rightChild))
                break;
            int child = (leftChild > rightChild) ? 2*i : 2*i + 1;

            int temp = arr[i];
            arr[i] = arr[child];
            arr[child] = temp;

            i = child;
        }
    }

    void printHeap(){
        System.out.println();
        for(int i = 1; i <= curSize; i++)
            System.out.print(arr[i] + " ");

    }
}
