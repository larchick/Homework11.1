import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2020;
        boolean yearLeap = isYearLeap(year);
        System.out.println("Год = " + year + ", результат = " + yearLeap);

        System.out.println("Задание 2");
        determineTypeOC(0, 2015);

        System.out.println("Задание 3");
        int distance = 70;
        int time = calculateTime(distance);
        System.out.println("Потребуется дней: " + time + ", для дистанции " + distance);
    }


    public static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void determineTypeOC(int type, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (type == 0) {
            if (deviceYear < currentYear) {
                System.out.println("ios, light");
            } else {
                System.out.println("ios, normal");
            }

        } else if (type == 1) {
            if (deviceYear < currentYear) {
                System.out.println("android, light");
            } else {
                System.out.println("android, normal");
            }
        }

    }

    public static int calculateTime(int distance) {

        if (distance <= 0 || distance > 100) {
            return -1;
        }

        int time = 1;

        if (distance >= 20) {
            ++time;
        }
        if (distance >= 60) {
            ++time;
        }

        return time;

    }
}





