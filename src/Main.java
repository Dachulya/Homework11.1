import java.time.LocalDate;

public class Main {
    public static void leapYear(int year){
        if ((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+"-высокосный год");
        }else {System.out.println(year+"-не высокостный год");}
    }
    public static void operatingSystemYearReleaseDate(int clientOS,int oldAndNew){
        switch (clientOS){
            case 0:
                System.out.println("Устаовите версию приложения для IOS поссылке");
                if (oldAndNew<2015) {
                    System.out.println("Установите упрощённую версию для IOS");}
                break;

            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (oldAndNew<2015) {
                    System.out.println("Установите упрощённую версию для Android");
                }
                break;
        }
    }
    public static void distanceEqualsTime(int deliveryDistance){
        int timeDelivery=1;
        if (deliveryDistance<20){

            System.out.println("Потребуется дней: "+timeDelivery);
        } else if (deliveryDistance>20 && deliveryDistance<60) {
            System.out.println("Потребуется дней: "+(timeDelivery+1));
        }else {
            System.out.println("Потребуется дней: "+(timeDelivery+2));
        }
    }

    public  static void task1(){
        int currentYear = LocalDate.now().getYear();
        leapYear(currentYear);
    }
    public  static void task2(){
        int client=0;
        int releaseDate= LocalDate.now().getYear();
        operatingSystemYearReleaseDate(client,releaseDate);
    }
    public static void task3(){
        int distance=44;
        distanceEqualsTime(distance);
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }}