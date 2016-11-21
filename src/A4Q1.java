import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
public class A4Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userchose = new Scanner(System.in);
		 Scanner userInput = new Scanner(System.in);
		
		double weight;
		String celestialbody;
		double Mercury=0.38; 
		double Venus=0.91;
		int Earth=1;
		double Moon=0.165;
		double Mars=0.38; 
		double Jupiter=2.34;
		double Saturn=1.06;
		double Uranus=0.92;
		double Neptune=1.19;
		double Pluto=0.06;

		
		
		
		
	
		
		System.out.println("Please enter your weight: ");
		weight=userInput.nextDouble();
		System.out.println("Please enter a  celestial body to travel to: ");
		celestialbody=userchose.next();
		
		userInput.close();
		if(celestialbody.equalsIgnoreCase("Mercury")) {
			System.out.println(String.format("%-22s"+ weight*Mercury, "Your weight on Mercury is : ")); 
		}
		else if (celestialbody.equalsIgnoreCase("Venus")){
			   System.out.println(String.format("%-22s"+ weight*Venus, "Your weight on Venus is :")); 
		}
		else if (celestialbody.equalsIgnoreCase("Earth")){
			System.out.println(String.format("%-22s"+weight*Earth," Your weight on Earth is : ")); 
		}
		else if (celestialbody.equalsIgnoreCase("Moon")){
			System.out.println(String.format("%-22s"+weight*Moon,"Your weight on Moon is : ")); 
		}
		else if (celestialbody.equalsIgnoreCase("Mars")){
			System.out.println(String.format("%-22s"+weight*Mars,"Your weight on Mars is  :")); 
		}
		else if (celestialbody.equalsIgnoreCase("Jupiter")){
			System.out.println(String.format("%-22s"+weight*Jupiter,"Your weight on Jupiter is  :")); 
		}
		else if (celestialbody.equalsIgnoreCase("Saturn")){
			System.out.println(String.format("%-22s"+weight*Saturn,"Your weight on Saturn is  :")); 
		}
		else if  (celestialbody.equalsIgnoreCase("Uranus")){
			System.out.println(String.format("%-22s"+weight*Uranus,"Your weight on Uranus is  :")); 
		}
		else if (celestialbody.equalsIgnoreCase("Neptune")){
			System.out.println(String.format("%-22s"+weight*Neptune,"Your weight on Neptune is  :")); 
		}
		else if (celestialbody.equalsIgnoreCase("Pluto")){
			System.out.println(String.format("%-22s"+weight*Pluto,"Your weight on Pluto is  :")); 
			
		}
	
		
		
		
		
		
		
	
		
		
		
		
		
		

        userInput.close();
		
		
		

		}
			
		
	}


