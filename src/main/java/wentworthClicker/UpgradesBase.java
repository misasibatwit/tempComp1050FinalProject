package wentworthClicker;

public abstract class UpgradesBase {
	
	private final double COST;
	private final double MULTIPLIER;
	private boolean OWNED;
	private final String UPGRADE_NAME;
	
	protected UpgradesBase() {
		this(1.0, 1.0, "Upgrade", false);
	}
	
	protected UpgradesBase(double multiplier, double cost, String upgradeName, boolean owned) {
		MULTIPLIER = multiplier;
		COST = cost;
		OWNED = owned;
		UPGRADE_NAME = upgradeName;
	}
	
	public double getCost() {
		return COST;
	}

	public boolean isOwned() {
		return OWNED;
	}
	
	public String getName() {
		return UPGRADE_NAME;
	}

	public double getMultiplier() {
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
