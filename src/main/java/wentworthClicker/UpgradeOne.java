package wentworthClicker;

public class UpgradeOne extends UpgradesBase {

	public UpgradeOne() {
		this(1.5, 10.0, "1.5x \"W\" income", false);
	}

	private UpgradeOne(double multiplier, double cost, String upgradeName, boolean owned) {
		super(multiplier, cost, upgradeName, owned);
	}
}
