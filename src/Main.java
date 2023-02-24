public class Main {
    public static void sumYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void changeOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static String term(int deliveryDistance) {
        int deliveryTerm = 1;
        if (deliveryDistance > 100) {
            return "Доставка не осуществляется";
        }
        if (deliveryDistance >= 20) {
            deliveryTerm++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTerm++;
        }
        return ("Дней доставки: " + deliveryTerm);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        sumYear(2024);
    }

    public static void task2() {
        System.out.println("Задача 2");
        changeOS(0, 2013);

        }

        public static void task3 () {
            System.out.println("Задача 3");

            System.out.println(term(120));

        }
    }

