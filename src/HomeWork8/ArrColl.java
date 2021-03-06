/**
 * Класс, который имплементирует интерфейс и реализует все методы для работы программы.
 *
 */

package HomeWork8;

public class ArrColl implements Collection{

    String[] arr = new String[10];


    @Override
    public boolean add(String o) {                              //Метод добавляет запись в массив на свободное место.

        boolean z = false;                                      //Переменная для проверки наличия пустых ячеек в массиве.

        for (int i=0; i< arr.length;i++){                       //Проверяем есть ли в массиве хоть одна пустая ячейка.
            if(arr[i]== null){
                z = true;
                break;
            }
        }

        if(z==false){                                           //Если пустой ячейки не оказалось,
            String[] arr1 = new String[arr.length+1];           //то создаём новый массив на один элемент длиннее.
            for(int i=0; i< arr.length; i++){                   //Копируем в новый массив все элементы исходного массива.
                arr1[i] = arr[i];
            }
            arr1[arr1.length-1] = o;                            //Последнему элементу нового массива присваиваем входящее значение.
            arr = arr1;                                         //Приравниваем исходный массив результирующему массиву метода.
        }

        else{                                                   //Если пустая ячейка была обнаружена,
            for(int i=0; i<arr.length; i++){
                if(arr[i]==null){
                    arr[i] = o;                                 //то присваиваем ей входящее значение.
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public boolean add(int index, String o) {                   //Метод вставляет новое значение в указанную ячейку.

        if(index > arr.length-1){                               //Проверяем введённый "index".
            String[] arr1 = new String[index+1];                //Если он находится за границами массива, то создаем новый массив с количеством элементо, достаточным, чтобы записать входные данные

            for(int i=0; i<arr.length; i++){                    //Копируем из изначального массива все элементы в новый массив.
                arr1[i] = arr[i];
            }
            arr1[index] = o;                                    //Присваиваем ячейке с необходимым индексом входные данные.
            arr = arr1;                                         //Приравниваем исходный массив результирующему массиву.
        }
        else{                                                   //Если индекс находится в пределах количества элементов массива,
            if(arr[index]==null){                               //и ячейка с этим индексом пуста,
                arr[index] = o;                                 //то просто записываем в эту ячейку входные данные.
            }
            else{                                               //Если же индекс находится в пределах количества элементов массива, но ячейка с эти индексом не пуста,
                boolean s = false;
                int marker = arr.length+1;
                for(int j=index; j<arr.length; j++){            //то определяем есть ли пустые ячейки до конца массива.
                    if(arr[j] == null){
                        s = true;
                        marker = j;
                        break;
                    }
                }
                if(s == true){                                  //В случае наличия пустой ячейки до конца массива
                    for(int k=marker; k>index; k--){            //передвигаем все элементы от конца массива до ячейки с "index"
                        arr[k] = arr[k-1];
                    }
                    arr[index] = o;                             //и записываем входящие данные в необходимую ячейку
                }
                else{                                           //В случае отсутствия пустой ячейки до конца массива
                    String[] arr1 = new String[arr.length+1];   //создаём новый массив на одну ячейку больше.

                    for(int t=0; t< arr.length; t++){           //Копируем все элементы изначального массива в новый массив.
                        arr1[t] = arr[t];
                    }

                    for(int i=arr1.length-1; i>index; i--){     //Сдвигаем все элементы от конца массива до элемента с "index"
                        arr1[i] = arr1[i-1];
                    }

                    arr1[index] = o;                            //и записываем входящие данные в необходимую ячейку.

                    arr = arr1;                                 //Приравниваем исходный массив результирующему массиву.
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(String o) {                       //Метод удаляет из массива запись и смещает все последующие элементы на один элемент к началу массива

        int numElements = arr.length;                       //Переменная хранящая количество элементов массива.
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
        if(arr.length != o.length){             //Проверка на равенство количества элементов двух массивов
            s = false;
            return s;
        }
        else{
            for(int i=0; i< arr.length;i++){    //Если количество элементов двух массивов одинаковое, то проводится проверка поэлементно
                if(!arr[i].equals(o[i])){       //при первом же несовпадении значений цикл прерывается и метод передаёт значени "false"
                    s = false;                  //Этот вариант используем если необходимо учитывать порядок элементов массивов
                    break;
                }
            }
            return s;
        }
    }

    @Override
    public boolean clear() {                        //Метод очищает массив
//        arr = new String[10];                     //Вариант, если необходимо вернуть массив в изначальное состояние (10 пустых элементов)

        for(int i=0; i< arr.length; i++){           //Вариант, если размер массива менять не нужно, а нужно только очистить значение ячеек
            arr[i] = null;
        }
        return true;
    }

    @Override
    public int size() {                             //Метод возвращает значение количества элементов массива
        return arr.length;
    }

    public void print(){                            //Метод позволяющий вывести массив в консоль.
        for(String s:arr){
            System.out.println(s);
        }
    }
}

