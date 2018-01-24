import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class P041 {
  public static void main(String[] args) {
    System.out.println("# Stack");
    Stack stk = new Stack();
    stk.push(2);
    stk.push(3);
    stk.push(4);
    System.out.println(stk);
    Object ret1 = stk.pop();
    System.out.println(ret1);
    System.out.println(stk);

    System.out.println("\n# Queue");
    Queue que = new LinkedList();
    que.add(2);
    que.add(3);
    que.add(4);
    System.out.println(que);
    Object ret2 = que.poll();
    System.out.println(ret2);
    System.out.println(que);
  }
}
