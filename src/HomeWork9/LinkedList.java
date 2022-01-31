/**
 * Класс реализующий все методы работы со списком.
 */

package HomeWork9;

import java.util.ArrayList;
import java.util.Collection;

public class LinkedList implements CustomCollection{

    private Link start;
    private Link finish;

    public LinkedList(){
        start = null;
        finish = null;
    }

    @Override
    public boolean add(String str) {                    //Метод добавляет новый элемент списка в конец списка.
        Link newNode = new Link(str);
        if(isEmpty()){                                  //Проверяем на пустоту список. Если пустой,
            start = newNode;                            //то в "start" записываем ссылку на следующий объект.
        }
        else{                                           //Если список не пустой,
            finish.next = newNode;                      //то записываем ссылку на объект в "finish"
            }
        finish = newNode;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {            //Метод добавляет элементы входящего массива в список.
        for(int i=0; i< strArr.length; i++){            //Используя цикл,
            add(strArr[i]);                             //передаём каждый элемент массива в метод "add".
        }
        return true;
    }

    @Override
    public boolean addAll(ArrayList strColl) {          //Метод добавляет элементы входящей коллекции в список.
        for(int i=0; i< strColl.size();i++){            //Используя цикл,
            add((String) strColl.get(i));               //передаём каждый элемент коллекции в метод "add".
        }
        return true;
    }

    @Override
    public boolean delete(int index) {                  //Метод удаляет из списка эемент с указанным индексом.
        Link currentNode = start;
        Link previousNode = null;
        int counter = 0;                                //Для определения индекса объекта списка используем вспомогательную переменную.

        while(currentNode != null){

            if(counter == index){
                if(currentNode == start){
                    start = currentNode.next;
                }
                else{
                    previousNode.next = currentNode.next;
                }
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
            counter++;
        }
        return true;
    }

    @Override
    public boolean delete(String str) {                 //Метод удаляет из списка запись, если хоть один элемент списка соответствует входящим данным.
        Link currentNode = start;
        Link previousNode = null;
        boolean s = false;                              //Переменная, в которую записывается состояние удаления. Если в списке есть соответствующая запись, то переменная становится "true".

        while(currentNode != null){

            if(currentNode.iData == str){
                if(currentNode == start){
                    start = currentNode.next;
                }
                else{
                    previousNode.next = currentNode.next;
                }
                s = true;
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return s;
    }

    @Override
    public String get(int index) {                          //Метод возвращает значение записи, ктороя находится в списке под входящим индексом.
        Link currentNode = start;
        int counter = 0;                                    //Для определения позиции записи в списке используем вспомогательную переменную.

        while(currentNode != null) {

            if (counter == index) {
                return currentNode.iData;
            }
            currentNode = currentNode.next;
            counter++;
        }
        return "В списке отсутствует элемент с таким индексом.";        //Если записи под таким индексом нету, возвращаем сообщение.
    }

    @Override
    public boolean contains(String str) {                       //Метод поэлементно сравнивает записи в списке сщ входящими данными
        Link currentNode = start;

        while(currentNode != null){
            if(currentNode.iData == str){
                return true;                                    //При совпадении возвращает "true".
            }
            currentNode = currentNode.next;
        }
        return false;                                           //Если при прохождении списка не обнаружено ни одного соответствия, возвращает "false".
    }

    @Override
    public boolean clear() {                                    //Метод очищает список путём удаления ссылки на следующий элемент.
        start = null;
        return true;
    }

    @Override
    public int size() {                                         //Метод возвращает количество элементов списка.
        Link currentNode = start;
        int counter = 0;                                        //Для определения количества элементов используем вспомогательную переменную.

        while(currentNode != null) {

            currentNode = currentNode.next;
            counter++;
        }
        return counter;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean compare(ArrayList coll) {                //Метод сравнивает входящую коллекцию и список.
        Link currentNode = start;
        int counter=0;

        while(currentNode != null){                         //Определяем количество элементов в списке.
            counter++;
            currentNode = currentNode.next;
        }

        if(counter!= coll.size()){                          //Если количество элементов списка не совпадает с количеством элементов входящей коллекции,
            return false;                                   //то сразу возвращаем "false".
        }
        else {                                                      //Если количество элементов совпадает, то проводим поэлементное сравнение.
            int j = 0;

            while (currentNode != null) {
                for (int i = j; i < coll.size(); i++) {
                    if (currentNode.iData.equals(coll.get(i))) {
                        break;                                      //Если элементы совпадают, то прерываем итеррацию.
                    } else {
                        return false;                               //При первом же несовпадении элементов возвращаем "false".
                    }
                }
                j++;
                currentNode = currentNode.next;
            }
            return true;                                            //Возвращаем "true", если все элементы совпали.
        }
    }


    public void print(){                                            //Метод выводит в консоль все элементы списка.
        Link currentNode = start;

        if (start != null){
            System.out.println(start.iData);
        }
        while(currentNode.next != null){
            currentNode = currentNode.next;
            System.out.println(currentNode.iData);
        }
    }

    public boolean isEmpty(){                                       //Метод определяет есть ли в списке элементы или он пуст.
        return (start==null);
    }
}
