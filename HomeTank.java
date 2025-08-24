package waterTank;

import javax.swing.JOptionPane;


class HomeTank extends WaterTank{
	public HomeTank() {
		
		super(200);
	}
	
	@Override
	public void fillTank(int liters) {
		if (liters <= 0) {
			JOptionPane.showMessageDialog(null, "Inavlid amount of water to fill the tank!");
			return;
		}
		
		if (currentlevel + liters > capacity) {
			JOptionPane.showConfirmDialog(null, "Tank overflow! Please fill the tank up to capacity.");
			currentlevel = capacity;
			
		} else {
			currentlevel += liters;
			JOptionPane.showMessageDialog(null, liters + " liters added. Current level: " + currentlevel + "/" + capacity);
		}
	}
	
	@Override
	public void useWater(int liters) {
		if (liters <= 0) {
			JOptionPane.showMessageDialog(null, "Invalid amount of water to use!");
			return;
		}
		
		if (currentlevel - liters < 0) {
			JOptionPane.showMessageDialog(null, "Not enough water! Water tank is drained.");
			currentlevel = 0;
			
		} else {
			currentlevel -= liters;
			JOptionPane.showMessageDialog(null, liters + " liters used. Current level: " + currentlevel + "/" + capacity);
		}
	}
	
	@Override
	public String checkStatus() {
		if (currentlevel == 0) return "Tank is empty!";
		if (currentlevel == capacity) return "Tank is full!";
		return "Tank is in use.";
	}

}
