/**
 * В классе Мейн надо определить и вывести на экран сколько надо долить топлива и его стоимость если маршрут у нас Одесса - Киев
 *
 * + 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
 * + сколько будет стоить полная поездка
 * + остаток топлива в пункте назначения
 *
 * стоимость топлива передавать как аргумент программы ------------------- (33,99 грн. на 26.12.2021)
 */
package HomeWork4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yesNo;                                     //Переключатель, позволяющий вернуться в главное меню
        Car car = new Car();
        float remainder = Car.fuelRemaining(176);  //Остаток топлива в Кривом Озере после заправки до полного бака в Одессе
        float remainder1 = Car.fuelRemaining(150); //Остаток топлива в Жашкове после заправки до полного бака в Кривом Озере
        float remaider2 = Car.fuelRemaining(148);  //Остаток топлива в Киеве после заправки до польного бака в Жашкове
        do {
            System.out.println("""
                    Выберите действие:
                    1 - Информация о заложенном маршруте.
                    2 - Действия на заложенном маршруте.
                    3 - Использовано топлива и его стоимость.
                    4 - Информация о состоянии маршрута в произвольной точке.""");

            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();


            switch (menu) {
                case 1 -> System.out.println("""
                        --------------------------------------------------------------------------------------------
                        | Запланированный маршрут: -------------------- Одесса - Киев.                             |
                        | Общая протяженность маршрута составляет ----- 474 км.                                    |
                        | Запрограммированный автомобиль -------------- Dodge RAM Mega Cab 1500 hemi (5.7 л 4WD)   |
                        | Заложенный расход топлива ------------------- 16.8 л/100 км.                             |
                        | Объём топливного бака ----------------------- 129 л.                                     |
                        | Остаток топлива в баке в начале маршрута ---- 55 л.                                      |
                        |__________________________________________________________________________________________|
                        """);
                case 2 -> {

                    System.out.println("----------------------------------------------------------------------\n" +
                            "| 1) В начале маршрута заправка до полного бака: " + Car.fillTankFull() + " л.             |\n" +
                            "|    На сумму: " + Car.fillTankFull() * Float.parseFloat(args[0]) + " грн.                                          |\n" +
                            "| 2) Остановка 'Кривое Озеро':                                       |\n" +
                            "|    Общее расстояние - 176 км.                                      |\n" +
                            "|    Расстояние от предыдущей остановки - 176 км.                    |");
                    System.out.printf("|    Остаток топлива - %6.2f л.                                     |\n", remainder);
                    System.out.printf("|    Дозаправлено - %6.2f л.                                        |\n", Car.refuel(remainder));
                    System.out.println("""
                            | 3) Остановка 'Жашков':                                             |
                            |    Общее расстояние - 326 км.                                      |
                            |    Расстояние от предыдущей остановки - 150 км.                    |""");
                    System.out.printf("|    Остаток топлива - %6.2f л.                                     |\n", remainder1);
                    System.out.printf("|    Дозаправлено - %6.2f л.                                        |\n", Car.refuel(remainder1));
                    System.out.println("""
                            | 4) Прибытие в конечную точку 'Киев':                               |
                            |    Общее расстояние - 474 км.                                      |
                            |    Расстояние от предыдущей остановки - 148 км.                    |""");
                    System.out.printf("|    Остаток топлива - %6.2f л.                                     |\n", remaider2);
                    System.out.println("|____________________________________________________________________|\n");
                }
                case 3 -> {
                    System.out.println("___________________________________________________\n" +
                            "| 1. Заправка №1 (г. Одесса) - " + Car.fillTankFull() + " л.            |\n" +
                            "|    На сумму - " + Car.fillTankFull() * Float.parseFloat(args[0]) + " грн.                      |");
                    System.out.printf("| 2. Запраква №2 (пгт Кривое Озеро) - %6.2f л.   |\n", Car.refuel(remainder));
                    System.out.printf("|    На сумму - %8.2f  грн.                    |\n", Car.refuel(remainder) * Float.parseFloat(args[0]));
                    System.out.printf("| 3. Заправка №3 (г. Жашков) - %6.2f л.          |\n", Car.refuel(remainder1));
                    System.out.printf("|    На сумму - %8.2f грн.                     |\n", Car.refuel(remainder1) * Float.parseFloat(args[0]));
                    System.out.println("|                                                 |");
                    System.out.printf("| Итого залито топлива: %6.2f л.                 |\n", (Car.fillTankFull() + Car.refuel(remainder) + Car.refuel(remainder1)));
                    System.out.printf("| На общую сумму: %8.2f грн.                   |\n", (Car.fillTankFull() + Car.refuel(remainder) + Car.refuel(remainder1)) * Float.parseFloat(args[0]));
                    System.out.println("|                                                 |");
                    System.out.printf("| Итого использовано топлива: %6.2f л.           |\n", (474 * car.getConsumption() / 100));
                    System.out.printf("| На сумму: %8.2f грн.                         |\n", (474 * car.getConsumption() / 100) * Float.parseFloat(args[0]));
                    System.out.println("|_________________________________________________|\n");
                }
                case 4 -> {
                    System.out.println("Введите точку (в километрах) от начала маршрута: ");
                    float distance = scanner.nextFloat();
                    System.out.println("_________________________________________________________\n");
                    if (distance<0 || distance>474){
                        System.out.println("Вы указали точку за границами маршрута.");
                    }
                    else {
                        if (distance >0 && distance<=176){
                            float gas = Car.fuelRemaining(distance);
                            System.out.printf("В точке %5.1f км остаток топлива в баке - %6.2f л.\nНеобходимо дозаправить %6.2f л.\n", distance, gas, Car.refuel(gas));
                        }
                        else if(distance>176 && distance<=326){
                            float gas = Car.fuelRemaining(distance - 176);
                            System.out.printf("В точке %6.1f км остаток топлива в баке - %6.2f л.\nНеобходимо дозаправить %6.2f л.\n", distance, gas, Car.refuel(gas));
                        }
                        else {
                            float gas = Car.fuelRemaining(distance - 326);
                            System.out.printf("В точке %6.1f км остаток топлива в баке - %6.2f л.\nНеобходимо дозаправить %6.2f л.\n", distance, gas, Car.refuel(gas));
                        }
                        System.out.println("_________________________________________________________\n");
                    }
                }
                default -> System.out.println("Вы выбрали несуществующий пункт меню.");
            }

            System.out.println("Вернуться в меню? (1 - вернуться, 2 - выйти)");
            yesNo = scanner.nextInt();


        } while (yesNo==1);
    }
}
