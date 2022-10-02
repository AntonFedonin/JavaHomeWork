// 1. Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
// 2. Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.
// 3. *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

package Seminar2;

import java.util.Scanner;

public class Task2 {
    static String GetValue(Scanner scan) {
        String str = scan.nextLine();
        return str;
    }

    static void GetLittleWindow(String str1, String str2) {
        if (str1.contains(str2))
            System.out.println("Есть окно!");
        else
            System.out.println("Совпадений нет!");
    }

    static boolean isRotation(String s1, String s2) {
        return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
    }

    static String revers(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return revers(str.substring(1)) + str.charAt(0);
    }

    static StringBuilder getLine() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            str.append("=");
        }
        return str;
    }

    static long getTime(String str) {
        long start, end;
        for (int i = 0; i < 10001; i++) {
            str += "=";
        }
        start = System.currentTimeMillis();

        str.replace("=", "равно");

        end = System.currentTimeMillis();

        return end - start;
    }

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите тект");
        String str = GetValue(input);
        System.out.println("Введите одно слово ");
        String str2 = GetValue(input);
        GetLittleWindow(str, str2);
        if (isRotation(str, str2))
        System.out.println("Являются");
        else
        System.out.println("Не являются");
        System.out.println(revers(str));
        String nums1 = "3";
        String nums2 = "56";
        StringBuilder res = new StringBuilder();
        res.append(nums1 + "+" + nums2 + "=" + "59" + " " + nums1 + "-" + nums2 + "="
        + "-59" + " " + nums1 + "*"
        + nums2 + "=" + "168");
        System.out.println(res);

        res.insert(res.indexOf("="), "Равно");
        res.deleteCharAt(res.indexOf("="));
        System.out.println(res);
        res.replace(res.indexOf("="), res.indexOf("=") + 1, "Равно");
        res.replace(res.indexOf("="), res.indexOf("=") + 1, "Равно");
        System.out.println(res);

        String timeTest = "";
        
        System.out.println(getTime(timeTest));
        
    }
}