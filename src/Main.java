public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void leapYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void version(int deviceYear, int clientOS) {
        if (deviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS.");
        } else if (deviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android.");
        }
        if (deviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS.");
        } else if (deviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android.");
        }
    }

    public static void delivery(int distance) {
        if (distance <= 20) {
            System.out.println("Доставка займет 1 день.");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Доставка займет 2 дня.");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Доставка займет 3 дня.");
        } else if (distance > 100) {
            System.out.println("Доставка не осуществлется.");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2018;
        leapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        // clienOS 0 - IOS, 1 - Android
        int clientOS = 0;
        int deviceYear = 2004;
        version(deviceYear, clientOS);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int distance = 20;
        delivery(distance);
    }
}