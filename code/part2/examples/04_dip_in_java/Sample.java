import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers1 = List.of(1, 2, 3);
    Set<Integer> numbers2 = Set.of(1, 2, 3);

    //Think of Collections in languages like Java and C#

    //A collection may have multiple iterators on it at the same time
    Iterator<Integer> iter1 = numbers1.iterator(); //view 1
    Iterator<Integer> iter2 = numbers1.iterator(); //view 2

    System.out.println(iter1.next()); //1
    System.out.println(iter1.next()); //2
    System.out.println("------");
    System.out.println(iter2.next()); //1

    //Our Remote in the lab is much like the Iterator, isn't it?
    //We can have multiple Remotes like the iterators can be multiple
    //for a given collection.

    System.out.println("-----------");

    System.out.println(numbers1.iterator());
    System.out.println(numbers2.iterator());

    //In Java and C#, the iterators are implemented as anonymous inner
    //classes or nested classes of the respective collection classes.
    //In effect, our solution2 for lab 2 is pretty much along the lines
    //of what Java and C# implementations for collections do.
  }
}
