package ch3_1;

public class Clinet {

	public static void main(String[] args) {
		Component c1, c2;
		Beijing bj;
		HunanSchool hs;
		XiangtanTeach xt;
		ChangshaTeach ct;
		c1 = new Ad();
		c2 = new Edu();
		bj = new Beijing();
		hs = new HunanSchool();
		xt = new XiangtanTeach();
		ct = new ChangshaTeach();

		bj.add(c1);
		bj.add(c2);
		bj.add(hs);

		hs.add(c1);
		hs.add(c2);
		hs.add(xt);
		hs.add(ct);

		xt.add(c1);
		xt.add(c2);

		ct.add(c1);
		ct.add(c2);
		
		bj.operation();

	}

}
