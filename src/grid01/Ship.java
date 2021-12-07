package grid01;

import javax.swing.JOptionPane;

public class Ship {

	private int length;
	private String type;
	private int points;
	
	//constructor
	public Ship() {}
	public Ship(String type, int length, int points) {
		setLength(length);
		setType(type);
		setPoints(points);
		
	}
		
	
	//toString
	public String toString() {
		String output;
		
		output = "The ship " +this.type +" has length " +this.length + " and " + this.points + " points";
		
		return output;
	
	}//end toString
	public void displayDetails() {
		String output;
		
		output = toString();
		
		JOptionPane.showMessageDialog(null, output);
	}//end displayDetails
	
	//getters and setters
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getPoints() {
		return this.points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}//end Ship

	

