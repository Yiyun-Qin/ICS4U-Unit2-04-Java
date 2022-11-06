import java.util.Scanner;
/**
 * This is the standard Main() class starting point.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2020-11-06
 */

final class Main {
  /**
   * Prevent instantiation.
   * Throw an exception IllegalStateException.
   * if this ever is called
   *
   * @throws IllegalStateException
   *
   */

  private Main() {
    throw new IllegalStateException("Cannot be instantiation");
  }

  /**
   * The starting main() function.
   *
   */
  public static void main(final String[] args) {
    MrCoxallStack newStack = new MrCoxallStack();
    Scanner myobj = new Scanner(System.in);
    final String passedNumber1String;
    final String passedNumber2String;
    final String passedNumber3String;
    final int passedNumber1;
    final int passedNumber2;
    final int passedNumber3;
    final String popNumber;
    final String peekNumber;

    System.out.print("Enter the first integer: ");
    passedNumber1String = myobj.next();
    System.out.print("Enter the second integer: ");
    passedNumber2String = myobj.next();
    System.out.print("Enter the third integer: ");
    passedNumber3String = myobj.next();

    try {
      passedNumber1 = Integer.parseInt(passedNumber1String);
      passedNumber2 = Integer.parseInt(passedNumber2String);
      passedNumber3 = Integer.parseInt(passedNumber3String);

      newStack.push(passedNumber1);
      newStack.push(passedNumber2);
      newStack.push(passedNumber3);
      System.out.println("\nThe list now is " + newStack.getStack());
      popNumber = newStack.pop();
      if (popNumber.equals("Nothing in the list!")) {
        System.out.println(popNumber);
      } else {
        System.out.println("The popped number is " + popNumber);
      }
      peekNumber = newStack.peek();
      if (peekNumber.equals("Nothing in the list!")) {
        System.out.println(peekNumber);
      } else {
        System.out.println("\nNow the number on the top is " + peekNumber);
      }
      System.out.println("The list is " + newStack.getStack());
    } catch (Exception e) {
      System.out.println("Invalid number!");
    } finally {
      System.out.println("\nDone.");
    }
  }
}

