/**
 * Класс, имплементирующий интерфейс Iterator
 */

package HomeWork10;
import HomeWork8.ArrColl;
import java.util.Iterator;

public class MyIterator implements Iterator<String> {

    private ArrColl list = new ArrColl();                       //Коллекция, с которой работает Итератор.
    private int currentSize;                                    //Количество элементов входящей коллекции.
    private int currentIndex;                                   //Текущий индекс элемента.

    public MyIterator(ArrColl list){                            //Конструктор, который принимает на вход коллекцию.
        this.list = list;
        this.currentSize = list.size();
        currentIndex = 0;
    }

    public MyIterator(){                                        //Конструктор по умолчанию.
    }

    @Override
    public boolean hasNext() {                                  //Метод определяет есть ли у коллекции следующий элемент
        return currentIndex < currentSize;
    }

    @Override
    public String next() {                                      //Метод возвращает значение следующего элемента
        return list.get(currentIndex++);
    }
}
