import java.util.Stack;
import java.util.Vector;

public class StackLegacyClass {
  public static void main(String[] args) {
    Stack st= new Stack();

    st.push(1);
    st.push(2);
    st.push(3);
    Vector v=new Vector();
    System.out.println("added el"+st); //[1,2,3]
    System.out.println("peak el"+st.peek());
    st.pop();
    System.out.println("pop el"+st);

    System.out.println("isEmpty el"+ st.isEmpty());

    System.out.println("search return offest"+ st.search(1));
    System.out.println("Search return -1"+ st.search(10));
  }
}
