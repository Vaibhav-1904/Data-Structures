package DS.LinkedList;
// https://leetcode.com/problems/palindrome-linked-list/
public class MyLinkedList<E>{

    public static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data){
            this.data = data;
            next = null;
        }
    }

    public Node<E> head; //First Node

    public void add(E data){
        Node<E> toAdd = new Node<>(data);
        if(head == null)
            head = toAdd;
        else{
            Node<E> temp = head;
            while(temp.next != null)
                temp = temp.next;

            temp.next = toAdd;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printLinkedList(){
        Node<E> temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void remove(int index){
        Node<E> temp = head;

        if(index == 0)
            head = head.next;
        else{
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next; // Assign null if last element
        }
    }

    public void printReversedLinkedList(Node<E> head){
        Node<E> temp = head;
        if(temp == null)
            return;

        printReversedLinkedList(temp.next);
        System.out.print(temp.data + " ");
    }

//    public MyLinkedList<E> reverse(Node<E> h, MyLinkedList<E> rev){
//
//        Node<E> temp = h;
//
//        while (temp.next != null){
//            temp = temp.next;
//            rev = reverse(temp, rev);
//        }
//        rev.add(temp.data);
//
//        return rev;
//    }

    public MyLinkedList<E> reverse(Node<E> h){
        Node<E> newHead = null;
        MyLinkedList<E> rev = new MyLinkedList<>();
        
        while(h != null){
            Node<E> next = h.next;
            h.next = newHead;
            newHead = h;
            rev.add(newHead.data);
            h = next;
        }
        rev.head = newHead;
        return rev;
    }


    // For Stack Implementations
    public E removeTop(){
        Node<E> toRemove = head;
        head = head.next;
        return toRemove.data;
    }

    public E peekTop(){
        return head.data;
    }

    public void addTop(E e){
        Node<E> head1 = new Node<>(e);
        if (head != null) {
            head1.next = head;
            head = head1;
        }
    }
}
