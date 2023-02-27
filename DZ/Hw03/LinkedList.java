package DZ.Hw03;

import java.util.Iterator;

public class LinkedList implements Iterable{

    private int count = 0;

    private Node head;

    public LinkedList(){
        head = null;
    }

    public class  Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public int size(){
        return count;
        }


    public void add(int data){
        Node newNode = new Node(data);
        Node currentNode = head;
        if (head == null){
            head = newNode;
            count = 1;
        }
        else {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            count++;
        }
    }
    
    /**
     * Удаление по значению
     * @param data - значение для удаления
     */
    public void remove(int data){
        Node currentNode = head;
        Node previosNode = null;
        while (currentNode.next != null){
            if (currentNode.data == data){
                if (currentNode == head){
                    head = currentNode.next;
                }
                else {
                    previosNode.next = currentNode.next;
                }
            }
            previosNode = currentNode;
            currentNode = currentNode.next;
        }
        count--;
    }

    public void print(){
        Node currentNode = head;
        StringBuilder Ll = new StringBuilder();
        if (head != null){
            Ll.append(head.data);
            Ll.append(" ");
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            Ll.append(currentNode.data);
            Ll.append(" ");
        }
        System.out.println(Ll);
    }

    @Override
    public String toString() {
        return Node.data;
    }

    @Override
    public Iterator<Node> iterator() {
        return new Ll();
    }

    protected class Ll implements Iterator<Node>{
        
        Node currentNode = head;
        private int index =0;

        @Override
        public boolean hasNext() {
            return currentNode.next != null;
        }

        @Override
        public Node next() {
            if (index == 0) {
                index++;
                return currentNode;
            }
            else {
            currentNode = currentNode.next;
            return currentNode;
            }
        }
    }
}