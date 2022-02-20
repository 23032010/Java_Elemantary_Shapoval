package HomeWork12;

import java.util.ArrayList;

public class ArrCollection implements Collection {

    private String[] arr = new String[10];
    private int count = 0;
    int[] indexes = new int[10];


    @Override
    public boolean add(String o) {                              //Метод добавляет запись в массив на свободное место.

        if (count < arr.length) {                               //Если счётчик не выходит за границы массива,
            arr[count] = o;                                     //то записываем значение в следующую пустую ячейку.
            count++;                                            //увеличиваем счётчик на одну запись.
        }
        else {                                                  //Если же счётчик уже выходит за границы имеющегося массива,
            String[] arr1 = new String[count];                  //то создаём новый массив с количеством элементов на один больше.
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];                               //Копируем все элементы изначального массива в новый массив.
            }
            arr1[arr1.length - 1] = o;                          //Последнему элементу нового массива присваиваем входящее значение,
            count++;                                            //увеличиваем счётчик на одну запись
            arr = arr1;                                         //и приравниваем изначальный массив результирующему массиву.
        }
        if(arr[count-1].equals(o)){                             //Проверяем, если входящие данные действительно были записанны в эту ячейку,
            return true;                                        //то метод возвращает 'true'.
        }
        else{
            return false;                                       //Если запись не была внесена, то метод возвращает 'false'.
        }
    }

    @Override
    public boolean add(int index, String o) {                               //Метод вставляет новое значение в указанную ячейку.
        if(enoughSpace(1, index)) {
            if(index<=count){
                for(int k=count+1; k>index; k--){                               //передвигаем все элементы от конца массива до ячейки с "index"
                    arr[k] = arr[k-1];
                }
                arr[index] = o;                                                 //и записываем входящие данные в необходимую ячейку
                count++;
            }
            else if(index>count){
                arr[index] = o;
                count = index;
            }
        }



//        if(index > arr.length-1){                               //Проверяем введённый "index".
//            String[] arr1 = new String[index+1];                //Если он находится за границами массива, то создаем новый массив с количеством элементо, достаточным, чтобы записать входные данные
//
//            for(int i=0; i<arr.length; i++){                    //Копируем из изначального массива все элементы в новый массив.
//                arr1[i] = arr[i];
//            }
//            arr1[index] = o;                                    //Присваиваем ячейке с необходимым индексом входные данные.
//            arr = arr1;                                         //Приравниваем исходный массив результирующему массиву.
//        }
//        else{                                                   //Если индекс находится в пределах количества элементов массива,
//            if(arr[index]==null){                               //и ячейка с этим индексом пуста,
//                arr[index] = o;                                 //то просто записываем в эту ячейку входные данные.
//            }
//            else{                                               //Если же индекс находится в пределах количества элементов массива, но ячейка с эти индексом не пуста,
//                boolean s = false;
//                int marker = arr.length+1;
//                for(int j=index; j<arr.length; j++){            //то определяем есть ли пустые ячейки до конца массива.
//                    if(arr[j] == null){
//                        s = true;
//                        marker = j;
//                        break;
//                    }
//                }
//                if(s == true){                                  //В случае наличия пустой ячейки до конца массива

//                }
//                else{                                           //В случае отсутствия пустой ячейки до конца массива
//                    String[] arr1 = new String[arr.length+1];   //создаём новый массив на одну ячейку больше.
//
//                    for(int t=0; t< arr.length; t++){           //Копируем все элементы изначального массива в новый массив.
//                        arr1[t] = arr[t];
//                    }
//
//
//                    }
//
//                    arr1[index] = o;                            //и записываем входящие данные в необходимую ячейку.
//
//                    arr = arr1;                                 //Приравниваем исходный массив результирующему массиву.
//                }
//            }
//        }
//        if(count< arr.length) {
//            if(index<count){
//            for (int i = count; i > index; i--) {     //Сдвигаем все элементы от конца массива до элемента с "index"
//                arr[i] = arr[i - 1];
//            }
//            arr[index] = o;
//            count++;
//            }
//        }
//        if(count>=arr.length && index<count);

        return false;
    }

    @Override
    public boolean delete(String o) {                       //Метод удаляет из массива запись и смещает все последующие элементы на один элемент к началу массива

        int numElements = count;                            //Переменная хранящая количество элементов массива.
        boolean s = false;

        for(int i=0; i<numElements; i++){                   //Поочерёдно сравниваем элементы.
            if(!arr[i].equals(o)){                          //Если элемент массива не совпадает, прерываем итеррацию.
                continue;
            }
            else{                                           //Если элемент совпадает,
                for(int j=i; j<numElements-1; j++){         //запускаем новый цикл с места совпадения
                    arr[j] = arr[j+1];                      //и присваиваем текущему элементу значение следующего.
                }
                numElements--;                              //Счётчик количества элементов уменьшаем на один.

                String[] arr1 = new String[numElements];    //Создаём новый массив с уже изменнённым количеством элементов

                for(int k=0; k<numElements; k++){
                    arr1[k] = arr[k];                       //и копируем в него элементы, которые необходимо сохранить.
                }
                arr = arr1;                                 //Приравниваем исходный массив результирующему массиву метода.
                s = true;
                count = numElements;
            }
        }
        return s;
    }

    @Override
    public String get(int index) {                      //Метод возвращает запрашиваемый элемент массива

        if (index<0 || index>= arr.length){             //Проверка допустимости входящего индекса
            String s = "Вы ввели недопустимый индекс.";
            return s;
        }
        else{
            return arr[index];                          //Если индекс находится в допустимом диапазоне, то метод передаёт значение элемента
        }
    }

    @Override
    public boolean contain(String o) {                  //Метод сравнивает входящую строку с элементами массива при совпадении возвращает true.
        boolean s = false;
        for(int i =0; i< arr.length;i++){
            if(o.equals(arr[i])){
                s = true;
                break;
            }
        }
        return s;
    }

    @Override
    public boolean equals(String[] o) {         //Метод проверяет равенство двух массивов
        boolean s = true;
        if(count != o.length){             //Проверка на равенство количества элементов двух массивов
            s = false;
            return s;
        }
        else{
            for(int i=0; i<count; i++){    //Если количество элементов двух массивов одинаковое, то проводится проверка поэлементно
                if(!arr[i].equals(o[i])){       //при первом же несовпадении значений цикл прерывается и метод передаёт значени "false"
                    s = false;
                    break;
                }
            }
            return s;
        }
    }

    @Override
    public boolean clear() {                        //Метод очищает массив
        this.count = 0;
        arr[count] = null;
        return true;
    }

    @Override
    public int size() {                             //Метод возвращает значение количества элементов массива
        return count;
    }

    public void print(){                            //Метод позволяющий вывести массив в консоль.
        for(int i=0; i<count;i++){
            System.out.println(arr[i]);
        }
    }

    public boolean enoughSpace(int numberOfElements, int index){                       //Метод определяет достаточно ли места в массиве для добавления необходимого количества элементов на конкретное место
        if(index<arr.length) {
            if ((arr.length - 1) - count >= numberOfElements) {
                return true;
            } else {
                return false;
            }
        }
        else{                                                                           //Если места не достаточно, то метод увеличивает массив до необходимого размера.
            String[] arr1 = new String[index+1];
            for (int i=0; i<arr.length; i++){
                arr1[i]=arr[i];
            }
            arr = arr1;
            return true;
        }
    }


}
