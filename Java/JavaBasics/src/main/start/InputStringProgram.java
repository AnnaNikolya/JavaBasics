package main.start;

import java.util.Scanner;

public class InputStringProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("hello " + input);
        int number = scan.nextInt();
        System.out.println(number);
    }
}
