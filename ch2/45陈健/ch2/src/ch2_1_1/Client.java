package ch2_1_1;

public class Client {

	public static void main(String[] args) {
		U u = new CAdapter();
		System.out.println(u.findzipcode("123456"));
	}
}
