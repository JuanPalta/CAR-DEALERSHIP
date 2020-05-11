package model;

/**
* Class MechanicalTec
*
* Class extends of Documents
*
*@author JuanPalta
*/
public class MechanicalTec extends Documents{
	
	/** ATRIBUTES */
	private double gaslevel;
 
	/**Constructor of the MechanicalTec Class
		pre:
		pos:  build a instance of mechanical tec
		@param price the price of the mechanical tec
		@param year the year of the mechanical tec
		@param gaslevel the gas level of the mechanical tec
		*/
 public MechanicalTec(double price,int year,double gaslevel){
  
  super(price,year);
  this.gaslevel = gaslevel;

 }	 
	
	/** Get the gas level of the mechanical tec
	pre:
	pos: get the gas level of the mechanical tec
	@return double gaslevel
	*/
 public double getGasLevel(){

	return gaslevel;
 }
 
	/** Set the gas level of the mechanical tec
	pre:
	pos: set the gas level of the mechanical tec
	@param gaslevel the gas level of the mechanical tec
	*/
 public void setGaslevel(double gaslevel){
	 
	 this.gaslevel = gaslevel;
 }
 
  /** Get the code of the mechanical tec
  pre:
  pos:  get the code of the mechanical tec
  */
 @Override
 public String getCode(){
	 
	 String info = "";
	 for(int i = 0; i==0;i++){
		 
	    for(int j = 0;j<WIDTH;j++){
		 
	  info+= getImage()[i][j];
	  
	 }
	 }
	 
	 int k = 2;
	 for(int i = 1 ; i<HEIGHT; i++){
		 
		
			 
			 info+= getImage()[i][k];
		 k--;
	 } 
	 
	 for(int i= WIDTH-1; i == WIDTH-1; i++){
		 
		 
		 for(int j = 1; j<WIDTH; j++){
			 
			 info+= getImage()[i][j];
		 }
		 
	 }
	 
	 setCode(info);
	 return info;
 }
 


}