package stream;

import java.util.Arrays;
import java.util.stream.Stream;


public class Example {
    // Streams: НЕ МЕНЯЮТ ИСТОЧНИК, НАЧИНАЕТ РАБОТАТЬ С ТЕРМИНАЛЬНОГО ОПЕРАТОРА.
    // СОЗДАЕМ СТРИМ - ЧЕ ТО ДЕЛАЕМ - ПРЕОБРАЗУЕМ В НУЖНЫЙ НАМ ТИП ДАННЫХ
    static int[] numbers = {32, 1, 45, 69, 870, 164, 238, 57, 104, 599, 59, 101,
                           2, 12, 121, 14, 4, 5, 6, 1, 45, 69, 870, 164, 238, 57};

    public static void main(String[] args) {
        //map(i) берет по очереди элемент и производит те действия которые указаны в выражении
//        int[] map1 = Arrays.stream(numbers).map(el -> el * 2).toArray();
//        System.out.println(Arrays.toString(map1));

        //filter(i) фильтрует данные
//        int[] filter = Arrays.stream(numbers).filter(el -> el % 2 > 0).toArray();
//        System.out.println(Arrays.toString(filter));

        //forEach(T) проходится по всем элементам и ПОКАЗЫВАЕТ ТО ЧТО НАДО
//        Arrays.stream(numbers).forEach(el -> System.out.print("[" + el / 20 + "]"));

        //reduce(T) на выходе всегда один элемент
        int reduce = Arrays.stream(numbers).reduce((el1, el2) -> el1 * el2).getAsInt();
        System.out.println("\n" + reduce);

        //sorted(i)
        int[] sorted = Arrays.stream(numbers).sorted().toArray();
        System.out.println(Arrays.toString(sorted));

        //chaining
        int chain = Arrays.stream(numbers)
                .filter(el -> el % 2 == 1)
                   .map(el -> {
                       if (el % 5 == 0) {
                           el = el / 5;
                       }
                       return el; })
                .reduce(Integer::sum)
                .getAsInt();
        System.out.println(chain);
        /**
         todo вывести все элементы которые больше 20 и меньше 500,
          каждый элемент ( если он нечетный поделить на 3,
          и оставшиеся перемножить между собой
        **/

        //concat
        Stream<Integer> s1 = Stream.of(reduce);
        Stream<Integer> s2 = Stream.of(chain);
        Stream<Integer> fin = Stream.concat(s1, s2);
        System.out.println("//////////////////////////////////////");
        fin.forEach(System.out::println);

        //distinct(i) возвращает стрим уникальных элементов
        Arrays.stream(numbers).distinct().forEach(System.out::println);

        //count(T) считает количество элементов

        long count = Arrays.stream(numbers).count();
        System.out.println("!!!!!!!"  + count);
        // todo вывести количество всех уникальных элементов
        // todo прочитать про примитивные типы данных, их диапазоны в байтах

        //peek(i) позволяет посмотреть что происходит на этапах chaining
        //todo почитать про peek и написать код с его использованием ТУТ

        //flatMap
        //collect
        //findFirst
        //min max
        //limit
        //skip
        //mapToInt
        //ParallelStream
     }
}