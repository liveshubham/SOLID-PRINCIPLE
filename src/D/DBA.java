package D;

public class DBA {
	private DataBase s;

	public DBA(DataBase s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	public void print() {
		System.out.println(s);
	}

	public static void main(String[] args) {
		DataBase s = new MySqldatabase();
		DBA d = new DBA(s);
		d.print();//ye my sql database ko call krega.
		DataBase s1 = new No_SQL();
		DBA d1 = new DBA(s1);
		d1.print(); // ye no sql database ko call krega.
 
	}
}
