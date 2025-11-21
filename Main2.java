//package com.tgdajay;
import java.util.*;

public class Main2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read name
    System.out.println("Enter name");
    String name = sc.nextLine();
    System.out.println("Name: " + name);

    // Sum of two numbers
    System.out.print("a = ");
    int a = sc.nextInt();
    System.out.print("b = ");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("Sum = " + sum);

    // IF ELSE: age check
    System.out.print("Age = ");
    int age = sc.nextInt();
    if (age > 18) {
      System.out.println("Adult");
    } else {
      System.out.println("bacha");
    }

    // Odd or even
    System.out.print("Enter value to check odd/even x = ");
    int x = sc.nextInt();
    if (x % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    // Compare two numbers
    System.out.println("a is greater or b is lesser or equal");
    System.out.print("a = ");
    int a2 = sc.nextInt();
    System.out.print("b = ");
    int b2 = sc.nextInt();
    if (a2 == b2) {
      System.out.println("equally");
    } else if (a2 > b2) {
      System.out.println("a is greater");
    } else {
      System.out.println("b is lesser");
    }

    // Button input with if/else and switch
    System.out.println("Click the button (1, 2 or 3):");
    System.out.print("button = ");
    int button = sc.nextInt();

    if (button == 1) {
      System.out.println("1 number once more");
    } else if (button == 2) {
      System.out.println("modi humse jyada to nhi hi kamata hoga or hoga to 2 number ka dhenda kar rha hoga");
    } else if (button == 3) {
      System.out.println("tin bhai thino thabhai 🔥");
    } else {
      System.out.println("idher ko dekh ke baat kar bhai 👀");
    }

    System.out.println("Switch on button:");
    switch (button) {
      case 1:
        System.out.println("hellooooo how are you ");
        break;
      case 2:
        System.out.println("modi to gayga lekin 2026 me dunia khatam hai");
        break;
      case 3:
        System.out.println("tin pati");
        break;
      default:
        System.out.println("👀👀👀👀👀");
        break;
    }

    // Calculator examples
    System.out.println("Calculator demo - enter two numbers for each operation");

    System.out.print("a = ");
    int ca = sc.nextInt();
    System.out.print("b = ");
    int cb = sc.nextInt();
    System.out.println("Sum = " + (ca + cb));

    System.out.print("a = ");
    ca = sc.nextInt();
    System.out.print("b = ");
    cb = sc.nextInt();
    System.out.println("Difference = " + (ca - cb));

    System.out.print("a = ");
    ca = sc.nextInt();
    System.out.print("b = ");
    cb = sc.nextInt();
    System.out.println("Product = " + (ca * cb));

    System.out.print("a = ");
    ca = sc.nextInt();
    System.out.print("b = ");
    cb = sc.nextInt();
    if (cb != 0) {
      System.out.println("Quotient = " + (ca / cb));
    } else {
      System.out.println("Cannot divide by zero");
    }

    System.out.print("a = ");
    ca = sc.nextInt();
    System.out.print("b = ");
    cb = sc.nextInt();
    if (cb != 0) {
      System.out.println("Remainder = " + (ca % cb));
    } else {
      System.out.println("Cannot modulo by zero");
    }

    // Month name from number
    System.out.print("Enter month number (1-12): ");
    int m = sc.nextInt();
    switch (m) {
      case 1: System.out.println("January"); break;
      case 2: System.out.println("February"); break;
      case 3: System.out.println("March"); break;
      case 4: System.out.println("April"); break;
      case 5: System.out.println("May"); break;
      case 6: System.out.println("June"); break;
      case 7: System.out.println("July"); break;
      case 8: System.out.println("August"); break;
      case 9: System.out.println("September"); break;
      case 10: System.out.println("October"); break;
      case 11: System.out.println("November"); break;
      case 12: System.out.println("December"); break;
      default: System.out.println("Invalid month number"); break;
    }

    sc.close();
  }
}