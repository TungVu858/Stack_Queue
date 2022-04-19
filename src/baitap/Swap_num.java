package baitap;

import java.util.Scanner;
import java.util.Stack;

public class Swap_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số : ");
        int num = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
