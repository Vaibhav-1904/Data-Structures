package DS.Heap;

public class HeapSort {

    // Below is also a buildHeap function
    public void sort(int[] arr){
        int n = arr.length;
        for(int i = n>>1; i >= 0; i--)
            heapify(arr, n, i);

        // Now elements in array are in maxHeap form

        for(int i = n - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i;
        int right = 2*i + 1;

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
        h.sort(arr);

        for(int i:arr)
            System.out.print(i + " ");

    }
}
