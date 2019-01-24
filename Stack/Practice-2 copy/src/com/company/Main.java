package com.company;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int n=1;
        Stack<Integer> stacktest = new Stack<>();
        do {
            System.out.println("1. Push 2.Pop 3.Clear 0. Exit");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            switch (n)
            {
                case 1:
                {
                    stacktest.push(sc.nextInt());
                    System.out.println(stacktest);
                }
                break;
                case 2:
                {
                    stacktest.pop();
                    System.out.println(stacktest);
                }
                break;
                case 3:
                {
                    stacktest.clear();
                    System.out.println(stacktest);
                }
            }
        }
        while (n!=0);

    }
}
