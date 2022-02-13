/**
 * Класс проводит проверку, являются ли введённые пользователем данные числом.
 */

package HomeWork14;

public class SignCheckIsDigit {
    public static boolean isNumeric(String s) throws NumberFormatException {

        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}