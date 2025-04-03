package S;

public class SendNotification {
	private Invoice v;
	public SendNotification(Invoice v) {
		this.v=v;
	}
	
	public void sendMail() {
		System.out.println("Sending Mail");
	}

}
