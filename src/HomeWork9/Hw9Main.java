package HomeWork9;

import java.util.ArrayList;

public class Hw9Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Гандзюк");
        list.add("Грушко");
        list.add("Дробышева-Яница");
        list.add("Енальев");
        list.add("Кекул");
        list.add("Колесниченко");
        list.add("Недева");
        list.add("Овчарук");
        list.add("Попов");
        list.add("Мальцев");
        list.add("Скараев");
        list.print();

        System.out.println("---------------------------------------------------\n");
        boolean v = list.delete("Овчарук");
        if(!v){
            System.out.println("Не удалось удалить элемент");
        }
        else {
            System.out.println("Элемент был успешно удалён.\nНовый список:\n");
            list.print();
        }

        System.out.println("---------------------------------------------------\n");
        String[] arr = {"Яница", "Радованов", "Русов", "Шаповал"};
        list.addAll(arr);
        list.print();

        System.out.println("-----------------------------------------------------\n");
        ArrayList<String> mass = new ArrayList<>();
        mass.add("Франко");
        mass.add("Шевченко");
        mass.add("Симоненко");
        mass.add("Рильський");
        mass.add("Тичина");
        list.addAll(mass);
        list.print();

        System.out.println("---------------------------------------------\n");
        list.delete(5);
        list.print();

        System.out.println("----------------------------------------------\n");
        String s = list.get(12);
        System.out.println("Искомый элемент - это '"+s + "'");

        System.out.println("----------------------------------------------\n");
        boolean c = list.contains("Тичина");
        if(c == true){
            System.out.println("В списке есть совпадение с введёнными данными");
        }
        else {
            System.out.println("В списке не нашлось ни одного элемента, который совпал бы с введёнными данными");
        }

//        System.out.println("-----------------------------------------------\n");
//        list.clear();
//        boolean z = list.isEmpty();
//        if(z==true){
//            System.out.println("Список очищен.");
//        }
//        else{
//            System.out.println("Не удалось очистить список.");
//        }

        System.out.println("-------------------------------------------------\n");
        int counter = list.size();
        System.out.println("В списке содержиться " + counter + " элементов.");

        System.out.println("---------------------------------------------------\n");
        ArrayList<String> mass1 = new ArrayList<>();
        mass1.add("Гандзюк");
        mass1.add("Грушко");
        mass1.add("Дробышева-Яница");
        mass1.add("Енальев");
        mass1.add("Кекул");
        mass1.add("Колесниченко");
        mass1.add("Недева");
        mass1.add("Овчарук");
        mass1.add("Попов");
        mass1.add("Мальцев");
        mass1.add("Скараев");

        boolean x = list.compare(mass1);
        if(x == true){
            System.out.println("Данная коллекция совпадает со списком.");
        }
        else{
            System.out.println("Данная коллекция отличается от связанного списка");
        }
    }
}
