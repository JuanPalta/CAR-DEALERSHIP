package model;

import java.util.*;

/**
*Class Vehicle
*
* Class Abstract to Car
*
*@author JuanPalta
*/
public abstract class Vehicle{
    
	/** ATRIBUTES */
	Random random = new Random();
	private int totalPrice;
	private int basePrice;
	private String brand;
	private int model;
	private double displacement;
	private double mileage;
	private boolean used;
	private String owner;
	private ArrayList <Documents> documents;
	private String licensePlate;
	
	/**Constructor for Vehicle class
	pre:
	pos: build a vehicle instance
	@param basePrice the basePrice of the vehicle
	@param brand the brand of the vehicle
	@param model the model of the vehicle
	@param displacement the displacement of the vehicle
	@param mileage the mileage(km) of the vehicle
	@param used determinate if the vehicle is used or not
	@param licensePlate the licensePlate of the vehicle
	*/
	public Vehicle(int basePrice,String brand,int model,double displacement,double mileage,boolean used,String licensePlate){
		
		this.basePrice = basePrice;
		this.brand = brand;
		this.model = model;
		this.displacement = displacement;
		this.mileage = mileage;
		this.used = used;
		owner = "";
		this.licensePlate = licensePlate;
		documents = new ArrayList <Documents> ();
		
		
	}
	
	/**Constructor for Vehicle class
	pre:
	pos: build a vehicle instance
	@param basePrice the basePrice of the vehicle
	@param brand the brand of the vehicle
	@param model the model of the vehicle
	@param displacement the displacement of the vehicle
	@param mileage the mileage(km) of the vehicle
	@param used determinate if the vehicle is used or not
	*/
	public Vehicle(int basePrice,String brand,int model,double displacement,double mileage,boolean used){
		
		this.totalPrice = totalPrice;
		this.basePrice = basePrice;
		this.brand = brand;
		this.model = model;
		this.displacement = displacement;
		this.mileage = mileage;
		this.used = used;
		owner = "";
		licensePlate = "";
		documents = new ArrayList <Documents> ();
		
		
	}

 /** Get the totalPrice
 pre:
 pos: get the totalPrice of the vehicle
 @return int totalPrice;
 */ 
 public int getTotalPrice(){

	return totalPrice;
 }
 
 /** Set the totalPrice
 pre:
 pos: set the total price according to the requeriments
 @param vehicle the vehicle to calculate the total price
 */
 public void setTotalPrice(Vehicle vehicle){
	 
	 int countYear = 0;
	 
	 for(int i = 0; i< vehicle.getDocuments().size();i++){
		 
     if(vehicle.getDocuments().get(i).getYear() == 2020){
		  countYear++;
		  }
		   }
	 
	 
	 
	 if(vehicle instanceof ElectricCar){
		 totalPrice += basePrice + (basePrice*0.2);
	 }
	 
	 else if(vehicle instanceof HybridCar){
		 totalPrice += basePrice + (basePrice*0.15);
	 
	 }
	 
	 else if(vehicle instanceof GasolineCar){
	       totalPrice = basePrice;}
	 
	 else if(vehicle instanceof Motorcycle & vehicle.getUsed() == true){
		 
		 totalPrice += basePrice - (basePrice*0.02);
	 }
	 
	 else if(vehicle instanceof Motorcycle & vehicle.getUsed() == false ){
		 
	 totalPrice += basePrice - (basePrice*0.04);}
	 
	 if(countYear != 2){
		 
	 totalPrice += 500000;}
	
 }
 
 /** Modify the price to the total price
 pre:
 pos: apply a discount of the totalPrice
 @param percentage the percentage to discount
 */
 public void modifyDiscount(double percentage){
	 
	 totalPrice = totalPrice - (int)(totalPrice*percentage); 
	 
 }
 /** Get the base price
 pre:
 pos: get the base price
 @return int basePrice
 */
 public int getBasePrice(){
	 
	 return basePrice;
 }
 /** Set the base price
 pre:
 pos: Set the base price
 @param basePrice the base price to assign
 */
 public void setBasePrice(int basePrice){
	 
	 this.basePrice = basePrice;
 }
 
 /** Get the brand
 pre:
 pos: get the brand
 @return String brand
 */
 public String getBrand(){
	 
	 return brand;
 }
 
 /** Set the brand
 pre:
 pos: set the base price
 @param brand the brand of the vehicle
 */
 public void setBrand(String brand){
	 
	 this.brand = brand;
 }
 
 /** Get the model
 pre:
 pos: get the model
 @return int model
 */
 public int getModel(){
	 
	 return model;
 }
 
 /** Set the model
 pre:
 pos: set the model
 @param model the model of the vehicle
 */
 public void setModel(int model){
	 
	 this.model = model;
 }
 
 /** Get the displacement
 pre:
 pos: get the displacement
 @return double displacement
 */
 public double getDisplacement(){
	 
	 return displacement;
 }
 
 /** Set the displacement
 pre:
 pos: set the displacement
 @param displacement the displacement of the vehicle
 */
 public void setDisplacement(double displacement){
	 
	 this.displacement = displacement;
 }
 
 /** Get the mileage
 pre:
 pos: get the mileage
 @return double mileage
 */
 public double getMileage(){
	 
	 return mileage;
 }
 
 /** Set the mileage
 pre:
 pos: set the mileage
 @param mileage the mileage of the vehicle
 */
 public void setMileage(double mileage){
	 
	 this.mileage = mileage;
 }
 
  /** Get if the vehicle is used or not
 pre:
 pos: Get if the vehicle is used or not
 @return boolean used
 */
 public boolean getUsed(){
	 
	 return used;
 }
 
 /** Set if the vehicle is used or not
 pre:
 pos: Set if the vehicle is used or not
 @param used determinate if the vehicle is used
 */
 public void setUsed(boolean used){
	 
	 this.used = used;
 }
 
  /** Get the owner of the vehicle
 pre:
 pos: Get the owner of the vehicle
 @return String owner the name of the owner
 */
 public String getOwner(){
	 
	 return owner;
 }
 
 /** Set the owner to the vehicle
 pre:
 pos: Set the owner to the vehicle
 @param owner the name of the owner
 */
 public void setOwner(String owner){
	 
	 this.owner = owner;
 }
 
 /** Get the documents of the vehicle
 pre:
 pos: Get the documents of the vehicle
 @return ArrayList documents the documents of the vehicle
 */
 public ArrayList<Documents> getDocuments(){
	 
	 return documents;
 }
 
 /** Add a document of the vehicle documents
 pre:
 pos: Add a document of the vehicle documents
 @param documentx the document to add
 */
 public void addDocuments(Documents documentx){
	 
	 
	 documents.add(documentx);
	 
 }
 
 /** Get the licensePlate of the vehicle
 pre:
 pos: Get the licensePlate of the vehicle
 @return String licensePlate the licensePlate of the vehicle
 */
 public String getLicensePlate(){
	 
 return licensePlate;
 }
 
 /** Set the licensePlate of the vehicle
 pre:
 pos: Set the licensePlate of the vehicle
 @param licensePlate the licensePlate of the vehicle
 */
 public void setLicensePlate(String licensePlate){
	 
	 this.licensePlate = licensePlate;
 }
  /** Abstract method to get the info of the vehicle
 pre:
 pos: get the info of the vehicle
 @return String info the info of the vehicle
 */
 public abstract String getInfo();
	 
	
	
}
	