package com.epam.rd.autotasks.meetstrangers;

import java.util.Scanner;

public class HelloStrangers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int strangers = Integer.valueOf(scanner.nextLine());
    if (strangers < 0) {
      System.out.println("Seriously? Why so negative?");
    } else if (strangers == 0) {
      System.out.println("Oh, it looks like there is no one here");
    } else {
      for (int i = 0; i < strangers; i++) System.out.println("Hello, " + scanner.nextLine());
    }
  }
}
