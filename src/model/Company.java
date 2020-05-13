package model;
import java.util.*;

/**
*	Class Company
*
* Manipulate Company information
*
*@author JuanPalta
*/
public class Company{

 /** ATRIBUTES */
 private String name;
 private int identification;
 private int totalGain;
 private int numberSale;
 private Seller[] sellers;
 private Vehicle[][] usedVehicles;
 private ArrayList <Vehicle> vehicles;
 private ArrayList <Client> clients;
 
	/**constructor for Company class
	pre:
	pos:build a Company instance
	@param name the name of the client
	@param identification the number of identification
	*/
 public Company(String name, int identification){

	this.name = name;
	this.identification = identification;
	totalGain = 0;
	numberSale = 0;
	sellers = new Seller[10]; 
	vehicles = new ArrayList<Vehicle>();
	clients = new ArrayList <Client>();
	usedVehicles = new Vehicle[10][5];
	
	
 }
 
	/** Get a name of the Company
	pre:
	pos: get a name of the Company
	@return String name
	*/
 public String getName(){
	 
	 return name;
	 
 }

	/** Set a name to the Company
	pre:
	pos: Set a name to the Company
	@param name the name of the Company
	*/
 public void setName(String name){

	this.name = name;	
}

	/** Get a identification of the Company
	pre:
	pos: get a identification of the Company
	@return int identification
	*/
 public int getIdentificacion(){
	
	return identification;
 }
 
	/** set identification of the Company
	pre:
	pos: set identification of the Company
	@param identification the identification of the company
	*/
 public void setIdentification(int identification){
	 this.identification = identification;
 }

	/** Get the totalgains of the Company
	pre:
	pos: get the totalgains of the Company
	@return int totalGain
	*/
 public int getTotalGain(){
	return totalGain;
 }

	/** set total gains of the Company
	pre:
	pos: set total gains of the Company
	@param totalGain the total gains of the company
	*/
 public void setTotalGain(int totalGain){

	totalGain += totalGain;
 }

	/** Get the number of sales of the Company
	pre:
	pos: get the number of sales of the Company
	@return int numberSale
	*/
 public int getNumberSale(){

	return numberSale;
}
 
	/** set the number of sales of the Company
	pre:
	pos: set the number of sales of the Company
	@param numberSale the the number of sales of the company
	*/
 public void setNumberSale(int numberSale){
	
	this.numberSale += numberSale;
}

 /** Get the sellers in the company
 pre:
 pos: get the sellers in the company
 @return sellers
 */
 public Seller[] getSeller(){

	return sellers;
}

	/** Get the clients in the company
	pre:
	pos: get the clients in the company
	@return clients
	*/
 public ArrayList<Client> getClients(){

	return clients;
}

	/** Get the catalogue of the company
	pre:
	pos: get the catalogue of the company
	@return vehicles
	*/
	public ArrayList<Vehicle> getVehicles(){
	
	return vehicles;
}
	/** Get the old vehicles in the company
	pre:
	pos: get the old vehicles in the company
	@return usedVehicles
	*/
	public Vehicle[][] getUsedVehicles(){
	return usedVehicles;}
	
	/** Add a seller to the company
	pre:
	pos: add a seller to the company
	@param name the name of the seller
	@param lastname the lastname of the seller
	@param identification the identification of the seller
	*/
	public void addSeller(String name, String lastname,int identification){
	boolean exit = false;
	int contador = 0;
  
	for(int i=0; i<sellers.length & exit == false; i++){
		
		if( sellers[i] == null){
			sellers[i] = new Seller(name,lastname,identification);
			exit = true;
			contador++;
		}
	}

  }
	
	/** Add a client to the company
	pre:
	pos: add a client to the company
	@param name the name of the client
	@param lastname the lastname of the client
	@param identification the identification of the client
	@param number the cellphone number of the client
	@param email the email of the client
	*/
    public  void addClient(String name, String lastname,int identification,int number,String email){
			
	clients.add( new Client(name,lastname,identification,number,email));
	
}
}
