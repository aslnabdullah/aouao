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
   //7
   public void areaOfRectangular(){
      System.out.println("What is the legth of the room in feet ? ");
      int len = in.nextInt();
      System.out.println("What is the width of the room in feet ?");
      int wid = in.nextInt();
      int area = len*wid;
      System.out.println("The area is " + area);
      double areaS = area * 0.0929;
      System.out.println(areaS + " square meters");
   }
   //8
      public void pizzaParty(){
      System.out.println("How many people?");
      int people = in.nextInt();
      System.out.println("How many pizzas do you have?");
      int pizzas = in.nextInt();
      int pizzaSlice = (pizzas*8);
      int pizzaForPeople = pizzaSlice/people;
      int pizzaMore = pizzaSlice % people;
      System.out.println(people + " people with "+ pizzas + " pizzas");
      System.out.println("Each person gets "+ pizzaForPeople + " piece of pizza.");
      System.out.printf("There are " + pizzaMore + " leftover pieces.");
      
   }
   //9

   //10
   public void selfCheckout(){
      System.out.println("Enter the price of item 1");
      int item1 = in.nextInt();
      System.out.println("Enter the quantity of item 1");
      int quant1 = in.nextInt();
      System.out.println("Enter the price of item 2");
      int item2 = in.nextInt();
       System.out.println("Enter the quantity of item 2");
      int quant2 = in.nextInt();
      System.out.println("Enter the price of item 3");
      int item3 = in.nextInt();
       System.out.println("Enter the quantity of item 3");
      int quant3 = in.nextInt();

      double subtotal = (item1*quant1) + (item2*quant2) + (item3*quant3);
      double tax =  subtotal*(5.50/100.0); 
      double total = subtotal + tax;
      System.out.println("Total : " + total);

   }

}
