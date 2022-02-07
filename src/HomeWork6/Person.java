/**
 * Класс, содержащий поля с информацией о пользователе
 * id                                   - id
 * Фамилия                              - lastName
 * Имя                                  - firstName
 * Отчество                             - secondName
 * Адрес                                - address
 * Номер телефона                       - phone
 * Номер кредитной карты                - creditCardNumber
 * Дебет                                - debit
 * Кредит                               - credit
 * Время городских разговоров           - timeInCity
 * Время междугородних переговоров      - timeOutCity
 * Трафик интернета                     - traffic
 */

package HomeWork6;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private String secondName;
    private String address;
    private String phone;
    private String creditCardNumber;
    private double debit;
    private double credit;
    private int timeInCity;
    private int timeOutCity;
    private int traffic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getTimeInCity() {
        return timeInCity;
    }

    public void setTimeInCity(int timeInCity) {
        this.timeInCity = timeInCity;
    }

    public int getTimeOutCity() {
        return timeOutCity;
    }

    public void setTimeOutCity(int timeOutCity) {
        this.timeOutCity = timeOutCity;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    @Override
    public String toString() {
        return "Пользователь: " +
                "id: " + id +
                ", lastName: '" + lastName + '\'' +
                ", firstName: '" + firstName + '\'' +
                ", secondName: '" + secondName + '\'' +
                ", address: '" + address + '\'' +
                ", phone: '" + phone + '\'' +
                ", creditCardNumber: '" + creditCardNumber + '\'' +
                ", debit: " + debit +
                ", credit: " + credit +
                ", timeInCity: " + timeInCity +
                ", timeOutCity: " + timeOutCity +
                ", traffic: " + traffic +
                '}';
    }

    public Person(int id, String lastName, String firstName, String secondName, String address,String phone, String creditCardNumber, double debit, double credit, int timeInCity, int timeOutCity, int traffic ){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.phone = phone;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
        this.credit = credit;
        this.timeInCity = timeInCity;
        this.timeOutCity = timeOutCity;
        this.traffic = traffic;
    }

    public Person(){
    }


}
