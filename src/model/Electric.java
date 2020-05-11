package model;
/** INTERFACE ELECTRIC */
public interface Electric {

	public String getTypeOfCharge();
	public double getBateryDuration();
	public double getBateryConsume();
	
	public void setTypeOfCharge(String typeOfCharge);
	public void setBateryDuration(double bateryDuration);
	public void setBateryConsume(double bateryConsume);



}