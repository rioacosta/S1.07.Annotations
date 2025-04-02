package nivel1;

import java.util.Date;

public class PresentialWorker extends Worker{
	public static final double MONTHLY_GAS_PRICE = 100.0;

	public PresentialWorker(String name, String lastName, double payPerHour) {
		super(name, lastName, payPerHour);
	}
	@Override
    public double calculatePayment(int hoursWorked) {
        return (hoursWorked * super.getPayPerhour()) + MONTHLY_GAS_PRICE;
    }
    @Deprecated
    public String obsoleteMethod() {
        Date date = new Date();
        int year = date.getYear();
        return "Old method deprecated: date.getYear()="+date.getYear();
    }
}

