public class Main {
    public static void main(String[] args) {
        Implementation list = new Implementation();
        //inserting element in linkedlist or addLast
        list.insert(30);
        list.insert(45);
        list.insert(55);
        list.insert(78);
        list.insert(39);
        list.traverse();//traversing in linkedlist
        System.out.println("Performing addFirst");
        list.addFirst(60);
        list.traverse();
        System.out.println(list.getSize());//printing a size of list
        //add on given index
        list.addGivenIndex(40,1);
        list.traverse();
        System.out.println("Size of List : "+list.getSize());
        System.out.println("Removing first Element!");
        list.removeFirst();
        list.traverse();
        System.out.println("Removing Last Element!");
        list.removeLast();
        list.traverse();
        list.search(60);
        System.out.println("Removing Node At given Index!");
        list.removeGivenIndex(5);
        list.traverse();
        list.removeGivenElement(45);
        list.traverse();
        System.out.println("Replacing Value");
        list.replace(55,90);
        list.traverse();
    }
}

