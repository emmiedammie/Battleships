package grid01;

import java.util.ArrayList;


import javax.swing.JOptionPane;

public class BattleShips {

	private Grid theGrid = new Grid();
	
	
	public void play() {
		int row = 0;
		int square = 0;
		int maxNumber = 10;
		int minNumber = 1;
		String rowToFire,columnToFire;
		int play;
		
		
		//creating the ships objects
		Ship s1 = new Ship("Aircraft Carrier", 5, 2);
		Ship s2 = new Ship("Battleship", 4, 4);
		Ship s3 = new Ship("Submarine", 3, 6);
		Ship s4 = new Ship("Destroyer", 2, 8);
		Ship s5 = new Ship("Patrol Boat", 1, 10);
				
		//creating a collection for ships
		ArrayList <Ship> theShips = new ArrayList <Ship>();
		
		//add each ship to the collection
		theShips.add(s1);
		theShips.add(s2);
		theShips.add(s3);
		theShips.add(s4);
		theShips.add(s5);
		
		
		//placing the ships randomly on the Grid
		for(Ship tempShip : theShips) {	
			
			//generate random numbers to place the ships
			for (int i = 1; i<=1; i++) {
				int randomRow = (int) (Math.random() * maxNumber + minNumber);
				int randomSquare = (int) (Math.random() * maxNumber + minNumber);
					
				this.theGrid.addShip(tempShip, randomRow, randomSquare);
				System.out.println(tempShip.getType() + " is at row " + randomRow + " and square " + randomSquare);

				}
		}
		
		
		//Accept user guesses for 10 chances
		for (play = 1; play < 11; play++){
			
			rowToFire = JOptionPane.showInputDialog("Specify a row to fire ");
			columnToFire = JOptionPane.showInputDialog("Specify a column to fire ");
		
			//convert user input to integers
			row = Integer.parseInt(rowToFire);
			square = Integer.parseInt(columnToFire);
	
			//Check user guess and determine if it is a Hit or Miss
			boolean checkGuess;
			String output = "";
			
			//call method isThereAShipOn the row and square
			checkGuess = this.theGrid.isThereAShipOn(row, square);
			
			//Logic to determine if it is a Hit or Miss
			if (checkGuess == true) {
				output = "Hit!";

				
				//Remove an already Hit ship from the Grid
				for(Ship tempShip : theShips) {	
					this.theGrid.removeShip(tempShip, row, square);
						
				}
				
			 }else {
				output = "Miss";
			}
			
		
			JOptionPane.showMessageDialog(null, output);

		}
		

	}
	
	//method to endGame
	public static void endGame() {
		String output;
		
		output = "You have won the game";
		JOptionPane.showMessageDialog(null, output);
		DemoBattleShips.menu();
	}

}
