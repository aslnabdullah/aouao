package Book;

import java.util.Scanner;

public class BookSol {
   public static Scanner in = new Scanner(System.in);
   //1
   public void sayingHello(){
    System.out.println("What is your name ?");
    String name = in.nextLine();
    System.out.println("Hello, "+name+", nice to meet you!");
   } 

   //2
   public void countingCharNum(){
      System.out.println("What is the input string ?");
      String s = in.nextLine();
      System.out.println(s.length());
   }

   //3
   public void printingQuotes(){
      System.out.println("What is the quote ?");
      String quote = in.nextLine();
      System.out.println("Who said it ?");
      String name = in.nextLine();
      System.out.println(name + " says, "+ quote);      
   }

   //4
   public void madLib(){
      System.out.println("Enter a noun :");
      String noun = in.nextLine();
      System.out.println("Enter a verb :");
      String verb = in.nextLine();
      System.out.println("Enter a adjective :");
      String adjective = in.nextLine();
      System.out.println("Enter a adverb :");
      String adverb = in.nextLine();
      System.out.println("Do you " + verb+ " your "+adjective +" "+ noun+" "+adverb + "?"+ " That's hilarious!");
   }

   //5
   public void simpleMath(){
      System.out.println("What is your first number ?");
      int a = in.nextInt();
      System.out.println("What is your second number ?");
      int b = in.nextInt();
      int s = a+b;
      int c = a-b;
      System.out.println(a + " + " + b +" = "+ s);
      System.out.println(a + " - " + b +" = " + c);
      System.out.println(a + " * " + b +" = "+ a*b);
      System.out.println(a + " / " + b +" = "+ a/b);
      
   }

   //6 
   public void retirementCalculator(){
      System.out.println("What is your current age ?");
      int age = in.nextInt();
      System.out.println("At what age would you like to retire ?");
      int retireAge = in.nextInt();
      int rAge = retireAge-age;
      System.out.println("You have " + rAge + " years left until you can retire." );
      int year = 2023;
      int rYear = year + rAge;
      System.out.println("It's "+ year+", so you can retire in "+ rYear);
   }

}
