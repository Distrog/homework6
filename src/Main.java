public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8");
        int monthSavings = 29000;
        int potTotalSavings = 0;
        for (int i = 1; i <= 12; i++) {
            potTotalSavings += monthSavings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + potTotalSavings + " рублей");
        }

        System.out.println("Задача 9");
        float bankTotalSavings = 0;
        for (int i = 1; i <= 12; i++) {
            bankTotalSavings *= 1.01f;
            bankTotalSavings += monthSavings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + bankTotalSavings + " рублей");
        }

        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            System.out.println("2*" + i + "=" + result);
        }
    }
}