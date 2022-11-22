public class Main {
    public static void main(String[] args) {
//  Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//  Задание 2
        int  clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Вы можете установить приложение");
        }
//  Задание 3
        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " год является високосным.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }
//  Задание 4
        int deliveryDistance = 95;
        int timeDeliveryDays = 1;
        if (deliveryDistance > 0 && deliveryDistance<20 ) {
            System.out.println("Потребуется дней: " + timeDeliveryDays);
        }
        else {
            timeDeliveryDays += (deliveryDistance +20) / 40;
            System.out.println("Потребуется дней: " + timeDeliveryDays);
        }
//  Задание 5
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь/Зима");
                break;
            case 2:
                System.out.println("Февраль/Зима");
                break;
            case 3:
                System.out.println("Март/Весна");
                break;
            case 4:
                System.out.println("Апрель/Весна");
                break;
            case 5:
                System.out.println("Май/Весна");
                break;
            case 6:
                System.out.println("Июнь/Лето");
                break;
            case 7:
                System.out.println("Июль/Лето");
                break;
            case 8:
                System.out.println("Август/Лето");
                break;
            case 9:
                System.out.println("Сентябрь/Осень");
                break;
            case 10:
                System.out.println("Октябрь/Осень");
                break;
            case 11:
                System.out.println("Ноябрь/Осень");
                break;
            case 12:
                System.out.println("Декабрь/Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }
}