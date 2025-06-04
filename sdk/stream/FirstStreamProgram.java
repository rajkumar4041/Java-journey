import java.util.*;
import java.util.stream.*;

public class FirstStreamProgram {
  public void test(){
    List<Integer> l=new ArrayList<Integer>();
    l.add(10);
    l.add(5);
    l.add(9);
    l.add(20);
    l.add(6);

    /**
     * normal adding numbers
     */
    System.out.println(l);


    /**
     * withour Stream in beofre 1.8 onword
     */
    List<Integer> l1=new ArrayList<Integer>();
    for(int el: l){
      if(el%2==0){
        l1.add(el);
      }
    }
    System.out.println("without stream"+l1);

    /**
     * With using stream
     */
    List<Integer> l2=l.stream().filter(el->el%2==0).collect(Collectors.toList());
    System.out.println("with stream"+l2);



  }
}
