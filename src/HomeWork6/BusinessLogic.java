/**
 * Класс, который имплементирует интерфейс Info.
 *
 */

package HomeWork6;

import java.util.Scanner;

public class BusinessLogic implements Info {

        Person [] users = new Person[10];

        public boolean add(Person o) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = o;
                break;
            }
        }
        return true;
        }

        @Override
        public boolean overTimeInCity () {
            System.out.println("Введите время городских разговоров:");
            Scanner scanner = new Scanner(System.in);
            int time = scanner.nextInt();
            System.out.println("Пользователи, у которых время городских разговоров превышает указанное Вами:");
            for (Person s : users) {
                if (s.getTimeInCity() > time) {
                    System.out.println(s);
                }
            }
            return true;
        }

        @Override
        public boolean isTimeOutCity () {
            System.out.println("---------------------------------------------------------------\n");
            System.out.println("Пользователи, у которых были проведены междугородние переговоры");
            for (Person s : users) {
                if (s.getTimeOutCity() > 0) {
                    System.out.println(s);
                }
            }
            return true;
        }

        @Override
        public boolean alphabetUsers () {
            System.out.println("---------------------------------------------------------------\n");
            Person buf;
            for(int i=users.length-1;i>0; i--){
                for(int j=0;j<i;j++){
                    String[] symbol = users[j].getLastName().split("");
                    String[] symbol1 = users[j+1].getLastName().split("");
                    if(symbol[0].compareTo(symbol1[0])>0){
                        buf=users[j];
                        users[j] = users[j+1];
                        users[j+1] = buf;
                    }
                }
            }
            System.out.println("В алфавитном порядке фамилии пользователей располагаются так:");
            for(Person s:users){
                System.out.println(s);
            }
            return true;
        }

        @Override
        public boolean biggestTraffic () {
            System.out.println("---------------------------------------------------------------\n");
            Person buf;
            for(int i=users.length-1;i>0; i--){
                for(int j=0;j<i;j++){
                    if(users[j].getTraffic()<users[j+1].getTraffic()){
                        buf=users[j];
                        users[j] = users[j+1];
                        users[j+1] = buf;
                    }
                }
            }
            System.out.println("По количеству использованого трафика пользователи располагаются так:");
            for(Person s:users){
                System.out.println(s);
            }
            return true;
        }
}
