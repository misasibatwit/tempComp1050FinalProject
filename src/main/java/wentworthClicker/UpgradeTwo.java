package wentworthClicker;

public class UpgradeTwo extends UpgradesBase {

	public UpgradeTwo() {
		this(2.0,50,"2x multiplier", false);
	}

	public UpgradeTwo(double multiplier, double cost, String upgradeName, boolean owned) {
		super(multiplier, cost, upgradeName, owned);
		
	}
}
