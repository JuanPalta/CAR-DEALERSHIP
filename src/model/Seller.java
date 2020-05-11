package model;
/**
*	Class Seller
*
* Manipulate Seller information
*
*@author JuanPalta
*/
public class Seller{

	/**ATRIBUTES*/
	private String name;
	private String lastname;
	private int identification;
	private int numberOfSell;
	private Client[] clients;

 /**constructor for Seller class
	pre:
	pos:build a seller instance
	@param name the name of the client
	@param lastname the lastname of the client
	@param identification the number of identification
	*/
 public Seller(String name, String lastname, int identification){
	 
	 this.name = name;
	 this.lastname = lastname;
	 this.identification = identification;
	 numberOfSell = 0;
	 
	 clients = new Client[5];
	 
	 
 }

	/** Get a name of the seller
	pre:
	pos: get a name of the seller
	@return String name
	*/
 public String getName(){
	 
	return name;
 }
	
	/** Set a name to the seller
	pre:
	pos: Set a name to the seller
	@param name the name of the seller
	*/
 public void setName(String name){
	 
	 this.name = name;
 }
 
	/** Get a lastname of the seller
	pre:
	pos: get a lastname of the seller
	@return String lastname
	*/
 public String getLastName(){
	 
	 return lastname;
	 
 }
 
	/** Set a lastname to the seller
	pre:
	pos: Set a lastname to the seller
	@param lastname the lastname of the seller
	*/
 public void setLastName(String lastname){
	 
	 this.lastname = lastname;
	 
 }
 
	/** Get a identification of the seller
	pre:
	pos: get a identification of the seller
	@return int identification
	*/
 public int getIdentification(){
	 
	 return identification;
	 
 }
 
	/** Set a identification to the seller
	pre:
	pos: Set a identification to the seller
	@param identification the identification of the seller
	*/
 public void setIdentification(int identification){
	 
	 this.identification = identification;
 }
 
	/** Get the numberOfSell of the seller
	pre:
	pos: get the numberOfSell of the seller
	@return int numberOfSell
	*/
 public int getNumberOfSell(){
	 
	 return numberOfSell;
	 
 }
 
	/** Set the numberOfSell of the seller
	pre:
	pos: set the numberOfSell of the seller
	@param numberOfSell the numberOfSells
	*/
 public void setNumberOfSell(int numberOfSell){
	 
	 this.numberOfSell = numberOfSell;
 }
 
	/**Get the clients of the seller
	pre:
	pos:Get the clients of the seller
	@return clients
	*/
 public Client[] getClientsSeller(){
	 
	 return clients;
 }
	
	/**Add a client to attend
	pre:
	pos:Add a client to attend
	@param client the client to addClient
	*/
	public void addClient(Client client){
	int contador = 0;
	boolean parcial = false;
	for(int i = 0; i<clients.length & parcial == false;i++){
	if(clients[i] == null){
		
	clients[i] = client;
	parcial = true;
	contador++;}
}
    if(contador == 5){
		System.out.println("This seller already has 5 clients in charge");
	}
}

}