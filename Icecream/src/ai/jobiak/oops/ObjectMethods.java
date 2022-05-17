package ai.jobiak.oops;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.util.Scanner;

public class   ObjectMethods {

	public static void main(String[] args) {
		
		 Icecream cream1 = new Icecream("chocochips", 215.00, "3.9*", true);
		  Icecream cream2 = new Icecream("Missisipi mud", 215.00, "3.4*", false);
		  Icecream cream3 = new Icecream("Chocolate Magic", 190.00, "3.6*", false);
		  Icecream cream4 = new Icecream("choco caramel", 190.00, "3.6*", true);
		  ChocolateIcecream choco1 = new ChocolateIcecream(cream1, "amul");
		  ChocolateIcecream choco2 = new ChocolateIcecream(cream2, "Baskin robbins");
		  ChocolateIcecream choco3 = new ChocolateIcecream(cream3, "Dairy day");
		  ChocolateIcecream choco4 = new ChocolateIcecream(cream4, "the Brooklyn creamery");
		  ChocolateIcecream choco[] = new ChocolateIcecream[4];
		  choco[0] = choco1;
		  choco[1] = choco2;
		  choco[2] = choco3;
		  choco[3] = choco4;
		  Icecream cream5 = new Icecream("VanillaMagic", 170, "3.9*", true);
		  Icecream cream6 = new Icecream("classic Vanilla", 395, "4.5", false);
		  Icecream cream7 = new Icecream("Vanilla Chocochips", 230, "2.2*", false);
		  Icecream cream8 = new Icecream("sweet Vanilla", 308.75, "2.0*", false);
		  VanillaIcecream vanilla1 = new VanillaIcecream(cream5, "amul");
		  VanillaIcecream vanilla2 = new VanillaIcecream(cream6, "Baskin robbins");
		  VanillaIcecream vanilla3 = new VanillaIcecream(cream7, "Dairy day");
		  VanillaIcecream vanilla4 = new VanillaIcecream(cream8, "The Brooklyn creamery");
		  VanillaIcecream vanilla[] = new VanillaIcecream[4];
		  vanilla[0] = vanilla1;
		  vanilla[1] = vanilla2;
		  vanilla[2] = vanilla3;
		  vanilla[3] = vanilla4;
		  Icecream cream9 = new Icecream("King Alphonso", 200, "3.8*", true);
		  Icecream cream10 = new Icecream("Black Currant", 346.75, "4.5*", false);
		  Icecream cream11 = new Icecream("strawberry", 110.00, "3.2*", false);
		  Icecream cream12 = new Icecream("Acai berry banana", 427.50, "3.5*", true);
		  BerryIcecream berry1 = new BerryIcecream(cream9, "amul");
		  BerryIcecream berry2 = new BerryIcecream(cream10, "Baskin robbins");
		  BerryIcecream berry3 = new BerryIcecream(cream11, "Dairy day");
		  BerryIcecream berry4 = new BerryIcecream(cream12, "The Brooklyn creamery");
		  BerryIcecream berry[] = new BerryIcecream[4];
		  berry[0] = berry1;
		  berry[1] = berry2;
		  berry[2] = berry3;
		  berry[3] = berry4;
		  System.out.println(" welcome to online icecreamshopping");
		  System.out.println("1. home");
		  System.out.println("2. go to Cart");
		  Scanner sc = new Scanner(System.in);
		  int op = sc.nextInt();
		

		  int ch = 1;
		  while (ch == 1) {

		   switch (op) {
		   case 1:
		   
		    break;
		   case 2:
		    
		    break;

		   }
		   System.out.println("if you want to exit press 0 else enter 1");
		   int e = sc.nextInt();
		   if (e == 0) {
		    ch = 0;
		   } else {
		    System.out.println("1. home");
		    System.out.println("2. go to Cart");
		    op = sc.nextInt();
		    ch = 1;
		
		   }
		   }

 }
}
