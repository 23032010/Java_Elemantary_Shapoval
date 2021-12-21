package HomeWork3;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Введите переменные x и n:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println((int)Math.pow(x,n));
    }
}
