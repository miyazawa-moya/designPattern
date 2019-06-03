
public class SingletonTest {

	public static void main(String[] args) {

		Renban renban1 = Renban.genInstance();
		renban1.plusNumber();
		System.out.println(renban1.getNumber());

		Renban renban2 = Renban.genInstance();
		renban2.plusNumber();
		System.out.println(renban2.getNumber());

		Renban renban3 = Renban.genInstance();
		renban3.plusNumber();
		System.out.println(renban3.getNumber());

		Renban renban4 = Renban.genInstance();
		renban4.plusNumber();
		System.out.println(renban4.getNumber());

		/*
		 * System.out.println(renban1.getNumber());
		 * System.out.println(renban2.getNumber());
		 * System.out.println(renban3.getNumber());
		 * System.out.println(renban4.getNumber());
		 */
	}

}
