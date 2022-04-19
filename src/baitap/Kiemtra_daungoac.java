package baitap;

import java.util.Scanner;
import java.util.Stack;

public class Kiemtra_daungoac {
    public static void main(String[] args) {
        Stack<String> bstack = new Stack<>();
        Stack<String> left = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("");
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")){
                bstack.push(arr[i]);
            }
            if (arr[i].equals(")")){
                if (bstack.isEmpty()){
                    check = false;
                }else {
                    left.push(bstack.pop());
                    check = true;
                }
            }
            else {
                check = true;
            }
        }
        if (check){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
