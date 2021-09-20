package DS.Heap;

public class HeapSort {

    // Below is also a buildHeap function
    // We are using Max Heap for sorting
    public void buildHeap(int[] arr){
        int n = arr.length;
        for(int i = n>>1; i >= 0; i--)
            heapify(arr, n, i);
        // Now elements in array are in maxHeap form

        // Soring array in ascending order
        for(int i = n - 1; i > 0; i--){
            // Sending The Greatest element(root of Max-Heap) to last positions
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0); // Telling to heapify only till ith position elements are in increasing order on right of current i
        }
    }

    void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        // if left child is larger than root
        if(left < n && arr[left] > arr[largest])
            largest = left;
        if(right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if(largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            // recursively heapify below subtree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        HeapSort h = new HeapSort();
        h.buildHeap(arr);

        for(int i:arr)
            System.out.print(i + " ");

    }
}
