import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            System.out.print("Enter month: ");
            int month = scanner.nextInt();
            System.out.print("Enter day: ");
            int day = scanner.nextInt();

            LocalDate date = LocalDate.of(year,month, day);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
            System.out.println("\n" + date.format(formatter));
            System.out.println(date.getDayOfWeek());
            System.out.println();

//        printWeek(2024,2,28);

    }


    public static void printWeek(int year, int month, int day) {
    LocalDate date = LocalDate.of(year, month, day);
    LocalDate currentDate  = LocalDate.now();


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");

    int offset = date.getDayOfWeek().getValue() % 7 - 1;
    int nextMonthDays = 1;

    System.out.println("\n" + date.format(formatter));
    System.out.println("Mo Tu We Th Fr Sa Su");

    LocalDate datePrev = LocalDate.of(date.minusDays(offset).getYear(), date.minusDays(offset).getMonth(), date.minusDays(offset).getDayOfMonth() );

        for (int i = datePrev.getDayOfMonth(); i < datePrev.getDayOfMonth() + 7; i++) {
            if (datePrev.lengthOfMonth() <= i) {
                System.out.printf("%2d ", nextMonthDays);
                nextMonthDays++;
            }else {
                System.out.printf("%2d ", i);
            }
        }

    }
}
