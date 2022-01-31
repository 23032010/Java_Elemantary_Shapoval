/**
 * Интерфейс на основе которого необходимо реализовать коллекцию Связанного списка.
 */

package HomeWork9;


import java.util.ArrayList;
import java.util.Collection;

public interface CustomCollection {

    boolean add(String str);

    boolean addAll(String[] strArr);

    boolean addAll(ArrayList strColl);

    boolean delete (int index);

    boolean delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean compare(ArrayList coll);
}
