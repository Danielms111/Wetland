package ui;

import java.util.Scanner;
import model.Systemm;

/**
 * @author DanielMontezuma
 * */
 public class MainSystem{
  
  /**
   * wetland is a System type variable that stores the info of the wetland
   **/
  private Systemm wetlands;

  /**
   * sc is an objet to read the input
   * */
  private Scanner sc;

  public MainSystem(){
		sc= new Scanner(System.in);
  }
  
  /*public static void main(String[]args){
  
    System.out.println("FUNCIONA");
  
  }*/

  public static void main (String[] a){
		// creando un objeto de la clase principal
		MainSystem obPpal = new MainSystem();
		
		//Llamando el método que inicializa la tienda pidiendo datos al usuario
		obPpal.initWetland();
		
		// variable para leer la entrada
		int option= 0;
		
		//ciclo para ejecutar el menu mientras que el usuario no
		// elija la opciOn para salir (0)
		do {
		    option =obPpal.showMenu();
		    obPpal.answerOption(option);
		}while (option !=0);


	}


	/**
	 * Metodo que se encarga de llamar a los mEtodos que resuelven cada uno de los 
	 * requerimientos de la aplicaciOn 
	 * @param userOption, int es el nUmero ingresado por el usuario (no ha sido validado) 
	 */
	public void answerOption(int userOption) {
		switch(userOption) {
		case 0: 
		System.out.println("Cerrando el sistema de humedales");
			break;
		case 1:
		createWetland();
			break;
		case 2:
        registerSpecieInWetland();
			break;
		case 3: 
        registerEventInWetland();
			break;
		case 4:
		createAmbientalPlan();
		    break;	
		case 5: 
        amountOfMaintenanceInWetland();
			break;
		case 6: 
        lessfloraWetland();
            break;
        case 7: 
        searchSpecie();
			break;
        case 8: 
         infoOfWetland();
			break;
        case 9: 
         wetlandWithMostAnimals();
            break;
		default:
		 System.out.println("Seleccione una opcion valida");
    }

	}
    
 /**
	* This method register the wetland
	*/
	public void createWetland(){

		String wname;
		String wlocation;
		String wurlPhoto;
		double percentage;
        double wkm;
        String protectedA;
        boolean aProtected = false;

		System.out.println("Write the name of the wetland");
		wname = sc.nextLine();

		System.out.println("Write the location for the wetland ");
		wlocation = sc.nextLine();

		System.out.println("Write the url of the photo of the wetland");
		wurlPhoto = sc.nextLine();

		System.out.println("Write the compliance percentage of the Management Plan of the wetland");
		percentage = sc.nextDouble();

		System.out.println("Write the number of km^2 of the wetland");
		wkm = sc.nextDouble();

		System.out.println("Write the yes or no if the wetland is a protected area");
		sc.nextLine();
		protectedA = sc.nextLine();

        if(protectedA.equalsIgnoreCase("yes")){

          aProtected = true;
        }if(protectedA.equalsIgnoreCase("no")){

          aProtected = false;
        }
		 wetlands.addWetland(wname,wlocation, wurlPhoto, percentage, wkm, aProtected);
		 
		 //System.out.println(wetlands.toString());

	}
 /**
	* This method register a specie of the wetland
	*/
	public void registerSpecieInWetland(){

		String specieName;
		String specieScientificName;
		String specieType = "";
		int numSpecie;
		String migratory = "";
		boolean migratoryT = false;
		String nomWetland = "";


		System.out.println("En que humedal desea registrar la especie");
		nomWetland = sc.nextLine();

		if(wetlands.findWetland(nomWetland)){

		System.out.println("Write the name of the specie");
		specieName = sc.nextLine();

		System.out.println("Write the scientific name of the specie");
		specieScientificName = sc.nextLine();

		System.out.println("Write the type of the specie : " + "\n" + " (1) Flora terrestre" + "\n" + " (2) Flora acuatica" + "\n" + " (3) ave"
		+ "\n" + " (4) Mamifero" + "\n" + " (5) Acuatico");
		numSpecie = sc.nextInt();

		switch(numSpecie){
			case 1:
			  specieType = "Flora Terrestre";
			  break;
			case 2:
			  specieType = "Flora acuatica";
			  break;
			case 3:
			  specieType = "Ave";
			  break;
			case 4:
			  specieType = "Mamifero";
			  break;
			case 5:
			  specieType = "Acuatico";
			  break;   
			default:
			   System.out.println("La opcion digitada no es valida");      
		}

		System.out.println(specieType);

		System.out.println("Write yes or not if the specie is migratory type");
		sc.nextLine();
		migratory = sc.nextLine();

		if(migratory.equalsIgnoreCase("yes")){

			migratoryT = true;
		}if(migratory.equalsIgnoreCase("no")){
  
			migratoryT = false;
		  }

		wetlands.addSpecieToWetland(nomWetland, specieName, specieScientificName, migratoryT, specieType);

		System.out.println("Specie Registraded");

		}else{

			System.out.println("El humedal digitado no existe");
		}

		 //System.out.println(wetlands.toString());

	}
 /**
	* This method register an event of the wetland
	*/
  public void registerEventInWetland(){

	String nomWetland;
	String nomDirector;
	double value;
	String description;
	int d;
	int m;
	int y;

	System.out.println("Digite el nombre del wetland en el que quiere realizar el evento");
	nomWetland = sc.nextLine();

	if(wetlands.findWetland(nomWetland)){

		System.out.println("Digite el nombre del director del evento");
		nomDirector = sc.nextLine();

		System.out.println("Digite el valor del vento");
		value = sc.nextDouble();

		System.out.println("Digite una descripcion del vento");
		sc.nextLine();
		description = sc.nextLine();

		System.out.println("Digite el dia del evento");
		d = sc.nextInt();

		System.out.println("Digite el mes del evento");
		m = sc.nextInt();

		System.out.println("Digite el año del evento");
		y = sc.nextInt();

		wetlands.addEventToWetland(nomWetland, nomDirector, value, description, d, m, y);

		System.out.println("Event Ceeated");

	}else{
		System.out.println("The wetland digitado does not exist");
	}
  }

  /**
	* This method show the amount of maintenances activities in a wetland
	*/
	public void createAmbientalPlan(){

		String type = "";
		double percentage;
		int d;
		int m;
		int y;
		String wName;
		int nType;

		System.out.println("Digite el nombre del wetland en el que desea registrar el plan de manejo ambiental ");
		wName = sc.nextLine();

		if(wetlands.findWetland(wName)){

			System.out.println("Choose the type of the Ambiental Management Plan" + "\n" + "(1) Restoration" + "\n" + "(2) Maintenance" + "\n" + "(3) Conservation");
			nType = sc.nextInt();

			switch(nType){
				case 1:
				  type = "Restoration";
				  break;
				case 2:
				  type = "Maintenance";
				  break;
				case 3:
				  type = "Conservation";
				  break;
				default:
				   System.out.println("La opcion digitada no es valida");      
			}

			System.out.println("Write the percentage compliance of the ambiental plan");
			percentage = sc.nextInt();

			System.out.println("Digite el dia");
			d = sc.nextInt();

			System.out.println("Digite el mes");
			m = sc.nextInt();

			System.out.println("Digite el año");
			y = sc.nextInt();

			wetlands.addPlanToWetland(wName, type, percentage, d, m, y);

		}else{

			System.out.println("The wetland does not exist");

		}

	}


   /**
	* This method show the amount of maintenances activities in a wetland
	*/
  public void amountOfMaintenanceInWetland(){

	    String wName;

		System.out.println("Write the name of the wetland");
		wName = sc.nextLine();

		if(wetlands.findWetland(wName)){

			System.out.println(wetlands.findWetlandPlan(wName));

		}else{

			System.out.println("The wetland does not exist");
		}

		
	}

 /**
	* This method show the wetland with less flora
	*/
  public void lessfloraWetland(){

		System.out.println(wetlands.getLessFlora());
	}	
 /**
	* This method search a Specie and show all teh wetlands that contains them
	*/
  public void searchSpecie(){

	    String nomSpecie;
		System.out.println("Write the name of the Specie");
		nomSpecie = sc.nextLine();

		System.out.println(wetlands.getWetlandSpecie(nomSpecie));
	}
 /**
	* This method show the info of the wetland
	*/
  public void infoOfWetland(){

	   System.out.println(wetlands.toString());
		
	}
 /**
	* This method show the wetland with most animals
	*/
  public void wetlandWithMostAnimals(){

		System.out.println(wetlands.getMostAnimals());
	}


	/**
	 * Metodo que permite crear instancias de los objetos con informaciOn ingresada
	 * por el usuario
	 */
	public void initWetland() {
		System.out.println("Bienvenido al sistema de humedales, introduce el nombre del sistema");
        String tit = sc.nextLine();
	    wetlands = new Systemm(tit);	
		
	}

	/**
	 * Metodo que muestra el menu de la aplicaciOn, a este metod hace falta implementar la validaciOn
	 * del valor ingresado por el usuario
	 * @return input, int es la opciOn elegida por el usuario
	 */
	public int showMenu() {
		int input;
		System.out.println("\n\nMenu del wetland, digite una opción\n"+ 
		                    "(1) Crear un humedal\n" +
		                    "(2) Registrar una nueva especie en el humedal\n" +
		                    "(3) Registrar un evento en el humedal\n"+
							"(4) Registrar un plan de manejo ambiental en el humedal\n"+
		                    "(5) Informar para cada humedal, la cantidad de mantenimientos en un año dado por el usuario\n"+
		                    "(6) Desplegar el nombre del humedal con menos especies de flora\n"+
		                    "(7) Dado el nombre de una especie, desplegar los humedales donde se encuentre \n"+
                            "(8) Desplegar la informacion de todos nuestros humedales, incliyendo el total de especies por tipo\n"+
                            "(9) Desplegar el nombre del humedal con mayor cantidad de animales\n"+
                            "(0) Para salir"
		);
		input = sc.nextInt();
		sc.nextLine();
		return input;
	}

}