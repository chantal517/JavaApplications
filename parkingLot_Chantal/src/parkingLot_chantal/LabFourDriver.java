package parkingLot_chantal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;




public class LabFourDriver {
	
	public static void main(String[] args) {
		initAttributes();
		
		System.out.print("Enter number of parking structure levels: ");
		String input = userInput.nextLine();
		System.out.println(" ");
		
		ParkingStructure parkingStructure = new ParkingStructure(Integer.parseInt(input));
		
		while (!parkingStructure.isFull()) {
			Car incomingCar = createCar();
			System.out.println(incomingCar.getMake()
					+ " " + incomingCar.getType() + " " + incomingCar.getColor());
			int storageLevel = parkingStructure.addCar(incomingCar);
			System.out.println("Car Stored at level " + storageLevel);
			System.out.println(" ");
		}

		
	}



	
	/**
	 * Sets up all the attributes needed for the class. 
	 * Sets up the array lists needed as well
	 */
	
	private static Scanner userInput;
	private static Random randomGenerator;
	private static ArrayList<String> carMakes;
	private static ArrayList<String> carTypes;
	private static ArrayList<String> carColors;
	
	private static void initAttributes(){
		
		randomGenerator = new Random(1337);
		userInput = new Scanner(System.in);
		carMakes = new ArrayList<String>();
		carTypes = new ArrayList<String>();
		carColors = new ArrayList<String>();

		carMakes.add("Ford"); //initializes the makes array list
		carMakes.add("Toyota");
		carMakes.add("Dodge");
		carMakes.add("Honda");
		
		carTypes.add("Sedan"); //initializes the Types array list
		carTypes.add("Truck");
		carTypes.add("Van");
		carTypes.add("Hatchback");
		
		carColors.add("Blue"); //initializes the colors array list
		carColors.add("Green");
		carColors.add("Red");
		carColors.add("Purple");
		carColors.add("Orange");
		carColors.add("Yellow");
			
	}
	/**
	 * Calls the car class to make a  new car object with random valuesfrom the array
	 * @return the newly made object
	 */
	private static Car createCar(){
		
		Car made_car = new Car(carMakes.get(randomGenerator.nextInt(4)), carTypes.get(randomGenerator.nextInt(4)), carColors.get(randomGenerator.nextInt(6)));
		return made_car;
	}
	
}
