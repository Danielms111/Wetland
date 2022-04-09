package model;

/**
 * @author DanielMontezuma
 * */
public class Wetland{

	private static final int MAX_SPECIE = 100;
 
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
   private ManagementPlan plan;

 /**
  * plan is a variable stored in the ManagementPlan class that gives us the management plan of the wetland
  **/
   private Event event;

   private Species[] species;
 

 
   /**
	* This method set the variables for the species
	* @param name, locationArea, photoUrl, numberOfKm^2, plan, compliancePercentageMP 
	*/
   public Wetland(String name,String locationArea, String photoUrl,double numberOfKm,ManagementPlan plan,double compliancePercentageMP, Event event, Species specie){
	 
	   this.name=name;
	   this.locationArea=locationArea;
	   this.photoUrl=photoUrl;
	   this.numberOfKm=numberOfKm;
	   this.plan=plan;
	   this.compliancePercentageMP=compliancePercentageMP; 
	   species[0] = specie;
   }

   public void addSpecie(String name){

	int contSpecie = 0;

	    if(contSpecie<MAX_SPECIE){

		species[contSpecie] = specie;
		contSpecie++;
	    }
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
     * @param date the date to set
     */
	public ManagementPlan getPlan() {
		return plan;
	}

	/**
     * @param date the date to set
     */
	public Event getEvent() {
		return event;
	}

 
   /**
	* This method get the variables for the wetland
	* @return name show the name of the wetland, locationArea show the name of the location of thw wetland, plan show the management plan of the wetland, compliancePercentageMP show the compliance percentage of the management plan of the wetland, photourl show a photo url of the wetland
	*/
 public String toString(){
	  
	  return name + "\n" + locationArea + "\n" + numberOfKm + "\n" + plan + "\n" + compliancePercentageMP + "\n" + photoUrl + "\n" + event;
  }

}