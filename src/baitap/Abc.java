package baitap;

import java.util.Scanner;
import java.util.Stack;

public class Abc {
    public static void main(String[] args) {
        Stack<Integer> stack2 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n phần tử vào mảng : ");
        System.out.print("n = ");
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        System.out.println(stack);
        for (int i = 0; i < n; i++) {
            stack2.push(stack.pop());
        }
        System.out.println(stack2);
        String chuoi = "hello";
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack3 = new Stack<>();
        for (int i = 0; i < chuoi.length(); i++) {
            stack1.push(String.valueOf(chuoi.charAt(i)));
        }
        System.out.println(stack1);
        while (!stack1.isEmpty()){
            stack3.push(stack1.pop());
        }
        System.out.println(stack3);
    }
}
