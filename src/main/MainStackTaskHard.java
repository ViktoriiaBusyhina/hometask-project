package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class MainStackTaskHard {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        boolean answer = true;
        Map<Character, Character> map = new HashMap<>();
        map.put( ')', '(');
        map.put( ']', '[');
        map.put( '}', '{');
        map.put( 'R', 'L');
        map.put( '\\', '/');


        // false или false = false
        //false(0) или(+) true(1) = true(1)
        //true или false = true
        //true или true = true

        //Ленивое условие - если у вас ИЛИ, то он работает до первой правды (true)

        // false и false = false
        //false(0) и(*) true(1) = false
        //true и false = false
        //true и true =  true

        //Ленивое условие - если у вас И, то он работает до первой неправды (false)




        //[)

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (map.containsValue(symbol)) {
                stack.push(symbol);
            }

            if (map.containsKey(symbol)) {
                if ((stack.empty()) || (stack.pop() != map.get(symbol))) {
                    answer = false;
                }
            }
        }

        if (!stack.empty()) {
            answer = false;
        }

        System.out.println(answer);

        //for (int i = 0; i < string.length(); i++) {
        //    char symbol = string.charAt(i);
        //    if (symbol == '(') {
        //        stack.push('(');
        //    }
//
        //    if (symbol == '[') {
        //        stack.push('[');
        //    }
//
        //    if (symbol == ')') {
        //        if (!stack.empty()) {
        //            char old = stack.pop();
        //            if (old != '(') {
        //                answer = false;
        //            }
        //        }
        //        else {
        //            answer = false;
        //        }
        //    }
//
        //    if (symbol == ']') {
        //        if (!stack.empty()) {
        //            char old = stack.pop();
        //            if (old != '[') {
        //                answer = false;
        //            }
        //        }
        //        else {
        //            answer = false;
        //        }
        //    }
        //}
//
        //if (!stack.empty()) {
        //    answer = false;
        //}
//
        //System.out.println(answer);


        //(((())))

        //


        //(,




    }
}
