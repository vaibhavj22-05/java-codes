import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueueDemo {

    public static void main(String[] args) {

        // -------- STACK IMPLEMENTATION --------
        Stack<Integer> stack = new Stack<>();

        System.out.println("STACK OPERATIONS:");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: " + stack);
        System.out.println("Top element (peek): " + stack.peek());

        stack.pop();
        System.out.println("Stack after pop: " + stack);

        // -------- QUEUE IMPLEMENTATION --------
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("\nQUEUE OPERATIONS:");
        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println("Queue after additions: " + queue);
        System.out.println("Front element (peek): " + queue.peek());

        queue.remove();
        System.out.println("Queue after remove: " + queue);
    }
}