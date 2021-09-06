package DS.Deque;

public class MyDeque<E> {

    public static class node<E>{
        E data;
        node<E> pre, next;

        public node(E data){
            this.data = data;
            this.pre = this.next = null;
        }
    }

    node<E> head,rear;

    public void addToHead(E data){

        node<E> toAdd = new node<>(data);

        if(head == null){
            head = rear = toAdd;
            return;
        }

        head.pre = toAdd;
        toAdd.next = head;
        head = toAdd;

    }

    public void addToTail(E data){

        node<E> toAdd = new node<>(data);

        if(head == null){
            head = rear = toAdd;
            return;
        }

        rear.next = toAdd;
        toAdd.pre = rear;
        rear = toAdd;

    }

    public E removeFromHead(){

        if(head == null)
            return null;

        node<E> temp = head;
        head.next.pre = null;
        head = head.next;

        return temp.data;
    }

    public E removeFromTail(){

        if(head == null)
            return null;

        node<E> temp = rear;
        rear.pre.next = null;
        rear = rear.pre;

        return temp.data;
    }

    void print(node<E> head) {

        node<E> temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp != null);
    }
}
