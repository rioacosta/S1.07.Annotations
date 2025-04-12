package nivel1.entities;

public class OnlineWorker extends Worker {
    public static final double INTERNET_CONECTION = 50.0;

    public OnlineWorker(String name, String lastName, double payPerHour) {
        super(name, lastName, payPerHour);
    }
    @Override
    public double calculatePayment(int hoursWorked) {
        return (hoursWorked * super.getPayPerhour()) + INTERNET_CONECTION;
    }
    @Deprecated
    public double paymentObsoletMethod(int hoursWorked) {
        return super.calculatePayment(hoursWorked);
    }
}