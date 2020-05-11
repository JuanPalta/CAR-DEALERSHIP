package ui;
import java.util.*;
import model.*;

public class Main{
 /**CONSTANTS */
/** The actual year */ 
private final static int ACTUALYEAR = 2020;
/**The Principal Menu */
private final static String MENU = "1: ADD CLIENTS " + "\n2: ADD SELLERS(MAX 10)" + "\n3: ASSIGN SELLER" + "\n4: REGISTER VEHICLE" + "\n5: SHOW CATALOGUE" + "\n6: SHOW INTEREST VEHICLES" + "\n7: PURCHASED VEHICLES" +
										"\n8: SEND OLD VEHICLE TO THE YARDS(REMEMBER THAT YOU CAN ONLY SEND ONE AT A TIME) " + "\n9: CHECK OLD VEHICLES" + "\n10:EXIT";
/**The Submenu*/									
private final static String SUBMENU = "FILTER TO: " + "\n1: USED AND NEW" + "\n2: USED" + "\n3: NEW" + "\n4: ELECTRIC CAR" + "\n5: GASOLINE CAR" + "\n6: HYBRID CAR" + "\n7: MOTORCYCLE" + "\n******************************" + 
							"\n8: BUY A VEHICLE" + "\n9: ASSIGN VEHICLE OF INTEREST" + "\n10: APPLY DISCOUNTS " + "\n11: BACK";
public static void main (String[] args){
	
	/** CREATING ITEMS */
    Company consecionario = new Company("CAR DEALERSHIP",1929373);
    consecionario.addClient("Juan","Palta",10022323,4030212,"juan@gmail.com");
	consecionario.addSeller("Cristiano", "Ronaldo",21020322);
	consecionario.addSeller("Leonel", "Messi",2439122);
	consecionario.addSeller("Fabian", "Posso",545480322);
	consecionario.addSeller("Pedro", "Aristizabal",214420322);
	consecionario.addSeller("Ricardo", "Cortes" , 54670222);
	consecionario.addSeller("Alonso", "Xiomara",2430322);
	consecionario.addSeller("Federico", "Dominguez",657020322);
    consecionario.getVehicles().add(new ElectricCar(20000,"Chevrolet",2003,32,0,true,"VAN",2,true,"FAST",48));
    consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( 4343 , 2020 ,0.68));
	consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( 21094 , 2019 ,0.312));
	consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
	
    consecionario.getVehicles().add( new HybridCar(30000,"Nissan",2020,24,0,false,"SEDAN",4,false,480,"DIESEL","NORMAL",24));
    consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( 2103 , 2020 ,0.43));
	consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( 2212 , 2020 ,0.12));
	consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
	
    consecionario.getVehicles().add( new GasolineCar(40000,"Toyota",2011,21,0,false,"VAN",4,true,480,"CORRIENTE"));
    consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( 12123 , 2018 ,0.32));
	consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( 3232 , 2018 ,0.52));
	consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
	
    consecionario.getVehicles().add(new Motorcycle(25000,"KYMCO",2016,16,0, true ,"ASDK921","SCOOTER", 16));
    consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( 50000 , 2017 ,0.54));
	consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( 2032 , 2020 ,0.43));
	consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
	
   /** ATRIBUTES */
   Random randoum = new Random();	
   int option = 0;
   int option2 =0;
   int option3 =0;
   int option4 =0;
   Scanner sc = new Scanner(System.in);
	 
 while(option != 10) {

	/**SHOW THE MENU*/
 System.out.println();
 System.out.println("// WELCOME TO THE " + consecionario.getName().toUpperCase() +  "//");
 System.out.println(MENU); 
 
 option = sc.nextInt();
 sc.nextLine();

 switch(option){
	 
	 /**CREATE A CLIENT*/
	 case 1: 
	 System.out.println("Insert name of the client");
	 String name = sc.nextLine();
	 System.out.println("Insert lastname of the client");
	 String lastname = sc.nextLine();
	 System.out.println("Insert identification of the client");
	 int identification = sc.nextInt();
	 sc.nextLine();
	 System.out.println("Insert cellphone number");
	 int number = sc.nextInt();
	 sc.nextLine();
	 System.out.println("Insert Email");
	 String email = sc.nextLine();
	 consecionario.addClient(name,lastname,identification,number,email);
	 break;
	 
	 /**CREATE A SELLER */
	 case 2:
	 
	 System.out.println("Insert name of the seller");
	 name = sc.nextLine();
	 System.out.println("Insert lastname of the seller");
	 lastname = sc.nextLine();
	 System.out.println("Insert identification of the seller");
	 identification = sc.nextInt();
	 sc.nextLine();
	 
	 consecionario.addSeller(name,lastname,identification);
	 break;
	 
	 /**ASSING A SELLER TO A CLIENT */
	 case 3:
	int idenficatorSeller = 0;
	int idenficatorClient = 0;
	int verification = 0;
	
	
	System.out.println("Chosee the client");
	System.out.println();
    for(int i = 0; i<consecionario.getClients().size();i++){
  
      System.out.println( (i+1) + " " + consecionario.getClients().get(i).getName() + " " + consecionario.getClients().get(i).getLastName());
	}
    System.out.println();
    idenficatorClient = sc.nextInt();
	sc.nextLine();
	
	if(consecionario.getClients().get(idenficatorClient-1).getWithSeller() == false){
	
    System.out.println("Chosee the seller to assing:");
	System.out.println();
	
	for(int i=0; i<consecionario.getSeller().length;i++){
		
		if(consecionario.getSeller()[i] != null){
			
			System.out.println( (i+1) + " " + consecionario.getSeller()[i].getName() + " " + consecionario.getSeller()[i].getLastName());
			verification ++;
		
		
	} 
	
	}
	
	if(verification == 0){
		
		System.out.println("you dont have Sellers");
		
	}
	
	else {
		idenficatorSeller = sc.nextInt();
		consecionario.getSeller()[idenficatorSeller-1].addClient(consecionario.getClients().get(idenficatorClient-1));
		consecionario.getClients().get(idenficatorClient-1).setWithSeller(true);
		System.out.println();
		}
		
		
	}
	  else {
      System.out.println();  
	  System.out.println("This client already have a seller");
	  System.out.println();}
	 break;
	 
	 /** REGISTER A NEW OR USED VEHICLES */
	 case 4:
	int basePrice = 0;
	String brand = "";
	int model = 0;
	double displacement = 0;
	double mileage = 0;
	String owner = "";
    String licensePlate = "";
	String type = "";
	int numberDoor = 0;
	boolean polarize = false;
	String typeOfCharge = "";
	double bateryDuration = 0;
	double gasolineTank = 0;
	String gasolineType = "";
	 
	System.out.println("What vehicle do you want register" + "\n1:CAR" + "\n2:MOTORCYCLE");
	option = sc.nextInt();
	System.out.println();
 
	if(option == 1){
	
	 
    System.out.println("New or used car" + "\n1:NEW" + "\n2:USED");
    option2 = sc.nextInt();
	System.out.println();

    if(option2 == 1){

     System.out.println("Type of car" + "\n1:ELECTRIC CAR" + "\n2:GASOLINE CAR" + "\n3:HYBRID CAR");
     option3 = sc.nextInt();
	 System.out.println();
     
	 if(option3 == 1){
		 
		 System.out.println("Insert the basePrice");
		 basePrice = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the brand");
		 brand = sc.nextLine();
		 
		 System.out.println("Insert the type (SEDAN OR VAN)");
		 type = sc.nextLine();
		 
		 System.out.println("Insert the model");
		 model = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the displacement");
		 displacement = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the number of doors");
		 numberDoor = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the type Of Charge (FAST OR NORMAL)");
		 typeOfCharge = sc.nextLine();
		 
		 System.out.println("Insert the duration of the batery");
		 bateryDuration = sc.nextDouble();
		 sc.nextLine();
		 
		System.out.println("The car have polarize" +"\n1:YES" + "\n2:NO");
		option4 = sc.nextInt();
		System.out.println();
		 
		 if(option4 == 1){
		 consecionario.getVehicles().add( new ElectricCar(basePrice,brand,model,displacement,0,false,type,numberDoor,true,typeOfCharge,bateryDuration));
		 
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=ACTUALYEAR;i++){
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));
		 
		 }
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		 }
		 
		 else if(option4 == 2){
		 consecionario.getVehicles().add( new ElectricCar(basePrice,brand,model,displacement,0,false,type,numberDoor,false,typeOfCharge,bateryDuration));
		 
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=ACTUALYEAR;i++){
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));
		 }
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		}
		}
	
	if(option3 == 2){
		 
		 System.out.println("Insert the basePrice");
		 basePrice = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the brand");
		 brand = sc.nextLine();
		 
		 System.out.println("Insert the type (SEDAN OR VAN)");
		 type = sc.nextLine();
		 
		 System.out.println("Insert the model");
		 model = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the displacement");
		 displacement = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the number of doors");
		 numberDoor = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the type Of gasoline (EXTRA,CORRIENTE OR NORMAL)");
		 gasolineType = sc.nextLine();
		 
		 System.out.println("Insert the quantity of the tank");
		 gasolineTank = sc.nextDouble();
		 sc.nextLine();
		
		 
		System.out.println("The car have polarize" +"\n1:YES" + "\n2:NO");
		option4 = sc.nextInt();
		System.out.println();
		 
		 if(option4 == 1){
		 consecionario.getVehicles().add(new GasolineCar(basePrice,brand,model,displacement,0,false,type,numberDoor,true,gasolineTank,gasolineType));
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=ACTUALYEAR;i++){
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));
		 }
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		 }
		 
		 else if(option4 == 2){
		 consecionario.getVehicles().add(new GasolineCar(basePrice,brand,model,displacement,0,false,type,numberDoor,false,gasolineTank,gasolineType));
		 
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=ACTUALYEAR;i++){
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));
		 }
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		 }	 
		 
		 
	 

	}
	
	if(option3 == 3){
		 
		 System.out.println("Insert the basePrice");
		 basePrice = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the brand");
		 brand = sc.nextLine();
		 
		 System.out.println("Insert the type (SEDAN OR VAN)");
		 type = sc.nextLine();
		 
		 System.out.println("Insert the model");
		 model = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the displacement");
		 displacement = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the number of doors");
		 numberDoor = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the type Of Charge (FAST OR NORMAL)");
		 typeOfCharge = sc.nextLine();
		 
		 System.out.println("Insert the duration of the batery");
		 bateryDuration = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the type Of gasoline (EXTRA,CORRIENTE OR NORMAL)");
		 gasolineType = sc.nextLine();
		 
		 System.out.println("Insert the quantity of the tank");
		 gasolineTank = sc.nextDouble();
		 sc.nextLine();
		 
		System.out.println("The car have polarize" +"\n1:YES" + "\n2:NO");
		option4 = sc.nextInt();
		System.out.println();
		 
		 if(option4 == 1){
		 consecionario.getVehicles().add(new HybridCar(basePrice,brand,model,displacement,0,false,type,numberDoor,true,gasolineTank,gasolineType,typeOfCharge,bateryDuration));
		double coverage = randoum.nextDouble();
		double gas = randoum.nextDouble();
		 for(int i = model ; i<=ACTUALYEAR;i++){
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));
		 
		 }
		consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));		 
		 }

		else if(option4 == 2){
		 consecionario.getVehicles().add(new HybridCar(basePrice,brand,model,displacement,0,false,type,numberDoor,false,gasolineTank,
											gasolineType,typeOfCharge,bateryDuration));
											
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=ACTUALYEAR;i++){
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));
		 }
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		 
		}
											
 }
	 } 
 
	if(option2 == 2){

     System.out.println("Type of car" + "\n1:ELECTRIC CAR" + "\n2:GASOLINE CAR" + "\n3:HYBRID CAR");
     option3 = sc.nextInt();
	 System.out.println();
     
	 if(option3 == 1){
		 
		 System.out.println("Insert the basePrice");
		 basePrice = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the brand");
		 brand = sc.nextLine();
		 
		 System.out.println("Insert the type (SEDAN OR VAN)");
		 type = sc.nextLine();
		 
		 System.out.println("Insert the model");
		 model = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the displacement");
		 displacement = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the mileage");
		 mileage = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the licensePlate");
		 licensePlate = sc.nextLine();
		 
		 System.out.println("Insert the number of doors");
		 numberDoor = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the type Of Charge (FAST OR NORMAL)");
		 typeOfCharge = sc.nextLine();
		 
		 System.out.println("Insert the duration of the batery");
		 bateryDuration = sc.nextDouble();
		 sc.nextLine(); 
		 
		System.out.println("The car have polarize" +"\n1:YES" + "\n2:NO");
		option4 = sc.nextInt();
		System.out.println();
		
		  System.out.println("Until what year do you have the updated documents");
		  int year = sc.nextInt();
		 
		 if(option4 == 1){
		 consecionario.getVehicles().add( new ElectricCar(basePrice,brand,model,displacement,mileage,true,licensePlate,type,numberDoor,true,typeOfCharge,bateryDuration));
		 
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=year;i++){
			
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));			
		}
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		 } 
		 
		 else if(option4 == 2){
		 consecionario.getVehicles().add( new ElectricCar(basePrice,brand,model,displacement,mileage,true,licensePlate,type,numberDoor,false,typeOfCharge,bateryDuration));
		 
		 
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=year;i++){
			
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));			
	 }
		consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
	 }}
	
	if(option3 == 2){
		 
		 System.out.println("Insert the basePrice");
		 basePrice = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the brand");
		 brand = sc.nextLine();
		 
		 System.out.println("Insert the type (SEDAN OR VAN)");
		 type = sc.nextLine();
		 
		 System.out.println("Insert the model");
		 model = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the displacement");
		 displacement = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the mileage");
		 mileage = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the number of doors");
		 numberDoor = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the licensePlate");
		 licensePlate = sc.nextLine();
		 
		 System.out.println("Insert the type Of gasoline (EXTRA,CORRIENTE OR NORMAL)");
		 gasolineType = sc.nextLine();
		 
		 System.out.println("Insert the quantity of the tank");
		 gasolineTank = sc.nextDouble();
		 sc.nextLine();
		  
		System.out.println("The car have polarize" +"\n1:YES" + "\n2:NO");
		option4 = sc.nextInt();
		System.out.println();
		
		System.out.println("Until what year do you have the updated documents");
		int year = sc.nextInt();
		 
		 if(option4 == 1){
		 consecionario.getVehicles().add(new GasolineCar(basePrice,brand,model,displacement,mileage,true,licensePlate,type,numberDoor,true,gasolineTank,gasolineType));
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=year;i++){
			
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));			
		}
		consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		 } 
		 else if(option4 == 2){
		 consecionario.getVehicles().add(new GasolineCar(basePrice,brand,model,displacement,mileage,true,licensePlate,type,numberDoor,false,gasolineTank,gasolineType));
		 
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=year;i++){
			
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));			
		}
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		 }	 
		 
		 
	 

	}
	
	if(option3 == 3){
		 
		 System.out.println("Insert the basePrice");
		 basePrice = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the brand");
		 brand = sc.nextLine();
		 
		 System.out.println("Insert the type (SEDAN OR VAN)");
		 type = sc.nextLine();
		 
		 System.out.println("Insert the model");
		 model = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the displacement");
		 displacement = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the mileage");
		 mileage = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the number of doors");
		 numberDoor = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the licensePlate");
		 licensePlate = sc.nextLine();
		 
		 System.out.println("Insert the type Of Charge (FAST OR NORMAL)");
		 typeOfCharge = sc.nextLine();
		 
		 System.out.println("Insert the duration of the batery");
		 bateryDuration = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the type Of gasoline (EXTRA,CORRIENTE OR NORMAL)");
		 gasolineType = sc.nextLine();
		 
		 System.out.println("Insert the quantity of the tank");
		 gasolineTank = sc.nextDouble();
		 sc.nextLine();
	
		 
		System.out.println("The car have polarize" +"\n1:YES" + "\n2:NO");
		option4 = sc.nextInt();
		System.out.println();
		
		System.out.println("Until what year do you have the updated documents");
		int year = sc.nextInt();
		 
		 if(option4 == 1){
		 consecionario.getVehicles().add(new HybridCar(basePrice,brand,model,displacement,mileage,true,licensePlate,type,numberDoor,true,gasolineTank,gasolineType,typeOfCharge,bateryDuration));
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=year;i++){
			
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));			
		}

		consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		}

		if(option4 == 2){
		 consecionario.getVehicles().add(new HybridCar(basePrice,brand,model,displacement,mileage,true,licensePlate,type,numberDoor,false,gasolineTank,
		gasolineType,typeOfCharge,bateryDuration));
		
		double coverage = randoum.nextDouble();
		double gas = randoum.nextDouble();
		 for(int i = model ; i<=year;i++){
			
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));			
		}
		consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		
		
		}
											
 }
	  
 }}
 
    if(option == 2){
	 
	System.out.println("New or used motorcycle" + "\n1:NEW" + "\n2:USED");
    option3 = sc.nextInt();
	System.out.println();
	
	if(option3 == 1){
		
		 System.out.println("Insert the basePrice");
		 basePrice = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the brand");
		 brand = sc.nextLine();
		 
		 System.out.println("Insert the model");
		 model = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the displacement");
		 displacement = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the type of motorcycle (STANDARD,SPORT,SCOOTER OR CROSS)");
		 type = sc.nextLine();
		 
		 System.out.println("Insert the quantity of the tank");
		 gasolineTank = sc.nextDouble();
		 sc.nextLine();
		 
		 consecionario.getVehicles().add(new Motorcycle(basePrice,brand,model,displacement,0, false ,type,gasolineTank));
		 
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 for(int i = model ; i<=ACTUALYEAR;i++){
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));
		 }
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
	}
		 
		if(option3 == 2){
		 
		 System.out.println("Insert the basePrice");
		 basePrice = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the brand");
		 brand = sc.nextLine();
		 
		 System.out.println("Insert the model");
		 model = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Insert the licensePlate");
		 licensePlate = sc.nextLine();
		 
		 System.out.println("Insert the displacement");
		 displacement = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the mileage");
		 mileage = sc.nextDouble();
		 sc.nextLine();
		 
		 System.out.println("Insert the type of motorcycle (STANDARD,SPORT,SCOOTER OR CROSS)");
		 type = sc.nextLine();
		 
		 System.out.println("Insert the quantity of the tank");
		 gasolineTank = sc.nextDouble();
		 sc.nextLine();
		 
		System.out.println("Until what year do you have the updated documents");
		 int year= sc.nextInt();
		 
		 consecionario.getVehicles().add(new Motorcycle(basePrice,brand,model,displacement,mileage, true ,licensePlate,type, gasolineTank));
		 
		 double coverage = randoum.nextDouble();
		 double gas = randoum.nextDouble();
		 
		 for(int i = model ; i<= year;i++){
		 double price = i * 0.5;
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new Soat( price , i ,coverage));
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).addDocuments(new MechanicalTec( price , i ,gas));			
		}
		 consecionario.getVehicles().get(consecionario.getVehicles().size()-1).setTotalPrice(consecionario.getVehicles().get(consecionario.getVehicles().size()-1));
		 }
		 
		
 }
 
	 break;
	 
	 /** SHOW THE CATALOGUE OF THE COMPANY */
	 case 5:
		int counter = 0;
		
		/** DETERMINATE IF THE COMPANY HAVE VEHICLES */
		for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i) != null){
				
				counter++;
				
		}}
		
		if(counter >=1){
		
		/** SHOW THE INFO OF THE VEHICLES */
		for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i).getOwner().equals("")){
				System.out.println("********************");
				System.out.println((i+1) + "." +"VEHICLE" + "\n" + consecionario.getVehicles().get(i).getInfo());
				System.out.println("********************");
				
				
		}}
		
		System.out.println();	
		System.out.println(SUBMENU);
		option = sc.nextInt();	
		
		/** SUBMENU -11 IS THE EXIT CONDITION */
		while(option !=11){
		
		/** SHOW VEHICLES NEW AND USED */
		if(option == 1){
		for(int i=0; i<consecionario.getVehicles().size();i++){
			
		if(consecionario.getVehicles().get(i).getOwner().equals("")){
				System.out.println("********************");
				System.out.println((i+1) + "." +"VEHICLE" + "\n" + consecionario.getVehicles().get(i).getInfo());
				System.out.println("********************");
				
				
			}}
			
		System.out.println();	
		System.out.println(SUBMENU);
		option = sc.nextInt();	
			
			}
		
		/** SHOW VEHICLES USED ONLY */
		if(option == 2){
			for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i).getOwner().equals("")){
				if(consecionario.getVehicles().get(i).getUsed() == true){
					
				System.out.println("********************");
				System.out.println((i+1) + "." +" VEHICLE" + "\n" + consecionario.getVehicles().get(i).getInfo());
				System.out.println("********************");
				
				
		}}}
		
		System.out.println();	
		System.out.println(SUBMENU);
		option = sc.nextInt();	
		}
		
		/** SHOW ONLY NEW VEHICLES */
		if(option == 3){
			for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i).getOwner().equals("")){
				if(consecionario.getVehicles().get(i).getUsed() == false){
					
				System.out.println("********************");
				System.out.println((i+1) + "." +" VEHICLE" + "\n" + consecionario.getVehicles().get(i).getInfo());
				System.out.println("********************");
				
				
		}}}
		System.out.println();	
		System.out.println(SUBMENU);
		option = sc.nextInt();	
		}
		
		/**SHOW ONLY ELECTRIC CAR VEHICLES */
		if(option == 4){
			for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i).getOwner().equals("")){
				if(consecionario.getVehicles().get(i) instanceof ElectricCar){
					
				System.out.println("********************");
				System.out.println((i+1) + "." +" VEHICLE" + "\n" + consecionario.getVehicles().get(i).getInfo());
				System.out.println("********************");
				
				
		}}}
		System.out.println();	
		System.out.println(SUBMENU);
		option = sc.nextInt();		
		}
		
		
		/**SHOW ONLY GASOLINE CAR VEHICLES */
		if(option == 5){
			for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i).getOwner().equals("")){
				if(consecionario.getVehicles().get(i) instanceof GasolineCar){
					
				System.out.println("********************");
				System.out.println((i+1) + "." +" VEHICLE" + "\n" + consecionario.getVehicles().get(i).getInfo());
				System.out.println("********************");
				
				
		}}}
		System.out.println();	
		System.out.println(SUBMENU);
		option = sc.nextInt();	
		}
		
		/**SHOW ONLY HYBRID CAR VEHICLES */
		if(option == 6){
			for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i).getOwner().equals("")){
				if(consecionario.getVehicles().get(i) instanceof HybridCar){
					
				System.out.println("********************");
				System.out.println((i+1) + "." +" VEHICLE" + "\n" + consecionario.getVehicles().get(i).getInfo());
				System.out.println("********************");
				
				
		}}}
		System.out.println();	
		System.out.println(SUBMENU);
		option = sc.nextInt();		
		}
		
		/**SHOW ONLY MOTORCYCLE*/
		if(option == 7){
			for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i).getOwner().equals("")){
				if(consecionario.getVehicles().get(i) instanceof Motorcycle){
					
				System.out.println("********************");
				System.out.println((i+1) + "." +" VEHICLE" + "\n" + consecionario.getVehicles().get(i).getInfo());
				System.out.println("********************");
				
				
		}}}
		System.out.println();	
		System.out.println(SUBMENU);
		option = sc.nextInt();	
		}
		
		/** BUY A VEHICLE */
		if(option == 8){
			
			int indexVehicle;
			int indexClient;
			int count = 0;
			System.out.println("Insert the index of the vehicle to buy");
			indexVehicle = sc.nextInt();
			
			for(int i = 0; i<consecionario.getClients().size();i++){
              
			  if(consecionario.getClients().get(i) != null){
				System.out.println("********************");
              System.out.println( (i+1) + "." + " " + consecionario.getClients().get(i).getName() + " " + consecionario.getClients().get(i).getLastName());
			  System.out.println("********************");
			  count = count+1;
			}}
			
			if(count > 0){
				
			System.out.println("Insert the index of the client");
			indexClient = sc.nextInt();

			if(consecionario.getVehicles().get(indexVehicle-1) != null ){
			consecionario.getVehicles().get(indexVehicle-1).setOwner(consecionario.getClients().get(indexClient-1).getName());
			consecionario.getClients().get(indexClient-1).getMyVehicles().add(consecionario.getVehicles().get(indexVehicle-1));
			consecionario.setTotalGain(consecionario.getVehicles().get(consecionario.getVehicles().size()-1).getTotalPrice());
			consecionario.setNumberSale(1);
			consecionario.getVehicles().remove(indexVehicle-1);
			System.out.println();
			System.out.println("Successfully added");
			}
			
			}
			else if(count == 0 || indexVehicle>consecionario.getVehicles().size()){
				 
			System.out.println("The purchase could not be made");}
			
		System.out.println();		
		System.out.println(SUBMENU);
		option = sc.nextInt();	
		}
		
		/**ADD A VEHICLE OF INTEREST*/
		if(option == 9){
			
			int indexVehicle;
			int indexClient;
			int count = 0;
			System.out.println("Insert the index of the vehicle to add in interest vehicles");
			indexVehicle = sc.nextInt();
			
			for(int i = 0; i<consecionario.getClients().size();i++){
              
			  if(consecionario.getClients().get(i) != null){
				  System.out.println("********************");
              System.out.println( (i+1) + "." + " " + consecionario.getClients().get(i).getName() + " " + consecionario.getClients().get(i).getLastName());
			  System.out.println("********************");
			  count = count+1;
			}}
			
			if(count > 0){
				
			System.out.println("Insert the index of the client");
			indexClient = sc.nextInt();

			if(consecionario.getClients().get(indexClient-1) != null){
			consecionario.getClients().get(indexClient-1).getInterestVehicles().add(consecionario.getVehicles().get(indexVehicle-1));
			System.out.println();
			System.out.println("Successfully added");
			}
			
			}
			else if(count == 0 || indexVehicle>consecionario.getVehicles().size()){
				 
			System.out.println("The assign car of interest could not be made");}
			
			
		
		System.out.println();
		System.out.println(SUBMENU);
		option = sc.nextInt();		
			
			
		}
		
		/**MAKE A DISCOUNT IN A VEHICLE*/
		if(option == 10){
			
			int indexVehicle;
			double percentage;
			int count = 0;
			System.out.println("Insert the index of the vehicle to Make discount");
			indexVehicle = sc.nextInt();
			System.out.println("Insert the percentage to discount (IN DECIMAL)");
			percentage = sc.nextDouble();
			
			consecionario.getVehicles().get(indexVehicle-1).modifyDiscount(percentage);
			for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i) != null){
				
				count++;
				
		}}
		
		if(count >=1){
		
		for(int i=0; i<consecionario.getVehicles().size();i++){
			
			if(consecionario.getVehicles().get(i).getOwner().equals("")){
				System.out.println("********************");
				System.out.println((i+1) + "." +"VEHICLE" + "\n" + consecionario.getVehicles().get(i).getInfo());
				System.out.println("********************");
				
				
		}}
			
		System.out.println();	
		System.out.println(SUBMENU);
		option = sc.nextInt();	
			
		}
		
		}
		
		
		}
		
		} else {
			
			System.out.println("Vehicles without stock");
		}
		
	    break;
	 
	 /**SHOW THE INTEREST VEHICLES OF A CLIENT */
	 case 6:
			System.out.println("Insert the index of the client");
			for(int i = 0; i<consecionario.getClients().size();i++){
			System.out.println( (i+1) + " " + consecionario.getClients().get(i).getName() + " " + consecionario.getClients().get(i).getLastName());
			}
			int indexClient = sc.nextInt();
			int count = 0;
			System.out.println();
			
	System.out.println("This client has added to the interest list " + consecionario.getClients().get(indexClient-1).getInterestVehicles().size() + " Vehicles throughout your stay at the company");		
    for(int i = 0; i<consecionario.getClients().get(indexClient-1).getInterestVehicles().size();i++){		
	 
	 if(consecionario.getClients().get(indexClient-1).getInterestVehicles().get(i) != null){
		 
		 System.out.println("********************");
		 System.out.println(consecionario.getClients().get(indexClient-1).getInterestVehicles().get(i).getInfo());
		 System.out.println("********************");
		 System.out.println();
		 count++;
	 }}
	break;
	
	/**SHOW PURCHASED VEHICLES OF A CLIENT */
	case 7:
	
			System.out.println("Insert the index of the client");
			for(int i = 0; i<consecionario.getClients().size();i++){
			System.out.println( (i+1) + " " + consecionario.getClients().get(i).getName() + " " + consecionario.getClients().get(i).getLastName());
			}
			System.out.println();
			indexClient = sc.nextInt();
			System.out.println();
	
	System.out.println("This client has bought " + consecionario.getClients().get(indexClient-1).getMyVehicles().size() + " Vehicles");
    for(int i = 0; i<consecionario.getClients().get(indexClient-1).getMyVehicles().size();i++){		
	 
	 if(consecionario.getClients().get(indexClient-1).getMyVehicles().get(i) != null){
		 
		 System.out.println("********************");
		 System.out.println(consecionario.getClients().get(indexClient-1).getMyVehicles().get(i).getInfo());
		 System.out.println();
		 System.out.println("********************");
		 System.out.println();
	 }}
	break;
	
	/**TRANSPORT THE OLD VEHICLES TO THE YARD*/
	case 8:
			
			
			for(int i =0; i<consecionario.getVehicles().size();i++){
			boolean stop = false;
			for(int j=0; j<consecionario.getUsedVehicles().length & stop ==false; j++){
			if(consecionario.getVehicles().get(i) instanceof Car & consecionario.getVehicles().get(i).getUsed() == true & consecionario.getVehicles().get(i).getModel() < 2015 ){
				
				 if(consecionario.getVehicles().get(i).getModel() == 2014){
				 if(consecionario.getUsedVehicles()[j][0] == null){
				 consecionario.getUsedVehicles()[j][0] = consecionario.getVehicles().get(i);
				 consecionario.getVehicles().remove(i);
				 stop = true;
				 }
				 else{ System.out.println("The vehicle could not be added");}
				 
				}
			
			
				else if(consecionario.getVehicles().get(i).getModel() == 2013){
				if(consecionario.getUsedVehicles()[j][1] == null){
				 consecionario.getUsedVehicles()[j][1]= consecionario.getVehicles().get(i);
				 consecionario.getVehicles().remove(i);
				 stop = true;
				}
				else{ System.out.println("The vehicle could not be added");}
				}
			
			
				else if(consecionario.getVehicles().get(i).getModel() == 2012){
				 if(consecionario.getUsedVehicles()[j][2] == null){
				 consecionario.getUsedVehicles()[j][2]= consecionario.getVehicles().get(i);
				 consecionario.getVehicles().remove(i);
				 stop = true;
				}
				else{ System.out.println("The vehicle could not be added");}
			}
			
				else if(consecionario.getVehicles().get(i).getModel() == 2011){
				 if(consecionario.getUsedVehicles()[j][3] == null){
				 consecionario.getUsedVehicles()[j][3]= consecionario.getVehicles().get(i);
				 consecionario.getVehicles().remove(i);
				 stop = true;
				}
				else{ System.out.println("The vehicle could not be added");}
			}
			
				else if(consecionario.getVehicles().get(i).getModel() < 2011){
				 if(consecionario.getUsedVehicles()[j][4] == null){
				 consecionario.getUsedVehicles()[j][4]= consecionario.getVehicles().get(i);
				 consecionario.getVehicles().remove(i);
				 stop = true;
				}
				else{ System.out.println("The vehicle could not be added");}
			}
					}
			}
			
			}
			
			
		
		
		
	break;
	
	/**FILTER THE CARS IN YARD BY THE YEAR(MODEL)*/
	case 9:
		
		System.out.println("Insert the year of the vehicles you want see");
		int yearused = sc.nextInt();
		
		for(int i = 0; i<consecionario.getUsedVehicles().length;i++){
			
			for(int j = 0; j<consecionario.getUsedVehicles()[i].length;j++){
			
			if(consecionario.getUsedVehicles()[i][j] != null){
				
				if(consecionario.getUsedVehicles()[i][j].getModel() == yearused){
				
				System.out.println();
				System.out.println(consecionario.getUsedVehicles()[i][j].getInfo());
			}
			
		}
		}
		}
		break;
		
	default: System.out.println("SEE YOU LATER, THANKS FOR CHOOSING US");
	break;
	
 } 
	 
	 
	 
 }
	
	
}
}
