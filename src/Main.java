import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2022;
        checkYear (year);
        int yearPhone = 2022;
        int OS = 1;
        checkOS (OS, yearPhone);
        checkDelivert (deliveryTime);
        int deliveryDistance = 95;
        int timeDelivery = calcDeliveryTime (deliveryDistance);
        if (timeDelivery == 1){
            System.out.println("Потребуется дней доставки" + timeDelivery);
        } else if (timeDelivery <= 2){
            System.out.println("Потребуется дней доставки" + timeDelivery);
        } else {
            System.out.println("Потребуется дней доставки" + timeDelivery);
        }
        }

     public static void checkYear (int checkYear){
        int  calc = checkYear % 400 % 100 % 4;
        if (calc == 0){
            System.out.println(checkYear + "год является високосным");
        } else {
            System.out.println(checkYear + "год не является високосным");
        }
     }

     public static void checkOS (int OS, int yearOS){
        int currentYear = LocalDate.now().getYear();
        if (OS == 0 && yearOS <= currentYear){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 0 && yearOS > currentYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 1 && yearOS <= currentYear){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS == 1 && yearOS > currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
     }

     public static void calcDeliveryTime (int distance){
        int timeDelivery = 0;
        if (distance <= 20){
            timeDelivery = 1;
            return timeDelivery;
        } else if (distance <= 60){
            timeDelivery = 2;
            return timeDelivery;
        } else {
             timeDelivery = 3;
             return timeDelivery;
        }
     }
}