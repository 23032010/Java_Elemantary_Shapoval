package HomeWork3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int i =0;
        do{
            if(i%2 !=0)System.out.print(i + " ");
            i++;
        }while (i<100);

        System.out.println("\nВведите число для вычисления факториала:");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int j = 1;
        int rez = 1;
        do{
            rez = rez*j;
            j++;
        } while(j<=k);
        System.out.println(k + "! = " + rez);
    }
}
