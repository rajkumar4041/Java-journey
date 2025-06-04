import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class RandomAccessInterf {
  public static void main(String[] args) {
    ArrayList l=new ArrayList();
    LinkedList ll=new LinkedList();

//    collection store copy(cloneable) collection transfer objs(Serializable required)
//    random access(RandomAccess(i))(marked interface)

    System.out.println(l instanceof Serializable); //true
    System.out.println(ll instanceof Serializable); //true
    System.out.println(l instanceof Cloneable); //true
    System.out.println(ll instanceof Cloneable); //true
    System.out.println(l instanceof RandomAccess); //true
    System.out.println(ll instanceof RandomAccess); //false
  }
}
