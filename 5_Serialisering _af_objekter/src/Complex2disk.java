import java.io.*;
public class Complex2disk {
	static final String dataFile = "complex.txt";

	public static void main(String[] args) throws IOException//, ClassNotFoundException 
	{
		Complex c1 = new Complex(42, 41);
		Complex c2 = new Complex(1, 3);

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c1 og c2 skrives nu til disk");

		ObjectOutputStream out = null;
		try {
			// out = new ObjectOutputStream(
			// new BufferedOutputStream(
			// new FileOutputStream(dataFile)));

			OutputStream temp1 = new FileOutputStream(dataFile);
			out = new ObjectOutputStream((temp1));

			for (int i = 0; i < 5000; i++) {
				out.writeObject(c1);
				out.writeObject(c2);
			}

		} finally {
			out.close();
		}
		System.out.println("c1 og c2 skrevet på disk");
		Complex c3 = null;
		Complex c4 = new Complex(3, 2);
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new BufferedInputStream(
				 new FileInputStream(dataFile)));
			c3 = (Complex) in.readObject();
			c4 = (Complex) in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			in.close();
		}
		System.out.println("udløsning efter løsning fra disk indlagt i c3 og c4");
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
	}
}

// 5 bytes per complex +74 bytes, s�dan ca.

