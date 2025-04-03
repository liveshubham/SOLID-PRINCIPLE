package O;

public class Invoice {
	private Pen p;

	public Invoice(Pen p) {
		this.p = p;
	}

	public int createInvoice() {
		return (int) (p.price * (1.18) + 2);
	}
}
