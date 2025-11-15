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
    System.oit.println("Enter value odd and even so x = ");
    if ( x % 2 == 0 ) {
      System.out.println("Even");
    }
    else {
      System.out.println("odd");
    }
    // if else if and else
    System.out.println(" a is greater or b is lesseer or equal");
    System.out.println(" a = ");
    int a = Sc.nextInt();
    System.out.println(" b = ");
    int b = Sc.nextInt();
    if ( a == b ) {
      System.out.println("equally");
    }
    else {
      if ( a > b ) {
        System.out.println(" a is greeter");
      }
      else {
        System.out.println(" b is lesser");
      }
      //print the greeting
      System.out.println(" click the button 123 your like ");
      System.out.println(" button ");
      int button = Sc.nextInt();
      if (button == 1) {
        System.out.println(" 1 number onse more onse more");
      }
      else if (button == 2) {
          System.out.println("modi humse jyada to nhi hi kamata hoga or hoga to 2 number ka dhenda kar rha hoga ");
        } 
        else if (button == 3) {
          System.out.println("tin bhai thino thabhai 🔥");
        }
        else {
          System.out.println("idher ko dekh ke baat kar bhai 👀")
        }
       //but in my case you want to 20 button to make in code so Java create a new method switch
       System.out.println("but in many case you want to 20 button to make in course Java create a new method");
       System.out.println(" Button ");
       Switch (button) {
         case 1 : System.out.println("hellooooo how are you ");
         break;
         case 2 : System.out.println(" modi to gayga lekin 2026 me dunia khatam hai");
         break;
         case 3 : System.out.println(" tin pati");
         default: System.out.println(" 👀👀👀👀👀");
         
       }
        //make a calculator take two number a and BS follow edition subtraction multiplication division or module
       System.out.println("make a calculator take two number a and BS follow edition subtraction multiplication division or module");
       
    }
  }
}
