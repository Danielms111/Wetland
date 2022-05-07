package model;

/**
 * @author DanielMontezuma
 * */
public class Wetland{

	private static final int MAX_SPECIE = 100;
	private static final int MAX_EVENT = 100;
	private static final int MAX_PLAN = 100;


 
 //Attributes

  /**
   * name is a String type variable that stores the name of the wetland
   **/
   private String name;
  /**
   * locationArea is a String type variable that stores the location of the wetland
   **/
   private String locationArea;
  /**
   * photoUrl is a String type variable that stores the pohot url of the wetland
   **/
   private String photoUrl;
  /**
   * compliancePercentageMP is a double type variable that stores the compliance Percentag of the Management Plan
   **/
   private double compliancePercentageMP;
  /**
   * numberOfKm^2 is a double type variable that stores the number Of Km^2 of the wetland
   **/
   private double numberOfKm;

  /**
   * Protected area is a boolean type variable that show if the wetland is a protected area or not
   **/
   private boolean protectedArea;
 
 //Associations

 /**
  * plan is a variable stored in the ManagementPlan class that gives us the management plan of the wetland
  **/
   private Event [] event;

   private Species[] species;

   private ManagementPlan[] plans;

   private Species a;

   private Event b;

   private ManagementPlan p;
 

 
   /**
	* This method set the variables for the species
	* @param name, locationArea, photoUrl, numberOfKm^2, plan, compliancePercentageMP 
	*/
   public Wetland(String name,String locationArea, String photoUrl,double numberOfKm,double compliancePercentageMP, boolean protectedArea2){
	 
	   this.name=name;
	   this.locationArea=locationArea;
	   this.photoUrl=photoUrl;
	   this.numberOfKm=numberOfKm;
	   this.compliancePercentageMP=compliancePercentageMP; 
	   species = new Species [MAX_SPECIE];
       event  = new Event [MAX_EVENT];
       plans = new ManagementPlan[MAX_PLAN];

       species [0] = a;
       event [0] = b;
       plans [0] = p;
   }

   /*public Wetland(String name,String locationArea, String photoUrl,double numberOfKm,double compliancePercentageMP, boolean protectedArea2, Species a){
	 
    this.name=name;
    this.locationArea=locationArea;
    this.photoUrl=photoUrl;
    this.numberOfKm=numberOfKm;
    this.compliancePercentageMP=compliancePercentageMP; 
    species = new Species [MAX_SPECIE];  
    species [0] = a;
   }

   public Wetland(String name,String locationArea, String photoUrl,double numberOfKm,double compliancePercentageMP, boolean protectedArea2, Event b){
	 
    this.name=name;
    this.locationArea=locationArea;
    this.photoUrl=photoUrl;
    this.numberOfKm=numberOfKm;
    this.compliancePercentageMP=compliancePercentageMP; 
    event = new Event [MAX_EVENT];
    
   }

   public Wetland(String name,String locationArea, String photoUrl,double numberOfKm,double compliancePercentageMP, boolean protectedArea2){
	 
    this.name=name;
    this.locationArea=locationArea;
    this.photoUrl=photoUrl;
    this.numberOfKm=numberOfKm;
    this.compliancePercentageMP=compliancePercentageMP; 
   }*/



   public int getEmptyPositionSpe(){

    boolean emptyPosition = false;

    int first =-1;

    for (int i =0;i<MAX_SPECIE && !emptyPosition;i++){

        if(species[i] == null){

            first = i;
            emptyPosition=true;
        }

    }
    return first;
   }
   
    /**
	 * This method add a Specie to the wetland
	 */
    public String addSpecie(String name, String scientificName, boolean migratoryType, String type) {
        String out = "";
        int emptyPos = getEmptyPositionSpe(); //busco la primera posición vacía
        // si el arreglo está lleno?
        out = "Entra al metodo";
        if(emptyPos == -1){ // está lleno
        //no se puede agregar
        out = "El arreglo está lleno";
        }else{ //Si no está lleno
        species[emptyPos] = new Species(name, scientificName, migratoryType, type);
        out = "El registro fue exitoso";
        }
        return out;
        }

    public int getEmptyPositionEve(){

            boolean emptyPosition = false;
        
            int first =-1;
        
            for (int i =0;i<MAX_EVENT && !emptyPosition;i++){
        
                if(event[i] == null){
        
                    first = i;
                    emptyPosition=true;
                }
        
            }
            return first;
    }

    public String addEvent(String nameD, double value, String description, Date date){

            String out = "";
            int emptyPos = getEmptyPositionEve(); //busco la primera posición vacía
            // si el arreglo está lleno?
            out = "Entra al metodo";
            if(emptyPos == -1){ // está lleno
            //no se puede agregar
            out = "El arreglo está lleno";
            }else{ //Si no está lleno
            event[emptyPos] = new Event(nameD, value, description, date);
            out = "El registro fue exitoso";
            }
            return out;
    }

    public int getEmptyPositionPlan(){

        boolean emptyPosition = false;
    
        int first =-1;
    
        for (int i =0;i<MAX_PLAN && !emptyPosition;i++){
    
            if(plans[i] == null){
    
                first = i;
                emptyPosition=true;
            }
    
        }
        return first;
       }

       public String addPlan(String nameP, double percentage, Date date){

        String out = "";
        int emptyPos = getEmptyPositionPlan(); //busco la primera posición vacía
        // si el arreglo está lleno?
        out = "Entra al metodo";
        if(emptyPos == -1){ // está lleno
        //no se puede agregar
        out = "El arreglo está lleno";
        }else{ //Si no está lleno
        plans[emptyPos] = new ManagementPlan(nameP, percentage, date);
        out = "El registro fue exitoso";
        }
        return out;
    } 

    public String showPlans(){

        String out = "";

        for(int j=0;j<MAX_PLAN;j++){

            if(plans[j] != null){

                out += plans[j].toString();

            }
        }

        return out;
    }

    public int showLessFlora(){
        int cont = 80;

        for(int i=0;i<MAX_SPECIE;i++){

            if(species[i] != null){

                if(species[i].showFlora()<cont){

                    cont = species[i].showFlora();
                }
            }
        }

        return cont;
    }

    public int showMostAnimals(){
        int cont = 0;

        for(int i=0;i<MAX_SPECIE;i++){

            if(species[i] != null){

                if(species[i].showAnimals()>cont){

                    cont = species[i].showAnimals();
                }
            }
        }

        return cont;
    }

    public boolean findSpecie(String nomSpecie){
        boolean out = false;

        for(int i=0;i<MAX_SPECIE;i++){

            if(species[i] != null){

                if(species[i].getWetlandSpecie(nomSpecie)){

                    out = true;
                }
            }
        }

        return out;
    }
        
        

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the locationArea
     */
    public String getLocationArea() {
        return locationArea;
    }

    /**
     * @param locationArea the locationArea to set
     */
    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    /**
     * @return String return the photoUrl
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * @param photoUrl the photoUrl to set
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * @return double return the compliancePercentageMP
     */
    public double getCompliancePercentageMP() {
        return compliancePercentageMP;
    }

    /**
     * @param compliancePercentageMP the compliancePercentageMP to set
     */
    public void setCompliancePercentageMP(double compliancePercentageMP) {
        this.compliancePercentageMP = compliancePercentageMP;
    }

    /**
     * @return double return the numberOfKm
     */
    public double getNumberOfKm() {
        return numberOfKm;
    }

    /**
     * @param numberOfKm the numberOfKm to set
     */
    public void setNumberOfKm(double numberOfKm) {
        this.numberOfKm = numberOfKm;
    }

    /**
     * @return boolean return the protectedArea
     */
    public boolean isProtectedArea() {
        return protectedArea;
    }

    /**
     * @param protectedArea the protectedArea to set
     */
    public void setProtectedArea(boolean protectedArea) {
        this.protectedArea = protectedArea;
    }


    /**
     * @return Event [] return the event
     */
    public Event [] getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(Event [] event) {
        this.event = event;
    }

    /**
     * @return Species[] return the species
     */
    public Species[] getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(Species[] species) {
        this.species = species;
    }

    /**
     * @return Species return the a
     */
    public Species getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Species a) {
        this.a = a;
    }

 
   /**
	* This method get the variables for the wetland
	* @return name show the name of the wetland, locationArea show the name of the location of thw wetland, plan show the management plan of the wetland, compliancePercentageMP show the compliance percentage of the management plan of the wetland, photourl show a photo url of the wetland
	*/
 public String toString(){

    String out = "";
    String out2 = "";

    out += "Name : " + name + "\n" + "Location Area: " + locationArea + "\n" + "photo url: " + photoUrl + "\n" +
      "Number of km^2" + numberOfKm + "\n";


    for(int i=0;i<MAX_SPECIE;i++){

      /* out += "Name : " + name + "\n" + "Location Area: " + locationArea + "\n" + "photo url: " + photoUrl + "\n" +
       "Number of km^2" + numberOfKm + "\n";*/
       
       if(species[i] != null){

        out2 = "**Se metio**";

        out2 += "Species: " + species[i].toString() + "\n";

       }if(plans[i] != null){

        out2 += "Ambiental plan:" + plans[i].toString() + "\n";

       }if(event[i] != null){

        out2 += "Events:" + event[i].toString();
       }
    }
    out += out2;
    return out;
  }


    /**
     * @return ManagementPlan return the plan
     */
    public ManagementPlan getP() {
        return p;
    }

    /**
     * @param plan the plan to set
     */
    public void setPlan(ManagementPlan p) {
        this.p = p;
    }

    /**
     * @return ManagementPlan[] return the plans
     */
    public ManagementPlan[] getPlans() {
        return plans;
    }

    /**
     * @param plans the plans to set
     */
    public void setPlans(ManagementPlan[] plans) {
        this.plans = plans;
    }

    /**
     * @return Event return the b
     */
    public Event getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Event b) {
        this.b = b;
    }

}