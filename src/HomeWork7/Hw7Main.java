package HomeWork7;

public class Hw7Main {

    public static void main(String[] args) {
        ArrColl arrColl = new ArrColl();

        arrColl.add("Гандзюк");
        arrColl.add("Грушко");
        arrColl.add("Дробышева-Яница");
        arrColl.add("Енальев");
        arrColl.add("Кекул");
        arrColl.add("Колесниченко");
        arrColl.add("Овчарук");
        arrColl.add("Недева");
        arrColl.add("Попов");
        arrColl.add("Скараев");
//        arrColl.print();
//        System.out.println("---------------------------------------------------------------");
//        arrColl.add(6,"Помпенко");
//        arrColl.add("Радованов");
        arrColl.print();
        System.out.println("---------------------------------------------------------------");
        arrColl.delete("Попов");
        arrColl.print();

        System.out.println("---------------------------------------------------------------");
        boolean val = arrColl.delete(3);
        if(val == false){
            System.out.println("Данный индекс выходит за границы допустимых значений. Введите другой индекс.");
        }
        else {
            System.out.println("Элемент успешно удалён\n");
        }
        arrColl.print();

        System.out.println("---------------------------------------------------------------");
        String s = arrColl.get(7);
        System.out.println("По указанному индексу находится элемент:\n" + s);
    }
}
