package parkingLot_chantal;

public class Car {
	/**
	 * The attributes needed for the car class initialized
	 */
	private String make;
	private String type;
	private String color;
	
	/**
	 * Constructor for the car class
	 * @param make of the car passed in
	 * @param type of the car passed in
	 * @param color of the car passed in
	 */
	public Car(String make, String type, String color){
		setMake(make);
		setType(type);
		setColor(color);
		
	}
	/**
	 * Sets the make of the car object
	 * @param make passed in value
	 */
	private void setMake(String make){
		this.make = make;
	}
	/**
	 * Sets the type of the car object
	 * @param type passed in value
	 */
	
	private void setType(String type){
		this.type = type;
	}
	/**
	 * Sets the color of the car object
	 * @param color passed in value
	 */
	private void setColor(String color){
		this.color = color;
	}
	
	/**
	 * Gets the make of particular car object
	 * @return make to caller
	 */
	public String getMake(){
		return this.make;
	}
	/**
	 * Gets the type of particular car object
	 * @return type to caller
	 */
	public String getType(){
		return this.type;
	}
	/**
	 * Gets the color of particular car object
	 * @return color to caller
	 */
	public String getColor(){
		return this.color;
	}
	
	
	
	
	

}
