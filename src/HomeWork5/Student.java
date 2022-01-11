/**
 * Создать класс, спецификация которого приведена ниже.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * --------------------------------------------------------------------------------------------
 * Student: id, Фамилия, Имя, Отчество, Год рождения, Адрес, Телефон, Факультет, Курс, Группа.
 */

package HomeWork5;

public class Student {
    private static int id = 0;
    private static String lastName = "Иванов";
    private static String firstName = "Иван";
    private static String secondName = "Иванович";
    private static int yearOfBirth = 2000;
    private static String address = "Дерибасовская 1";
    private static String phone = "+380-99-999-99-99";
    private static String faculty = "Народного хозяйства";
    private static byte yearOfStudy = 0;
    private static String group = "ФХТ-14";


    public static int getId() {
        return id;
    }
    public static String getLastName() {
        return lastName;
    }
    public static String getFirstName() {
        return firstName;
    }
    public static String getSecondName() {
        return secondName;
    }
    public static int getYearOfBirth() {
        return yearOfBirth;
    }
    public static String getAddress() {
        return address;
    }
    public static String getPhone() {
        return phone;
    }
    public static String getFaculty() {
        return faculty;
    }
    public static byte getYearOfStudy() {
        return yearOfStudy;
    }
    public static String getGroup() {
        return group;
    }


    public static void setId(int id) {
        Student.id = id;
    }
    public static void setLastName(String lastName) {
        Student.lastName = lastName;
    }
    public static void setFirstName(String firstName) {
        Student.firstName = firstName;
    }
    public static void setSecondName(String secondName) {
        Student.secondName = secondName;
    }
    public static void setYearOfBirth(int yearOfBirth) {
        Student.yearOfBirth = yearOfBirth;
    }
    public static void setAddress(String address) {
        Student.address = address;
    }
    public static void setPhone(String phone) {
        Student.phone = phone;
    }
    public static void setFaculty(String faculty) {
        Student.faculty = faculty;
    }
    public static void setYearOfStudy(byte yearOfStudy) {
        Student.yearOfStudy = yearOfStudy;
    }
    public static void setGroup(String group) {
        Student.group = group;
    }



}
