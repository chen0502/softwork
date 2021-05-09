package ch2_1_2;

public class CAdapter extends U {
	private C c;

	public CAdapter(C c) {
		this.c = c;
	}

	public String findzipcode(String zipcode) {
		String l = "ULocation";
		int code[] = new int[6];
		for (int i = 0; i < zipcode.length(); i++) {
			Character ch = zipcode.charAt(i);
			code[i] = Integer.parseInt(ch.toString());
		}
		l = c.zipcode(code);
		return l;
	}
}
