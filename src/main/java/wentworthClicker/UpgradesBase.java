package wentworthClicker;

public abstract class UpgradesBase {
	
	public final double COST;
	public final double MULTIPLIER;
	public boolean OWNED;
	public final String UPGRADE_NAME;
	
	public UpgradesBase() {
		this(1.0, 1.0, "Upgrade", false);
	}
	
	public UpgradesBase(double multiplier, double cost, String upgradeName, boolean owned) {
		MULTIPLIER = multiplier;
		COST = cost;
		OWNED = owned;
		UPGRADE_NAME = upgradeName;
		
	}
	
	abstract double returnCost();
	
	abstract double returnMultiplier();
	
	abstract boolean returnOwned();
	
	abstract String returnName();
	
	public void purchaseUpgrade(double pointsOwned) {
		if (canPurchase(pointsOwned)) {
			OWNED = true;
		}
	}
	
	public boolean canPurchase(double pointsOwned) {
		
		if (pointsOwned < COST || OWNED == true) {
			return false;
		}
		return true;
		
	}
	
}
