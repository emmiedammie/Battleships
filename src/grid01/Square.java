package grid01;

public class Square {

	private int number;
	private Ship theShip;
	
	public Square(int number) {
		setNumber(number);
	}
	
	public boolean isThereAShip() {
		if(theShip == null) {
			return false;
		}
		return true;
	}
	
	
	//getters and setters
	public void setShip(Ship theShip) {
		this.theShip = theShip;
	}
	
	public void sinkShip(Ship theShip) {
		this.theShip = null;
	}
	
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
	/*
	public void setShip() {//first attempt
		this.ship = true;
	}
	
	public boolean getShip() {
		return this.ship;
	}
	*/
}//end class
