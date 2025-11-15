//package com.tgdajay;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    //input by user
    Scanner Sc = new scanner(System.in);
    System.out.println("Enter name");
    String name = Sc.nextline();
                    //nextInt();
                    //nextFleat();
    System.out.println(name);

    // Variables "a" & "b" and print their Sum up ?
      System.out.prinln(" a = ");  
    int= Sc.nextInt();
    System.out.println(" b = ");
    int b = Sc.nextInt();
    int Sum = a + b;
    System.out.println(Sum);

    //CONDITION STATMENT IN JAVA
     // IF ELSE
     System.out.println("Age = ");
    int age = Sc.nextInt();
    if (age > 18) {
      System.out.println("Adult");
    }
    else {
      System.out.println("bacha");
    }
  }
}
