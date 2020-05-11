package model;
/**
*Class Car
* Class extends of Vehicle
* Class Abstract to HybridCar,ElectricCar And GasolineCar
*
*@author JuanPalta
*/
public abstract class Car extends Vehicle {
	
	/** ATRIBUTES */
	private String type;
	private int numberDoor;
	private boolean polarize;

/**Constructor for car class
pre:
pos: build a car used instance
@param basePrice the baseprice of the car
@param brand the brand of the car
@param model the model of the car
@param displacement the displacement of the car
@param mileage the mileage(km) of the car
@param used determinate if the car is used or not
@param licensePlate the licensePlate of the car
@param type the type of the car(Sedan or Van)
@param numberDoor number of doors in the car
@param polarize determinate if the car is polarize or not
*/
 public Car(int basePrice,String brand,int model,double displacement,double mileage,boolean used,String licensePlate, String type, int numberDoor, boolean polarize){
	 
	 super(basePrice,brand,model,displacement,mileage,used,licensePlate);
	 this.type = type;
	 this.numberDoor = numberDoor;
	 this.polarize = polarize;
	 
	 
	 
 }
 
 /**Constructor for car class
pre:
pos: build a car new instance
@param basePrice the baseprice of the car
@param brand the brand of the car
@param model the model of the car
@param displacement the displacement of the car
@param mileage the mileage(km) of the car
@param used determinate if the car is used or not
@param type the type of the car(Sedan or Van)
@param numberDoor number of doors in the car
@param polarize determinate if the car is polarize or not
*/
 public Car(int basePrice,String brand,int model,double displacement,double mileage,boolean used, String type, int numberDoor, boolean polarize){
	 
	 super(basePrice,brand,model,displacement,mileage,used);
	 this.type = type;
	 this.numberDoor = numberDoor;
	 this.polarize = polarize;
	 
	 
	 
 }
 
 /** Get type of the car
 pre:
 pos: get type of the car
 @return String type
 */
 public String getType(){
	 
	 return type;
 }
 
 /** Set type of the car
 pre:
 pos: set type of the car
 @param type the type of the car
 */
 public void setType(String type){
	 
	 this.type = type;
 }
 
 /** Get numbers of door in the car
 pre:
 pos: get the numbers of door in the car
 @return int numberDoor
 */
 public int getNumberDoor(){
	 
	 return numberDoor;
 }
 
 /** Get numbers of door in the car
 pre:
 pos: get the numbers of door in the car
 @param numberDoor the number of doors
 */
 public void setNumberDoor(int numberDoor){
	 
	 this.numberDoor = numberDoor;
 }
 
 /** Get if the car is polarize or not
 pre:
 pos: Get if the car is polarize or not
 @return boolean polarize;
 */
 
 public boolean getPolarize(){
	 
	 return polarize;
 }
 
  /** Set polarize to the car
 pre:
 pos: set polarize to the car
 @param polarize the polarize of the car
 */
 public void setPolarize(boolean polarize){
	 
	 this.polarize = polarize;
	 
 }

}