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
        amountOfMaintenanceInWetland();
			break;
		case 5: 
        lessfloraWetland();
            break;
        case 6: 
        searchSpecie();
			break;
        case 7: 
         infoOfWetland();
			break;
        case 8: 
         wetlandWithMostAnimals();
            break;
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

		 System.out.println(wetlands.toString());

	}
 /**
	* This method register a specie of the wetland
	*/
	public void registerSpecieInWetland(){

		String specieName;
		String specieScientificName;
		String specieType;
		int numSpecie;
		String nomWetland = "";


		System.out.println("En que humedal desea registrar la especie");
		nomWetland = sc.nextLine();

		if(wetlands.findWetland(nomWetland)){

		System.out.println("Write the name of the specie");
		specieName = sc.nextLine();

		System.out.println("Write the scientific name of the specie");
		specieScientificName = sc.nextLine();

		System.out.println("Write the type of the specie");
		specieType = sc.nextLine();

		wetlands.addSpecie(specieName, specieScientificName, specieType);

		System.out.println("Specie Registraded");

		System.out.println(wetlands.toString());

		}else{

			System.out.println("El humedal digitado no existe");
		}
	}
 /**
	* This method register an event of the wetland
	*/
  public void registerEventInWetland(){

		System.out.println("wetland CReated");
	}
 /**
	* This method show the amount of maintenances activities in a wetland
	*/
  public void amountOfMaintenanceInWetland(){

		System.out.println("wetland CReated");
	}
 /**
	* This method show the wetland with less flora
	*/
  public void lessfloraWetland(){

		System.out.println("wetland CReated");
	}	
 /**
	* This method search a Specie and show all teh wetlands that contains them
	*/
  public void searchSpecie(){

		System.out.println("wetland CReated");
	}
 /**
	* This method show the info of the wetland
	*/
  public void infoOfWetland(){

		System.out.println("wetland CReated");
	}
 /**
	* This method show the wetland with most animals
	*/
  public void wetlandWithMostAnimals(){

		System.out.println("wetland CReated");
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
		                    "(4) Informar para cada humedal, la cantidad de mantenimientos en un año dado por el usuario\n"+
		                    "(5) Desplegar el nombre del humedal con menos especies de flora\n"+
		                    "(6) Ddao el nombre de una especie, desplegar los humedales donde se encuentre \n"+
                            "(7) Desplegar la informacion de todos nuestros humedales, incliyendo el total de especies por tipo\n"+
                            "(8) Desplegar el nombre del humedal con mayor cantidad de animales\n"+
                            "(0) Para salir"
		);
		input = sc.nextInt();
		sc.nextLine();
		return input;
	}

}