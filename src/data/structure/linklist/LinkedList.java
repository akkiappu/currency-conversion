package data.structure.linklist;

public class LinkedList<E> {

    private class Node<E>{
        private Node node;
        private E data;
        Node(E data, Node next){
            node = next;
            this.data = data;
        }
    }

    private Node head;
    private Node current;

    public boolean add(E e){
        if(head == null){
            head = new Node(e, null);
            current = head;
        } else{
            Node newNode = new Node(e,null);
            current.node = newNode;
            current = newNode;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        LinkedList.Node node =linkedList.head.node;
        while(node!= null){
            System.out.println(node.data);
            node = node.node;
        }
    }
}
