public class Node {
    //Node -> data,next(ref of next node)
    private int data;
    private Node next;

    //constructor for Node
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    //getter and setter method for data and reference
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }

}
