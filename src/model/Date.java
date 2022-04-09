package model;

/**
 * @author DanielMontezuma
 * */
public class Date{
  
  /**
 * day is an integer type variable that stores the day of the date
 * */
  private int day;
  /**
 * month is an integer type variable that stores the month of the date
 * */
  private int month;
  /**
 * year is an integer type variable that stores the year of the date
 * */
  private int year;
  
  //Set
  
  /**
	* This method set the variables for the date
	* @param  d, m, y
	*/
  public Date(int d, int m, int y){
	  
	  day=d;
	  month=m;
	  year=y;
	  
  }

  
    /**
     * @return int return the day
     */
    public int getDay() {
      return day;
  }

  /**
   * @param day the day to set
   */
  public void setDay(int day) {
      this.day = day;
  }

  /**
   * @return int return the month
   */
  public int getMonth() {
      return month;
  }

  /**
   * @param month the month to set
   */
  public void setMonth(int month) {
      this.month = month;
  }

  /**
   * @return int return the year
   */
  public int getYear() {
      return year;
  }

  /**
   * @param year the year to set
   */
  public void setYear(int year) {
      this.year = year;
  }
  
  
  //Get
  
  /**
	* This method get the variables for the date
	* @return day show the day of the date, month show the month of the date, year show the year of the date
	*/
  public String toString (){
	  
	  return day + "/n" + month + "/n" + year ;
  }

}