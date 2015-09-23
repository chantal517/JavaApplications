package parkingLot_chantal;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
/**
* Name:Chantal Lewis
* Date:10/01/14
* Section: D
* Lab Code: Fantasy Football
**/


public class Level {

	/**
	 * Sets the attributes needed for the class
	 */
	private ArrayList<Car> carsStored;
	private int numberOfParkingSpots;
	
	/**
	 * constructor calls to set the number of parking spots on each level
	 * @param numberOfParkingSpots passed in from caller
	 */
	public Level(int numberOfParkingSpots){
		setParkingSpots(numberOfParkingSpots);
	}
	/**
	 * sets the number of parking spots and array list
	 * @param numberOfParkingSpots passed in from constructor
	 */
	private void setParkingSpots(int numberOfParkingSpots){
		carsStored = new ArrayList<Car>();
		this.numberOfParkingSpots = numberOfParkingSpots;
		
	}
	/**
	 * Checks to see if a param of the array list is full
	 * @return true or false
	 */
	public boolean isFull(){
		
		if(carsStored.size() >= numberOfParkingSpots ){
			return true;
			
		}
		else{
			return false;
		}
		
	}
	
	/**
	 * Adds car to arraylist 
	 * @param incomingCar passed in object of type car
	 */
	public void addCar(Car incomingCar){
		
		carsStored.add(incomingCar);
		
	}
	
	
	
}
