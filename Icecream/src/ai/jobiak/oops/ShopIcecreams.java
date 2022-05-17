package ai.jobiak.oops;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopIcecreams implements ShopIcecream {
 static ArrayList<String> arr = new ArrayList<String>();
 Scanner sc = new Scanner(System.in);
 Icecream cream1 = new Icecream("chocochips", 215.00, "3.9*", true);
 Icecream cream2 = new Icecream("Missisipi mud", 215.00, "3.4*", false);
 Icecream cream3 = new Icecream("Chocolate Magic", 190.00, "3.6*", false);
 Icecream cream4 = new Icecream("choco caramel", 190.00, "3.6*", true);
 Icecream cream5 = new Icecream("VanillaMagic", 170, "3.9*", true);
 Icecream cream6 = new Icecream("classic Vanilla", 395, "4.5", false);
 Icecream cream7 = new Icecream("Vanilla Chocochips", 230, "2.2*", false);
 Icecream cream8 = new Icecream("sweet Vanilla", 308.75, "2.0*", false);
 Icecream cream9 = new Icecream("King Alphonso", 200, "3.8*", true);
 Icecream cream10 = new Icecream("Black Currant", 346.75, "4.5*", false);
 Icecream cream11 = new Icecream("strawberry", 110.00, "3.2*", false);
 Icecream cream12 = new Icecream("Acai berry banana", 427.50, "3.5*", true);

 public void home() {
  System.out.println("select the brand you want to choose");
  System.out.println("1.amul");
  System.out.println("2.Baskin robbins");
  System.out.println("3. Dairy day");
  System.out.println("4. The Brooklyn creamery");
  int brand = sc.nextInt();
  System.out.println("select the flavour you want to choose");

  if (brand == 1) {
   String s1 = cream1.name;
   String s2 = cream5.name;
   String s3 = cream9.name;
   System.out.println("1." + "" + s1);
   System.out.println("2." + "" + s2);
   System.out.println("3." + "" + s3);
   int ch = sc.nextInt();
   System.out.println("do you want to add to cart");
   System.out.println("select ");
   System.out.println("1.cart");
   System.out.println("2.home");
   int a = sc.nextInt();
   if (a == 1) {
    addtocart(ch, s1, s2, s3);
   } else if (a == 2) {
    home();
   }

  } else if (brand == 2) {
   String s1 = cream2.name;
   String s2 = cream6.name;
   String s3 = cream10.name;
   System.out.println("1." + "" + s1);
   System.out.println("2." + "" + s2);
   System.out.println("3." + "" + s3);
   int ch = sc.nextInt();
   System.out.println("do you want to add to cart");
   System.out.println("select ");
   System.out.println("1.cart");
   System.out.println("2.home");
   int a = sc.nextInt();
   if (a == 1) {
    addtocart(ch, s1, s2, s3);
   } else if (a == 2) {
    home();
   }

  } else if (brand == 3) {
   String s1 = cream3.name;
   String s2 = cream7.name;
   String s3 = cream11.name;
   System.out.println("1." + "" + s1);
   System.out.println("2." + "" + s2);
   System.out.println("3." + "" + s3);
   int ch = sc.nextInt();
   System.out.println("do you want to add to cart");
   System.out.println("select ");
   System.out.println("1.cart");
   System.out.println("2.home");
   int a = sc.nextInt();
   if (a == 1) {
    addtocart(ch, s1, s2, s3);
   } else if (a == 2) {
    home();
   }

  } else if (brand == 4) {
   String s1 = cream4.name;
   String s2 = cream8.name;
   String s3 = cream12.name;
   System.out.println("1." + "" + s1);
   System.out.println("2." + "" + s2);
   System.out.println("3." + "" + s3);
   int ch = sc.nextInt();
   System.out.println("do you want to add to cart");
   System.out.println("select ");
   System.out.println("1.cart");
   System.out.println("2.home");
   int a = sc.nextInt();
   if (a == 1) {
    addtocart(ch, s1, s2, s3);
   } else if (a == 2) {
    home();
   }

  }

 }

 public void addtocart(int ch, String s1, String s2, String s3) {

  if (ch == 1) {
   arr.add(s1);
  } else if (ch == 2) {
   arr.add(s2);
  } else if (ch == 3) {
   arr.add(s3);
  }

  System.out.println("Selected item is added in the cart");

 }

 @Override
 public void gotocart(ArrayList<String> arr) {
  // TODO Auto-generated method stub
  if (arr.isEmpty()) {
   System.out.println("please add items in the cart");
  } else {
   System.out.println(arr);
  }
  if(!(arr.isEmpty())) {
  System.out.println("Do you want to order");
  System.out.println("select ");
  System.out.println("1.order");
  System.out.println("2.home");
  int a = sc.nextInt();
  if (a == 1) {
   System.out.println("Your order will be delivered soon");
  } else if (a == 2) {
   home();
  }
  }
  }}


	
	


