public class Lecture3{
	public static void main(String[] args) {
		// boolean isCold = true; // false;
		// if(isCold){
		// 	//executes ONLY if isCold is true
		// 	System.out.println("It's cold, wear a jacket!");
		// }

		// boolean isLightGreen = true; // false;
		// if(isLightGreen){
		// 	//traffic light is green
		// 	System.out.println("Drive!");
		// }

		/*Given the boolean variable isRaining ,
		  write an if statement that will print out
		  Windsheild wipers on.
		  when its raining.
		*/
		// boolean isRaining = true; // false;
		// if(isRaining){
		// 	//traffic light is green
		// 	System.out.println("Windsheild wipers on.");
		// }

		// boolean isLightGreen = true; // false;
		// if(isLightGreen){
		// 	//traffic light is green
		// 	double carSpeed = 100; // in km/hr
		// 	System.out.println("Drive!");
		// 	System.out.println("Speed is: " + carSpeed);
		// }
		// carSpeed = carSpeed - 10;  // This will cause an error because its outside

		// boolean isLightGreen = false; // true;
		// if(isLightGreen){
		// 	//traffic light is green
		// 	System.out.println("Drive!");
		// } 
		// else{
		// 	//traffic light is NOT green
		// 	System.out.println("Stop!");
		// }

		// boolean isLightGreen = false; // true;
		// boolean isLightYellow = true; //false
		// if(isLightGreen){
		// 	//traffic light is green
		// 	System.out.println("Drive!");
		// } 
		// else if(isLightYellow){
		// 	//traffic light is Yellow
		// 	System.out.println("Slow down!");
		// }	
		// else{
		// 	//traffic light is neither green nor Yellow
		// 	System.out.println("Stop!");
		// }

		boolean passport = false; // true;
		boolean birthCertificate = true; //false
		boolean driverLicense = true; //false
		if(passport){
			System.out.println("A passport is a valid ID.");
		} 
		else if(birthCertificate){
			System.out.println("A birth certificate ia a valid ID.");
		}	
		else if(driverLicense){
			System.out.println("A driver's license ia a valid ID.");
		}	
		else{
			System.out.println("Invalid ID. Your application is denied.");
		}					  
	}
}