public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        int sal = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000){
            i++;
            total = total + total/100;
            total = total + sal;
            System.out.println("месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2 (){
        int i = 0;
        int r = 11;
        while (i < 10){
            i++;
            System.out.print(i);
        }
        System.out.println();
        while (r > 1){
            r--;
            System.out.print(r);
        }
        System.out.println();
    }
    public static void task3 (){
        int y = 12_000_000;
        int fertility = 17 * 1000;
        int mortality = 8 * 1000;
        int populationGain = fertility - mortality;
        int year = 0;
        while (year < 10){
            year++;
            y = y + populationGain;
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }
    }
    public static void task4 (){
        int initialSum = 15_000;
        int total = 0;
        int month = 0;
        while (total < 12_000_000){
            month++;
            total = total + (total/100) * 7;
            total = total + initialSum;
            System.out.println("месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task5 (){
        int initialSum = 15_000;
        int total = 0;
        int month = 0;
        while (total < 12_000_000){
            month++;
            total = total + (total/100) * 7;
            total = total + initialSum;
            if (month % 6 ==0) {
                System.out.println("месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task6 (){
        int sal = 29000;
        int total = 0;
        int month = 0;
        while (month < 9) {
            month++;
            total = total + total / 100;
            total = total + sal;
            System.out.println("месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task7 (){
        int friday = 7;
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++){
            if (dayNumber % friday == 0) {
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8 (){
        int currentYear = 2017;
        //невозможно получить нужный результат '1896 1975 2054', если использовать нынешний год
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometYear = 79;
        int year = startYear;

        while (year < endYear) {
            year = year + cometYear;
            if (year > 2117)break;
            System.out.println(year);
        }
    }
}