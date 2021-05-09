package ch3_2;

public class Client {

	public static void main(String[] args) {
		Fo f;
		Sys s;
		f = new GIF();
		s = new L();
		s.setF(f);
		s.look();

	}

}
