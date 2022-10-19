package exception;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Executable;

public class Test33 {
    public static Integer sumArray(Integer @NotNull [] nums) {
        Integer sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    public static String greeting(int timeOfDay) {
        //проверка диапазона 0-23
        String message = "";
        if(timeOfDay < 0 || timeOfDay > 23) {
            throw new IncorrectTimeException();
        } else if (timeOfDay >= 5 && timeOfDay < 12) {
            message = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            message = "Good afternoon!";
        } else if(timeOfDay > 18 && timeOfDay < 24){
            message = "Good evening!";
        }
        return message;
    }

    public static int checkMaxAttendees(int level) {
        int maxAttendees = 0;
        switch (level) {
            case 4 -> maxAttendees += 20;
            case 2, 3 -> maxAttendees += 50;
            case 1 -> maxAttendees += 100;
            case 0 -> maxAttendees += 200;
        }
        return maxAttendees;
    }

    public static boolean checkInput(String input) {
        return (input.equalsIgnoreCase("password"));
    }
}