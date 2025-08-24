package waterTank;

abstract class WaterTank {
	
	protected int capacity;
	protected int currentlevel;
	
	public abstract void fillTank(int liters);
	public abstract void useWater(int liters);
	public abstract String checkStatus();
	
	public WaterTank(int capacity) {
		this.capacity = capacity;
		this.currentlevel = 0;
	}
	
}
