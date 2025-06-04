import java.util.LinkedList;

public class LinkedListExp {
  public static void main(String[] args) {
    LinkedList ll=new LinkedList();
    ll.add(20);
    ll.add("rajkumar");
    ll.add(null);
    System.out.println("base method 1"+ll);
    ll.remove(0);
    ll.set(0,30);
    System.out.println("base method 2"+ll);

    /**
     * base methods of LinkedList Class where general requirement is to convert the ll (LIFO) into stack or queue(FIFO)
     */
    ll.addFirst(100);
    System.out.println("add first"+ll);
    ll.addLast(900);
    System.out.println("add last"+ll);
    ll.removeFirst();
    System.out.println("remove first"+ll);
    ll.removeLast();
    System.out.println("remove last"+ll);
    Object ll1=ll.getFirst();
    System.out.println("get first"+ll1);
    Object ll2=ll.getLast();
    System.out.println("get last"+ll2);
  }
}
