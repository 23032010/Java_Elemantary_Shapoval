/**
 * 2. Написать итератор по коллекции реализованной в ДЗ №8 -
 * https://lms.ithillel.ua/groups/610d561a59df53758f7cb446/lessons/610d561a59df53758f7cb463 -
 *
 * надо заимплементить интерфейс Iterator
 */

package HomeWork10;

import HomeWork8.ArrColl;

public class IterMain {
    public static void main(String[] args) {
        ArrColl col = new ArrColl();
        col.add("Гандзюк");
        col.add("Грушко");
        col.add("Дробышева-Яница");
        col.add("Енальев");
        col.add("Кекул");
        col.add("Колесниченко");
        col.add("Овчарук");
        col.add("Недева");
        col.add("Попов");
        col.add("Скараев");



        MyIterator iter = new MyIterator(col);
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
