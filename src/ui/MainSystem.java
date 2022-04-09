package ui;

import java.util.Scanner;
import model.System;

/**
 * @author DanielMontezuma
 * */
public class MainSystem{

  private System wetland;

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
		/*System.out.println("La informaciOn de la tienda es la siguiente:");
		System.out.println(store);
		System.out.println("Los comics disponibles son: " + "\n");
		System.out.println(store.getComics());*/
      break;
    case 6: 
        searchSpecie();
			break;
    case 7: 
         nfoOfWetland();
			break;
    case 8: 
         wetlandWithMostAnimals();
      break;
    }

	}
    
	/**
	* This method register the comic
	*/
	public void createWetland(){

		String name;
		double price;
		int nums;

		System.out.println("Write the name of the wetland");
		name = sc.nextLine();

		System.out.println(" Write the location for the wetland ");
		nums = sc.nextInt();

		System.out.println("Write the url of the photo of the wetland");
		price = sc.nextDouble();

		System.out.println("Write the compliance percentage of the Management Plan of the wetland");
		nameAuthor = sc.nextLine();

		System.out.println("Write the number of km^2 of the wetland");
		idAuthor = sc.nextLine();

		System.out.println("Write the yes or not if the wetland is a protected area" + "\n");
		price = sc.nextDouble();

    System.out.println("Write the yes or not if the wetland is a protected area" + "\n");
		price = sc.nextDouble();

    System.out.println("Write the yes or not if the wetland is a protected area" + "\n");
		price = sc.nextDouble();

    System.out.println("Write the yes or not if the wetland is a protected area" + "\n");
		price = sc.nextDouble();

		int optionGenre = genre;

		store.addComic(name, nums, price);

	}

	public void registerSpecieInWetland(){

		System.out.println("Comic sold");
	}

  public void registerEventInWetland(){

		System.out.println("Comic sold");
	}

  public void amountOfMaintenanceInWetland(){

		System.out.println("Comic sold");
	}

  public void lessfloraWetland(){

		System.out.println("Comic sold");
	}	

  public void searchSpecie(){

		System.out.println("Comic sold");
	}

  public void infoOfWetland(){

		System.out.println("Comic sold");
	}

  public void wetlandWithMostAnimals(){

		System.out.println("Comic sold");
	}


	/**
	 * Metodo que permite crear instancias de los objetos con informaciOn ingresada
	 * por el usuario
	 */
	public void initWetland() {
		System.out.println("Bienvenido al sistema de humedales");
		wetlands = new System();
		
		
		
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