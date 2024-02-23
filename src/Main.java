import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        watchTask1();
        watchTask2();
        watchTask3();
    }

    public static void defineLeapYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void determineVersion(int deviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS.");
        } else if (deviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android.");
        }
        if (deviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS.");
        } else if (deviceYear >= currentYear && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android.");
        }
    }

    public static int deliverOrder(int distance) {
        int deliverlyDays = 0;
        if (distance <= 20) {
            deliverlyDays++;
            return deliverlyDays;
        } else if (distance <= 60) {
            deliverlyDays+= 2;
            return deliverlyDays;
        } else if (distance <= 100) {
            deliverlyDays+=3;
            return deliverlyDays;
        }
        return deliverlyDays;
    }

    public static void watchTask1() {
        System.out.println("Задача 1");
        int year = 2018;
        defineLeapYear(year);
    }

    public static void watchTask2() {
        System.out.println("Задача 2");
        // clienOS 0 - IOS, 1 - Android
        int clientOS = 0;
        int deviceYear = 2023;
        determineVersion(deviceYear, clientOS);
    }

    public static void watchTask3() {
        System.out.println("Задача 3");
        int distance = 110;
        int diliverlyDays = deliverOrder(distance);
        if (diliverlyDays == 0) {
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println("Потребуется дней на доставку - " + diliverlyDays);
        }


    }
}