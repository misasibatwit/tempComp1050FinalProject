package wentworthClicker;

public abstract class UpgradesBase {
	
	public final double COST;
	public final double MULTIPLIER;
	public boolean OWNED;
	public final String UPGRADE_NAME;
	
	protected UpgradesBase() {
		this(1.0, 1.0, "Upgrade", false);
	}
	
	protected UpgradesBase(double multiplier, double cost, String upgradeName, boolean owned) {
		MULTIPLIER = multiplier;
		COST = cost;
		OWNED = owned;
		UPGRADE_NAME = upgradeName;
		
	}
	
	public double returnCost() {
		return COST;
	}

	public boolean returnOwned() {
		return OWNED;
	}
	
	public String returnName() {
		// TODO Auto-generated method stub
		return UPGRADE_NAME;
	}

	public double returnMultiplier() {
		// TODO Auto-generated method stub
		return MULTIPLIER;
	}
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
