import java.util.List;

import javax.xml.transform.Source;
import java.util.*;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> value = new ArrayList<>();
    Node<String> currentNode = head;

    while(currentNode != null){
      value.add(currentNode.val);
      currentNode = currentNode.next;
    }
     return value;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    Solution.linkedListValues(a); 
    // -> [ "a", "b", "c", "d" ]

    System.out.println(Solution.linkedListValues(a));
  }
}
