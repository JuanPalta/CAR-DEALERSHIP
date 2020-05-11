package model;
/**
*Class Motorcycle
*
* Class extends of Vehicle
*
*@author JuanPalta
*/
public class Motorcycle extends Vehicle {

	/**ATRIBUTES*/
	private String type;
	private double gasolineCapacity;
	private double gasolineConsume;

/**Constructor for Motorcycle class
	pre:
	pos: build a Motorcycle used instance
	@param basePrice the basePrice of the vehicle
	@param brand the brand of the vehicle
	@param model the model of the vehicle
	@param displacement the displacement of the vehicle
	@param mileage the mileage(km) of the vehicle
	@param used determinate if the vehicle is used or not
	@param licensePlate the licensePlate of the vehicle
	@param type the type of the motorcycle(STANDARD,SCOOTER,SPORT,CROSS)
	@param gasolineCapacity the capacity of gasoline
	*/	
 public Motorcycle(int basePrice,String brand,int model,double displacement,double mileage,boolean used,String licensePlate,String type,double gasolineCapacity
                   ){
 
 super(basePrice, brand , model, displacement, mileage, used,licensePlate);
 this.type = type;
 this.gasolineCapacity = gasolineCapacity;
 gasolineConsume = gasolineCapacity *(mileage/90);
}

/**Constructor for Motorcycle class
	pre:
	pos: build a Motorcycle new instance
	@param basePrice the basePrice of the vehicle
	@param brand the brand of the vehicle
	@param model the model of the vehicle
	@param displacement the displacement of the vehicle
	@param mileage the mileage(km) of the vehicle
	@param used determinate if the vehicle is used or not
	@param type the type of the motorcycle(STANDARD,SCOOTER,SPORT,CROSS)
	@param gasolineCapacity the capacity of gasoline
	*/	
public Motorcycle(int basePrice,String brand,int model,double displacement,double mileage,boolean used,String type,double gasolineCapacity
                   ){
 
 super(basePrice,brand , model, displacement, mileage, used);
 this.type = type;
 this.gasolineCapacity = gasolineCapacity;
 gasolineConsume = gasolineCapacity *(mileage/90);
}

	/** Get the type
	pre:
	pos: get the type of the motorcycle
	@return String type
	*/	
 public String getType(){
	 
	 return type;
 }
 
 /** Set the type
 pre:
 pos: set the type of the motorcycle
 @param type the type of the motorcycle
 */
 public void setType(String type){
	 
	 this.type = type;
 }
 
 /** Get the gasolineCapacity
	pre:
	pos: get the gasolineCapacity of the motorcycle
	@return double gasolineCapacity
	*/	
 public double getGasolineCapacity(){
	 
	 return gasolineCapacity;
 }
 
  /** Set the gasolineCapacity
	pre:
	pos: set the gasolineCapacity of the motorcycle
	@param gasolineCapacity the capacity of the gasoline
	*/
 public void setGasolineCapacity(double gasolineCapacity){
	 
	 this.gasolineCapacity = gasolineCapacity;
 }
 
 
  /** Get the gasolineConsume
	pre:
	pos: get the gasoline consume of the motorcycle
	@return double gasolineConsume
	*/
 public double getGasolineConsume(){
	 
	 return gasolineConsume;
 }
 
 
 /** Set the gasolineConsume
	pre:
	pos: set the gasolineConsume of the motorcycle
	@param gasolineConsume the consume of gasoline
	*/
 public void setGasolineConsume(double gasolineConsume){
	 
	 this.gasolineConsume = gasolineConsume;
 }
 
/** get the info of the Motorcycle
 pre:
 pos: get the info of the Motorcycle
 @return String info
 */ 
@Override
public String getInfo(){
	
	if(getOwner().equalsIgnoreCase("")){
	String info = "";
    info += "totalPrice: " + getTotalPrice();
	info += "\nbasePrice: " + getBasePrice();
	info += "\nbrand: " + getBrand();
	info+= "\nmodel: " + getModel();
    info+= "\ndisplacement" + getDisplacement();
    info+= "\nmileage: " + getMileage();	
	
	if(getUsed() == true){
	info += "\nused :" + "YES";}
	else{
	info+= "\nused :" + "NO";}
	
	info+= "\nType: " + type;
	info+= "\ngasolineTank: " + gasolineCapacity;
	info+= "\ngasolineConsume: " + gasolineConsume;
	info += "\nSoat: " + getDocuments().get((getDocuments().size()-2)).getYear();
	info += "\nMechanicalTec: " + getDocuments().get((getDocuments().size()-1)).getYear();
	
	
   return info;
	
	
} else{

	String info = "";
    info += "totalPrice: " + getTotalPrice();
	info += "\nbasePrice: " + getBasePrice();
	info += "\nbrand: " + getBrand();
	info+= "\nmodel: " + getModel();
    info+= "\ndisplacement" + getDisplacement();
    info+= "\nmileage: " + getMileage();	
	
	if(getUsed() == true){
	info += "\nused :" + "YES";}
	else{
	info+= "\nused :" + "NO";}
	
	info+= "\nType: " + type;
	info+= "\ngasolineTank: " + gasolineCapacity;
	info+= "\ngasolineConsume: " + gasolineConsume;
	info += "\nSoat: " + getDocuments().get((getDocuments().size()-2)).getYear();
	info += "\nCode: " + getDocuments().get((getDocuments().size()-2)).getCode();
	if(getDocuments().get((getDocuments().size()-2)) instanceof Soat){
		Soat soat = (Soat) getDocuments().get((getDocuments().size()-2));
	info += "\nCoverageAmount: " + soat.getCoverageAmount();}
	info += "\nMechanicalTec: " + getDocuments().get((getDocuments().size()-1)).getYear();
	info += "\nCode: " + getDocuments().get((getDocuments().size()-1)).getCode();
	
	if(getDocuments().get((getDocuments().size()-1)) instanceof MechanicalTec){
		MechanicalTec mechanicaltec = (MechanicalTec) getDocuments().get((getDocuments().size()-1));
	info += "\nGasLevel: " + mechanicaltec.getGasLevel();}
	
	return info;
	
}}}

