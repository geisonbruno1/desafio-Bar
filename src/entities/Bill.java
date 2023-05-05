package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		return 4.00;
	}

	public double feeding() {
		return beer * 5.00 + softDrink * 3.00 + barbecue * 7.00;
	}

	public double ticket() {
		if (gender == 'M') {
			return 10.00;
		} else {
			return 8.00;
		}
	}

	public double total() {
		if (feeding() > 30) {
			return feeding() + ticket();
		} else {
			return cover() + ticket() + feeding();
		}
	}

	public String toString() {
		if (feeding() > 30) {
			return "*ISENTO DE COUVERT*";
		}
		return String.format("%.2f", cover());
	}

}
