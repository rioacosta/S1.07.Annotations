package nivel1;

public class MainNivel1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker workerExample = new Worker("Maira", "Casanova", 40);
		double workerPayment = workerExample.calculatePayment(120);
		System.out.println(workerPayment);
		
		OnlineWorker onlineWorkerExample = new OnlineWorker("Maira", "Casanova", 40);
		double showOnlineWorkerPayment = onlineWorkerExample.calculatePayment(120);
		System.out.println(showOnlineWorkerPayment);
		
		PresentialWorker presentialWorkerExample = new PresentialWorker("Omar", "Monagas", 40);
		double showPresentialWorkerPayment = presentialWorkerExample.calculatePayment(120);
		System.out.println(showPresentialWorkerPayment);
		
		System.out.println(presentialWorkerExample.obsoleteMethod());
		System.out.println(onlineWorkerExample.obsoletMethod());
						
	}

}
