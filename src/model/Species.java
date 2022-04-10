package model;

/**
 * @author DanielMontezuma
 * */
public class Species{

  //Attributes
  
  /**
   * name is a String type variable that stores the name of the specie
   * */
  private String name;

  /**
   * type is a String type variable that stores the type of the specie
   * */
  private String type;

  /**
   * scientificName is a String type variable that stores scientific Name of the specie
   * */
  private String scientificName;

  /**
   * migratorySpecie is a boolean type variable that show if the specie is a migratory specie or not
   * */
  private boolean migratorySpecie;

  
 /**
	* This method set the variables for the species
	* @param  name, type, scientificName
	*/
  public Species(String name,String type,String scientificName){
	 
	 this.name=name;
	 this.scientificName=scientificName;
	 this.type=type;
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
   * @return String return the type
   */
  public String getType() {
      return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(String type) {
      this.type = type;
  }

  /**
   * @return String return the scientificName
   */
  public String getScientificName() {
      return scientificName;
  }

  /**
   * @param scientificName the scientificName to set
   */
  public void setScientificName(String scientificName) {
      this.scientificName = scientificName;
  }

    /**
     * @return boolean return the migratorySpecie
     */
    public boolean isMigratorySpecie() {
      return migratorySpecie;
  }

  /**
   * @param migratorySpecie the migratorySpecie to set
   */
  public void setMigratorySpecie(boolean migratorySpecie) {
      this.migratorySpecie = migratorySpecie;
  }

 
 /**
	* This method get the variables for the species
	* @return name show the name of the specie, scientificName show the name of the specie, type show the type of the specie
	*/
   public String toString(){
	  
	  return name + "\n" + scientificName + "\n" + type + "\n" + migratorySpecie;
  }

}