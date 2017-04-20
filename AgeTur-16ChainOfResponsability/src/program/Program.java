package program;

import chain_abstractclass.Client;
import chain_abstractclass.Notificator;
import chain_abstractclass.NotificatorEmail;
import chain_abstractclass.NotificatorManager;
import chain_abstractclass.NotificatorSMS;

public class Program {

	public static void main(String[] args) {
		Notificator notificatorSMS=new NotificatorSMS();
		Notificator notificatorEmail=new NotificatorEmail();
		Notificator notificatorManager=new NotificatorManager();
		
		notificatorSMS.setUrmatorulNotificator(notificatorEmail);
		notificatorEmail.setUrmatorulNotificator(notificatorManager);
		
		Client client=new Client("Popescu", null, null);
		
		notificatorSMS.notifica(client, "Notificare TEST");
	}

}
