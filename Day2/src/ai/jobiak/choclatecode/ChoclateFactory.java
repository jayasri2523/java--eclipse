package ai.jobiak.choclatecode;

public class ChoclateFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Choclate cadburydairymilk=new Choclate("DarkMilk",156.00,
				    199.00,"Paperbox",false);
				 Choclate fivestar=new Choclate("new soft bar",25.00,10.00,
				      "silverfoil",false);
				 Choclate snickers=new Choclate("peanutfilledchocalte",
				      100.00,50.00,"silverfoil",false);
				 Choclate darkFantasy=new Choclate("Chocofills",75.00,210.00,
				   "paperbox",false);
				 Choclate kitkat=new Choclate("Rich Choco fudge",27.5,19.00,
				   "papercover",true);
				 Choclate munch=new Choclate("long chocolate bar",208.00,85.00,
				   "silverfoil",false);
				 Choclate perk=new Choclate("Home treats",28.00,10.00,
				   "papercover",false);
				 Choclate milkybar=new Choclate("More yummy",25.00,18.80,
				   "silverfoil",false);
				 Choclate alpenliebe=new Choclate("cream strawberry",152.00,47.00,
				   "plasticcover",true);
				 Choclate kaccha=new Choclate("mango bite",27.00,10.00,
				   "plasticcover",true);
					
				    System.out.println(cadburydairymilk);
				    System.out.println(fivestar);
				    System.out.println(snickers); 
				    System.out.println(darkFantasy); 
				    System.out.println(kitkat); 
				    System.out.println(munch); 
				    System.out.println(perk); 
				    System.out.println(milkybar); 
				    System.out.println(alpenliebe); 
				    System.out.println(kaccha); 
				    boolean result=cadburydairymilk==kaccha;
				    System.out.println(result);
				    if(cadburydairymilk instanceof Choclate &&
				      fivestar instanceof Choclate) {
				     result=cadburydairymilk==snickers;
				     System.out.println("using instanceof "+result);
				    }
				    Choclate chok=cadburydairymilk;
				     result=(cadburydairymilk==chok);
				     System.out.println(result);
				    
				  
				    
				    
				    
				   

	}

}
