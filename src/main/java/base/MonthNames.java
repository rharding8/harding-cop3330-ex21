package base;

import java.util.Scanner;

public class MonthNames {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    MonthNames month = new MonthNames();
    int n = month.getNumber();
    System.out.println("The name of the month is " + month.getName(n));
  }

  public int getNumber() {
    System.out.print("Please enter the number of the month: ");
    return input.nextInt();
  }

  public String getName(int n) {
    return switch (n) {
      case 1 -> "January.";
      case 2 -> "February.";
      case 3 -> "March.";
      case 4 -> "April.";
      case 5 -> "May.";
      case 6 -> "June.";
      case 7 -> "July.";
      case 8 -> "August.";
      case 9 -> "September.";
      case 10 -> "October.";
      case 11 -> "November.";
      case 12 -> "December.";
      default -> "Invalid, try again!";
    };
  }
}
