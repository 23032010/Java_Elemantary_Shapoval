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
        firstTask();
        secondTask();
        thirdsTask();
        fourthTask();
    }


    public static void firstTask(){
        System.out.println("""
                
                Задание а)
                Введите название факультета для отображения списка студентов
                (Информационные технологии, Автоматизация производства, Филология)""");
        Scanner scanner = new Scanner(System.in);
        Student stud = new Student();
        String faculty = scanner.nextLine();
        String[] array = new String[10];

        for(int j=0;j<10;j++){
            studentsData(stud, array, j);
            if(faculty.equals(stud.getFaculty())) System.out.println(array[j]);
            }
        }


    public static void secondTask(){
        System.out.println("""

                Задание b)
                Введите название факультета (Информационные технологии, Автоматизация производства, Филология)\s
                и название группы (АМ-202, АМ-203, АК-201, АК-192, КПС-203) для отображения списка студентов""");
        Scanner scanner = new Scanner(System.in);
        Student stud = new Student();
        String faculty = scanner.nextLine();
        String group = scanner.nextLine();
        String[] array = new String[10];

        for(int j=0; j<10; j++){
            studentsData(stud, array, j);
            if(faculty.equals(stud.getFaculty()) || group.equals(stud.getGroup())) System.out.println(array[j]);
        }
    }


    public static void thirdsTask(){
        System.out.println("\nЗадание c)\nВведите год, чтобы узнать, кто из студентов родился после него");
        Scanner scanner = new Scanner(System.in);
        Student stud = new Student();
        int year = scanner.nextInt();
        String[] array = new String[10];
        for(int j=0; j<10; j++){
            studentsData(stud, array, j);
            if(year<stud.getYearOfBirth()) System.out.println(array[j]);
        }
    }


    public static void fourthTask(){
        System.out.println("""
                
                Задание d)
                Введите группу, чтобы отобразить список студентов, которые в ней учатся
                (АМ-202, АМ-203, АК-201, АК-192, КПС-203):""");
        Scanner scanner = new Scanner(System.in);
        Student stud = new Student();
        String group = scanner.nextLine();
        String[] array = new String[10];
        for(int j=0; j<10; j++){
            studentsData(stud, array, j);
            if(group.equals(stud.getGroup())) System.out.println(array[j]);
        }
    }

    private static void studentsData(Student stud, String[] array, int j) {
        if(j==0){
            stud.setId(1);
            stud.setLastName("  Гандзюк ");
            stud.setFirstName("Дмитрий ");
            stud.setSecondName("Витальевич, ");
            stud.setYearOfBirth(2003);
            stud.setAddress("Адрес: Богдана Хмельницкого, 28,  ");
            stud.setPhone("Телефон: +380-68-105-52-21,  ");
            stud.setFaculty("Информационные технологии");
            stud.setYearOfStudy(3);
            stud.setGroup("КПС-203");
        }
        if(j==1){
            stud.setId(2);
            stud.setLastName("  Грушко ");
            stud.setFirstName("Александр ");
            stud.setSecondName("Сергеевич, ");
            stud.setYearOfBirth(2002);
            stud.setAddress("Адрес: Академика Заболотного, 32,  ");
            stud.setPhone("Телефон: +380-97-116-43-71,  ");
            stud.setFaculty("Информационные технологии");
            stud.setYearOfStudy(3);
            stud.setGroup("КПС-203");
        }
        if(j==2){
            stud.setId(3);
            stud.setLastName("  Дробышева-Яница ");
            stud.setFirstName("Арина ");
            stud.setSecondName("Руслановна, ");
            stud.setYearOfBirth(2003);
            stud.setAddress("Адрес: Павла Шклярука, 4а,  ");
            stud.setPhone("Телефон: +380-99-309-72-71,  ");
            stud.setFaculty("Информационные технологии");
            stud.setYearOfStudy(3);
            stud.setGroup("КПС-203");
        }
        if(j==3){
            stud.setId(4);
            stud.setLastName("  Енальев ");
            stud.setFirstName("Иван ");
            stud.setSecondName("Андреевич, ");
            stud.setYearOfBirth(2001);
            stud.setAddress("Адрес: Багрицкого, 18,  ");
            stud.setPhone("Телефон: +380-66-352-43-01,  ");
            stud.setFaculty("Информационные технологии");
            stud.setYearOfStudy(3);
            stud.setGroup("КПС-203");
        }
        if(j==4){
            stud.setId(5);
            stud.setLastName("  Кекул ");
            stud.setFirstName("Кирилл ");
            stud.setSecondName("Александрович, ");
            stud.setYearOfBirth(2000);
            stud.setAddress("Адрес: Вишнёвая, 35,  ");
            stud.setPhone("Телефон: +380-98-401-69-01,  ");
            stud.setFaculty("Автоматизация производства");
            stud.setYearOfStudy(4);
            stud.setGroup("АК-201");
        }
        if(j==5){
            stud.setId(6);
            stud.setLastName("  Колесниченко ");
            stud.setFirstName("Валентин ");
            stud.setSecondName("Александрович, ");
            stud.setYearOfBirth(1998);
            stud.setAddress("Адрес: Добровольского, 14,  ");
            stud.setPhone("Телефон: +380-97-153-16-81,  ");
            stud.setFaculty("Автоматизация производства");
            stud.setYearOfStudy(5);
            stud.setGroup("АК-192");
        }
        if(j==6){
            stud.setId(7);
            stud.setLastName("  Мальцев ");
            stud.setFirstName("Вячеслав ");
            stud.setSecondName("Сергеевич, ");
            stud.setYearOfBirth(2001);
            stud.setAddress("Адрес: Онежская, 46,  ");
            stud.setPhone("Телефон: +380-66-490-90-71,  ");
            stud.setFaculty("Автоматизация производства");
            stud.setYearOfStudy(4);
            stud.setGroup("АК-201");
        }
        if(j==7){
            stud.setId(8);
            stud.setLastName("  Недева ");
            stud.setFirstName("Алина ");
            stud.setSecondName("Алексеевна, ");
            stud.setYearOfBirth(2002);
            stud.setAddress("Адрес: Хуторская, 85,  ");
            stud.setPhone("Телефон: +380-66-893-40-39,  ");
            stud.setFaculty("Филология");
            stud.setYearOfStudy(2);
            stud.setGroup("АМ-203");
        }
        if(j==8){
            stud.setId(9);
            stud.setLastName("  Овчарук ");
            stud.setFirstName("Игорь ");
            stud.setSecondName("Роланович, ");
            stud.setYearOfBirth(2000);
            stud.setAddress("Адрес: Академика Заболотного, 45,  ");
            stud.setPhone("Телефон: +380-66-502-73-31,  ");
            stud.setFaculty("Филология");
            stud.setYearOfStudy(3);
            stud.setGroup("АМ-203");
        }
        if(j==9){
            stud.setId(10);
            stud.setLastName("  Попов ");
            stud.setFirstName("Алексей ");
            stud.setSecondName("Русланович, ");
            stud.setYearOfBirth(1999);
            stud.setAddress("Адрес: Новощепной ряд, 11,  ");
            stud.setPhone("Телефон: +380-96-033-02-21,  ");
            stud.setFaculty("Филология");
            stud.setYearOfStudy(3);
            stud.setGroup("АМ-202");
        }
        array[j] = stud.getId()+ stud.getLastName()+ stud.getFirstName()+ stud.getSecondName()
                + stud.getYearOfBirth()+ " г.р., " + stud.getAddress()+ stud.getPhone()+" Факультет: "+ stud.getFaculty()
                +", "+ stud.getYearOfStudy()+"-й курс, Группа: "+ stud.getGroup();
    }

}
