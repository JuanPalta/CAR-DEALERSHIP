package model;

/**
* Class Soat
*
* Class extends of Documents
*
*@author JuanPalta
*/
public class Soat extends Documents{
	
	/** ATRIBUTES */
	private double coverageAmount;
	
	
	/**Constructor of the Soat Class
		pre:
		pos:  build a instance of soat
		@param price the price of the soat
		@param year the year of the soat
		@param coverageAmount the coverage Amount of the soat
		*/
 public Soat(double price,int year,double coverageAmount){
  
   super(price,year);
   this.coverageAmount = coverageAmount;
   
 }	 

	/** Get the coverage amount of the soat
	pre:
	pos: get the coverage amount of the soat
	@return double coverageAmount
	*/
 public double getCoverageAmount(){
	 
	 return coverageAmount;
 }
 
	/** Set the coverage amount of the soat
	pre:
	pos: Set the coverage amount of the soat
	@param coverageAmount the coverage amount of the soat
	*/
 public void setCoverageAmount(double coverageAmount){
	 
	 this.coverageAmount = coverageAmount;
 }
 
 
 /** Get the code of the soat
  pre:
  pos:  get the code of the soat
  */
 @Override
 public String getCode(){
	 
	 String info = "";
	 
	 for(int i = 0; i<HEIGHT;i++){
		 
	    info += getImage()[i][0];
	 }
	 
	 for(int j =1 ;j<WIDTH;j++){
		 
	  info += getImage()[3][j];
	 }
	 setCode(info);
	 return info;
	 
	 
	 
 }
 
}