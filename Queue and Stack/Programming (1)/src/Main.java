import java.util.*;

public class Main {

  public static void main(String[] args) {

    Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
    queue.removeFirst();
    queue.removeFirst();
    queue.add(5);
    //write your code here


    System.out.println(queue);

  }
}