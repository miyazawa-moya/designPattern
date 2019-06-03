
class Renban {
	private static Renban jittai = new Renban();
	private int Serial_number;

	public static Renban genInstance() {
		return jittai;
	}

	public void plusNumber() {
		if (Serial_number < 9999) {
			Serial_number += 1;
		}
	}

	public String getNumber() {
		String number = String.valueOf(Serial_number);
		if (Serial_number < 10) {
			number = "000" + number;
		} else if (Serial_number < 100) {
			number = "00" + number;
		} else if (Serial_number < 1000) {
			number = "0" + number;
		}
		return number;
	}
}
