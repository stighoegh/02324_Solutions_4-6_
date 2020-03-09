package tennis01;
public class SpilTennis {
	public static void main(String[] args) {
		Tennis t1, t2;
		t1 = new Tennis("Peter", false, null);
		t2 = new Tennis("Søren", false, null);
		t1.setModstander(t2);
		t2.setModstander(t1);
		t1.start();
		t2.start();
		t1.setHarBold(true);
	}
}


