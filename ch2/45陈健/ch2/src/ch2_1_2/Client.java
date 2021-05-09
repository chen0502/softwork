package ch2_1_2;

public class Client {

	public static void main(String[] args) {
		C c = new C();
		CAdapter cad = new CAdapter(c);
		System.out.println(cad.findzipcode("123456"));

	}

}
