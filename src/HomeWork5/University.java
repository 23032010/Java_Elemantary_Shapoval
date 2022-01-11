/**
 * Создать класс, спецификация которого приведена ниже.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * ----------------------------------------------------------------------------------------
 * Создать массив из 10 объектов.
 *
 * Вывести:
 * a) список студентов заданного факультета; - Факульет
 * b) списки студентов для каждого факультета и курса; - Факультет, Группа
 * c) список студентов, родившихся после заданного года; - Год рождения
 * d) список учебной группы. - Группа
 */

package HomeWork5;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        System.out.println("""
                
                Задание а)
                Введите название факультета для отображения списка студентов
                (Информационные технологии, Автоматизация производства, Филология)""");
        Scanner scanner = new Scanner(System.in);
        String faculty = scanner.nextLine();
        String[] array = new String[10];
        for(int i=0; i<10; i++){
            massive(array, i);
            if(faculty.equals(Student.getFaculty())) System.out.println(array[i]);
        }

        System.out.println("""
                
                Задание b)
                Введите название факультета (Информационные технологии, Автоматизация производства, Филология)\s
                и название группы (АМ-202, АМ-203, АК-201, АК-192, КПС-203) для отображения списка студентов""");
        String yourFaculty = scanner.nextLine();
        String yourGroup = scanner.nextLine();
        String[] yourArray = new String[10];
        for(int i=0; i<10; i++){
            massive(yourArray, i);
            if(yourFaculty.equals(Student.getFaculty()) || yourGroup.equals(Student.getGroup())) System.out.println(yourArray[i]);
        }
        System.out.println("\nЗадание c)\nВведите год, чтобы узнать, кто из студентов родился после него");
        int year = scanner.nextInt();
        String[] newArray = new String[10];
        for(int i=0; i<10; i++){
            massive(newArray, i);
            if(year<Student.getYearOfBirth()) System.out.println(newArray[i]);
        }

        System.out.println("""
                
                Задание d)
                Введите группу, чтобы отобразить список студентов, которые в ней учатся
                (АМ-202, АМ-203, АК-201, АК-192, КПС-203):""");
        String myGroup = scanner.nextLine();
        String[] noArray = new String[10];
        for(int i=0; i<10; i++){
            massive(noArray, i);
            if(myGroup.equals(Student.getGroup())) System.out.println(noArray[i]);
        }

    }

    private static void massive(String[] myArray, int i) {
        if(i==0){
            Student.setId(1);
            Student.setLastName("  Гандзюк ");
            Student.setFirstName("Дмитрий ");
            Student.setSecondName("Витальевич, ");
            Student.setYearOfBirth(2003);
            Student.setAddress("Адрес: Богдана Хмельницкого, 28,  ");
            Student.setPhone("Телефон: +380-68-105-52-21,  ");
            Student.setFaculty("Информационные технологии");
            Student.setYearOfStudy((byte)3);
            Student.setGroup("КПС-203");
        }
        if(i==1){
            Student.setId(2);
            Student.setLastName("  Грушко ");
            Student.setFirstName("Александр ");
            Student.setSecondName("Сергеевич, ");
            Student.setYearOfBirth(2002);
            Student.setAddress("Адрес: Академика Заболотного, 32,  ");
            Student.setPhone("Телефон: +380-97-116-43-71,  ");
            Student.setFaculty("Информационные технологии");
            Student.setYearOfStudy((byte)3);
            Student.setGroup("КПС-203");
        }
        if(i==2){
            Student.setId(3);
            Student.setLastName("  Дробышева-Яница ");
            Student.setFirstName("Арина ");
            Student.setSecondName("Руслановна, ");
            Student.setYearOfBirth(2003);
            Student.setAddress("Адрес: Павла Шклярука, 4а,  ");
            Student.setPhone("Телефон: +380-99-309-72-71,  ");
            Student.setFaculty("Информационные технологии");
            Student.setYearOfStudy((byte)3);
            Student.setGroup("КПС-203");
        }
        if(i==3){
            Student.setId(4);
            Student.setLastName("  Енальев ");
            Student.setFirstName("Иван ");
            Student.setSecondName("Андреевич, ");
            Student.setYearOfBirth(2001);
            Student.setAddress("Адрес: Багрицкого, 18,  ");
            Student.setPhone("Телефон: +380-66-352-43-01,  ");
            Student.setFaculty("Информационные технологии");
            Student.setYearOfStudy((byte)3);
            Student.setGroup("КПС-203");
        }
        if(i==4){
            Student.setId(5);
            Student.setLastName("  Кекул ");
            Student.setFirstName("Кирилл ");
            Student.setSecondName("Александрович, ");
            Student.setYearOfBirth(2000);
            Student.setAddress("Адрес: Вишнёвая, 35,  ");
            Student.setPhone("Телефон: +380-98-401-69-01,  ");
            Student.setFaculty("Автоматизация производства");
            Student.setYearOfStudy((byte)4);
            Student.setGroup("АК-201");
        }
        if(i==5){
            Student.setId(6);
            Student.setLastName("  Колесниченко ");
            Student.setFirstName("Валентин ");
            Student.setSecondName("Александрович, ");
            Student.setYearOfBirth(1998);
            Student.setAddress("Адрес: Добровольского, 14,  ");
            Student.setPhone("Телефон: +380-97-153-16-81,  ");
            Student.setFaculty("Автоматизация производства");
            Student.setYearOfStudy((byte)5);
            Student.setGroup("АК-192");
        }
        if(i==6){
            Student.setId(7);
            Student.setLastName("  Мальцев ");
            Student.setFirstName("Вячеслав ");
            Student.setSecondName("Сергеевич, ");
            Student.setYearOfBirth(2001);
            Student.setAddress("Адрес: Онежская, 46,  ");
            Student.setPhone("Телефон: +380-66-490-90-71,  ");
            Student.setFaculty("Автоматизация производства");
            Student.setYearOfStudy((byte)4);
            Student.setGroup("АК-201");
        }
        if(i==7){
            Student.setId(8);
            Student.setLastName("  Недева ");
            Student.setFirstName("Алина ");
            Student.setSecondName("Алексеевна, ");
            Student.setYearOfBirth(2002);
            Student.setAddress("Адрес: Хуторская, 85,  ");
            Student.setPhone("Телефон: +380-66-893-40-39,  ");
            Student.setFaculty("Филология");
            Student.setYearOfStudy((byte)2);
            Student.setGroup("АМ-203");
        }
        if(i==8){
            Student.setId(9);
            Student.setLastName("  Овчарук ");
            Student.setFirstName("Игорь ");
            Student.setSecondName("Роланович, ");
            Student.setYearOfBirth(2000);
            Student.setAddress("Адрес: Академика Заболотного, 45,  ");
            Student.setPhone("Телефон: +380-66-502-73-31,  ");
            Student.setFaculty("Филология");
            Student.setYearOfStudy((byte)3);
            Student.setGroup("АМ-203");
        }
        if(i==9){
            Student.setId(10);
            Student.setLastName("  Попов ");
            Student.setFirstName("Алексей ");
            Student.setSecondName("Русланович, ");
            Student.setYearOfBirth(1999);
            Student.setAddress("Адрес: Новощепной ряд, 11,  ");
            Student.setPhone("Телефон: +380-96-033-02-21,  ");
            Student.setFaculty("Филология");
            Student.setYearOfStudy((byte)3);
            Student.setGroup("АМ-202");
        }
        myArray[i] = Student.getId()+ Student.getLastName()+ Student.getFirstName()+ Student.getSecondName()
                + Student.getYearOfBirth()+ " г.р., " + Student.getAddress()+ Student.getPhone()+" Факультет: "+ Student.getFaculty()
                +", "+ Student.getYearOfStudy()+"-й курс, Группа: "+ Student.getGroup();
    }
}
