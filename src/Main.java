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
        for (int b = 0; b < 17; b= b +2 ){
            System.out.println("Чётные числа в отрезке от 0 до 17 это: " + b);
        }
        System.out.println("Задание 4");
        for (int c = 10; c >= -10; c--){
            System.out.println("Числа убывают " + c);
        }
    }
}