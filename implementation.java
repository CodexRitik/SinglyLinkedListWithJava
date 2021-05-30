public class implementation {
    private Node head;
    private int size;

    //constructor
    public singlylinkedlist(){
        head = null;
        size = 0;
    }
    //isEmpty() method
    boolean isEmpty(){
        return head == null;
        //or we may use size == 0
    }
    //size() of linkedlist.
    public int getSize(){
        return size;
    }
    //insert at First
    public void addFirst(int element){
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
        }else{
            Node temp = head;
            head = node;
            node.setNext(temp);
        }
        size++;
    }
    //insertion in linkedlist or addLast
    public void insert(int element){
        Node node = new Node(element);
        if(!isEmpty()){
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }else{
            head = node;
        }
        size++;
    }
    //insert at given index
    public void addGivenIndex(int element,int index){
        Node node = new Node(element);
        if(index>=1){
            if(index==1){
                addFirst(element);
            }
            else if(index==size+1){
                insert(element);
            }
            else if(index<=size){
                Node temp = head;
                for (int i = 1; i < index-1; i++) {
                    temp=temp.getNext();
                }
                node.setNext(temp.getNext());
                temp.setNext(node);
                size++;

            }
        }
        else{
            System.out.println("Cannot Add element at Negative Index!");
        }
    }

    //remove at first
    public void removeFirst(){
        if(!isEmpty()){
            Node temp = head;
            head = temp.getNext();
            size--;
        }
        else{
            System.out.println("Empty LinkedList!");
        }
    }
    //remove at Last
    public void removeLast(){
        if(!isEmpty()){
            Node temp = head;
            while(temp.getNext().getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(null);
            size--;
        }
        else{
            System.out.println("Empty LinkedList!");
        }
    }
    //remove given node
    public void removeGivenIndex(int index){
        Node temp = head;
        if(index>=1 && index<=size){
            if(index==1){
                removeFirst();
            }
            else if(index==size){
                removeLast();
            }
            else{
                for (int i = 1; i < index-1; i++) {
                    temp = temp.getNext();
                }
                Node ref = temp.getNext().getNext();
                temp.setNext(null);
                size--;
                temp.setNext(ref);

            }
        }
    }
    //remove given element
    public void removeGivenElement(int element){
        if(!isEmpty()){
          Node temp = head;
          if(temp.getData()==element){
              removeFirst();
              System.out.println("Element Removed!");
          }
          else{
              while(temp.getNext().getData()!=element){
                  temp=temp.getNext();
              }
              Node ref = temp.getNext().getNext();
              temp.setNext(null);
              size--;
              temp.setNext(ref);
              System.out.println("Element Removed!");
          }
        }
        else{
            System.out.println("LinkedList is Empty!");
        }
    }
    //Traversing in linkedlist
    public void traverse(){
        if(!isEmpty()){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.getData()+",");
                temp = temp.getNext();
            }
            System.out.println();
        }
        else{
            System.out.println("LinkedList is Empty!");
        }
    }
    //searching in LinkedList
    public void search(int element){
        Node temp = head;
        boolean res = false;
        while(temp!=null){
            if(temp.getData() == element){
                res = true;
                break;
            }
            temp=temp.getNext();
        }
        if(res){
            System.out.println("Element Found!");
        }
        else{
            System.out.println("Not Found!");
        }
    }
    //replace given value with given element value
    public void replace(int element,int value){
        if(!isEmpty()){
            Node temp = head;
            while(temp!=null){
                if(temp.getData()==element){
                    temp.setData(value);
                }
                temp = temp.getNext();
            }
        }
        else{
            System.out.println("LinkedList is Empty!");
        }
    }


}
