/**
 * 1. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */

package HomeWork10;

import java.util.ArrayList;
import java.util.HashSet;

public class NoDuplicates {
    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<>();
        lst.add("Гандзюк");
        lst.add("Гандзюк");
        lst.add("Грушко");
        lst.add("Дробышева-Яница");
        lst.add("Енальев");
        lst.add("Кекул");
        lst.add("Колесниченко");
        lst.add("Недева");
        lst.add("Енальев");
        lst.add("Овчарук");
        lst.add("Попов");
        lst.add("Мальцев");
        lst.add("Кекул");
        lst.add("Скараев");
        lst.add("Колесниченко");
        System.out.println("Исходная коллекция имеет вид:");

        for(String s:lst){
            System.out.println(s);
        }
        System.out.println("----------------------------------------------------------------\n");

        System.out.println("После ликвидации дубликатов коллекция имеет вид:\n");
        ArrayList<String> list = noDuplicates(lst);
        for (String val:list){
            System.out.println(val);
        }
    }

    public static ArrayList noDuplicates(ArrayList list){
        return (new ArrayList(new HashSet(list)));
    }
}
