package model;

/**
* Class GasolineCar
*
* Class extends of car
*
*@author JuanPalta
*/
public class GasolineCar extends Car implements Gasoline {

	/**ATRIBUTES*/
	private double gasolineTank;
	private String gasolineType;
	private double gasolineConsume;
 
 /**Constructor for GasolineCar class
pre:
pos: build a gasolineCar used instance
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
@param gasolineTank the tank of gasoline in the hybridCar
@param gasolineType the type of the gasoline(Extra,Corriente,Diesel)
*/ 
 public GasolineCar(int basePrice,String brand,int model,double displacement,double mileage,boolean used,String licensePlate, String type, int numberDoor, boolean polarize,
 double gasolineTank,String gasolineType){
 
 super(basePrice,brand , model, displacement, mileage, used,licensePlate, type, numberDoor, polarize);
 this.gasolineTank = gasolineTank;
 this.gasolineType = gasolineType;
 gasolineConsume = gasolineTank *(mileage/100);
 
}

 /**Constructor for GasolineCar class
pre:
pos: build a gasolineCar new instance
@param basePrice the baseprice of the car
@param brand the brand of the car
@param model the model of the car
@param displacement the displacement of the car
@param mileage the mileage(km) of the car
@param used determinate if the car is used or not
@param type the type of the car(Sedan or Van)
@param numberDoor number of doors in the car
@param polarize determinate if the car is polarize or not
@param gasolineTank the tank of gasoline in the hybridCar
@param gasolineType the type of the gasoline(Extra,Corriente,Diesel)
*/ 
 public GasolineCar(int basePrice,String brand,int model,double displacement,double mileage,boolean used, String type, int numberDoor, boolean polarize,
 double gasolineTank,String gasolineType){
 
 super(basePrice,brand , model, displacement, mileage, used,type, numberDoor, polarize);
 this.gasolineTank = gasolineTank;
 this.gasolineType = gasolineType;
 gasolineConsume = gasolineTank *(mileage/100);
}

/** Get the gasoline tank
 pre:
 pos: get the gasoline tank of the gasolineCar
 @return double gasolineTank
 */
@Override
public double getGasolineTank(){
	
	return gasolineTank;
}

/** Get the gasoline type
 pre:
 pos: get the gasoline type of the gasolineCar
 @return String gasolineType 
 */
@Override
public String getGasolineType(){
	
	return gasolineType;
}

/** Get the gasoline consume
 pre:
 pos: get the gasoline consume of the gasolineCar
 @return double gasolineConsume
 */
@Override
public double getGasolineConsume(){
	
	return gasolineConsume;
}

/** Set the gasoline tank
 pre:
 pos: set the gasoline tank of the gasolineCar
 @param gasolineTank  the gasoline tank of the gasolineCar
 */
@Override
public void setGasolineTank(double gasolineTank){
	
	this.gasolineTank = gasolineTank;
}

/** Set the gasoline type
 pre:
 pos: set the gasoline type of the gasolineCar
 @param gasolineType  the gasoline type of the gasolineCar
 */
@Override 
public void setGasolineType(String gasolineType){
	
	this.gasolineType = gasolineType;
}

/** Set the gasoline consume
 pre:
 pos: set the gasoline consume of the gasolineCar
 @param gasolineConsume  the gasoline consume of the gasolineCar
 */
@Override
public void setGasolineConsume(double gasolineConsume){
	
	this.gasolineConsume = gasolineConsume;
}

/** get the info of the gasolineCar
 pre:
 pos: get the info of the gasolineCar
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
	info+= "\ntype: " + getType();
	
	if(getUsed() == true){
	info += "\nused :" + "YES";}
	else{
	info+= "\nused :" + "NO";}
	
	info+= "\ngasolineType: " + gasolineType;
	info+= "\ngasolineTank: " + gasolineTank;
	info+= "\ngasolineConsume: " + gasolineConsume;
	info += "\nSoat: " + getDocuments().get((getDocuments().size()-2)).getYear();
	info += "\nMechanicalTec: " + getDocuments().get((getDocuments().size()-1)).getYear();
	
	
   return info;	
}
	else {
		
	String info = "";
    info += "totalPrice: " + getTotalPrice();
	info += "\nbasePrice: " + getBasePrice();
	info += "\nbrand: " + getBrand();
	info+= "\nmodel: " + getModel();
    info+= "\ndisplacement" + getDisplacement();
    info+= "\nmileage: " + getMileage();	
	info+= "\ntype: " + getType();
	
	if(getUsed() == true){
	info += "\nused :" + "YES";}
	else{
	info+= "\nused :" + "NO";}
	
	info+= "\ngasolineType: " + gasolineType;
	info+= "\ngasolineTank: " + gasolineTank;
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
}}
}