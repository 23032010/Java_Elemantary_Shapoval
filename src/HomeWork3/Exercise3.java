package HomeWork3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int i =0;
        while (i<100){
            if(i%2 !=0)System.out.print(i + " ");
            i++;
        }
        System.out.println("\n-------------------------------------\nВведите число для вычисления факториала:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int rez = 1;
        int j = 1;
        while (j<=number){
            rez = rez*j;
            j++;
        }
        System.out.println(number + "! = " + rez);
    }
}
