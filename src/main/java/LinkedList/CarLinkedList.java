package LinkedList;


import ArrayList.Car;
import ArrayList.CarList;

public class CarLinkedList implements CarList {

    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public Car get(int index) {
        return getNode(index).value;
    }

    @Override
    public void add(Car car) {
        if(size == 0){
            Node node = new Node(null , car , null);
            last = node;
            first = node;

        }else {
            Node secondLast = last;
            last = new Node(secondLast , car , null);
            secondLast.next = last;
        }
        size++;

    }

    @Override
    public void add(Car car, int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if(index == size){
            add(car);
            return;
        }
        Node nextNode = getNode(index);
        Node previousNode = nextNode.previous;
        Node newNode = new Node(previousNode , car , nextNode);
        nextNode.previous = newNode;
        if(previousNode != null){
            previousNode.next = newNode;
        }else{
            first = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(Car car) {
        Node node = first;
        for(int i = 0 ; i < size ; i++){
            if(node.value.equals(car)){
                removeAt(i);
            }else{
                first = node.next;
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        Node node = getNode(index);
        Node nextNode = node.next;
        Node previousNode = node.previous;
        if(nextNode != null){
            nextNode.previous = previousNode;
        }else{
            last = previousNode;
        }
        if(previousNode != null){
            previousNode.next = nextNode;
        }else{
            first = nextNode;
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;

    }
    private Node getNode(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        for(int i = 0 ; i < index; i++){
            node = node.next;
        }
        return node;
    }

    private static class Node{
        private Node previous;
        private Car value;
        private Node next;

        public Node(Node previous , Car value , Node next){
            this.next = next;
            this.previous = previous;
            this.value = value;
        }
    }

}
