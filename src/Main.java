public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задание 2");
        for (int a = 10; a >= 1; a--) {
            System.out.println("Итерация цикла " + a);
        }
        System.out.println("Задание 3");
        for (int b = 0; b < 17; b = b + 2) {
            System.out.println("Чётные числа в отрезке от 0 до 17 это: " + b);
        }
        System.out.println("Задание 4");
        for (int c = 10; c >= -10; c--) {
            System.out.println("Числа убывают " + c);
        }
        System.out.println("Задание 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является вискосным");
            }
        }
        System.out.println("Задание 6");
        for (int h = 7; h <= 98; h = h + 7) {
            System.out.print(h + " ");
        }
        System.out.println ();
        System.out.println("Задание 7");
        for (int d = 1; d <= 512; d = d * 2) {
            System.out.print(d + " ");}
            System.out.println ();

        System.out.println("Задание 8");
        int saving = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + saving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание 9");
        int saving1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + saving1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
    }
}