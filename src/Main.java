import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Ex.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number");
        String monthString = scanner.nextLine();
        int month = Integer.parseInt(monthString.trim());

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("It is winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("This is spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("This is summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("This is fall");
        } else System.out.println("This month doesn't exist");
//Ex.2
        String[] musicBands = new String[5];
        musicBands[0] = "Infected Mushrooms ";
        musicBands[1] = "The Down ";
        musicBands[2] = "Crowbar ";
        musicBands[3] = "Onyx ";
        musicBands[4] = "Evol Intent ";
//Ex.3
        int[] firstArray = {1, 2};
        int[] secondArray = {3, 4};
        int[] thirdArray = {5, 6};
        System.out.print(firstArray[0] + " ");
        System.out.println(firstArray[1]);
        System.out.print(secondArray[0] + " ");
        System.out.println(secondArray[1]);
        System.out.print(thirdArray[0] + " ");
        System.out.println(thirdArray[1]);
//ex.4
        Phone phone = new Phone(112, "Nokia", 100);
        phone.showModel();
        phone.callPhone();
    }
}
