package parkingLot_chantal;

import java.util.ArrayList;

public class ParkingStructure {
	
	//attributes needed for class
private ArrayList<Level> levels;
	
	/**
	 * constructor for parking structure class
	 * @param numberOfLevels passed in for object
	 */
	public ParkingStructure(int numberOfLevels){
		
		setLevels(numberOfLevels);
	
	}
	/**
	 * Sets the number of levels dependent upon error check
	 * @param numberOfLevels
	 */
	private void setLevels(int numberOfLevels){
		levels = new ArrayList<Level>();
		if(numberOfLevels <= 0){
			
			levels.add(new Level(10));
			levels.add(new Level(10));

		}
		else{

			for(int i = 0; i < numberOfLevels; ++i){
				
				levels.add(new Level(10));
				
			}
			
			
		}
		
	}
	
	/**
	 * Checks to see if a param of the arry list is full
	 * @return true or false
	 */
	public boolean isFull(){
		
		for(Level indiv_level : levels){
		if(!indiv_level.isFull()){
			return false;	
		}
	
		}
		return true;
	}
	
	/**
	 * Adds car to array list if num of spots isnt full
	 * @param incomingCar
	 * @return the level the car was added to
	 */
	public int addCar(Car incomingCar){
	int counter = 1;
		for(Level indiv_level : levels){
			if(!indiv_level.isFull()){
			indiv_level.addCar(incomingCar);
			break;
			}
			counter++;
	}
		return counter;
	}
	
}

