package model;

/**
 * @author DanielMontezuma
 * */
public class System{

	private static final int  MAX_WETLAND = 80;

	private String title;

 //Associations

    private Wetland [] aWetland;

	/**
	 * Constructor
	 * @param tit is a string with the figures manager title tit!= null, tit!= ""
	 */
	public System(String tit){

		title=tit;

		aWetland = new Wetland[MAX_WETLAND];
	}

	public boolean hasSpace(){

		boolean emptyPosition = false;

		for(int i=0; i<MAX_WETLAND && !emptyPosition; i++){

			if(Wetland[i]==null){

				emptyPosition=true;

			}
		}

		return emptyPosition;
	}

	public int getEmptyPosition(){

		boolean emptyPosition = false;

		int first =-1;

		for (int i =0;i<MAX_WETLAND;i++){

			if(Wetland[i] == null){

				first = i;
				emptyPosition=true;
			}

		}
		return first;
	}

	/**This method creates three objects of the class Point, creates 
	 * an object of the class Circle and sets up the info
	 * */
	public String addWetalnd(String name, String locationArea, String photoUrl, double compliancePercentageMP, double numberOfKm, boolean protectedArea) {

		String out="";
	
		int pos = getEmptyPosition(); //Busco la primera posicion vacia

		if(pos == -1){//Si el arreglo esta lleno

			out="El arreglo esta lleno";

		}else{//Si el arreglo no esta lleno

			ManagementPlan plan = new ManagementPlan ();
			Event event = new Event (eventDirector, value, description, date);
		    aWetland[pos] = new Wetland (name, locationArea, photoUrl, compliancePercentageMP, numberOfKm, protectedArea, plan, event);
			out="The wetland was added";

		}

		return out;
		
	}
 
   /**
	* This method get the variables for the system
	* @return type show the type of the wetland, protected show the wetland is a protected Area, specie show the specie of the wetland, eType show the type of the event
	*/
    public String toString(){
	  
	  return type + "\n" + protectedArea + "\n" + migratorySpecies + "\n" + specie + "\n" + eType;
    }
 


}