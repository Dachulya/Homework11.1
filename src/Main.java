import java.time.LocalDate;

public class Main {
    private static void findOutLeapYear(int year){
        if ((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+"-высокосный год");
        }else {System.out.println(year+"-не высокостный год");}
    }
    private static void findOutOperatingSystemYearReleaseDate(int clientOS,int oldAndNew){
        int releaseDate= LocalDate.now().getYear();
        if (clientOS==0&&oldAndNew<releaseDate){
            System.out.println("Устаовите старую версию приложения для IOS поссылке");}
        if (clientOS==0&&oldAndNew==releaseDate){
            System.out.println("Устаовите новую версию приложения для IOS поссылке");}
        if (clientOS==1&&oldAndNew<releaseDate){
            System.out.println("Устаовите старую версию приложения для Android поссылке");
        }else {
            System.out.println("Устаовите новую версию приложения для Android поссылке");
        }
        /*
        if (clientOS==0){
            System.out.println("Устаовите версию приложения для IOS поссылке");
            if (oldAndNew<releaseDate) {
                System.out.println("Установите упрощённую версию для IOS");}
        }
        if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
            if (oldAndNew<releaseDate) {
                System.out.println("Установите упрощённую версию для Android");
            }
        }*/
        /*switch (clientOS){
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
        }*/
    }
    private static int calculateDistanceEqualsTime(int deliveryDistance){
        int timeDelivery=1;
        int a=0;
        if (deliveryDistance<20){
            a=timeDelivery;
            //System.out.println("Потребуется дней: "+timeDelivery);
        } else if (deliveryDistance>20 && deliveryDistance<60) {
            a=timeDelivery+1;
            //System.out.println("Потребуется дней: "+(timeDelivery+1));
        }else {
            a=timeDelivery+2;
            //System.out.println("Потребуется дней: "+(timeDelivery+2));
        }
        return a;
    }

    private  static void task1(){
        int currentYear = LocalDate.now().getYear();
        findOutLeapYear(currentYear);
    }
    private  static void task2(){
        int client=1;
        int date=2000;
        findOutOperatingSystemYearReleaseDate(client,date);
    }
    private static void task3(){
        int distance=44;
        System.out.println("Сроки доставки: "+calculateDistanceEqualsTime(distance));

    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }}