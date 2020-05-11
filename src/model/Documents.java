package model;
import java.util.*;

/**
* Class Documents
*
* Class Abstract to Soat And MechanicalTec
*
*@author JuanPalta
*/
public abstract class Documents{
	
	/** CONSTANTS */
	protected final static int HEIGHT = 4;
	protected final static int WIDTH = 4;
	
	/** ATRIBUTES */
	Random random = new Random();
	private double price;
	private int year;
	private int[][] image;
	private String code;
 
	/** Constructor of Documents class
	pre:
	pos: build a documents instance
	@param price the price of the document
	@param year the year of the document
	*/
 public Documents(double price,int year){
	 
	 this.price = price;
	 this.year = year;
	 image = new int [HEIGHT][WIDTH];
	 
	 for(int i = 0; i<HEIGHT; i++){
		 
		 for(int j= 0; j<WIDTH; j++){
			 
		 image[i][j] = random.nextInt(40);
			  
		 } 
	 }
	 
 }

	/** Get the price of the document
	pre:
	pos: get the price of the document
	@return double price
	*/
 public double getPrice(){

	return price;
 }
 
	/** Set the price of the document
	pre:
	pos: Set the price of the document
	@param price the price of the document
	*/
 public void setPrice(double price){
	 
	 this.price = price;
 }
 
	/** Get the year of the document
	pre:
	pos: get the year of the document
	@return int year
	*/
 public int getYear(){
	 
	 return year;
 }
 
	/** Set the year of the document
	pre:
	pos: Set the year of the document
	@param year the year of the document
	*/
 public void setYear(int year){
	 
	 this.year = year;
 }
 
	/** Abstract method to get the document code
	pre:
	pos: get the code of the document
	@return String code
	*/
	public abstract String getCode();
	
	/** Set the document code
	pre:
	pos: set the code of the document
	@param code the code of the document
	*/
	public void setCode(String code){
		this.code = code;
	}
	
	/** Show the image of the document
	pre:
	pos: Show the image of the document
	*/
	public void showImage(){
	 
	  for(int i = 0; i<HEIGHT; i++){
		 
		 for(int j= 0; j<WIDTH; j++){
			 
		 System.out.print(image[i][j] + "");
			  
		 }
		System.out.println();
	 }
 }
 
	/** Get the image of the document
	pre:
	pos: get the image of the document
	@return int[][] image
	*/
 public int[][] getImage(){
	 
	 return image;
	 
 }

}