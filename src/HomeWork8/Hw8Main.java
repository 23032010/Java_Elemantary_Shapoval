package HomeWork8;

public class Hw8Main {
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
//        arrColl.add(6,"Помпенко");
        arrColl.delete("Колесниченко");
//        arrColl.add(15,"Шаповал");
//        arrColl.add("Радованов");
        arrColl.print();
//        arrColl.clear();

        System.out.println("------------------------------------------");
        String get = arrColl.get(7);
        System.out.println(get);

        System.out.println("------------------------------------------");
        boolean contain = arrColl.contain("Джабаров");
        if(contain == false){
            System.out.println("В массиве нету совпадения с этими данными.");
        }
        else{
            System.out.println("Массив содержит такую запись.");
        }

        System.out.println("------------------------------------------");
        String[] mass = new String[10];
        mass[0] = "Гандзюк";
        mass[1] = "Грушко";
        mass[2] = "Дробышева-Яница";
        mass[3] = "Енальев";
        mass[4] = "Кекул";
        mass[5] = "Колесниченко";
        mass[6] = "Овчарук";
        mass[7] = "Недева";
        mass[8] = "Попов";
        mass[9] = "Скараев";

        boolean equals = arrColl.equals(mass);
        if(equals == true){
            System.out.println("Массивы одинаковы");
        }
        else {
            System.out.println("Массивы отличаются");
        }
    }
}
