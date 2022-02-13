package DS.Heap;
// https://www.youtube.com/watch?v=UVW0NfG_YWA
public class HeapSort {

    // Below is also a buildHeap function
    // We are using Max Heap for sorting
    public void buildHeap(int[] arr) {
        int n = arr.length;
        // this part is taking O(n) time
        for(int i = n/2; i >= 0; i--) // i from n/2  because rest n/2 are leaf nodes
            heapify(arr, n, i);
        // Now elements in array are in maxHeap form

        // Sorting array in ascending order T->O(nlog n)
        for(int i = n - 1; i > 0; i--) {
            // Sending The Greatest element(root of Max-Heap) to last positions
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0); // Telling to heapify only till ith position,
            // elements are in increasing order on right of current i
        }
    }

    void heapify(int[] arr, int n, int i){
        int parent = i;
        int leftChild = 2*i + 1;
        int rightChild = 2*i + 2;

        // if leftChild child is larger than root
        if(leftChild < n && arr[leftChild] > arr[parent])
            parent = leftChild;
        if(rightChild < n && arr[rightChild] > arr[parent])
            parent = rightChild;

        // If parent is not root, it means parent element is smaller than child nodes
        if(parent != i)
        {
            int temp = arr[i];
            arr[i] = arr[parent];
            arr[parent] = temp;
            // recursively heapify below subtree
            heapify(arr, n, parent);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7 };

        HeapSort h = new HeapSort();
        h.buildHeap(arr);

        for(int i:arr)
            System.out.print(i + " ");

    }
}
