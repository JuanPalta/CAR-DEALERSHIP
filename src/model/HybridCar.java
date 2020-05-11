package model;

/**
* Class HybridCar
*
* Class extends of car
*
*@author JuanPalta
*/
public class HybridCar extends Car implements Electric, Gasoline{
	
	/**ATRIBUTES*/
	private double gasolineTank;
	private String gasolineType;
	private double gasolineConsume;
	
	private String typeOfCharge;
	private double bateryDuration;
	private double bateryConsume;
 
/**Constructor for HybridCar class
pre:
pos: build a hybridCar used instance
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
@param typeOfCharge the type of the charge (Fast,Normal)
@param bateryDuration the duration of the batery
*/ 
 public HybridCar(int basePrice,String brand,int model,double displacement,double mileage,boolean used,String licensePlate, String type, int numberDoor, boolean polarize,
 double gasolineTank,String gasolineType,String typeOfCharge,double bateryDuration){
	
 super(basePrice,brand , model, displacement, mileage, used,licensePlate, type, numberDoor, polarize);
 this.gasolineTank = gasolineTank;
 this.gasolineType = gasolineType;
 gasolineConsume = gasolineTank *(mileage/110);
 
 this.typeOfCharge = typeOfCharge;
 this.bateryDuration = bateryDuration;
 if(typeOfCharge.equalsIgnoreCase("fast")){
	 
  bateryConsume = bateryDuration*(mileage/100);
 }
 else if(typeOfCharge.equalsIgnoreCase("normal")){
	 bateryConsume = (bateryDuration + 5) *(mileage/100);
}

}

/**Constructor for HybridCar class
pre:
pos: build a hybridCar new instance
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
@param typeOfCharge the type of the charge (Fast,Normal)
@param bateryDuration the duration of the batery
*/ 
 public HybridCar(int basePrice,String brand,int model,double displacement,double mileage,boolean used, String type, int numberDoor, boolean polarize,
 double gasolineTank,String gasolineType,String typeOfCharge,double bateryDuration){
	
 super(basePrice,brand , model, displacement, mileage, used,type, numberDoor, polarize);
 this.gasolineTank = gasolineTank;
 this.gasolineType = gasolineType;
 gasolineConsume = gasolineTank *(mileage/110);
 
 this.typeOfCharge = typeOfCharge;
 this.bateryDuration = bateryDuration;
 if(typeOfCharge.equalsIgnoreCase("fast")){
	 
  bateryConsume = bateryDuration*(mileage/100);
 }
 else if(typeOfCharge.equalsIgnoreCase("normal")){
	 bateryConsume = (bateryDuration + 5) *(mileage/100);
}

}


 /** Get the typeOfCharge
 pre:
 pos: get the typeOfCharge of the hybridCar
 @return String typeOfCharge
 */ 
@Override
public String getTypeOfCharge(){
	return typeOfCharge;
}

/** Get the Batery duration
 pre:
 pos: get the batery duration of the hybridCar
 @return double bateryDuration
 */ 
@Override
public double getBateryDuration(){
	
	return bateryDuration;
}

/** Get the bateryConsume
 pre:
 pos: get the bateryConsume of the hybridCar
 @return double bateryConsume
 */ 
@Override
public double getBateryConsume(){
	
	return bateryConsume;
}

/** Set the typeOfCharge
 pre:
 pos: set the type of charge of the hybridCar
 @param typeOfCharge the type of the charge
 */
@Override
public void setTypeOfCharge(String typeOfCharge){
	
	this.typeOfCharge = typeOfCharge;
}

/** Set the batery duration
 pre:
 pos: set the batery duration of the hybridCar
 @param bateryDuration the duration of the batery in the hybridCar
 */
@Override
public void setBateryDuration(double bateryDuration){
	
	this.bateryDuration = bateryDuration;
}

/** Set the batery consume
 pre:
 pos: set the batery consume of the hybridCar
 @param bateryConsume the consume of the batery in the hybridCar
 */
@Override
public void setBateryConsume(double bateryConsume){
	
	this.bateryConsume = bateryConsume;
}

/** Get the gasoline tank
 pre:
 pos: get the gasoline tank of the hybridCar
 @return double gasolineTank
 */
@Override
public double getGasolineTank(){
	
	return gasolineTank;
}

/** Get the gasoline type
 pre:
 pos: get the gasoline type of the hybridCar
 @return String gasolineType 
 */
@Override
public String getGasolineType(){
	
	return gasolineType;
}

/** Get the gasoline consume
 pre:
 pos: get the gasoline consume of the hybridCar
 @return double gasolineConsume
 */
@Override
public double getGasolineConsume(){
	
	return gasolineConsume;
}

/** Set the gasoline tank
 pre:
 pos: set the gasoline tank of the hybridCar
 @param gasolineTank  the gasoline tank of the hybridCar
 */
@Override
public void setGasolineTank(double gasolineTank){
	
	this.gasolineTank = gasolineTank;
}

/** Set the gasoline type
 pre:
 pos: set the gasoline type of the hybridCar
 @param gasolineType  the gasoline type of the hybridCar
 */
@Override 
public void setGasolineType(String gasolineType){
	
	this.gasolineType = gasolineType;
}

/** Set the gasoline consume
 pre:
 pos: set the gasoline consume of the hybridCar
 @param gasolineConsume  the gasoline consume of the hybridCar
 */
@Override
public void setGasolineConsume(double gasolineConsume){
	
	this.gasolineConsume = gasolineConsume;
}

/** get the info of the hybridCar
 pre:
 pos: get the info of the hybridCar
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
	
	info+= "\ntypeOfCharge: " + typeOfCharge;
	info+= "\nbateryDuration: " + bateryDuration;
	info+= "\nbateryConsume: " + bateryConsume;
	info += "\nSoat: " + getDocuments().get((getDocuments().size()-2)).getYear();
	info += "\nMechanicalTec: " + getDocuments().get((getDocuments().size()-1)).getYear();
	
   return info;
}

 else{
	 
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
	
	info+= "\ntypeOfCharge: " + typeOfCharge;
	info+= "\nbateryDuration: " + bateryDuration;
	info+= "\nbateryConsume: " + bateryConsume;
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