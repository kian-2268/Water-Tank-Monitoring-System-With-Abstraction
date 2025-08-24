package waterTank;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		WaterTank tank;
		String choice;
		String action;
		String status;
		int fillLiters;
		int useLiters;
		
		choice = JOptionPane.showInputDialog("Enter type of tank:\n(1) Home Tank (200 liters) \n(2) Building Tank (1000 liters)");
		
		if(choice.equals("1")) {
			tank = new HomeTank();
		}
		
		else if (choice.equals("2")) {
			tank = new BuildingTank();
			
		} else {
			JOptionPane.showMessageDialog(null, "Inavalid input choice. Please enter 1 or 2 only.");
			return;
		}
		
		while(true) {
			action = JOptionPane.showInputDialog("Choose action:\n(1) Fill tank \n(2) Use water \n(3) Check Status \n(4) Exit");
			
			if (action == null || action.equals("4")) {
				JOptionPane.showMessageDialog(null, "Thank you for using the program!");
				break;
			}
			
			switch (action) {
			case "1":
				fillLiters = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of liter(s) to fill: "));
				tank.fillTank(fillLiters);
				break;
				
			case "2":
				useLiters = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of liter(s) to use: "));
				tank.useWater(useLiters);
				break;
				
			case "3":
				JOptionPane.showMessageDialog(null, tank.checkStatus());
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Inavalid input choice. Please enter 1,2,3, or 4 only.");
			}
			
			status = tank.checkStatus();
			if(status.contains("full")) {
				JOptionPane.showMessageDialog(null, status + " Program ended.");
				break; 
			}		
		
		}

	}

}
