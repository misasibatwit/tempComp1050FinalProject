package wentworthClicker;

public class UpgradeOne extends UpgradesBase {

	public UpgradeOne() {
		this(1.5, 10.0, "1.5x \"W\" income", false);
	}

	private UpgradeOne(double multiplier, double cost, String upgradeName, boolean owned) {
		super(multiplier, cost, upgradeName, owned);
	}

	@Override
	double returnCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double returnMultiplier() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	boolean returnOwned() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	String returnName() {
		// TODO Auto-generated method stub
		return null;
	}

}
