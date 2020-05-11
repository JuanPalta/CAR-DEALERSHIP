package model;

import java.util.*;

/**
*	Class Client
*
* Manipulate Client information
*
*@author JuanPalta
*/
public class Client{
	
	/** ATRIBUTES */
	private String name;
	private String lastname;
	private int identification;
	private int number;
	private String email;
	private ArrayList<Vehicle> interestVehicles;
	private ArrayList<Vehicle> myVehicles;
	private boolean withSeller;

	/**constructor for client class
	pre:
	pos:build a client instance
	@param name the name of the client
	@param lastname the lastname of the client
	@param identification the number of identification
	@param number the cellphone number of the client
	@param email the email of the client
	*/
 public Client(String name, String lastname , int identification, int number, String email){
	 
	 this.name = name;
	 this.lastname = lastname;
	 this.identification = identification;
	 this.number = number;
	 this.email = email;
	 myVehicles = new ArrayList<Vehicle>();
	 interestVehicles = new ArrayList<Vehicle>();
	 withSeller = false;
	 
	 
 }
	
	/** Get a name of the client
	pre:
	pos: get a name of the client
	@return String name
	*/
 public String getName(){
		
		return name;
	}
	
	/** Set a name to the client
	pre:
	pos: Set a name to the client
	@param name the name of the client
	*/
 public void setName(String name){
	 
	 this.name = name;
 }
	
	/** Get a lastname of the client
	pre:
	pos: get a lastname of the client
	@return String lastname
	*/
 public String getLastName(){
	 
	 return lastname;
	 
 }
 
	/** Set a lastname to the client
	pre:
	pos: Set a lastname to the client
	@param lastname the lastname of the client
	*/
 public void setLastName(String lastname){
	 
	 this.lastname = lastname;
	 
 }
 
	/** Get a identification of the client
	pre:
	pos: get a identification of the client
	@return int identification
	*/
 public int getIdentification(){
	 
	 return identification;
	 
 }
 
	/** Set a identification to the client
	pre:
	pos: Set a identification to the client
	@param identification the identification of the client
	*/
 public void setIdentification(int identification){
	 
	 this.identification = identification;
 }
 
	/** Get Cellphonenumber of the client
	pre:
	pos: get Cellphonenumber of the client
	@return int number
	*/
 public int getNumber(){
	 
	 return number;
 }
 
	/** Set Cellphonenumber of the client
	pre:
	pos: set Cellphonenumber of the client
	@param number the number of the client
	*/
 public void setNumber(int number){
	 
	 this.number = number;
 }
 
	/** Get email of the client
	pre:
	pos: get email of the client
	@return String email
	*/
 public String getEmail(){
	 
	 return email;
 }
 
 
 /** Set email of the client
	pre:
	pos: Set email of the client
	@param email the email of the client
	*/
 public void setEmail(String email){
	 
	 this.email = email;
 }
 
 /** Get the vehicles purchased
 pre:
 pos: get the list of vehicles purchased
 @return myVehicles
 */
 public ArrayList<Vehicle> getMyVehicles(){
	 
	 return myVehicles;
 }
	
	/** Get the vehicles in interest
 pre:
 pos: get the list of vehicles in interest
 @return interestVehicles
 */
  public ArrayList<Vehicle> getInterestVehicles(){
	 
	 return interestVehicles;
 }
 
 /** Set a seller
 pre:
 pos: Set a seller
 @param withSeller the boolean to determinate if the client have a seller
 */
 public void setWithSeller(boolean withSeller){
	 this.withSeller = withSeller;
 }
 
 /** determinate if the client have a seller
 pre:
 pos: determinate if the client have a seller
 @return withSeller
 */
 public boolean getWithSeller(){
	 return withSeller;
 }



}