package DS.Heap;

public class MainHeap {
    public static void main(String[] args) throws Exception{
        MaxHeap max = new MaxHeap();
        max.insert(10);
//        max.delete();
//        max.delete();
        max.insert(5);
        max.insert(2);
        max.insert(15);
        max.insert(4);
        max.insert(20);
        max.printHeap();
        max.delete();
        max.printHeap();
    }
}
