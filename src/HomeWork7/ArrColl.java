/**
 * Реализовать простую коллекцию для String на базе массива.
 *
 * Реализовать следующие методы для работы с коллекцией:
 * 1. public boolean add(int index, String value);          - Добавить запись в ячейку с указанным индексом
 * 2. public boolean add(String value);                     - Добавить запись в первую свободную ячейку
 * 3. public boolean delete(int index);                     - Удалить запись из ячейки с указанным индексом
 * 4. public boolean delete(String value);                  - Удалить запись, которая соответстует заданной
 * 5. public String get(int index);                         - Получить запись из ячейки с указанным индексом.
 */
package HomeWork7;

public class ArrColl {

    String[] arr = new String[10];

    public boolean add(int index, String value) {               //Метод вставляет новое значение в указанную ячейку.

        if(index > arr.length-1){                               //Проверяем введённый "index".
            String[] arr1 = new String[index+1];                //Если он находится за границами массива, то создаем новый массив с количеством элементо, достаточным, чтобы записать входные данные

            for(int i=0; i<arr.length; i++){                    //Копируем из изначального массива все элементы в новый массив.
                arr1[i] = arr[i];
            }
            arr1[index] = value;                                //Присваиваем ячейке с необходимым индексом входные данные.
            arr = arr1;                                         //Приравниваем исходный массив результирующему массиву.
        }
        else{                                                   //Если индекс находится в пределах количества элементов массива,
            if(arr[index]==null){                               //и ячейка с этим индексом пуста,
                arr[index] = value;                             //то просто записываем в эту ячейку входные данные.
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
                    arr[index] = value;                         //и записываем входящие данные в необходимую ячейку
                }
                else{                                           //В случае отсутствия пустой ячейки до конца массива
                    String[] arr1 = new String[arr.length+1];   //создаём новый массив на одну ячейку больше.

                    for(int t=0; t< arr.length; t++){           //Копируем все элементы изначального массива в новый массив.
                        arr1[t] = arr[t];
                    }

                    for(int i=arr1.length-1; i>index; i--){     //Сдвигаем все элементы от конца массива до элемента с "index"
                        arr1[i] = arr1[i-1];
                    }

                    arr1[index] = value;                        //и записываем входящие данные в необходимую ячейку.

                    arr = arr1;                                 //Приравниваем исходный массив результирующему массиву.
                }
            }
        }
        return true;
    }

    public boolean add(String value) {                          //Метод добавляет запись в массив на свободное место.

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
            arr1[arr1.length-1] = value;                        //Последнему элементу нового массива присваиваем входящее значение.
            arr = arr1;                                         //Приравниваем исходный массив результирующему массиву метода.
        }

        else{                                                   //Если пустая ячейка была обнаружена,
            for(int i=0; i<arr.length; i++){
                if(arr[i]==null){
                    arr[i] = value;                             //то присваиваем ей входящее значение.
                    break;
                }
            }
        }
        return true;
    }

    public boolean delete(int index) {                          //Метод удаляет из массива запись, расположенную по указанному индексу и смещает все последующие элементы на один элемент к началу массива.

        if(index<0 || index>arr.length-1){                      //Если индекс находится за границами количества элементов массива,
            return  false;                                      //то метод возвращает значение "false".
        }
        else{                                                   //Если индекс находится внутри массива,
            for(int i=index; i<arr.length-1; i++){
                arr[i] = arr[i+1];                              //то копируем в ячейку с адресом "index" значение следующей за ней ячейки.
            }
            String[] arr1 = new String[arr.length-1];           //Создаём новый массив с размерностью на один меньше, чем изначальный массив.

            for(int j=0; j<arr1.length; j++){                   //Копируем все элементы изначального массива в новый массив
                arr1[j] = arr[j];                               //(за исключением последнего элеммента, который уже скопирован в предпоследнюю ячейку).
            }
            arr = arr1;                                         //Приравниваем исходный массив результирующему массиву метода.
            return true;
        }
    }

    public boolean delete(String value) {                   //Метод удаляет из массива запись и смещает все последующие элементы на один элемент к началу массива

        int numElements = arr.length;                       //Переменная хранящая количество элементов массива.
        boolean s = false;

        for(int i=0; i<numElements; i++){                   //Поочерёдно сравниваем элементы.
            if(!arr[i].equals(value) || arr[i]==null){                      //Если элемент массива не совпадает, прерываем итеррацию.
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

    public String get(int index) {                      //Метод возвращает запрашиваемый элемент массива

        if (index<0 || index>= arr.length){             //Проверка допустимости входящего индекса
            String s = "Вы ввели недопустимый индекс.";
            return s;
        }
        else{
            return arr[index];                          //Если индекс находится в допустимом диапазоне, то метод передаёт значение элемента
        }
    }

    public void print(){                            //Метод позволяющий вывести массив в консоль.
        for(String s:arr){
            System.out.println(s);
        }
    }
}