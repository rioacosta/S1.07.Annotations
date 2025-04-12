package nivel1.controller;

import nivel1.entities.OnlineWorker;
import nivel1.entities.PresentialWorker;
import nivel1.entities.Worker;

@SuppressWarnings("deprecated")
public class MainStart {
    public static void startMain () {
        Worker workerExample = new Worker("Maira", "Casanova", 40);
        double workerPayment = workerExample.calculatePayment(120);
        System.out.println("Mostrar el funcionamiento del metodo original de calcular el pago: \n" +
                + workerPayment);

        OnlineWorker onlineWorkerExample = new OnlineWorker("Maira", "Casanova", 40);
        double showOnlineWorkerPayment = onlineWorkerExample.calculatePayment(120);

        PresentialWorker presentialWorkerExample = new PresentialWorker("Omar", "Monagas", 40);
        double showPresentialWorkerPayment = presentialWorkerExample.calculatePayment(120);

        System.out.println("Calcular el sueldo con los pluses utilizando Override: \n"
                + showOnlineWorkerPayment + "\n"
                + showPresentialWorkerPayment);


        System.out.println("Utilizar el metodo deprecated desde las clases hijas, con una SupressWarnings: \n"
               + presentialWorkerExample.paymentObsoletMethod(120) + "\n"
                + onlineWorkerExample.paymentObsoletMethod(120));

    }
}
