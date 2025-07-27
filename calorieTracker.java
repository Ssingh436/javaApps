import java.util.Scanner;

public class calorieTracker {
    public static int getCalorieMaintenance(int weight, int height, int age, String option, String gender) {
        /* Formula from medicinenet.com */
        // Calculate BMR
        double BMR = (gender.equals("M")) ? ((66 + (6.23 * weight) + (12.7 * height)) - (6.8 * age)) :
                ((655 + (4.3 * weight) + (4.7 * height)) - (4.7 * age));
        int maintain;
        // Calculate maintenance calories from BMR based on activity level
        if (option.equals("1")) {
            maintain = (int) (1.2 * BMR);
        } else if (option.equals("2")) {
            maintain = (int) (1.375 * BMR);
        } else if (option.equals("3")) {
            maintain = (int) (1.55 * BMR);
        } else if (option.equals("4")) {;
            maintain = (int) (1.725 * BMR);
        } else if (option.equals("5")) {
            maintain = (int) (1.9 * BMR);
        } else {
            maintain = 0;
        }
        return maintain;
    }

    public static void getCaloricGoal (int maintain) {
        System.out.print("Nothing yet");
    }

    public static void main(String[] args) {
        System.out.println("Enter your weight: ");
        System.out.println("Enter your height: ");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int height = sc.nextInt();
        sc.close();
    }
}


