import java.util.ArrayList;

// collection(I)->List(I)->ArrayList(c)

public class ArrayLIstExp {
  public static void main(String[] args) {
    /**
     * duplicate allowed
     * null allowed
     * insertion order preserved
     */
    ArrayList<Integer> l=new ArrayList<Integer>();
    l.add(10);

    //duplicate allowed
    l.add(20);
    l.add(20);

    //null allowed
    l.add(null);
    //insertion order preserved

    System.out.println("list after add"+l);
    l.add(1,200);
    System.out.println("list after add at index"+l);
    l.remove(1);
    System.out.println("list after add at remove index"+l);
    l.add(1,100);
    System.out.println("list after add at at particular index "+l);
    l.add(300);
    System.out.println("list after add last element"+l);

  }

}
