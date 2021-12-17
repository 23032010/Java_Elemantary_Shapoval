package HomeWork2;

import java.util.Scanner;

public class RundomNumbers {
    public static void main(String[] args) {
        System.out.print("Введите количество чисел, которое Вы будуте использовать для проведения расчётов: ");
        Scanner scanner = new Scanner(System.in);
        int kol = scanner.nextInt();
        int[] mass = new int[kol];
        int average = 0;
        System.out.println("Введите числа для проведения расчётов");
        for(int i=0; i< mass.length; i++){
            mass[i] = scanner.nextInt();
            average = average + mass[i];
        }
        System.out.println("Среднее арифметическое значение введённых чисел: " + average/kol);

    }
}
