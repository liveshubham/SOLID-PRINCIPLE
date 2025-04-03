package S;

public class Invoice {
	private Pen p;

	public Invoice(Pen p) {
		this.p = p;
	}

	public int createInvoice() {
		return (int) (p.price * (1.18) + 2);
	}
// esme ek class me multiple responsibilty hai.
//	public void sendEmail() {
//		System.out.println("Mail ker diya.");
//	}
//
//	public void print() {
//		System.out.println("Print ker diya.");
//	}
}
