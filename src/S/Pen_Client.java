package S;

public class Pen_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p=new Pen();
		Invoice i = new Invoice(p);
		System.out.println(i.createInvoice());
//		i.sendEmail();
//		i.print();   ye single responsiblity principle nhi follow kr rha hai
		SendNotification sn = new SendNotification(i);
		sn.sendMail();
	}

}
