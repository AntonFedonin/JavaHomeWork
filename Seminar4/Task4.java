package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "utf-8");
        Scanner scanner = new Scanner(System.in, encoding);
        ArrayList<Integer> age = new ArrayList<>();
        LinkedList<Integer> id = new LinkedList<>();
        ArrayList<String> name = new ArrayList<>();
        // int numm = scanner.nextInt();
        // String str = scanner.nextLine();
        boolean run = true;

        int count = 0;
        while (run) {
            System.out.println("Введите имя");
            name.add(scanner.nextLine());

            System.out.println("Введите возраст");
            age.add(scanner.nextInt());
            id.add(count);
            count++;
            System.out.println("Хотим ли мы продолжить??");
            scanner.nextLine();
            if (scanner.nextLine().toLowerCase().equals("n")) {
                run = false;
            }
        }

        for (int index = 0; index < id.size(); index++) {
            System.out.print(name.get(id.get(index)) + ", ");
            System.out.print(age.get(id.get(index)) + ", ");
            System.out.println(id.get(index) + " ");
        }
        // Сортируем
        int cnt = id.size() - 1;
        while (cnt > -1) {
            int maxAge = age.get(id.get(cnt));
            int index = cnt;

            for (int i = 0; i < cnt; i++) {
                if (maxAge > age.get(id.get(i))) {
                    index = i;
                    maxAge = age.get(id.get(i));
                }
            }
            int temp = id.get(index);
            id.set(index, id.get(cnt));
            id.remove(cnt);
            id.add(temp);
            cnt--;
        }

        System.out.println("После сортировки");
        for (int index = 0; index < id.size(); index++) {
            System.out.print(name.get(id.get(index)) + ", ");
            System.out.print(age.get(id.get(index)) + ", ");
            System.out.println(id.get(index) + " ");
        }
    }
}