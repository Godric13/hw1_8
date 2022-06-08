import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        var year = 2016;
        defineYear(year);

        // Задание 2
        int systemType = 1;
        var phoneOld = 2022;
        determineSystem(systemType, phoneOld);

        //Задание 3
        int deliveryDistance = 1;
        int time = calculateDistance (deliveryDistance);
        System.out.println("Время доставки " + time);

        // System.out.println(time);

    }

    public static void defineYear (int year) {
        if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");}
        else {
            System.out.println(year + " год не является високосным");}
    }
    public static void determineSystem (int systemType, int phoneOld) {
        int currentYear = LocalDate.now().getYear();
        if (systemType == 1) {
            if (phoneOld >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");}
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        } else if (systemType == 0) {
            if (phoneOld >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");}
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }


    }
    public static int calculateDistance (int deliveryDistance) {
        int deliveryTime = 1;
        int minRange = 20;
        int maxRange = 60;
        if (deliveryDistance <= minRange) {
        }

        else if ((deliveryDistance > minRange) && (deliveryDistance <= maxRange)) {
            deliveryTime = deliveryTime + 1;
        }

        else if ((deliveryDistance > minRange + 40) && (deliveryDistance <= maxRange + 40)) {
            deliveryTime = deliveryTime + 2;
        }
        return deliveryTime;
    }

}