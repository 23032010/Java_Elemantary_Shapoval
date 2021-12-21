package HomeWork3;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int[] mass1 = obMass();
        int min = mass1[0];
        System.out.print("Наименьший(-ие) элемент(-ы) массива: ");
        for(int i =0; i< mass1.length; i++) {
            if(min>mass1[i]) min = mass1[i];
        }
        for (int c:mass1){
            if(c == min) System.out.print(c + "  ");
        }
    }

    public static int[] obMass() {
        System.out.println("Введите какой размерности должен быть массив:");
        Scanner scanner = new Scanner(System.in);
        int razm = scanner.nextInt();
        int[] mass = new int[razm];
        System.out.println("Введите элементы массива:");
        for(int i = 0; i< mass.length; i++){
            mass[i] = scanner.nextInt();
        }
        return mass;
    }
}
