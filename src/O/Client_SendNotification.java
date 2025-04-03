package O;


public class Client_SendNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Pen();
		Invoice i = new Invoice(p);
		System.out.println(i.createInvoice());
		SendNotification sn = new SendNotification();
		sn.sendMessage(i);
		Gmail_Notification gn=new Gmail_Notification();
		gn.sendMessage(i);
		Send_SMS sms=new Send_SMS();
		sms.sendMessage(i);
		
	}

}
