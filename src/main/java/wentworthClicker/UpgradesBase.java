package wentworthClicker;

public abstract class UpgradesBase {
	
	public final double COST;
	public final double MULTIPLIER;
	public final boolean OWNED;
	
	public UpgradesBase() {
		this(1.0, 1.0, false);
	}
	
	public UpgradesBase(double multiplier, double cost, boolean owned) {
		MULTIPLIER = multiplier;
		COST = cost;
		OWNED = owned;
		
	}
	
	abstract double returnCost();
	
	abstract double returnMultiplier();
	
	abstract double returnOwned();
	
}
