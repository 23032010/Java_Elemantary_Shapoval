package HomeWork3;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Введите число, таблицу умножения которого нужно вывести на экран:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 0; i<11; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}
