/**
 * Создать интерфейс и его реализацию для выборки данных и вывести эти данные на консоль.
 * a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное  - overTimeInCity
 * b) сведения об абонентах, которые пользовались междугородной связью                      - isTimeOutCity
 * c) сведения об абонентах в алфавитном порядке                                            - alphabetUsers
 * д) сведения об первых 10 абонентов у которых самый большой трафик интернета              - biggestTraffic
 */

package HomeWork6;

public interface Info {
    public boolean overTimeInCity();
    public boolean isTimeOutCity();
    public boolean alphabetUsers();
    public boolean biggestTraffic();
}
