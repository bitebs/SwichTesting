package switches;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number of week: ");
        int day = scanner.nextInt();

        String dayOfWeek = getDayOfWeek2(day);
        //String dayOfWeek = "";


        System.out.println(dayOfWeek);
    }

    public static String getDayOfWeek(int day) {
        String dayOfWeek = "";
        if (day == 1) dayOfWeek = "Monday";
        else if (day == 2) dayOfWeek = "Tuesday";
        else if (day == 3) dayOfWeek = "Wednesday";
        return dayOfWeek;
    }

    public static String getDayOfWeek2(int day) {
        String dayOfWeek;
        switch (day) {
            case 1: dayOfWeek="Monday"; break;
            case 2: dayOfWeek="Tuesday"; break;
            case 3: dayOfWeek="Wednesday"; break;
            default: dayOfWeek=""; break;
        }
        return dayOfWeek;
        }
    }

