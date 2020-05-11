package model;
/**
* Class ElectricCar
*
* Class extends of car
*
*@author JuanPalta
*/
public class ElectricCar extends Car implements Electric {
	
	/**ATRIBUTES*/
	private String typeOfCharge;
	private double bateryDuration;
	private double bateryConsume;

/**Constructor for ElectricCar class
pre:
pos: build a ElectricCar used instance
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
@param typeOfCharge the type of the charge (Fast,Normal)
@param bateryDuration the duration of the batery
*/ 	
 public ElectricCar(int basePrice,String brand,int model,double displacement,double mileage,boolean used, String licensePlate, String type, int numberDoor, boolean polarize,String typeOfCharge,
 double bateryDuration){
 
 super(basePrice,brand , model, displacement, mileage, used,licensePlate, type, numberDoor, polarize);
 this.typeOfCharge = typeOfCharge;
 this.bateryDuration = bateryDuration;
 
 if(typeOfCharge.equalsIgnoreCase("fast")){
	 
  bateryConsume = (bateryDuration + 10) *(mileage/100);
 }
 else if(typeOfCharge.equalsIgnoreCase("normal")){
	 bateryConsume = (bateryDuration + 15) *(mileage/100);
}
 }


/**Constructor for ElectricCar class
pre:
pos: build a ElectricCar new instance
@param basePrice the baseprice of the car
@param brand the brand of the car
@param model the model of the car
@param displacement the displacement of the car
@param mileage the mileage(km) of the car
@param used determinate if the car is used or not
@param type the type of the car(Sedan or Van)
@param numberDoor number of doors in the car
@param polarize determinate if the car is polarize or not
@param typeOfCharge the type of the charge (Fast,Normal)
@param bateryDuration the duration of the batery
*/ 
 public ElectricCar(int basePrice,String brand,int model,double displacement,double mileage,boolean used, String type, int numberDoor, boolean polarize,String typeOfCharge,
 double bateryDuration){
 
 super(basePrice,brand , model, displacement, mileage, used, type, numberDoor, polarize);
 this.typeOfCharge = typeOfCharge;
 this.bateryDuration = bateryDuration;
 if(typeOfCharge.equalsIgnoreCase("fast")){
	 
  bateryConsume = (bateryDuration + 10) *(mileage/100);
 }
 else if(typeOfCharge.equalsIgnoreCase("normal")){
	 bateryConsume = (bateryDuration + 15) *(mileage/100);
}
}

/** Get the typeOfCharge
 pre:
 pos: get the typeOfCharge of the electricCar
 @return String typeOfCharge
 */ 
@Override
public String getTypeOfCharge(){
	return typeOfCharge;
}

/** Get the Batery duration
 pre:
 pos: get the batery duration of the electricCar
 @return double bateryDuration
 */ 
@Override
public double getBateryDuration(){
	
	return bateryDuration;
}

/** Get the bateryConsume
 pre:
 pos: get the bateryConsume of the electricCar
 @return double bateryConsume
 */ 
@Override
public double getBateryConsume(){
	
	return bateryConsume;
}

/** Set the typeOfCharge
 pre:
 pos: set the type of charge of the electricCar
 @param typeOfCharge the type of the charge
 */
@Override
public void setTypeOfCharge(String typeOfCharge){
	
	this.typeOfCharge = typeOfCharge;
}

/** Set the batery duration
 pre:
 pos: set the batery duration of the electricCar
 @param bateryDuration the duration of the batery in the electricCar
 */
@Override
public void setBateryDuration(double bateryDuration){
	
	this.bateryDuration = bateryDuration;
}

/** Set the batery consume
 pre:
 pos: set the batery consume of the electricCar
 @param bateryConsume the consume of the batery in the electricCar
 */
@Override
public void setBateryConsume(double bateryConsume){
	
	this.bateryConsume = bateryConsume;
}

/** get the info of the electricCar
 pre:
 pos: get the info of the electricCar
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


}
}}