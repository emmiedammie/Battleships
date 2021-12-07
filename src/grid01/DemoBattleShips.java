package grid01;

import javax.swing.JOptionPane;

public class DemoBattleShips {
	public static void main(String[] args) {
		menu();
		

	}//end main
	
	
	
	//A menu method
	public static void menu() {
		String output, userNum;
		int num;
		
		do{
			//construct output
			output = "Select one of the menu options \n\n";
			output = output + "1 - New Game \n";
			output = output + "2 - Continue Game \n";
			output = output + "3 - High Score \n";
			output = output + "4 - Instructions \n";
			output = output + "5 - Exit";
			
			//prompt user
			userNum = JOptionPane.showInputDialog(output);
			//convert to integer
			num = Integer.parseInt(userNum);
			
			if(num == 1) {
				
				output = "Do you want to play Debug Mode ?";
				if (JOptionPane.showConfirmDialog(null, "Do you want to play DEBUG MODE?", "DEBUG MODE",
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				    // yes option
				} else {
				    // no option
				}
				output = "Battleship game is starting ";
				//display output
				JOptionPane.showMessageDialog(null, output);
				
				BattleShips bs = new BattleShips();
				
				bs.play();
				

			}
			if(num == 2) {
				output = "Would you like to continue last saved game?";
				//display output
				JOptionPane.showMessageDialog(null, output);
			}
			if(num == 3) {
				output = "High Score is ";
				//display output
				JOptionPane.showMessageDialog(null, output);
			}
			if(num == 4) {
				output = "The computer places 5 different ships randomly on a 10 * 10 grid. You are to select and individual square to fire at";
				//display output
				JOptionPane.showMessageDialog(null, output);
			}
		}while (num!= 5);//end do/while loop
	}
	
}
