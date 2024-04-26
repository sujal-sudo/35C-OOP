package Week3;


import java.util.Scanner;
public class SeasonIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month
        System.out.print("Enter the month (1 to 12): ");
        int month = scanner.nextInt();

        // Determine season based on the month
        String season;
        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
        }

        System.out.println("The season corresponding to month " + month + " is: " + season);

        scanner.close();
    }
}
