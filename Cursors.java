import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Cursors {
  public static void main(String[] args) {
    Vector v = new Vector();
    v.add(10);
    v.add(20);
    v.add(5);

    /**
     * cursor 1 -> no add/remove (only legacy class)
     */
    Enumeration e = v.elements();
    while (e.hasMoreElements()) {
      System.out.println(e.nextElement());
    }

    /**
     * cursor 2 ->  add moethod (any collection class) iterator method of collection interface
     */
    Iterator itr = v.iterator();
    while (itr.hasNext()) {
      System.out.println("itr" + itr.next());
    }

    /**
     * cursor 3 -> prev->next move remove/add fnc
     */
    ListIterator litr = v.listIterator();
    while (litr.hasNext()) {
      System.out.println("el" +litr.next());

      System.out.println("bakcword nav" +litr.hasPrevious());
      System.out.println("prev el"+litr.previous());

      litr.add(20);
      System.out.println("after add el" +v);

      litr.remove();
      System.out.println("after add el" +v+" itr "+itr);
    }

  }
}
