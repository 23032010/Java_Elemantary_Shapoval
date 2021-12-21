package HomeWork3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Введите число для вычисления факториала: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int rez = 1;
        for(int i =1; i<=number; i++){
            rez = rez*i;
        }
        System.out.println(rez);
    }
}
