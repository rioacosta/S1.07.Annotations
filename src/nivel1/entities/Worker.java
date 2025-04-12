package nivel1.entities;

public class Worker {
    protected String name;
    protected String lastName;
    private double payPerHour;

    public Worker (String name, String lastName, double payPerHour) {
        this.name = name;
        this.lastName = lastName;
        this.payPerHour = payPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public double getPayPerhour() {
        return payPerHour;
    }

    public double calculatePayment (int hoursWorked) {
        return hoursWorked * this.payPerHour;
    }

}
