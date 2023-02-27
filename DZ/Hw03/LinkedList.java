package DZ.Hw03;

import java.util.Iterator;

public class LinkedList implements Iterable{

    private int count = 0;

    private Node head;

    public LinkedList(){
        head = null;
    }

    public class  Node{
        public  int data;
        public  Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return String.format(this.data);
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
    public Iterator<Node> iterator() {
        return new Ll();
    }

    protected class Ll implements Iterator<Node>{
        
        Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode.next != null;
        }

        @Override
        public Node next() {
            currentNode = currentNode.next;
            return currentNode;
        }
    }
}