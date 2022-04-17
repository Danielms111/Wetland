package model;

public class ManagementPlan {

    private String name;
    private Date date;
    private double compliancePercentage;

    public ManagementPlan(String name , double compliancePercentage, Date date){
        
        this.name=name;
        this.date = date;
        this.compliancePercentage = compliancePercentage;
    }

    public int getYear(){

        int out = date.getYear();

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
     * @return Date return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return double return the compliancePercentage
     */
    public double getCompliancePercentage() {
        return compliancePercentage;
    }

    /**
     * @param compliancePercentage the compliancePercentage to set
     */
    public void setCompliancePercentage(double compliancePercentage) {
        this.compliancePercentage = compliancePercentage;
    }

    public String toString(){
	  
        return "The environmental management plan is " + name + " type " + "\n" +  "the complieance percentage is " + compliancePercentage + "%" +
               "\n" + "and the date is "  + date;
    }

}