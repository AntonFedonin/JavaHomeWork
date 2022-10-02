// 1.Создайте новый список массивов, добавить несколько цветов (строку) и вывести коллекцию на экран.
// 2.Проитерируйте все элементы списка цветов и добавте к каждому символа '!'.
// 3.Напишите программу для вставки элемента в список массивов в первой позиции.
// 4.Извлеките элемент (по указанному индексу) из заданного списка.
// 5.Обновите элемент массива по заданному индексу.
// 6.Напишите программу для удаления третьего элемента из списка массивов.
// 7.Напишите программу для поиска элемента в списке массивов.
// 8.*Напишите программу для сортировки заданного списка массивов.
// 9.*Напишите программу для копирования одного списка массивов в другой.

package Seminar3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        // Создаём список с цветами
        ArrayList<String> list = new ArrayList<>();
        list.add("Красый");
        list.add("Оранжевый");
        list.add("Жёлтый");
        list.add("Зелёный");
        list.add("Голубой");
        list.add("Синий");
        list.add("Фиолетовый");
        // Вывожу на экран
        System.out.println(list);
        // Добавим к цветам символ "!"
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            temp += "!";
            list.set(i, temp);
        }
        System.out.println(list);
        // Добавим элемент в на первую позицию списка.
        list.add(0, "Новый эллемент");
        System.out.println(list);
        // Извлекаем элемент с указаным индексом
        System.out.println(list.get(3));
        // Обновляем элемент
        list.set(4,"Обновление");
        System.out.println(list);
        // Удалим третий элемент списка
        list.remove(3);
        System.out.println(list);
        // Найдём, если я правильно понял условие, индекс элемента
        System.out.println(list.indexOf("Синий!"));
        // Отсортируем список
        list.sort(null); 
        // Правда я не сильно понял по какому принципу идёт сортировка
        System.out.println(list);
        // Скопируем массив
        ArrayList <String> copyList=(ArrayList<String>)list.clone();
        System.out.println(copyList);
    }

}
