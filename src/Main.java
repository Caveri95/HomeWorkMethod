import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int year = 2001;
        leapYearOrNoPrint(year);

        // Задача 2
        int clientDeviceYear = LocalDate.now().getYear();
        int osDevice = 1;                           //0 — iOS или 1 — Android
        needInstallLiteVersionOrNoForAndroidOrIos(clientDeviceYear, osDevice);

        // Задача 3
        int deliveryDistance = 95;
        amountDayDelivery(deliveryDistance);
    }
    public static void leapYearOrNoPrint(int x) {
        if (x % 400 == 0){
            System.out.println(x + " номер года — високосный год");
        } else if (x % 100 == 0) {
            System.out.println(x + " номер года — не високосный год");
        } else if (x % 4 == 0){
            System.out.println(x + " номер года — високосный год");
        } else
            System.out.println(x + " номер года — не високосный год");
    }

    public static void needInstallLiteVersionOrNoForAndroidOrIos(int clientDeviceYear, int system) {
        if (clientDeviceYear >= 2015) {
            System.out.println("Приложение будет работать корректно");
        } else if (system == 0) {
            System.out.println("Приложение будет работать некорректно, установите " +
                    "облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Приложение будет работать некорректно, установите " +
                    "облегченную версию приложения для Android по ссылке");
        }
    }

    public static void amountDayDelivery(int distance) {
        if (distance < 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (distance >= 20 && distance < 60) {
            System.out.println("Потребуется дней: 2");

        }
        if (distance >= 60 && distance < 100) {
            System.out.println("Потребуется дней: 3");
        }

    }





}