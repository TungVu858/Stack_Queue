package baitap;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
            stack.push(str.charAt(i));
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean check = false;
        while (!stack.isEmpty()){
            if (queue.remove().equals(stack.pop())){
                check = true;
            }
        }
        if (check){
            System.out.println("Chuỗi : " + str + " là chuỗi palindrome");
        }
        else {
            System.out.println("Chuỗi : " + str + " không là chuỗi palindrome");
        }
    }
}
