package main;

import java.util.PriorityQueue;
import java.util.Stack;

public class MainQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(15);
        queue.add(34);

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("-----------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(15);
        stack.add(34);

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());



        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
