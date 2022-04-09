package model;

/**
 * @author DanielMontezuma
 * */
public class Event{
 
 //Attributes
 
 /**
 * eventDirector is a String type variable that stores th perosn who makes the event
 * */
 private String eventDirector;
 /**
 * value is a double type variable that stores the value of the event
 * */
 private double value;
 /**
 * description is a String type variable that stores a short description of the event
 * */
 private String description;
 
 //Associations
 
 /**
 * date is a variable stored in the Date class that gives us the date of the event
 * */
 private Date date;

 
    /**
	* This method set the variables for the event
	* @param eventDirector, value, description, date
	*/
 public Event(String eventDirector,double value, String description, Date date){
	 
	 this.eventDirector=eventDirector;
	 this.value=value;
	 this.description=description;
	 this.date=date;
 }

    /**
     * @return String return the eventDirector
     */
    public String getEventDirector() {
        return eventDirector;
    }

    /**
     * @param eventDirector the eventDirector to set
     */
    public void setEventDirector(String eventDirector) {
        this.eventDirector = eventDirector;
    }

    /**
     * @return double return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

	/**
     * @param date the date to set
     */
	public Date getDate() {
		return date;
	}

	/**This method creates three objects of the class Point, creates 
	 * an object of the class Rectangle and sets up the info
	 * */
	public void addDate(int day, int month, int year) {
		date = new Date(d, m, y);
	}

    /**
	* This method get the variables for the event
	* @return eventDirector show the name of the person who makes the event, value show the value of the event, description show a description of the event, date show the date of the event
	*/
 public String toString(){
	  
	  return eventDirector + "\n" + value + "\n" + description + "\n" + date;
  }

}