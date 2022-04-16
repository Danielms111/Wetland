package model;

/**
 * @author DanielMontezuma
 * */
public class Systemm{

	private static final int  MAX_WETLAND = 80;

    private static final int  MAX_SPECIES = 80;

	private static final int  MAX_EVENT = 80;

    /**
     * title is a String type variable that stores the name of the System
     **/
	private String title;

 //Associations
    /**
     * awetalnd is an Wetland array type variable that stores the info of the wetland
     **/
    private Wetland [] aWetland;

    private Species [] aSpecies;

    private Event [] aEvent;


	/**
	 * Constructor
	 * @param tit is a string with the figures manager title tit!= null, tit!= ""
	 **/
	public Systemm(String tit){

		title=tit;

		aWetland = new Wetland[MAX_WETLAND];
        aSpecies = new Species[MAX_SPECIES];
		aEvent = new Event[MAX_EVENT];
	}
    
	/**
	 * This method shows if the array has space for one wetland more
	 */
	public boolean hasSpace(){

		boolean emptyPosition = false;

		for(int i=0; i<MAX_WETLAND && !emptyPosition; i++){

			if(aWetland[i]==null){

				emptyPosition=true;

			}
		}

		return emptyPosition;
	}
    /**
	 * This method get the first empty position in the array 
	 */
	public int getEmptyPosition(){

		boolean emptyPosition = false;

		int first =-1;

		for (int i =0;i<MAX_WETLAND && !emptyPosition;i++){

			if(aWetland[i] == null){

				first = i;
				emptyPosition=true;
			}

		}
		return first;
	}

	/**This method creates the wetland
	 * */
	public String addWetland(String name, String locationArea, String photoUrl, double compliancePercentageMP, double numberOfKm, boolean protectedArea) {

		String out="";
	
		int pos = getEmptyPosition(); //Busco la primera posicion vacia

		if(pos == -1){//Si el arreglo esta lleno

			out="El arreglo esta lleno";

		}else{//Si el arreglo no esta lleno

		    aWetland[pos] = new Wetland (name, locationArea, photoUrl, compliancePercentageMP, numberOfKm, protectedArea);
			out="The wetland was added";

		}

		return out;
		
	}

    public int getEmptyPositionSpe(){

		boolean emptyPosition = false;

		int first =-1;

		for (int i =0;i<MAX_SPECIES && !emptyPosition;i++){

			if(aSpecies[i] == null){

				first = i;
				emptyPosition=true;
			}

		}
		return first;
	}

    /**
	 * Ths method add the Ambiental PlaN to the wetland
	 */
	/*public void addPlanToWetland(String wetlandName, String lA, String urlP, double km, int numPlan){

		ManagementPlan plan = null;

		switch(numPlan){

			case 1:
			       plan = ManagementPlan.RESTORATION;
				   break;
		    case 2:
			       plan = ManagementPlan.MAINTENANCE;
				   break;
			case 3:
			       plan = ManagementPlan.CONSERVATION;
				   break;
			default:
			        System.out.println("Opcion no valida");

		}

	}*/

    public boolean findWetland(String wname){

        boolean find = false;

		for(int i=0; i<MAX_WETLAND && !find; i++){

			if(aWetland[i] != null){
                
                if(aWetland[i].getName().equals(wname)){

				find=true;

                }

			}
		}
		return find;
    }

	public String addSpecieToWetland(String wetlandName, String name, String scientificName, boolean migratoryType, String type) {
		String out = "";
		boolean control = true;
		
		for(int i=0; i < MAX_WETLAND && control == true; i++){
		if(aWetland[i].getName().equals(wetlandName)){
		control = false; // Para que no se repita
		aWetland[i].addSpecie(name, scientificName, migratoryType, type);
		out = "The specie "+name+" was successfully registered in the wetland "+wetlandName;
		}else{
		control = false;
		out = "The register was not successful because the wetland "+ wetlandName+" doesn't exist";
		}
		}
		return out;
		}


	public String addEventToWetland(String wetlandName, String director, double value, String description, int d, int m, int y) {
			String out = "";
			boolean control = true;
			
			for(int i=0; i < MAX_WETLAND && control == true; i++){
			if(aWetland[i].getName().equals(wetlandName)){
			control = false; // Para que no se repita
			Date date = new Date (d , m ,y);
			aWetland[i].addEvent(director, value, description,date);
			out = "The event was successfully registered in the wetland "+wetlandName;
			}else{
			control = false;
			out = "The register was not successful because the wetland "+ wetlandName+" doesn't exist";
			}
			}
			return out;
	}

	public String addPlanToWetland(String wetlandName, String nameP, double percentage,int d, int m, int y) {
		String out = "";
		boolean control = true;
		
		for(int i=0; i < MAX_WETLAND && control == true; i++){
		if(aWetland[i].getName().equals(wetlandName)){
		control = false; // Para que no se repita
		Date date = new Date (d , m ,y);
		aWetland[i].addPlan(nameP, percentage, date);
		out = "The event was successfully registered in the wetland "+wetlandName;
		}else{
		control = false;
		out = "The register was not successful because the wetland "+ wetlandName+" doesn't exist";
		}
		}
		return out;
}



    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return Wetland [] return the aWetland
     */
    public Wetland [] getAWetland() {
        return aWetland;
    }

    /**
     * @param aWetland the aWetland to set
     */
    public void setAWetland(Wetland [] aWetland) {
        this.aWetland = aWetland;
    }

    public String toString(){

        return "Datos del wetland" + "\n" + aWetland[0].toString();
    }

}