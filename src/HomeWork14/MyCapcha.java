/**
 * Рисовалка цифр
 *
 * Требуется написать программу на вход будет принимать последовательности цифр,
 * а выводить на экран в псевдографику в одну строчку как в приложении,
 * добавить проверку что все знаки цифры
 */

package HomeWork14;

import java.util.Scanner;

public class MyCapcha {
    public static void main(String[] args) {

        System.out.println("Введите число:");                       //Вводим число с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();



        SignCheckIsDigit signCheck = new SignCheckIsDigit();        //Проверяем является ли введённая строка числом
        boolean isNumeric = signCheck.isNumeric(number);

        if(isNumeric){
            System.out.println("Есть число");
            String [] mass = number.split("");                  //Если строка является числом, то разбиваем её на отдельные цифры

            CreateImagine imagine = new CreateImagine();
            imagine.numbersLikeImagine(mass);
        }
        else {
            System.out.println("Введённая стока не является числом.");
        }


    }
}
